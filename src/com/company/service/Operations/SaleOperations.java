package com.company.service.Operations;

import com.company.database.MySQLConnection;
import com.company.objects.Sales;
import com.company.service.LoginSession;

import javax.swing.*;
import java.sql.*;
import java.util.ArrayList;
import java.util.HashMap;

public class SaleOperations {
    public static void addSale(JFrame frame, String product, int id, int quantity, String date) {
        if(quantity==0){
                JOptionPane.showMessageDialog(frame, "Can't sell 0.");
        }else if (ProductOperations.isSaleValid(frame,quantity,product)) {
            String query = "INSERT INTO sales(product,quantity,dateOfSale,employeeName,clientId)" +
                    "VALUES('" + product + "','" + quantity + "','" + date + "','" + LoginSession.UserName + "','" + id + "');";
            try {
                Connection MyCon = MySQLConnection.getConnectionProducts();
                PreparedStatement preparedStatement = MyCon.prepareStatement(query);
                preparedStatement.execute(query);
                ProductOperations.updateQuantityProduct(frame, quantity, product);
                JOptionPane.showMessageDialog(frame, "Done.");
            } catch (DataTruncation dte) {
                JOptionPane.showMessageDialog(frame, "Invalid date.");
            } catch (Exception e) {
                JOptionPane.showMessageDialog(frame, "Database error:" + e.getMessage());
            }
        }else{
            JOptionPane.showMessageDialog(frame, "Can't sell more than in stock.");

        }
    }

