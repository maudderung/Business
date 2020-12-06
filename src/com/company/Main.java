package com.company;

import com.company.view.Login;

import javax.swing.*;

public class Main {
    public static void main(String[] args){
        javax.swing.SwingUtilities.invokeLater(() -> {
            Login GUI = new Login();
            GUI.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            GUI.setVisible(true);
        });
    }
}
