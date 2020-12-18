/*
 * Created by JFormDesigner on Wed Dec 09 13:12:44 EET 2020
 */

package com.company.adminServiceDashboard.Sales;

import com.company.SRserviceDashboard.SRDashboard;
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

/**
 * @author unknown
 */
public class AdminViewSales extends JFrame {
    public AdminViewSales() {
        initComponents();
        initTextField();
    }
    private void initTextField(){
        ArrayList<Sales> sales=SaleOperations.readSales(this);
        for(Sales c:sales){
            salesField.append(c.toString()+", Client: "+ ClientOperations.getClientNamesById(this,c.getClientId())+"\n");
        }
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
        backButton = new JButton();

        //======== this ========
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setTitle("View Sales");
        setMinimumSize(new Dimension(450, 350));
        var contentPane = getContentPane();
        contentPane.setLayout(new GridLayoutManager(2, 1, new Insets(0, 0, 0, 0), -1, -1));

        //======== scrollPane1 ========
        {

            //---- salesField ----
            salesField.setMinimumSize(new Dimension(400, 300));
            salesField.setPreferredSize(new Dimension(750, 300));
            scrollPane1.setViewportView(salesField);
        }
        contentPane.add(scrollPane1, new GridConstraints(0, 0, 1, 1,
            GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_NONE,
            GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW,
            GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW,
            null, null, null));

        //---- backButton ----
        backButton.setText("Back");
        backButton.addActionListener(e -> backButtonActionPerformed(e));
        contentPane.add(backButton, new GridConstraints(1, 0, 1, 1,
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
    private JButton backButton;
    // JFormDesigner - End of variables declaration  //GEN-END:variables
}