 public static ArrayList<Sales> readSales(JFrame frame) {
     Sales sale;
     String query = "SELECT * FROM sales ";
     ArrayList<Sales> salesList = new ArrayList<>();
     try {
         Connection MyCon = MySQLConnection.getConnectionProducts();
         PreparedStatement preparedStatement = MyCon.prepareStatement(query);
         ResultSet rs = preparedStatement.executeQuery();
         while (rs.next()) {
             sale = new Sales();
             sale.setId(rs.getInt("id"));
             sale.setProduct(rs.getString("product"));
             sale.setQuantity(rs.getInt("quantity"));
             sale.setDateOfSale(rs.getString("dateOfSale"));
             sale.setClientId(rs.getInt("clientId"));
             salesList.add(sale);
         }
     } catch (Exception e) {
         JOptionPane.showMessageDialog(frame, "Database error:" + e.getMessage());
     }
     return salesList;
 }
    public static ArrayList<Sales> readSalesByEmployee(JFrame frame) {
        Sales sale;
        String query = "SELECT * FROM sales WHERE employeeName='" + LoginSession.UserName + "'";
        ArrayList<Sales> salesList = new ArrayList<>();
        try {
            Connection MyCon = MySQLConnection.getConnectionProducts();
            PreparedStatement preparedStatement = MyCon.prepareStatement(query);
            ResultSet rs = preparedStatement.executeQuery();
            while (rs.next()) {
                sale = new Sales();
                sale.setId(rs.getInt("id"));
                sale.setProduct(rs.getString("product"));
                sale.setQuantity(rs.getInt("quantity"));
                sale.setDateOfSale(rs.getString("dateOfSale"));
                sale.setClientId(rs.getInt("clientId"));
                salesList.add(sale);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(frame, "Database error:" + e.getMessage());
        }
        return salesList;
    }
    public static ArrayList<Sales> readSalesByEmployee(JFrame frame,String employee) {
        Sales sale;
        String query = "SELECT * FROM sales WHERE employeeName='" +employee + "'";
        ArrayList<Sales> salesList = new ArrayList<>();
        try {
            Connection MyCon = MySQLConnection.getConnectionProducts();
            PreparedStatement preparedStatement = MyCon.prepareStatement(query);
            ResultSet rs = preparedStatement.executeQuery();
            while (rs.next()) {
                sale = new Sales();
                sale.setId(rs.getInt("id"));
                sale.setProduct(rs.getString("product"));
                sale.setQuantity(rs.getInt("quantity"));
                sale.setDateOfSale(rs.getString("dateOfSale"));
                sale.setClientId(rs.getInt("clientId"));
                salesList.add(sale);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(frame, "Database error:" + e.getMessage());
        }
        return salesList;
    }
    public static ArrayList<Sales> readSalesByTime(JFrame frame,String fromDate, String toDate) {
        Sales sale;
        String query = "SELECT * FROM sales WHERE (dateOfSale BETWEEN '" +fromDate + "' AND '"+toDate+"')";
        ArrayList<Sales> salesList = new ArrayList<>();
        try {
            Connection MyCon = MySQLConnection.getConnectionProducts();
            PreparedStatement preparedStatement = MyCon.prepareStatement(query);
            ResultSet rs = preparedStatement.executeQuery();
            while (rs.next()) {
                sale = new Sales();
                sale.setId(rs.getInt("id"));
                sale.setProduct(rs.getString("product"));
                sale.setQuantity(rs.getInt("quantity"));
                sale.setDateOfSale(rs.getString("dateOfSale"));
                sale.setClientId(rs.getInt("clientId"));
                salesList.add(sale);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(frame, "Database error:" + e.getMessage());
        }
        return salesList;
    }
    public static int getSoldQuantity(){
        String query = "SELECT quantity FROM sales ";
        ArrayList<Integer> quantity=new ArrayList<>();
        int total = 0;
        try {
            Connection MyCon = MySQLConnection.getConnectionProducts();
            PreparedStatement preparedStatement = MyCon.prepareStatement(query);
            ResultSet rs = preparedStatement.executeQuery();
            while (rs.next()) {
                quantity.add(rs.getInt("quantity"));
            }
        } catch (Exception e) {
            System.out.println("Database error:" + e.getMessage());
        }
        for(int i:quantity){
            total+=i;
        }
        return total;
    }
    public static double totalIncome(JFrame frame) {
        String query = "SELECT product,quantity FROM sales ";
        String product;
        int quantity;
        double total = 0,price;
        try {
            Connection MyCon = MySQLConnection.getConnectionProducts();
            PreparedStatement preparedStatement = MyCon.prepareStatement(query);
            ResultSet rs = preparedStatement.executeQuery();
            while (rs.next()) {
                product=rs.getString("product");
                quantity=rs.getInt("quantity");
                price=ProductOperations.getProductPrice(frame,product);
                total=price*quantity;
            }
        } catch (Exception e) {
            System.out.println("Database error:" + e.getMessage());
        }
        return total;
    }
    public static int salesByEmployees(String employee) {
        String query = "SELECT quantity FROM sales where employeeName='"+employee+"'";
        int quantity;
        int total=0;
        try {
            Connection MyCon = MySQLConnection.getConnectionProducts();
            PreparedStatement preparedStatement = MyCon.prepareStatement(query);
            ResultSet rs = preparedStatement.executeQuery();
            while (rs.next()) {
                quantity=rs.getInt("quantity");
                total+=quantity;
            }
        } catch (Exception e) {
            System.out.println("Database error:" + e.getMessage());
        }
        return total;
    }

    public static Sales mostSalesByEmployee(JFrame frame) {
        Sales sale;
        HashMap<String,Integer> sales=new HashMap<>();
        ArrayList<String>employees=UserOperations.readEmployees(frame);
        int totalSales;
        for(String employee:employees){
            totalSales=salesByEmployees(employee);
            sales.put(employee,totalSales);
        }
        sale=saleSort(sales,employees);
        return sale;
    }

    public static Sales saleSort(HashMap<String,Integer> sales,ArrayList<String>employees){
        Sales sale=new Sales();
        int currentSale;
        int maxSale=0;
        String maxEmployee="";
        for(String employee:employees){
            currentSale=sales.get(employee);
            if(currentSale>maxSale){
                maxSale=currentSale;
                maxEmployee=employee;
            }
        }
        sale.setEmployeeName(maxEmployee);
        sale.setQuantity(maxSale);
        return sale;
    }

    public static Sales soldProducts() {
        String query = "SELECT product FROM sales";
        int quantity;
        Sales sale;
        ArrayList<Sales> sales=new ArrayList<>();
        String product;
        try {
            Connection MyCon = MySQLConnection.getConnectionProducts();
            PreparedStatement preparedStatement = MyCon.prepareStatement(query);
            ResultSet rs = preparedStatement.executeQuery();
            while (rs.next()) {
                sale=new Sales();
                product=rs.getString("product");
                quantity=soldProductTotal(product);
                sale.setQuantity(quantity);
                sale.setProduct(product);
                sales.add(sale);
            }
        } catch (Exception e) {
            System.out.println("Database error:" + e.getMessage());
        }
        sale=mostSoldProduct(sales);
        return sale;
    }

    public static int soldProductTotal(String product) {
        String query = "SELECT quantity FROM sales WHERE product='"+product+"'";
        int quantity;
        int total=0;
        try {
            Connection MyCon = MySQLConnection.getConnectionProducts();
            PreparedStatement preparedStatement = MyCon.prepareStatement(query);
            ResultSet rs = preparedStatement.executeQuery();
            while (rs.next()) {
                quantity=rs.getInt("quantity");
                total+=quantity;
            }
        } catch (Exception e) {
            System.out.println("Database error:" + e.getMessage());
        }
        return total;
    }
    public static Sales mostSoldProduct(ArrayList<Sales> sales){
        int maxSale=0;
        String maxProduct="";
        for(Sales sale:sales){
            if(sale.getQuantity()>maxSale){
                maxProduct=sale.getProduct();
                maxSale=sale.getQuantity();
            }
        }
        Sales sale=new Sales();
        sale.setProduct(maxProduct);
        sale.setQuantity(maxSale);
        return sale;
    }

}

