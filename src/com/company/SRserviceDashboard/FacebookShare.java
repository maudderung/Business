/*
 * Created by JFormDesigner on Fri Dec 25 22:29:53 EET 2020
 */

package com.company.SRserviceDashboard;

import com.company.service.Facebook;
import com.company.service.LogOut;
import com.company.service.Operations.ProductOperations;
import com.intellij.uiDesigner.core.GridConstraints;
import com.intellij.uiDesigner.core.GridLayoutManager;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.util.ArrayList;

/**
 * @author unknown
 */
public class FacebookShare extends JFrame {
    public FacebookShare() {
        initComponents();
        comboInit();
    }

    private void publishDefaultActionPerformed(ActionEvent e) {
        Facebook fb=new Facebook();
        String product=(String)productCombo.getSelectedItem();
        String price=String.valueOf(ProductOperations.getProductPrice(this,product));
        String text="Only now!\nBuy "+product+" for "+price+" leva!\nPrice is valid only until the product is in stock!";
        fb.makePost(text);
    }

    private void customDefaultActionPerformed(ActionEvent e) {
        Facebook fb=new Facebook();
        String text=customMessage.getText();
        fb.makePost(text);
    }

    private void backButtonActionPerformed(ActionEvent e) {
        SRDashboard dashboard= new SRDashboard();
        LogOut.SRback(this,dashboard);
    }

    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents
        // Generated using JFormDesigner Evaluation license - unknown
        panel1 = new JPanel();
        label2 = new JLabel();
        label1 = new JLabel();
        productCombo = new JComboBox();
        publishDefault = new JButton();
        label3 = new JLabel();
        scrollPane1 = new JScrollPane();
        customMessage = new JTextArea();
        customDefault = new JButton();
        backButton = new JButton();

        //======== this ========
        setMinimumSize(new Dimension(550, 500));
        setTitle("Share a promotional message to FB");
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        var contentPane = getContentPane();
        contentPane.setLayout(new GridLayoutManager(1, 1, new Insets(0, 0, 0, 0), -1, -1));

        //======== panel1 ========
        {
            panel1.setBorder (new javax. swing. border. CompoundBorder( new javax .swing .border .TitledBorder (new javax. swing
            . border. EmptyBorder( 0, 0, 0, 0) , "JF\u006frmD\u0065sig\u006eer \u0045val\u0075ati\u006fn", javax. swing. border. TitledBorder
            . CENTER, javax. swing. border. TitledBorder. BOTTOM, new java .awt .Font ("Dia\u006cog" ,java .
            awt .Font .BOLD ,12 ), java. awt. Color. red) ,panel1. getBorder( )) )
            ; panel1. addPropertyChangeListener (new java. beans. PropertyChangeListener( ){ @Override public void propertyChange (java .beans .PropertyChangeEvent e
            ) {if ("\u0062ord\u0065r" .equals (e .getPropertyName () )) throw new RuntimeException( ); }} )
            ;
            panel1.setLayout(new GridLayoutManager(7, 6, new Insets(0, 0, 0, 0), -1, -1));

            //---- label2 ----
            label2.setText("Default promotional message");
            label2.setFont(new Font("Tw Cen MT", Font.PLAIN, 22));
            panel1.add(label2, new GridConstraints(0, 1, 1, 5,
                GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_NONE,
                GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW,
                GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW,
                null, null, null));

            //---- label1 ----
            label1.setText("Product :");
            panel1.add(label1, new GridConstraints(2, 0, 1, 1,
                GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_NONE,
                GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW,
                GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW,
                null, null, null));

            //---- productCombo ----
            productCombo.setMinimumSize(new Dimension(350, 30));
            panel1.add(productCombo, new GridConstraints(2, 1, 1, 5,
                GridConstraints.ANCHOR_WEST, GridConstraints.FILL_NONE,
                GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW,
                GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW,
                null, null, null));

            //---- publishDefault ----
            publishDefault.setText("Publish");
            publishDefault.addActionListener(e -> publishDefaultActionPerformed(e));
            panel1.add(publishDefault, new GridConstraints(3, 1, 1, 4,
                GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_NONE,
                GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW,
                GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW,
                null, null, null));

            //---- label3 ----
            label3.setText("Custom promotional message");
            label3.setFont(new Font("Tw Cen MT", Font.PLAIN, 22));
            panel1.add(label3, new GridConstraints(4, 1, 1, 5,
                GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_NONE,
                GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW,
                GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW,
                null, null, null));

            //======== scrollPane1 ========
            {

                //---- customMessage ----
                customMessage.setLineWrap(true);
                customMessage.setMinimumSize(new Dimension(350, 200));
                customMessage.setPreferredSize(new Dimension(350, 200));
                scrollPane1.setViewportView(customMessage);
            }
            panel1.add(scrollPane1, new GridConstraints(5, 2, 1, 4,
                GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_NONE,
                GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW,
                GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW,
                null, null, null));

            //---- customDefault ----
            customDefault.setText("Publish");
            customDefault.addActionListener(e -> customDefaultActionPerformed(e));
            panel1.add(customDefault, new GridConstraints(6, 2, 1, 1,
                GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_NONE,
                GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW,
                GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW,
                new Dimension(150, 30), null, null));

            //---- backButton ----
            backButton.setText("Back");
            backButton.addActionListener(e -> backButtonActionPerformed(e));
            panel1.add(backButton, new GridConstraints(6, 3, 1, 1,
                GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_NONE,
                GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW,
                GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW,
                new Dimension(150, 30), null, null));
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
    private void comboInit() {
        ArrayList<String> ProductsList;
        ProductsList = ProductOperations.readProducts(this);
        for (String c : ProductsList) {
            productCombo.addItem(c);
        }
    }

    // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables
    // Generated using JFormDesigner Evaluation license - unknown
    private JPanel panel1;
    private JLabel label2;
    private JLabel label1;
    private JComboBox productCombo;
    private JButton publishDefault;
    private JLabel label3;
    private JScrollPane scrollPane1;
    private JTextArea customMessage;
    private JButton customDefault;
    private JButton backButton;
    // JFormDesigner - End of variables declaration  //GEN-END:variables
}
