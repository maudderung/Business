package com.company.service;

import com.company.SRserviceDashboard.Clients.AddClientMenu;
import com.company.SRserviceDashboard.Clients.DeleteClient;
import com.company.SRserviceDashboard.Clients.EditClient;
import com.company.SRserviceDashboard.Sales.AddSale;
import com.company.SRserviceDashboard.Sales.ViewSales;
import com.company.adminServiceDashboard.Product.AddProducts;
import com.company.adminServiceDashboard.Product.EditProduct;
import com.company.adminServiceDashboard.Product.RemoveProduct;
import com.company.adminServiceDashboard.Sales.AdminViewSales;
import com.company.adminServiceDashboard.Sales.AdminViewSalesSR;
import com.company.adminServiceDashboard.Sales.AdminViewSalesTime;
import com.company.adminServiceDashboard.Users.AddUser;
import com.company.adminServiceDashboard.Users.EditUser;
import com.company.adminServiceDashboard.Users.RemoveUser;

import javax.swing.*;

public class OpenMenu {
    public static void SRaddClient(JFrame context, AddClientMenu dashboard){
        context.setVisible(false);
        dashboard.setVisible(true);
    }
    public static void SReditClient(JFrame context, EditClient dashboard){
        context.setVisible(false);
        dashboard.setVisible(true);
    }
    public static void SRdeleteClient(JFrame context, DeleteClient dashboard){
        context.setVisible(false);
        dashboard.setVisible(true);
    }
    public static void SRaddSale(JFrame context, AddSale dashboard){
        context.setVisible(false);
        dashboard.setVisible(true);
    }
    public static void SRviewSale(JFrame context, ViewSales dashboard){
        context.setVisible(false);
        dashboard.setVisible(true);
    }
    public static void AdminAddProduct(JFrame context, AddProducts dashboard){
        context.setVisible(false);
        dashboard.setVisible(true);
    }
    public static void AdminEditProduct(JFrame context, EditProduct dashboard){
        context.setVisible(false);
        dashboard.setVisible(true);
    }
    public static void AdminRemoveProduct(JFrame context, RemoveProduct dashboard){
        context.setVisible(false);
        dashboard.setVisible(true);
    }
    public static void AdminAddUser(JFrame context, AddUser dashboard){
        context.setVisible(false);
        dashboard.setVisible(true);
    }
    public static void AdminRemoveUser(JFrame context, RemoveUser dashboard){
        context.setVisible(false);
        dashboard.setVisible(true);
    }
    public static void AdminEditUser(JFrame context, EditUser dashboard){
        context.setVisible(false);
        dashboard.setVisible(true);
    }
    public static void AdminViewSales(JFrame context, AdminViewSales dashboard){
        context.setVisible(false);
        dashboard.setVisible(true);
    }
    public static void AdminViewSalesSR(JFrame context, AdminViewSalesSR dashboard){
        context.setVisible(false);
        dashboard.setVisible(true);
    }
    public static void AdminViewSalesTime(JFrame context, AdminViewSalesTime dashboard){
        context.setVisible(false);
        dashboard.setVisible(true);
    }
}
