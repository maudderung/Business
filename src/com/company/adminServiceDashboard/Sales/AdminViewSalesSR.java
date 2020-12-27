/*
 * Created by JFormDesigner on Wed Dec 09 13:12:44 EET 2020
 */

package com.company.adminServiceDashboard.Sales;

import com.company.adminServiceDashboard.AdminDashboard;
import com.company.objects.Sales;
import com.company.service.LogOut;
import com.company.service.Operations.ClientOperations;
import com.company.service.Operations.SaleOperations;
import com.company.service.Operations.UserOperations;
import com.intellij.uiDesigner.core.GridConstraints;
import com.intellij.uiDesigner.core.GridLayoutManager;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ItemEvent;
import java.util.ArrayList;

/**
 * @author unknown
 */
public class AdminViewSalesSR extends JFrame {
    public AdminViewSalesSR() {
        initComponents();
        initCombo();
    }

    private void initTextField(String employee){
        ArrayList<Sales> sales=SaleOperations.readSalesByEmployee(this,employee);
        for(Sales c:sales){
            salesField.append(c.toString()+", Client: "+ ClientOperations.getClientNamesById(this,c.getClientId())+"\n");
        }
    }
    private void initCombo(){
        ArrayList<String> employees;
        employees= UserOperations.readEmployees(this);
        for (String c : employees) {
            employeeCombo.addItem(c);
        }
    }

    private void employeeComboItemStateChanged(ItemEvent e) {
        salesField.setText("");
        String employee=(String)employeeCombo.getSelectedItem();
        initTextField(employee);
    }

    private void backButtonActionPerformed(ActionEvent e) {
        AdminDashboard adminDashboard = new AdminDashboard();
        LogOut.backAdmin(this,adminDashboard);
    }

    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents
        // Generated using JFormDesigner Evaluation license - unknown
        panel1 = new JPanel();
        label1 = new JLabel();
        employeeCombo = new JComboBox();
        scrollPane1 = new JScrollPane();
        salesField = new JTextArea();
        backButton = new JButton();

        //======== this ========
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setTitle("View Sales By Employee");
        setMinimumSize(new Dimension(450, 450));
        var contentPane = getContentPane();
        contentPane.setLayout(new GridLayoutManager(3, 1, new Insets(0, 0, 0, 0), -1, -1));

        //======== panel1 ========
        {
            panel1.setBorder (new javax. swing. border. CompoundBorder( new javax .swing .border .TitledBorder (new javax. swing. border
            . EmptyBorder( 0, 0, 0, 0) , "JF\u006frmD\u0065sig\u006eer \u0045val\u0075ati\u006fn", javax. swing. border. TitledBorder. CENTER, javax
            . swing. border. TitledBorder. BOTTOM, new java .awt .Font ("Dia\u006cog" ,java .awt .Font .BOLD ,
            12 ), java. awt. Color. red) ,panel1. getBorder( )) ); panel1. addPropertyChangeListener (new java. beans
            . PropertyChangeListener( ){ @Override public void propertyChange (java .beans .PropertyChangeEvent e) {if ("\u0062ord\u0065r" .equals (e .
            getPropertyName () )) throw new RuntimeException( ); }} );
            panel1.setLayout(new GridLayoutManager(2, 3, new Insets(0, 0, 0, 0), -1, -1));

            //---- label1 ----
            label1.setText("Employee");
            panel1.add(label1, new GridConstraints(0, 0, 1, 1,
                GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_NONE,
                GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW,
                GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW,
                null, null, null));

            //---- employeeCombo ----
            employeeCombo.setMinimumSize(new Dimension(200, 30));
            employeeCombo.addItemListener(e -> employeeComboItemStateChanged(e));
            panel1.add(employeeCombo, new GridConstraints(0, 1, 1, 1,
                GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_NONE,
                GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW,
                GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW,
                null, null, null));
        }
        contentPane.add(panel1, new GridConstraints(0, 0, 1, 1,
            GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_NONE,
            GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW,
            GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW,
            null, null, null));

        //======== scrollPane1 ========
        {

            //---- salesField ----
            salesField.setMinimumSize(new Dimension(400, 300));
            salesField.setPreferredSize(new Dimension(750, 300));
            scrollPane1.setViewportView(salesField);
        }
        contentPane.add(scrollPane1, new GridConstraints(1, 0, 1, 1,
            GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_NONE,
            GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW,
            GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW,
            null, null, null));

        //---- backButton ----
        backButton.setText("Back");
        backButton.addActionListener(e -> backButtonActionPerformed(e));
        contentPane.add(backButton, new GridConstraints(2, 0, 1, 1,
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
    private JPanel panel1;
    private JLabel label1;
    private JComboBox employeeCombo;
    private JScrollPane scrollPane1;
    private JTextArea salesField;
    private JButton backButton;
    // JFormDesigner - End of variables declaration  //GEN-END:variables
}
