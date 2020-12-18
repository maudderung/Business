/*
 * Created by JFormDesigner on Sat Dec 12 17:52:07 EET 2020
 */

package com.company.adminServiceDashboard.Users;

import com.company.adminServiceDashboard.AdminDashboard;
import com.company.objects.Products;
import com.company.objects.Users;
import com.company.service.LogOut;
import com.company.service.LoginSession;
import com.company.service.Operations.ProductOperations;
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
public class RemoveUser extends JFrame {
    public RemoveUser() {
        initComponents();
        comboInit();
    }


    private void RemoveButtonActionPerformed(ActionEvent e) {
        String combo=(String)userCombo.getSelectedItem();
        String userType=combo.substring( 0, combo.indexOf(":")-1);
        String userName=combo.substring( combo.indexOf(":")+3);
        UserOperations.removeUser(this,userName,userType);
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
            userCombo.addItem(c.getUserType()+" :  "+c.getUserName());
        }
    }


    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents
        // Generated using JFormDesigner Evaluation license - unknown
        AddUserText = new JLabel();
        panel1 = new JPanel();
        user = new JLabel();
        userCombo = new JComboBox();
        panel2 = new JPanel();
        RemoveButton = new JButton();
        BackButton = new JButton();

        //======== this ========
        setTitle("Remove User");
        setMinimumSize(new Dimension(550, 250));
        setResizable(false);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        var contentPane = getContentPane();
        contentPane.setLayout(new GridLayoutManager(3, 1, new Insets(0, 0, 0, 0), -1, -1));

        //---- AddUserText ----
        AddUserText.setText("Remove User");
        AddUserText.setFont(new Font("Tw Cen MT", Font.PLAIN, 18));
        contentPane.add(AddUserText, new GridConstraints(0, 0, 1, 1,
            GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_NONE,
            GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW,
            GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW,
            null, null, null));

        //======== panel1 ========
        {
            panel1.setBorder ( new javax . swing. border .CompoundBorder ( new javax . swing. border .TitledBorder (
            new javax . swing. border .EmptyBorder ( 0, 0 ,0 , 0) ,  "JFor\u006dDesi\u0067ner \u0045valu\u0061tion"
            , javax. swing .border . TitledBorder. CENTER ,javax . swing. border .TitledBorder . BOTTOM
            , new java. awt .Font ( "Dia\u006cog", java .awt . Font. BOLD ,12 )
            ,java . awt. Color .red ) ,panel1. getBorder () ) ); panel1. addPropertyChangeListener(
            new java. beans .PropertyChangeListener ( ){ @Override public void propertyChange (java . beans. PropertyChangeEvent e
            ) { if( "bord\u0065r" .equals ( e. getPropertyName () ) )throw new RuntimeException( )
            ;} } );
            panel1.setLayout(new GridLayoutManager(3, 2, new Insets(0, 0, 0, 0), -1, -1));

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
                new Dimension(350, 30), null, null));
        }
        contentPane.add(panel1, new GridConstraints(1, 0, 1, 1,
            GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_NONE,
            GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW,
            GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW,
            null, null, null));

        //======== panel2 ========
        {
            panel2.setLayout(new GridLayoutManager(1, 2, new Insets(0, 0, 0, 0), -1, -1));

            //---- RemoveButton ----
            RemoveButton.setText("Remove");
            RemoveButton.addActionListener(e -> RemoveButtonActionPerformed(e));
            panel2.add(RemoveButton, new GridConstraints(0, 0, 1, 1,
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
    private JPanel panel2;
    private JButton RemoveButton;
    private JButton BackButton;
    // JFormDesigner - End of variables declaration  //GEN-END:variables
}
