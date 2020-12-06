package com.company.service;

import com.company.SRserviceDashboard.AddClientMenu;
import com.company.SRserviceDashboard.AddSale;
import com.company.SRserviceDashboard.EditClient;
import com.company.SRserviceDashboard.DeleteClient;
import com.company.view.AdminDashboard;
import com.company.view.Login;
import com.company.view.SRDashboard;

import javax.swing.*;

public class LogOut {
    public static void logOut(JFrame context, Login loginScreen){
        LoginSession.isLoggedIn=false;
        context.setVisible(false);
        loginScreen.getFrame1().setVisible(true);
    }
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
    public static void SRback(JFrame context, SRDashboard dashboard){
        context.setVisible(false);
        dashboard.setVisible(true);
    }
    public static void SRaddSale(JFrame context, AddSale dashboard){
        context.setVisible(false);
        dashboard.setVisible(true);
    }
    public static void backAdmin(JFrame context, AdminDashboard dashboard){
        context.setVisible(false);
        dashboard.setVisible(true);
    }
}
