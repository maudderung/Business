/*
 * Created by JFormDesigner on Wed Dec 09 13:12:44 EET 2020
 */

package com.company.adminServiceDashboard.Sales;

import com.company.adminServiceDashboard.AdminDashboard;
import com.company.objects.Sales;
import com.company.service.LogOut;
import com.company.service.Operations.ClientOperations;
import com.company.service.Operations.SaleOperations;
import com.intellij.uiDesigner.core.GridConstraints;
import com.intellij.uiDesigner.core.GridLayoutManager;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Set;

/**
 * @author unknown
 */
public class AdminViewSales extends JFrame {
    public AdminViewSales() {
        initComponents();
        initTextField();
        initAnalysis();
    }
    private void initTextField(){
        ArrayList<Sales> sales=SaleOperations.readSales(this);
        for(Sales c:sales){
            salesField.append(c.toString()+", Client: "+ ClientOperations.getClientNamesById(this,c.getClientId())+"\n");
        }
    }
    private void initAnalysis(){
        Sales mostSales;
        Sales mostSold;
        int quantity=SaleOperations.getSoldQuantity();
        double income=SaleOperations.totalIncome(this);
        mostSales = SaleOperations.mostSalesByEmployee(this);
        mostSold=SaleOperations.soldProducts();
        quantityLabel.setText(String.valueOf(quantity));
        incomeLabel.setText(String.format("%10.2f",income)+" lv.");
        mostSalesLabel.setText(mostSales.getQuantity()+" by "+mostSales.getEmployeeName());
        productLabel.setText(mostSold.getProduct()+" - "+ mostSold.getQuantity());
    }

    private void backButtonActionPerformed(ActionEvent e) {
        AdminDashboard adminDashboard = new AdminDashboard();
        LogOut.backAdmin(this,adminDashboard);
    }

    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents
        // Generated using JFormDesigner Evaluation license - unknown
        scrollPane1 = new JScrollPane();
        salesField = new JTextArea();
        label1 = new JLabel();
        quantityLabel = new JLabel();
        label2 = new JLabel();
        incomeLabel = new JLabel();
        label4 = new JLabel();
        mostSalesLabel = new JLabel();
        label3 = new JLabel();
        productLabel = new JLabel();
        backButton = new JButton();

        //======== this ========
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setTitle("View Sales");
        setMinimumSize(new Dimension(450, 350));
        var contentPane = getContentPane();
        contentPane.setLayout(new GridLayoutManager(6, 4, new Insets(0, 0, 0, 0), -1, -1));

        //======== scrollPane1 ========
        {

            //---- salesField ----
            salesField.setMinimumSize(new Dimension(400, 300));
            salesField.setPreferredSize(new Dimension(750, 300));
            scrollPane1.setViewportView(salesField);
        }
        contentPane.add(scrollPane1, new GridConstraints(0, 0, 1, 4,
            GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_NONE,
            GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW,
            GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW,
            null, null, null));

        //---- label1 ----
        label1.setText("Sold quantity:");
        contentPane.add(label1, new GridConstraints(1, 0, 1, 1,
            GridConstraints.ANCHOR_EAST, GridConstraints.FILL_NONE,
            GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW,
            GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW,
            null, null, null));
        contentPane.add(quantityLabel, new GridConstraints(1, 1, 1, 1,
            GridConstraints.ANCHOR_WEST, GridConstraints.FILL_NONE,
            GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW,
            GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW,
            null, null, null));

        //---- label2 ----
        label2.setText("Total income from sales:");
        contentPane.add(label2, new GridConstraints(2, 0, 1, 1,
            GridConstraints.ANCHOR_EAST, GridConstraints.FILL_NONE,
            GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW,
            GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW,
            null, null, null));
        contentPane.add(incomeLabel, new GridConstraints(2, 1, 1, 1,
            GridConstraints.ANCHOR_WEST, GridConstraints.FILL_NONE,
            GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW,
            GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW,
            null, null, null));

        //---- label4 ----
        label4.setText("Most sales :");
        contentPane.add(label4, new GridConstraints(3, 0, 1, 1,
            GridConstraints.ANCHOR_EAST, GridConstraints.FILL_NONE,
            GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW,
            GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW,
            null, null, null));
        contentPane.add(mostSalesLabel, new GridConstraints(3, 1, 1, 1,
            GridConstraints.ANCHOR_WEST, GridConstraints.FILL_NONE,
            GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW,
            GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW,
            null, null, null));

        //---- label3 ----
        label3.setText("Most sold product:");
        contentPane.add(label3, new GridConstraints(4, 0, 1, 1,
            GridConstraints.ANCHOR_EAST, GridConstraints.FILL_NONE,
            GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW,
            GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW,
            null, null, null));
        contentPane.add(productLabel, new GridConstraints(4, 1, 1, 1,
            GridConstraints.ANCHOR_WEST, GridConstraints.FILL_NONE,
            GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW,
            GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW,
            null, null, null));

        //---- backButton ----
        backButton.setText("Back");
        backButton.addActionListener(e -> backButtonActionPerformed(e));
        contentPane.add(backButton, new GridConstraints(5, 0, 1, 4,
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
    private JScrollPane scrollPane1;
    private JTextArea salesField;
    private JLabel label1;
    private JLabel quantityLabel;
    private JLabel label2;
    private JLabel incomeLabel;
    private JLabel label4;
    private JLabel mostSalesLabel;
    private JLabel label3;
    private JLabel productLabel;
    private JButton backButton;
    // JFormDesigner - End of variables declaration  //GEN-END:variables
}
