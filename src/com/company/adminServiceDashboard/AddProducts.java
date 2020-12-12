/*
 * Created by JFormDesigner on Thu Dec 10 14:23:39 EET 2020
 */

package com.company.adminServiceDashboard;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

import com.company.service.Operations.LogOut;
import com.company.service.Operations.ProductOperations;
import com.company.view.AdminDashboard;
import com.intellij.uiDesigner.core.*;

/**
 * @author unknown
 */
public class AddProducts extends JFrame {
    public AddProducts() {
        initComponents();
    }

    private void AddButtonActionPerformed(ActionEvent e) {
        String product=nameField.getText();
        int quantity=Integer.parseInt(quantityField.getText());
        double price=Double.parseDouble(priceField.getText());
        ProductOperations.addProduct(this,product,price,quantity);
    }

    private void BackButtonActionPerformed(ActionEvent e) {
        AdminDashboard dashboard = new AdminDashboard();
        LogOut.backAdmin(this,dashboard);
    }

    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents
        // Generated using JFormDesigner Evaluation license - unknown
        addAproduct = new JLabel();
        panel1 = new JPanel();
        productName = new JLabel();
        nameField = new JTextField();
        quantity = new JLabel();
        quantityField = new JTextField();
        price = new JLabel();
        priceField = new JTextField();
        panel2 = new JPanel();
        AddButton = new JButton();
        BackButton = new JButton();

        //======== this ========
        setMinimumSize(new Dimension(430, 300));
        setResizable(false);
        setTitle("Add product");
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        var contentPane = getContentPane();
        contentPane.setLayout(new GridLayoutManager(3, 1, new Insets(0, 0, 0, 0), -1, -1));

        //---- addAproduct ----
        addAproduct.setText("Add a product");
        addAproduct.setFont(new Font("Tw Cen MT", Font.PLAIN, 30));
        contentPane.add(addAproduct, new GridConstraints(0, 0, 1, 1,
            GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_NONE,
            GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW,
            GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW,
            null, null, null));

        //======== panel1 ========
        {
            panel1.setBorder (new javax. swing. border. CompoundBorder( new javax .swing .border .TitledBorder (
            new javax. swing. border. EmptyBorder( 0, 0, 0, 0) , "JF\u006frm\u0044es\u0069gn\u0065r \u0045va\u006cua\u0074io\u006e"
            , javax. swing. border. TitledBorder. CENTER, javax. swing. border. TitledBorder. BOTTOM
            , new java .awt .Font ("D\u0069al\u006fg" ,java .awt .Font .BOLD ,12 )
            , java. awt. Color. red) ,panel1. getBorder( )) ); panel1. addPropertyChangeListener (
            new java. beans. PropertyChangeListener( ){ @Override public void propertyChange (java .beans .PropertyChangeEvent e
            ) {if ("\u0062or\u0064er" .equals (e .getPropertyName () )) throw new RuntimeException( )
            ; }} );
            panel1.setLayout(new GridLayoutManager(3, 2, new Insets(0, 0, 0, 0), -1, -1));

            //---- productName ----
            productName.setText("Product name");
            panel1.add(productName, new GridConstraints(0, 0, 1, 1,
                GridConstraints.ANCHOR_EAST, GridConstraints.FILL_NONE,
                GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW,
                GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW,
                null, null, null));
            panel1.add(nameField, new GridConstraints(0, 1, 1, 1,
                GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_NONE,
                GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW,
                GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW,
                new Dimension(300, 30), null, null));

            //---- quantity ----
            quantity.setText("Quantity");
            panel1.add(quantity, new GridConstraints(1, 0, 1, 1,
                GridConstraints.ANCHOR_EAST, GridConstraints.FILL_NONE,
                GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW,
                GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW,
                null, null, null));
            panel1.add(quantityField, new GridConstraints(1, 1, 1, 1,
                GridConstraints.ANCHOR_WEST, GridConstraints.FILL_NONE,
                GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW,
                GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW,
                new Dimension(100, 30), null, null));

            //---- price ----
            price.setText("Price");
            panel1.add(price, new GridConstraints(2, 0, 1, 1,
                GridConstraints.ANCHOR_EAST, GridConstraints.FILL_NONE,
                GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW,
                GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW,
                null, null, null));
            panel1.add(priceField, new GridConstraints(2, 1, 1, 1,
                GridConstraints.ANCHOR_WEST, GridConstraints.FILL_NONE,
                GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW,
                GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW,
                new Dimension(100, 30), null, null));
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
    private JLabel addAproduct;
    private JPanel panel1;
    private JLabel productName;
    private JTextField nameField;
    private JLabel quantity;
    private JTextField quantityField;
    private JLabel price;
    private JTextField priceField;
    private JPanel panel2;
    private JButton AddButton;
    private JButton BackButton;
    // JFormDesigner - End of variables declaration  //GEN-END:variables
}
