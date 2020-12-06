package com.company.service;

import com.company.database.MySQLConnection;
import com.company.objects.Clients;
import com.company.view.Login;

import javax.swing.*;
import java.sql.*;
import java.util.ArrayList;

public class Operations {


    public boolean isLoggedIn(String username, String password, JFrame frame) {
        try {
            Connection MyCon = MySQLConnection.getConnectionLogin();
            String mySQLQuery = "SELECT userType from login WHERE Username= '" +
                    username +
                    "' AND Password='" +
                    password +
                    "'";
            PreparedStatement preparedStatement = MyCon.prepareStatement(mySQLQuery);
            ResultSet rs = preparedStatement.executeQuery();
            while (rs.next()) {
                LoginSession.UserType = rs.getString("userType");
                LoginSession.UserName = username;
                return true;
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(frame, "Database error:" + e.getMessage());
        }
        return false;
    }

    public static void addClient(String query, JFrame frame) {
        try {
            Connection MyCon = MySQLConnection.getConnectionClients();
            PreparedStatement preparedStatement = MyCon.prepareStatement(query);
            preparedStatement.execute(query);
            JOptionPane.showMessageDialog(frame, "Done.");
        } catch (SQLIntegrityConstraintViolationException exc) {
            JOptionPane.showMessageDialog(frame, "Duplicate entry for email/tel.");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(frame, "Database error:" + e.getMessage());
        }
    }

    public static void deleteClient(JFrame frame, int comboid) {
        String query = "DELETE FROM clients WHERE id=" + comboid;
        try {
            Connection MyCon = MySQLConnection.getConnectionClients();
            PreparedStatement preparedStatement = MyCon.prepareStatement(query);
            preparedStatement.execute(query);
            JOptionPane.showMessageDialog(frame, "Done.");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(frame, "Database error:" + e.getMessage());
        }
    }

    public static ArrayList<Clients> readClients(JFrame frame) {
        String query = "SELECT * from clients";
        Clients client;
        ArrayList<Clients> clientList = new ArrayList<>();
        try {
            Connection MyCon = MySQLConnection.getConnectionClients();
            PreparedStatement preparedStatement = MyCon.prepareStatement(query);
            ResultSet rs = preparedStatement.executeQuery();
            while (rs.next()) {
                client = new Clients();
                client.setId(rs.getInt("id"));
                client.setFirstname(rs.getString("firstname"));
                client.setLastname(rs.getString("lastname"));
                client.setAddress(rs.getString("address"));
                client.setEmail(rs.getString("email"));
                client.setTel(rs.getString("tel"));
                clientList.add(client);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(frame, "Database error:" + e.getMessage());
        }
        return clientList;
    }

    public static Clients getClient(JFrame frame, int id) {
        String query = "SELECT * from clients WHERE id=" + id;
        Clients client = new Clients();
        try {
            Connection MyCon = MySQLConnection.getConnectionClients();
            PreparedStatement preparedStatement = MyCon.prepareStatement(query);
            ResultSet rs = preparedStatement.executeQuery();
            while (rs.next()) {
                client.setId(rs.getInt("id"));
                client.setFirstname(rs.getString("firstname"));
                client.setLastname(rs.getString("lastname"));
                client.setAddress(rs.getString("address"));
                client.setEmail(rs.getString("email"));
                client.setTel(rs.getString("tel"));
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(frame, "Database error:" + e.getMessage());
        }
        return client;
    }

    public static void addEditedClient(JFrame frame, Clients client) {
        String query = "UPDATE clients " +
                "SET firstname='" + client.getFirstname() + "', " +
                "lastname='" + client.getLastname() + "', " +
                "address='" + client.getAddress() + "', " +
                "email='" + client.getEmail() + "', " +
                "tel='" + client.getTel() + "' " +
                "WHERE id=" + client.getId();
        try {
            Connection MyCon = MySQLConnection.getConnectionClients();
            PreparedStatement preparedStatement = MyCon.prepareStatement(query);
            preparedStatement.execute(query);
            JOptionPane.showMessageDialog(frame, "Done.");
        } catch (SQLIntegrityConstraintViolationException exc) {
            JOptionPane.showMessageDialog(frame, "Duplicate entry for email/tel.");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(frame, "Database error:" + e.getMessage());
        }
    }

    public static Clients areFieldsValid(JFrame frame, Clients client, int comboId, String fieldFirstname, String fieldLastname, String fieldEmail, String fieldAddress, String fieldTel) {
        if (fieldFirstname.length() == 0 && fieldLastname.length() == 0 && fieldEmail.length() == 0 && fieldAddress.length() == 0 && fieldTel.length() == 0) {
            try {
                throw new Exception();
            } catch (Exception exception) {
                JOptionPane.showMessageDialog(frame, "Please insert info");
            }
        } else {
            client = Operations.getClient(frame, comboId);
            if (fieldFirstname.length() > 0) {
                client.setFirstname(fieldFirstname);
            }
            if (fieldLastname.length() > 0) {
                client.setLastname(fieldLastname);
            }
            if (fieldAddress.length() > 0) {
                client.setAddress(fieldAddress);
            }
            try {
                if (fieldEmail.length() > 0) {
                    if (!Validator.isEmailValid(fieldEmail)) {
                        throw new Exception();
                    } else {
                        client.setEmail(fieldEmail);
                    }
                }
                if (fieldTel.length() > 0) {
                    if (!Validator.isPhoneValid(fieldTel)) {
                        throw new Exception();
                    } else {
                        client.setTel(fieldTel);
                    }
                }
            } catch (Exception formatexception) {
                JOptionPane.showMessageDialog(frame, "Email/Phone format is invalid");
            }
        }
        return client;
    }

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

    public static ArrayList<Clients> readClientID(JFrame frame) {
        Clients client;
        String query = "SELECT id,firstname,lastname FROM clientinfo.clients;";
        ArrayList<Clients> clientIDList = new ArrayList<>();
        try {
            Connection MyCon = MySQLConnection.getConnectionClients();
            PreparedStatement preparedStatement = MyCon.prepareStatement(query);
            ResultSet rs = preparedStatement.executeQuery();
            while (rs.next()) {
                client = new Clients();
                client.setId(rs.getInt("id"));
                client.setFirstname(rs.getString("firstname"));
                client.setLastname(rs.getString("lastname"));
                clientIDList.add(client);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(frame, "Database error:" + e.getMessage());
        }
        return clientIDList;
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

    public static void addSale(JFrame frame, String product, int id, int quantity, String date) {
        if (updateQuantityProduct(frame, quantity, product)) {
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

}