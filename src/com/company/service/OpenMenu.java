package com.company.service;

import com.company.SRserviceDashboard.*;
import com.company.adminServiceDashboard.AddProducts;
import com.company.adminServiceDashboard.EditProduct;
import com.company.temp.EditSale;

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

}
