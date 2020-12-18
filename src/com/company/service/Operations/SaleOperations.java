package com.company.service.Operations;

import com.company.database.MySQLConnection;
import com.company.objects.Sales;
import com.company.service.LoginSession;

import javax.swing.*;
import java.sql.Connection;
import java.sql.DataTruncation;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

public class SaleOperations {
    public static void addSale(JFrame frame, String product, int id, int quantity, String date) {
        if (ProductOperations.updateQuantityProduct(frame, quantity, product)) {
            String query = "INSERT INTO sales(product,quantity,dateOfSale,employeeName,clientId)" +
                    "VALUES('" + product + "','" + quantity + "','" + date + "','" + LoginSession.UserName + "','" + id + "');";
            try {
                Connection MyCon = MySQLConnection.getConnectionProducts();
                PreparedStatement preparedStatement = MyCon.prepareStatement(query);
                preparedStatement.execute(query);
                JOptionPane.showMessageDialog(frame, "Done.");
            } catch (DataTruncation dte) {
                JOptionPane.showMessageDialog(frame, "Invalid date.");
            } catch (Exception e) {
                JOptionPane.showMessageDialog(frame, "Database error:" + e.getMessage());
            }
        }
    }

 /*   public static Sales getSale(JFrame frame, int id) {
        String query = "SELECT * from sales WHERE id='" + id + "'";
        Sales sale = new Sales();
        try {
            Connection MyCon = MySQLConnection.getConnectionProducts();
            PreparedStatement preparedStatement = MyCon.prepareStatement(query);
            ResultSet rs = preparedStatement.executeQuery();
            while (rs.next()) {
                sale.setId(rs.getInt("id"));
                sale.setProduct(rs.getString("product"));
                sale.setQuantity(rs.getInt("quantity"));
                sale.setDateOfSale(rs.getString("dateOfSale"));
                sale.setEmployeeName(rs.getString("employeeName"));
                sale.setClientId(rs.getInt("clientId"));
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(frame, "Database error:" + e.getMessage());
        }
        return sale;
    }*/
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
  /*  public static void editSale(JFrame frame,Sales sale, int id, int newQuantity, String date) {
        if (ProductOperations.editQuantityProduct(frame, newQuantity, sale.getProduct(),id)) {
            String query = "UPDATE sales " +
                    "SET product='" + sale.getProduct() + "', " +
                    "quantity='" + sale.getQuantity() + "', " +
                    "dateOfSale='" + sale.getDateOfSale() + "', " +
                    "employeeName='" + sale.getEmployeeName() + "', " +
                    "clientId='" + sale.getClientId()+ "' " +
                    "WHERE id=" + sale.getId();
            try {
                Connection MyCon = MySQLConnection.getConnectionProducts();
                PreparedStatement preparedStatement = MyCon.prepareStatement(query);
                preparedStatement.execute(query);
                JOptionPane.showMessageDialog(frame, "Done.");
            } catch (DataTruncation dte) {
                JOptionPane.showMessageDialog(frame, "Invalid date.");
            } catch (Exception e) {
                JOptionPane.showMessageDialog(frame, "Database error:" + e.getMessage());
            }
        }
    }*/
}
