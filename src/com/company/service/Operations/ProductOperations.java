package com.company.service.Operations;

import com.company.database.MySQLConnection;
import com.company.objects.Clients;
import com.company.objects.Products;
import com.company.objects.Sales;
import com.company.service.Operations.*;
import com.company.service.Validator;

import javax.swing.*;
import java.sql.*;
import java.util.ArrayList;

public class ProductOperations {
    public static ArrayList<String> readProducts(JFrame frame) {
        String query = "SELECT name FROM products.product;";
        ArrayList<String> productsList = new ArrayList<>();
        try {
            Connection MyCon = MySQLConnection.getConnectionProducts();
            PreparedStatement preparedStatement = MyCon.prepareStatement(query);
            ResultSet rs = preparedStatement.executeQuery();
            while (rs.next()) {
                String temp;
                temp = rs.getString("name");
                productsList.add(temp);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(frame, "Database error:" + e.getMessage());
        }
        return productsList;
    }

    public static ArrayList<Products> returnProducts(JFrame frame) {
        String query = "SELECT * FROM products.product;";
        ArrayList<Products> productsList = new ArrayList<>();
        Products product;
        try {
            Connection MyCon = MySQLConnection.getConnectionProducts();
            PreparedStatement preparedStatement = MyCon.prepareStatement(query);
            ResultSet rs = preparedStatement.executeQuery();
            while (rs.next()) {
                product = new Products();
                product.setId(rs.getInt("id"));
                product.setName(rs.getString("name"));
                product.setPrice(rs.getDouble("price"));
                product.setQuantity(rs.getInt("quantity"));
                productsList.add(product);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(frame, "Database error:" + e.getMessage());
        }
        return productsList;
    }

    public static int getQuantityProduct(JFrame frame, String product) {
        int quantity = 0;
        String query = "SELECT quantity FROM product WHERE name='" + product + "'";
        try {
            Connection MyCon = MySQLConnection.getConnectionProducts();
            PreparedStatement preparedStatement = MyCon.prepareStatement(query);
            ResultSet rs = preparedStatement.executeQuery();
            while (rs.next()) {
                quantity = rs.getInt("quantity");
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(frame, "Database error:" + e.getMessage());
        }
        return quantity;
    }
    public static String getProductName(JFrame frame,int id) {
        String query = "SELECT name FROM products.product WHERE id="+id;
        String name="";
        try {
            Connection MyCon = MySQLConnection.getConnectionProducts();
            PreparedStatement preparedStatement = MyCon.prepareStatement(query);
            ResultSet rs = preparedStatement.executeQuery();
            while (rs.next()) {
               name=rs.getString("name");
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(frame, "Database error:" + e.getMessage());
        }
        return name;
    }

    public static void addProduct(JFrame frame, String name, double price,int quantity) {
        String query = "INSERT INTO product(name, price, quantity) VALUES(" +
                "'"+name+"', "+
                "'"+price+"', "+
                "'"+quantity+"' "+
                ")";
        try {
            Connection MyCon = MySQLConnection.getConnectionProducts();
            PreparedStatement preparedStatement = MyCon.prepareStatement(query);
            preparedStatement.execute(query);
            JOptionPane.showMessageDialog(frame,"Done.");
        } catch (SQLIntegrityConstraintViolationException exc) {
            JOptionPane.showMessageDialog(frame, "Product already exists");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(frame, "Database error:" + e.getMessage());
        }
    }
    public static boolean nameValidity(String name){
        if(name.length()==0){
            return false;
        }else{
            return true;
        }
    }
    public static void addEditedProduct(JFrame frame, double price, int quantity,int id) {
           String query = "UPDATE product SET price="+
                    "'"+price+"',quantity="+
                    "'"+quantity+"' WHERE id="+id;
        try {
            Connection MyCon = MySQLConnection.getConnectionProducts();
            PreparedStatement preparedStatement = MyCon.prepareStatement(query);
            preparedStatement.execute(query);
            JOptionPane.showMessageDialog(frame,"Done.");
        } catch (SQLIntegrityConstraintViolationException exc) {
            JOptionPane.showMessageDialog(frame, "Product already exists");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(frame, "Database error:" + e.getMessage());
        }
    }

    public static boolean updateQuantityProduct(JFrame frame, int quantitySale, String product) {
        int quantityCalculated = (getQuantityProduct(frame, product)) - quantitySale;
        String query = "UPDATE product SET quantity=" + quantityCalculated + " WHERE name='" + product + "'";
        try {
            Connection MyCon = MySQLConnection.getConnectionProducts();
            PreparedStatement preparedStatement = MyCon.prepareStatement(query);
            preparedStatement.execute(query);
            return true;
        } catch (DataTruncation dte) {
            JOptionPane.showMessageDialog(frame, "Can't sell more items than in stock.");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(frame, "Database error:" + e.getMessage());
        }
        return false;
    }


/*    public static boolean editQuantityProduct(JFrame frame, int newQuantity, String product, int id) {
        int quantityDifference,quantityCalculated=0;
        Sales sale = SaleOperations.getSale(frame, id);
        if (sale.getQuantity() > newQuantity) {
            quantityDifference = (sale.getQuantity()) - newQuantity;
            quantityCalculated = (getQuantityProduct(frame, product)) + quantityDifference;
        } else if (sale.getQuantity() < newQuantity) {
            quantityDifference = newQuantity - (sale.getQuantity());
            quantityCalculated = (getQuantityProduct(frame, product)) - quantityDifference;
        }
        else if (sale.getQuantity() == newQuantity) {
            return true;
        }
        String query = "UPDATE product SET quantity=" + quantityCalculated + " WHERE name='" + product + "'";
        try {
            Connection MyCon = MySQLConnection.getConnectionProducts();
            PreparedStatement preparedStatement = MyCon.prepareStatement(query);
            preparedStatement.execute(query);
            return true;
        } catch (DataTruncation dte) {
            JOptionPane.showMessageDialog(frame, "Can't sell more items than in stock.");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(frame, "Database error:" + e.getMessage());
        }
        return false;
    }*/
}
