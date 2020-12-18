/*
 * Created by JFormDesigner on Fri Dec 04 12:47:41 EET 2020
 */

package com.company.adminServiceDashboard.Product;

import com.company.objects.Products;
import com.company.service.LogOut;
import com.company.service.Operations.ProductOperations;
import com.company.adminServiceDashboard.AdminDashboard;
import com.intellij.uiDesigner.core.GridConstraints;
import com.intellij.uiDesigner.core.GridLayoutManager;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.util.ArrayList;

/**
 * @author unknown
 */
public class RemoveProduct extends JFrame {
    public RemoveProduct() {
        initComponents();
        comboInit();
    }

    private void DeleteButtonActionPerformed(ActionEvent e) {
        String combo =(String) productCombo.getSelectedItem();
        String id = combo.substring( 0, combo.indexOf(":"));
        int comboId=Integer.parseInt(id);
        ProductOperations.deleteProduct(this,comboId);
        comboInit();
    }
    
    private void BackActionPerformed(ActionEvent e) {
        AdminDashboard dashboard = new AdminDashboard();
        LogOut.backAdmin(this, dashboard);
    }


    private void comboInit(){
        productCombo.removeAllItems();
        ArrayList<Products> productsList;
        productsList=ProductOperations.returnProducts(this);
        for (Products c : productsList) {
            productCombo.addItem(c.toString());
        }
    }


    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents
        // Generated using JFormDesigner Evaluation license - unknown
        panel1 = new JPanel();
        label8 = new JLabel();
        label7 = new JLabel();
        productCombo = new JComboBox();
        label9 = new JLabel();
        panel2 = new JPanel();
        DeleteButton = new JButton();
        Back = new JButton();

        //======== this ========
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setTitle("Remove Product");
        setMinimumSize(new Dimension(650, 280));
        setResizable(false);
        var contentPane = getContentPane();
        contentPane.setLayout(new GridLayoutManager(1, 1, new Insets(0, 0, 0, 0), -1, -1));

        //======== panel1 ========
        {
            panel1.setMinimumSize(new Dimension(300, 200));
            panel1.setBorder(new javax.swing.border.CompoundBorder(new javax.swing.border.TitledBorder(
            new javax.swing.border.EmptyBorder(0,0,0,0), "JF\u006frmDesi\u0067ner Ev\u0061luatio\u006e"
            ,javax.swing.border.TitledBorder.CENTER,javax.swing.border.TitledBorder.BOTTOM
            ,new java.awt.Font("Dialo\u0067",java.awt.Font.BOLD,12)
            ,java.awt.Color.red),panel1. getBorder()));panel1. addPropertyChangeListener(
            new java.beans.PropertyChangeListener(){@Override public void propertyChange(java.beans.PropertyChangeEvent e
            ){if("borde\u0072".equals(e.getPropertyName()))throw new RuntimeException()
            ;}});
            panel1.setLayout(new GridLayoutManager(11, 1, new Insets(0, 0, 0, 0), -1, -1));

            //---- label8 ----
            label8.setText("  ");
            panel1.add(label8, new GridConstraints(0, 0, 1, 1,
                GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_NONE,
                GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW,
                GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW,
                null, null, null));

            //---- label7 ----
            label7.setText("Choose Product");
            label7.setFont(new Font("Tw Cen MT", Font.ITALIC, 15));
            panel1.add(label7, new GridConstraints(1, 0, 1, 1,
                GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_NONE,
                GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW,
                GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW,
                null, null, null));
            panel1.add(productCombo, new GridConstraints(2, 0, 1, 1,
                GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_NONE,
                GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW,
                GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW,
                new Dimension(400, 30), null, null));

            //---- label9 ----
            label9.setText("  ");
            panel1.add(label9, new GridConstraints(3, 0, 1, 1,
                GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_NONE,
                GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW,
                GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW,
                null, null, null));

            //======== panel2 ========
            {
                panel2.setLayout(new GridLayoutManager(1, 3, new Insets(0, 0, 0, 0), -1, -1));

                //---- DeleteButton ----
                DeleteButton.setText("Delete");
                DeleteButton.addActionListener(e -> DeleteButtonActionPerformed(e));
                panel2.add(DeleteButton, new GridConstraints(0, 0, 1, 2,
                    GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_NONE,
                    GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW,
                    GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW,
                    null, null, null));

                //---- Back ----
                Back.setText("Back");
                Back.addActionListener(e -> BackActionPerformed(e));
                panel2.add(Back, new GridConstraints(0, 2, 1, 1,
                    GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_NONE,
                    GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW,
                    GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW,
                    null, null, null));
            }
            panel1.add(panel2, new GridConstraints(7, 0, 1, 1,
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
        pack();
        setLocationRelativeTo(getOwner());
        // JFormDesigner - End of component initialization  //GEN-END:initComponents
    }

    // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables
    // Generated using JFormDesigner Evaluation license - unknown
    private JPanel panel1;
    private JLabel label8;
    private JLabel label7;
    private JComboBox productCombo;
    private JLabel label9;
    private JPanel panel2;
    private JButton DeleteButton;
    private JButton Back;
    // JFormDesigner - End of variables declaration  //GEN-END:variables
}
