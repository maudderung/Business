/*
 * Created by JFormDesigner on Tue Dec 01 09:54:30 EET 2020
 */

package com.company.view;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

import com.company.service.LoginSession;
import com.company.service.Operations;
import net.miginfocom.swing.*;

/**
 * @author unknown
 */
public class Login extends JFrame {
    public Login() {
        initComponents();
    }

    private void loginButtonActionPerformed(ActionEvent e) {
        // TODO add your code here
        Operations operations = new Operations();
        try {
            String usernameStr = usernameField.getText();
            String passwordStr = new String(passwordField.getPassword());
            if (operations.isLoggedIn(usernameStr, passwordStr, this)) {
                if (LoginSession.UserType.equals("Admin")) {
                    new AdminDashboard().setVisible(true);
                } else {
                    new SRDashboard().setVisible(true);
                }
                frame1.dispose();
            } else {
                JOptionPane.showMessageDialog(this, "Please type correct Username/Password.");
            }
        } catch (Exception exception) {
            JOptionPane.showMessageDialog(this, "Please type correct info.");
        }
    }

    private void closeButtonActionPerformed(ActionEvent e) {
        System.exit(0);
    }

    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents
        // Generated using JFormDesigner Evaluation license - unknown
        frame1 = new JFrame();
        label3 = new JLabel();
        label2 = new JLabel();
        label4 = new JLabel();
        usernameField = new JTextField();
        label5 = new JLabel();
        passwordField = new JPasswordField();
        loginButton = new JButton();
        closeButton = new JButton();

        //======== frame1 ========
        {
            frame1.getContentPane().setBackground(new Color(51, 51, 51));
            frame1.setTitle("Login");
            frame1.setMinimumSize(new Dimension(378, 348));
            frame1.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
            frame1.setResizable(false);
            var frame1ContentPane = frame1.getContentPane();
            frame1ContentPane.setLayout(new MigLayout(
                "hidemode 3",
                // columns
                "[fill]" +
                "[fill]" +
                "[fill]" +
                "[fill]" +
                "[fill]" +
                "[fill]" +
                "[fill]" +
                "[fill]" +
                "[fill]" +
                "[fill]" +
                "[fill]" +
                "[fill]" +
                "[fill]" +
                "[fill]" +
                "[fill]" +
                "[fill]" +
                "[fill]" +
                "[fill]" +
                "[fill]" +
                "[fill]" +
                "[fill]" +
                "[fill]" +
                "[fill]" +
                "[fill]" +
                "[fill]" +
                "[fill]" +
                "[fill]" +
                "[fill]" +
                "[fill]" +
                "[fill]" +
                "[fill]" +
                "[87,fill]" +
                "[fill]" +
                "[fill]" +
                "[fill]" +
                "[fill]" +
                "[99,fill]" +
                "[fill]" +
                "[fill]" +
                "[fill]" +
                "[fill]" +
                "[fill]" +
                "[fill]" +
                "[fill]" +
                "[fill]" +
                "[fill]" +
                "[fill]" +
                "[fill]" +
                "[fill]" +
                "[95,fill]" +
                "[fill]" +
                "[fill]" +
                "[83,fill]" +
                "[fill]" +
                "[fill]" +
                "[fill]" +
                "[fill]" +
                "[36,fill]" +
                "[fill]" +
                "[0,fill]" +
                "[fill]" +
                "[fill]" +
                "[fill]" +
                "[fill]" +
                "[fill]" +
                "[fill]" +
                "[fill]" +
                "[fill]" +
                "[fill]" +
                "[fill]" +
                "[fill]",
                // rows
                "[]" +
                "[]" +
                "[]" +
                "[]" +
                "[]" +
                "[]" +
                "[]" +
                "[]" +
                "[]" +
                "[]" +
                "[]" +
                "[]" +
                "[]" +
                "[]"));

            //---- label3 ----
            label3.setText("Login Form");
            label3.setFont(label3.getFont().deriveFont(label3.getFont().getStyle() | Font.BOLD, label3.getFont().getSize() + 12f));
            label3.setHorizontalAlignment(SwingConstants.CENTER);
            label3.setForeground(Color.white);
            frame1ContentPane.add(label3, "cell 0 0 50 1");

            //---- label2 ----
            label2.setIcon(new ImageIcon(getClass().getResource("/Images/lock.png")));
            label2.setHorizontalTextPosition(SwingConstants.CENTER);
            label2.setHorizontalAlignment(SwingConstants.CENTER);
            frame1ContentPane.add(label2, "cell 0 1 51 1");

            //---- label4 ----
            label4.setText("Username");
            label4.setFont(new Font("Tw Cen MT", Font.PLAIN, 17));
            label4.setForeground(Color.white);
            frame1ContentPane.add(label4, "cell 3 3 8 1");

            //---- usernameField ----
            usernameField.setBackground(new Color(102, 102, 102));
            usernameField.setForeground(Color.white);
            usernameField.setCaretColor(new Color(51, 51, 51));
            frame1ContentPane.add(usernameField, "cell 12 3 34 1");

            //---- label5 ----
            label5.setText("Password");
            label5.setFont(new Font("Tw Cen MT", Font.PLAIN, 17));
            label5.setForeground(Color.white);
            frame1ContentPane.add(label5, "cell 3 5 8 1");

            //---- passwordField ----
            passwordField.setBackground(new Color(102, 102, 102));
            passwordField.setForeground(Color.white);
            passwordField.setCaretColor(new Color(51, 51, 51));
            frame1ContentPane.add(passwordField, "cell 12 5 34 1");

            //---- loginButton ----
            loginButton.setText("Login");
            loginButton.setBackground(new Color(102, 102, 102));
            loginButton.addActionListener(e -> loginButtonActionPerformed(e));
            frame1ContentPane.add(loginButton, "cell 3 9 43 2");

            //---- closeButton ----
            closeButton.setText("Close");
            closeButton.setBackground(new Color(102, 102, 102));
            closeButton.addActionListener(e -> closeButtonActionPerformed(e));
            frame1ContentPane.add(closeButton, "cell 3 11 43 1");
            frame1.setLocationRelativeTo(frame1.getOwner());
        }
        // JFormDesigner - End of component initialization  //GEN-END:initComponents
    }

    public JFrame getFrame1() {
        return frame1;
    }

    // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables
    // Generated using JFormDesigner Evaluation license - unknown
    private JFrame frame1;
    private JLabel label3;
    private JLabel label2;
    private JLabel label4;
    private JTextField usernameField;
    private JLabel label5;
    private JPasswordField passwordField;
    private JButton loginButton;
    private JButton closeButton;
    // JFormDesigner - End of variables declaration  //GEN-END:variables

    public static void main(String[] args) {
        javax.swing.SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                Login GUI = new Login();
                GUI.frame1.setVisible(true);
            }
        });
    }
}