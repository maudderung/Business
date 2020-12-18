package com.company.service;

import com.company.SRserviceDashboard.SRDashboard;
import com.company.adminServiceDashboard.AdminDashboard;
import com.company.service.LoginSession;
import com.company.view.Login;

import javax.swing.*;

public class LogOut {
    public static void logOut(JFrame context, Login loginScreen) {
        LoginSession.isLoggedIn = false;
        context.setVisible(false);
        loginScreen.getFrame1().setVisible(true);
    }

    public static void SRback(JFrame context, SRDashboard dashboard) {
        context.setVisible(false);
        dashboard.setVisible(true);
    }

    public static void backAdmin(JFrame context, AdminDashboard dashboard) {
        context.setVisible(false);
        dashboard.setVisible(true);
    }
}
