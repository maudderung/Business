/*
 * Created by JFormDesigner on Sat Dec 12 17:52:07 EET 2020
 */

package com.company.adminServiceDashboard.Users;

import com.company.adminServiceDashboard.AdminDashboard;
import com.company.objects.Users;
import com.company.service.LogOut;
import com.company.service.Operations.UserOperations;
import com.intellij.uiDesigner.core.GridConstraints;
import com.intellij.uiDesigner.core.GridLayoutManager;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.util.ArrayList;

/**
 * @author unknown
 */
public class EditUser extends JFrame {
    public EditUser() {
        initComponents();
        comboInit();
    }

    private void EditButtonActionPerformed(ActionEvent e) {
        String combo=(String)userCombo.getSelectedItem();
        String oldUserName=combo.substring( 0, combo.indexOf(":")-1);
        String newUserType=(String)userTypeCombo.getSelectedItem();
        String newUserName=userNameField.getText();
        String newPassword=new String(passwordField.getPassword());
        if(newUserName.length()==0){
            newUserName=oldUserName;
        }
        if(newPassword.length()==0){
            UserOperations.editUser(this,newUserType,newUserName,oldUserName);
        }else {
            Users user = new Users(newUserType, newUserName, newPassword);
            UserOperations.editUser(this, user, oldUserName);
        }
        comboInit();
    }

    private void BackButtonActionPerformed(ActionEvent e) {
        AdminDashboard dashboard= new AdminDashboard();
        LogOut.backAdmin(this,dashboard);
    }

    private void comboInit(){
        userCombo.removeAllItems();
        ArrayList<Users> userList;
        userList= UserOperations.readUsers(this);
        for (Users c : userList) {
            userCombo.addItem(c.getUserName()+" :  "+c.getUserType());
        }
    }



    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents
        // Generated using JFormDesigner Evaluation license - unknown
        AddUserText = new JLabel();
        panel1 = new JPanel();
        user = new JLabel();
        userCombo = new JComboBox();
        UserType = new JLabel();
        userTypeCombo = new JComboBox<>();
        Username = new JLabel();
        userNameField = new JTextField();
        password = new JLabel();
        passwordField = new JPasswordField();
        panel2 = new JPanel();
        EditButton = new JButton();
        BackButton = new JButton();

        //======== this ========
        setTitle("Edit User");
        setMinimumSize(new Dimension(400, 300));
        setResizable(false);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        var contentPane = getContentPane();
        contentPane.setLayout(new GridLayoutManager(3, 1, new Insets(0, 0, 0, 0), -1, -1));

        //---- AddUserText ----
        AddUserText.setText("Edit User");
        AddUserText.setFont(new Font("Tw Cen MT", Font.PLAIN, 18));
        contentPane.add(AddUserText, new GridConstraints(0, 0, 1, 1,
            GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_NONE,
            GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW,
            GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW,
            null, null, null));

        //======== panel1 ========
        {
            panel1.setBorder (new javax. swing. border. CompoundBorder( new javax .swing .border .TitledBorder (new javax. swing
            . border. EmptyBorder( 0, 0, 0, 0) , "JF\u006frmD\u0065sig\u006eer \u0045val\u0075ati\u006fn", javax. swing. border. TitledBorder
            . CENTER, javax. swing. border. TitledBorder. BOTTOM, new java .awt .Font ("Dia\u006cog" ,java .
            awt .Font .BOLD ,12 ), java. awt. Color. red) ,panel1. getBorder( )) )
            ; panel1. addPropertyChangeListener (new java. beans. PropertyChangeListener( ){ @Override public void propertyChange (java .beans .PropertyChangeEvent e
            ) {if ("\u0062ord\u0065r" .equals (e .getPropertyName () )) throw new RuntimeException( ); }} )
            ;
            panel1.setLayout(new GridLayoutManager(5, 2, new Insets(0, 0, 0, 0), -1, -1));

            //---- user ----
            user.setText("User");
            user.setFont(new Font("Tw Cen MT", Font.PLAIN, 16));
            panel1.add(user, new GridConstraints(0, 0, 1, 1,
                GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_NONE,
                GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW,
                GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW,
                null, null, null));
            panel1.add(userCombo, new GridConstraints(0, 1, 1, 1,
                GridConstraints.ANCHOR_WEST, GridConstraints.FILL_NONE,
                GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW,
                GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW,
                new Dimension(150, 30), new Dimension(50, 30), null));

            //---- UserType ----
            UserType.setText("User Type");
            UserType.setFont(new Font("Tw Cen MT", Font.PLAIN, 16));
            panel1.add(UserType, new GridConstraints(1, 0, 1, 1,
                GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_NONE,
                GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW,
                GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW,
                null, null, null));

            //---- userTypeCombo ----
            userTypeCombo.setModel(new DefaultComboBoxModel<>(new String[] {
                "Sales Representative",
                "Admin"
            }));
            panel1.add(userTypeCombo, new GridConstraints(1, 1, 1, 1,
                GridConstraints.ANCHOR_WEST, GridConstraints.FILL_NONE,
                GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW,
                GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW,
                new Dimension(150, 30), new Dimension(50, 30), null));

            //---- Username ----
            Username.setText("Username");
            Username.setFont(new Font("Tw Cen MT", Font.PLAIN, 16));
            panel1.add(Username, new GridConstraints(2, 0, 1, 1,
                GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_NONE,
                GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW,
                GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW,
                null, null, null));

            //---- userNameField ----
            userNameField.setMinimumSize(new Dimension(200, 30));
            panel1.add(userNameField, new GridConstraints(2, 1, 1, 1,
                GridConstraints.ANCHOR_WEST, GridConstraints.FILL_NONE,
                GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW,
                GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW,
                null, null, null));

            //---- password ----
            password.setText("Password");
            password.setFont(new Font("Tw Cen MT", Font.PLAIN, 16));
            panel1.add(password, new GridConstraints(3, 0, 1, 1,
                GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_NONE,
                GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW,
                GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW,
                null, null, null));
            panel1.add(passwordField, new GridConstraints(3, 1, 1, 1,
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

            //---- EditButton ----
            EditButton.setText("Edit");
            EditButton.addActionListener(e -> EditButtonActionPerformed(e));
            panel2.add(EditButton, new GridConstraints(0, 0, 1, 1,
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
    private JLabel user;
    private JComboBox userCombo;
    private JLabel UserType;
    private JComboBox<String> userTypeCombo;
    private JLabel Username;
    private JTextField userNameField;
    private JLabel password;
    private JPasswordField passwordField;
    private JPanel panel2;
    private JButton EditButton;
    private JButton BackButton;
    // JFormDesigner - End of variables declaration  //GEN-END:variables
}
