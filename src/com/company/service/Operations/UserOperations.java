package com.company.service.Operations;

import com.company.database.MySQLConnection;
import com.company.objects.Sales;
import com.company.objects.Users;
import com.company.service.LoginSession;
import com.restfb.types.User;

import javax.swing.*;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLIntegrityConstraintViolationException;
import java.util.ArrayList;

public class UserOperations {

    public static void addUser(JFrame frame, String userType, String userName, String password) {
        String query = "INSERT INTO login(UserType, Username, Password) VALUES(" +
                "'" + userType + "', " +
                "'" + userName + "', " +
                "'" + password + "' " +
                ")";
        try {
            Connection MyCon = MySQLConnection.getConnectionLogin();
            PreparedStatement preparedStatement = MyCon.prepareStatement(query);
            preparedStatement.execute(query);
            JOptionPane.showMessageDialog(frame, "Done.");
        } catch (SQLIntegrityConstraintViolationException exc) {
            JOptionPane.showMessageDialog(frame, "User already exists");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(frame, "Database error:" + e.getMessage());
        }
    }
    public static void storeEmployeeName(JFrame frame, String name) {
        String query = "INSERT INTO sr(name) VALUE('"+name+"')";
        try {
            Connection MyCon = MySQLConnection.getConnectionEmployees();
            PreparedStatement preparedStatement = MyCon.prepareStatement(query);
            preparedStatement.execute(query);
        } catch (SQLIntegrityConstraintViolationException exc) {
            JOptionPane.showMessageDialog(frame, "User already exists");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(frame, "Database error:" + e.getMessage());
        }
    }
    public static ArrayList<Users> readUsers(JFrame frame) {
        Users user;
        ArrayList<Users> userList = new ArrayList<>();
        String query = "SELECT * FROM login";
        try {
            Connection MyCon = MySQLConnection.getConnectionLogin();
            PreparedStatement preparedStatement = MyCon.prepareStatement(query);
            ResultSet rs = preparedStatement.executeQuery();
            while (rs.next()) {
                user = new Users();
                user.setUserType(rs.getString("userType"));
                user.setUserName(rs.getString("Username"));
                user.setPassword(rs.getString("Password"));
                userList.add(user);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(frame, "Database error:" + e.getMessage());
        }
        return userList;
    }
    public static ArrayList<String> readEmployees(JFrame frame) {
        ArrayList<String> employees = new ArrayList<>();
        String query = "SELECT name FROM sr";
        try {
            Connection MyCon = MySQLConnection.getConnectionEmployees();
            PreparedStatement preparedStatement = MyCon.prepareStatement(query);
            ResultSet rs = preparedStatement.executeQuery();
            while (rs.next()) {
                employees.add((rs.getString("name")));
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(frame, "Database error:" + e.getMessage());
        }
        return employees;
    }

    public static void removeUser(JFrame frame, String userName, String userType) {
        if (!LoginSession.UserName.equals(userName) && !LoginSession.UserType.equals(userType)) {
            String query = "DELETE FROM login WHERE userType=" +
                    "'" + userType + "' AND Username=" +
                    "'" + userName + "'";
            try {
                Connection MyCon = MySQLConnection.getConnectionLogin();
                PreparedStatement preparedStatement = MyCon.prepareStatement(query);
                preparedStatement.execute(query);
                JOptionPane.showMessageDialog(frame, "Done.");
            } catch (Exception e) {
                JOptionPane.showMessageDialog(frame, "Database error:" + e.getMessage());
            }
        } else {
            JOptionPane.showMessageDialog(frame, "Can't delete your own user.");
        }
    }

    public static void editUser(JFrame frame, Users user, String oldUserName) {
        if (user.getUserName().equals(LoginSession.UserName) && !user.getUserType().equals(LoginSession.UserType)) {
            JOptionPane.showMessageDialog(frame, "Can't change your user type!");
        } else {
            String query = "UPDATE login SET Username=" +
                    "'" + user.getUserName() + "',userType=" +
                    "'" + user.getUserType() + "',Password=" +
                    "'" + user.getPassword() + "' WHERE Username='" + oldUserName + "'";
            try {
                Connection MyCon = MySQLConnection.getConnectionLogin();
                PreparedStatement preparedStatement = MyCon.prepareStatement(query);
                preparedStatement.execute(query);
                if (user.getUserName().equals(LoginSession.UserName)) {
                    LoginSession.UserName = user.getUserName();
                }
                JOptionPane.showMessageDialog(frame, "Done.");
            } catch (SQLIntegrityConstraintViolationException exc) {
                JOptionPane.showMessageDialog(frame, "Product already exists");
            } catch (Exception e) {
                JOptionPane.showMessageDialog(frame, "Database error:" + e.getMessage());
            }
        }
    }

    public static void editUser(JFrame frame, String userType, String userName, String oldUserName) {
        if (userName.equals(LoginSession.UserName) && !userType.equals(LoginSession.UserType)) {
            JOptionPane.showMessageDialog(frame, "Can't change your user type!");
        } else {
            String query = "UPDATE login SET Username=" +
                    "'" + userName + "',userType=" +
                    "'" + userType + "' WHERE Username='" + oldUserName + "'";
            try {
                Connection MyCon = MySQLConnection.getConnectionLogin();
                PreparedStatement preparedStatement = MyCon.prepareStatement(query);
                preparedStatement.execute(query);
                if (userName.equals(LoginSession.UserName)) {
                    LoginSession.UserName = userName;
                }
                JOptionPane.showMessageDialog(frame, "Done.");
            } catch (SQLIntegrityConstraintViolationException exc) {
                JOptionPane.showMessageDialog(frame, "Username already taken");
            } catch (Exception e) {
                JOptionPane.showMessageDialog(frame, "Database error:" + e.getMessage());
            }
        }
    }
}