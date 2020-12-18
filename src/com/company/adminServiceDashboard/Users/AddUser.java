/*
 * Created by JFormDesigner on Sat Dec 12 17:52:07 EET 2020
 */

package com.company.adminServiceDashboard.Users;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

import com.company.adminServiceDashboard.AdminDashboard;
import com.company.service.LogOut;
import com.company.service.Operations.UserOperations;
import com.intellij.uiDesigner.core.*;

/**
 * @author unknown
 */
public class AddUser extends JFrame {
    public AddUser() {
        initComponents();
    }

    private void AddButtonActionPerformed(ActionEvent e) {
        String userType=(String)userTypeCombo.getSelectedItem();
        String username=userField.getText();
        String password=new String(passwordField.getPassword());
        UserOperations.addUser(this,userType,username,password);
    }

    private void BackButtonActionPerformed(ActionEvent e) {
        AdminDashboard dashboard= new AdminDashboard();
        LogOut.backAdmin(this,dashboard);
    }

    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents
        // Generated using JFormDesigner Evaluation license - unknown
        AddUserText = new JLabel();
        panel1 = new JPanel();
        UserType = new JLabel();
        userTypeCombo = new JComboBox<>();
        user = new JLabel();
        userField = new JTextField();
        password = new JLabel();
        passwordField = new JPasswordField();
        panel2 = new JPanel();
        AddButton = new JButton();
        BackButton = new JButton();

        //======== this ========
        setTitle("Add User");
        setMinimumSize(new Dimension(400, 250));
        setResizable(false);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        var contentPane = getContentPane();
        contentPane.setLayout(new GridLayoutManager(3, 1, new Insets(0, 0, 0, 0), -1, -1));

        //---- AddUserText ----
        AddUserText.setText("Add User");
        AddUserText.setFont(new Font("Tw Cen MT", Font.PLAIN, 18));
        contentPane.add(AddUserText, new GridConstraints(0, 0, 1, 1,
            GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_NONE,
            GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW,
            GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW,
            null, null, null));

        //======== panel1 ========
        {
            panel1.setBorder (new javax. swing. border. CompoundBorder( new javax .swing .border .TitledBorder (new javax
            . swing. border. EmptyBorder( 0, 0, 0, 0) , "JFor\u006dDesi\u0067ner \u0045valu\u0061tion", javax. swing
            . border. TitledBorder. CENTER, javax. swing. border. TitledBorder. BOTTOM, new java .awt .
            Font ("Dia\u006cog" ,java .awt .Font .BOLD ,12 ), java. awt. Color. red
            ) ,panel1. getBorder( )) ); panel1. addPropertyChangeListener (new java. beans. PropertyChangeListener( ){ @Override
            public void propertyChange (java .beans .PropertyChangeEvent e) {if ("bord\u0065r" .equals (e .getPropertyName (
            ) )) throw new RuntimeException( ); }} );
            panel1.setLayout(new GridLayoutManager(3, 2, new Insets(0, 0, 0, 0), -1, -1));

            //---- UserType ----
            UserType.setText("User Type");
            UserType.setFont(new Font("Tw Cen MT", Font.PLAIN, 16));
            panel1.add(UserType, new GridConstraints(0, 0, 1, 1,
                GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_NONE,
                GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW,
                GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW,
                null, null, null));

            //---- userTypeCombo ----
            userTypeCombo.setModel(new DefaultComboBoxModel<>(new String[] {
                "Sales Representative",
                "Admin"
            }));
            panel1.add(userTypeCombo, new GridConstraints(0, 1, 1, 1,
                GridConstraints.ANCHOR_WEST, GridConstraints.FILL_NONE,
                GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW,
                GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW,
                new Dimension(150, 30), new Dimension(50, 30), null));

            //---- user ----
            user.setText("Username");
            user.setFont(new Font("Tw Cen MT", Font.PLAIN, 16));
            panel1.add(user, new GridConstraints(1, 0, 1, 1,
                GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_NONE,
                GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW,
                GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW,
                null, null, null));
            panel1.add(userField, new GridConstraints(1, 1, 1, 1,
                GridConstraints.ANCHOR_WEST, GridConstraints.FILL_NONE,
                GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW,
                GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW,
                new Dimension(200, 30), null, null));

            //---- password ----
            password.setText("Password");
            password.setFont(new Font("Tw Cen MT", Font.PLAIN, 16));
            panel1.add(password, new GridConstraints(2, 0, 1, 1,
                GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_NONE,
                GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW,
                GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW,
                null, null, null));
            panel1.add(passwordField, new GridConstraints(2, 1, 1, 1,
                GridConstraints.ANCHOR_WEST, GridConstraints.FILL_NONE,
                GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW,
                GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW,
                new Dimension(200, 30), null, null));
        }
        contentPane.add(panel1, new GridConstraints(1, 0, 1, 1,
            GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_NONE,
            GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW,
            GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW,
            null, null, null));

        //======== panel2 ========
        {
            panel2.setLayout(new GridLayoutManager(1, 2, new Insets(0, 0, 0, 0), -1, -1));

            //---- AddButton ----
            AddButton.setText("Add");
            AddButton.addActionListener(e -> AddButtonActionPerformed(e));
            panel2.add(AddButton, new GridConstraints(0, 0, 1, 1,
                GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_NONE,
                GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW,
                GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW,
                null, null, null));

            //---- BackButton ----
            BackButton.setText("Back");
            BackButton.addActionListener(e -> BackButtonActionPerformed(e));
            panel2.add(BackButton, new GridConstraints(0, 1, 1, 1,
                GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_NONE,
                GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW,
                GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW,
                null, null, null));
        }
        contentPane.add(panel2, new GridConstraints(2, 0, 1, 1,
            GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_NONE,
            GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW,
            GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW,
            null, null, null));
        pack();
        setLocationRelativeTo(getOwner());
        // JFormDesigner - End of component initialization  //GEN-END:initComponents
    }

    // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables
    // Generated using JFormDesigner Evaluation license - unknown
    private JLabel AddUserText;
    private JPanel panel1;
    private JLabel UserType;
    private JComboBox<String> userTypeCombo;
    private JLabel user;
    private JTextField userField;
    private JLabel password;
    private JPasswordField passwordField;
    private JPanel panel2;
    private JButton AddButton;
    private JButton BackButton;
    // JFormDesigner - End of variables declaration  //GEN-END:variables
}
