package com.company.database;
import java.sql.*;

public class MySQLConnection {

    public static Connection getConnectionLogin() throws Exception {
        String url = "jdbc:mysql://localhost:3306/logindata?autoReconnect=true&useSSL=false";
        String user = "root";
        String password = "adminaccess";
        Connection MyCon = DriverManager.getConnection(url, user, password);
        return MyCon;
    }

    public static Connection getConnectionClients() throws Exception {
        String url = "jdbc:mysql://localhost:3306/clientinfo?autoReconnect=true&useSSL=false";
        String user = "root";
        String password = "adminaccess";
        Connection MyCon = DriverManager.getConnection(url, user, password);
        return MyCon;
    }

    public static Connection getConnectionProducts() throws Exception {
        String url = "jdbc:mysql://localhost:3306/products?autoReconnect=true&useSSL=false";
        String user = "root";
        String password = "adminaccess";
        Connection MyCon = DriverManager.getConnection(url, user, password);
        return MyCon;
    }
}