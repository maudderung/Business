package com.company.service.Operations;

import com.company.database.MySQLConnection;
import com.company.objects.Clients;
import com.company.service.Validator;

import javax.swing.*;
import java.sql.*;
import java.util.ArrayList;

public class ClientOperations {

    public static void getInfo(Clients client, ResultSet rs) throws SQLException {
        client.setId(rs.getInt("id"));
        client.setFirstname(rs.getString("firstname"));
        client.setLastname(rs.getString("lastname"));
        client.setAddress(rs.getString("address"));
        client.setEmail(rs.getString("email"));
        client.setTel(rs.getString("tel"));
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
                getInfo(client, rs);
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
                getInfo(client, rs);
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
            client = ClientOperations.getClient(frame, comboId);
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
    public static String getClientNamesById(JFrame frame, int id) {
        String query = "SELECT firstname,lastname from clients WHERE id=" + id;
        Clients client = new Clients();
        try {
            Connection MyCon = MySQLConnection.getConnectionClients();
            PreparedStatement preparedStatement = MyCon.prepareStatement(query);
            ResultSet rs = preparedStatement.executeQuery();
            while (rs.next()) {
                client.setFirstname(rs.getString("firstname"));
                client.setLastname(rs.getString("lastname"));
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(frame, "Database error:" + e.getMessage());
        }
        return client.getFirstname() + " " + client.getLastname();
    }


}
