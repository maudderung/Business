package com.company.service;

import com.company.database.MySQLConnection;

import javax.swing.*;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class LoginSession {
    public static String UserName;
    public static String UserType;
    public static boolean isLoggedIn=false;

    public boolean isLoggedIn(String username, String password, JFrame frame) {
        try {
            Connection MyCon = MySQLConnection.getConnectionLogin();
            String mySQLQuery = "SELECT userType,Username from login WHERE Username= '" +
                    username +
                    "' AND Password='" +
                    password +
                    "'";
            PreparedStatement preparedStatement = MyCon.prepareStatement(mySQLQuery);
            ResultSet rs = preparedStatement.executeQuery();
            while (rs.next()) {
                LoginSession.UserType = rs.getString("userType");
                LoginSession.UserName = rs.getString("Username");
                return true;
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(frame, "Database error:" + e.getMessage());
        }
        return false;
    }
}
