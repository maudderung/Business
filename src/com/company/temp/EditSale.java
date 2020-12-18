/*
 * Created by JFormDesigner on Sun Dec 06 20:07:19 EET 2020
 */

package com.company.temp;
import com.company.service.LogOut;
import com.company.service.Operations.*;
import com.company.objects.Clients;
import com.company.objects.Sales;
import com.company.service.LoginSession;
import com.company.SRserviceDashboard.SRDashboard;
import com.intellij.uiDesigner.core.GridConstraints;
import com.intellij.uiDesigner.core.GridLayoutManager;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ItemEvent;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.util.ArrayList;

/**
 * @author unknown
 */
public class EditSale extends JFrame {

    public EditSale() {
        initComponents();
        comboBoxesInit();
    }

    private void editButtonActionPerformed(ActionEvent e) {
        String product=productCombo.getSelectedItem().toString();
        String saleID=saleCombo.getSelectedItem().toString();
        saleID = saleID.replaceAll("\\D+","");
        int ID=Integer.parseInt(saleID);
        String client=clientIDcombo.getSelectedItem().toString();
        client = client.replaceAll("\\D+","");
        int clientId=Integer.parseInt(client);
        int quantity=Integer.parseInt(quantityField.getText());
        String date=Integer.parseInt(yearField.getText())+"-"+Integer.parseInt(monthField.getText())+"-"+Integer.parseInt(dayField.getText());
        Sales sale= new Sales(ID,product,quantity,date,clientId);
        //SaleOperations.editSale(this,sale,ID,quantity,date);
    }

    private void backButtonActionPerformed(ActionEvent e) {
        SRDashboard dashboard = new SRDashboard();
        LogOut.SRback(this,dashboard);
    }

    private void comboBoxesInit(){
        ArrayList<Clients> clientIDList;
        ArrayList<Sales> salesList;
        ArrayList<String> ProductsList;
        salesList=SaleOperations.readSalesByEmployee(this);
        ProductsList = ProductOperations.readProducts(this);
        clientIDList=ClientOperations.readClientID(this);
        for (String c : ProductsList) {
            productCombo.addItem(c);
        }
        for(Sales c: salesList){
            saleCombo.addItem(c.getId()+": "+c.getProduct());
        }
        for(Clients c: clientIDList){
            clientIDcombo.addItem(c.getId()+": "+c.getFirstname()+" "+c.getLastname());
        }

    }
    private void productComboItemStateChanged(ItemEvent e) {
        int quantity=ProductOperations.getQuantityProduct(this,productCombo.getSelectedItem().toString());
        existingLabel.setText("Stock: "+quantity);
    }


    private void dayFieldKeyTyped(KeyEvent e) {
        if ((dayField.getText() + e.getKeyChar()).length() > 2) {
            e.consume();
        }
    }

    private void monthFieldKeyTyped(KeyEvent e) {
        if ((monthField.getText() + e.getKeyChar()).length() > 2) {
            e.consume();
        }
    }

    private void yearFieldKeyTyped(KeyEvent e) {
        if ((dayField.getText() + e.getKeyChar()).length() > 4) {
            e.consume();
        }
    }

    private void saleComboItemStateChanged(ItemEvent e) {
        ArrayList<Sales> salesList;
        salesList=SaleOperations.readSalesByEmployee(this);
        for(Sales c:salesList){
            if((c.getId()+": "+c.getProduct()).equals(saleCombo.getSelectedItem().toString())){
                infoLabel.setText("Quantity: "+c.getQuantity()+"; Date of sale: "+c.getDateOfSale()+"; Employee: "+LoginSession.UserName+"; Client ID: "+c.getClientId());
            }
        }
        
    }
    

    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents
        // Generated using JFormDesigner Evaluation license - unknown
        panel1 = new JPanel();
        label5 = new JLabel();
        label8 = new JLabel();
        saleCombo = new JComboBox();
        infoLabel = new JLabel();
        label1 = new JLabel();
        productCombo = new JComboBox();
        label2 = new JLabel();
        panel4 = new JPanel();
        quantityField = new JTextField();
        existingLabel = new JLabel();
        label3 = new JLabel();
        panel3 = new JPanel();
        dayField = new JTextField();
        label6 = new JLabel();
        monthField = new JTextField();
        label7 = new JLabel();
        yearField = new JTextField();
        label4 = new JLabel();
        clientIDcombo = new JComboBox();
        panel2 = new JPanel();
        editButton = new JButton();
        backButton = new JButton();

        //======== this ========
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setTitle("Edit Sale");
        setMinimumSize(new Dimension(600, 290));
        var contentPane = getContentPane();
        contentPane.setLayout(new GridLayoutManager(2, 1, new Insets(0, 0, 0, 0), -1, -1));

        //======== panel1 ========
        {
            panel1.setBorder ( new javax . swing. border .CompoundBorder ( new javax . swing. border .TitledBorder ( new
            javax . swing. border .EmptyBorder ( 0, 0 ,0 , 0) ,  "JF\u006frmDesi\u0067ner Ev\u0061luatio\u006e" , javax
            . swing .border . TitledBorder. CENTER ,javax . swing. border .TitledBorder . BOTTOM, new java
            . awt .Font ( "Dialo\u0067", java .awt . Font. BOLD ,12 ) ,java . awt
            . Color .red ) ,panel1. getBorder () ) ); panel1. addPropertyChangeListener( new java. beans .
            PropertyChangeListener ( ){ @Override public void propertyChange (java . beans. PropertyChangeEvent e) { if( "borde\u0072" .
            equals ( e. getPropertyName () ) )throw new RuntimeException( ) ;} } );
            panel1.setLayout(new GridLayoutManager(10, 8, new Insets(0, 0, 0, 0), -1, -1));

            //---- label5 ----
            label5.setText("Edit a sale");
            label5.setFont(new Font("Tw Cen MT", Font.PLAIN, 23));
            panel1.add(label5, new GridConstraints(1, 0, 1, 8,
                GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_NONE,
                GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW,
                GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW,
                null, null, null));

            //---- label8 ----
            label8.setText("Sale ID");
            panel1.add(label8, new GridConstraints(2, 0, 1, 1,
                GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_NONE,
                GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW,
                GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW,
                null, null, null));

            //---- saleCombo ----
            saleCombo.setMinimumSize(new Dimension(100, 30));
            saleCombo.addItemListener(e -> saleComboItemStateChanged(e));
            panel1.add(saleCombo, new GridConstraints(2, 3, 1, 1,
                GridConstraints.ANCHOR_WEST, GridConstraints.FILL_NONE,
                GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW,
                GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW,
                null, null, null));
            panel1.add(infoLabel, new GridConstraints(3, 3, 1, 1,
                GridConstraints.ANCHOR_WEST, GridConstraints.FILL_NONE,
                GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW,
                GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW,
                null, null, null));

            //---- label1 ----
            label1.setText("Product");
            label1.setFont(new Font("Tw Cen MT", Font.PLAIN, 14));
            panel1.add(label1, new GridConstraints(4, 0, 1, 1,
                GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_NONE,
                GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW,
                GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW,
                null, null, null));

            //---- productCombo ----
            productCombo.setMinimumSize(new Dimension(150, 30));
            productCombo.addItemListener(e -> productComboItemStateChanged(e));
            panel1.add(productCombo, new GridConstraints(4, 3, 1, 1,
                GridConstraints.ANCHOR_WEST, GridConstraints.FILL_NONE,
                GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW,
                GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW,
                null, null, null));

            //---- label2 ----
            label2.setText("Quantity");
            label2.setFont(new Font("Tw Cen MT", Font.PLAIN, 14));
            panel1.add(label2, new GridConstraints(5, 0, 1, 1,
                GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_NONE,
                GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW,
                GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW,
                null, null, null));

            //======== panel4 ========
            {
                panel4.setLayout(new GridLayoutManager(1, 2, new Insets(0, 0, 0, 0), -1, -1));

                //---- quantityField ----
                quantityField.setMaximumSize(new Dimension(50, 2147483647));
                quantityField.setMinimumSize(new Dimension(50, 30));
                quantityField.setPreferredSize(new Dimension(50, 30));
                panel4.add(quantityField, new GridConstraints(0, 0, 1, 1,
                    GridConstraints.ANCHOR_WEST, GridConstraints.FILL_NONE,
                    GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW,
                    GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW,
                    null, null, null));
                panel4.add(existingLabel, new GridConstraints(0, 1, 1, 1,
                    GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_NONE,
                    GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW,
                    GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW,
                    null, null, null));
            }
            panel1.add(panel4, new GridConstraints(5, 3, 1, 1,
                GridConstraints.ANCHOR_WEST, GridConstraints.FILL_NONE,
                GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW,
                GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW,
                null, null, null));

            //---- label3 ----
            label3.setText("Day");
            label3.setFont(new Font("Tw Cen MT", Font.PLAIN, 14));
            panel1.add(label3, new GridConstraints(6, 0, 1, 1,
                GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_NONE,
                GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW,
                GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW,
                null, null, null));

            //======== panel3 ========
            {
                panel3.setLayout(new GridLayoutManager(1, 5, new Insets(0, 0, 0, 0), -1, -1));

                //---- dayField ----
                dayField.setMinimumSize(new Dimension(30, 30));
                dayField.setPreferredSize(new Dimension(30, 30));
                dayField.addKeyListener(new KeyAdapter() {
                    @Override
                    public void keyTyped(KeyEvent e) {
                        dayFieldKeyTyped(e);
                    }
                });
                panel3.add(dayField, new GridConstraints(0, 0, 1, 1,
                    GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_NONE,
                    GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW,
                    GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW,
                    null, null, null));

                //---- label6 ----
                label6.setText("Month");
                panel3.add(label6, new GridConstraints(0, 1, 1, 1,
                    GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_NONE,
                    GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW,
                    GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW,
                    null, null, null));

                //---- monthField ----
                monthField.setPreferredSize(new Dimension(30, 30));
                monthField.setMinimumSize(new Dimension(30, 30));
                monthField.addKeyListener(new KeyAdapter() {
                    @Override
                    public void keyTyped(KeyEvent e) {
                        monthFieldKeyTyped(e);
                    }
                });
                panel3.add(monthField, new GridConstraints(0, 2, 1, 1,
                    GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_NONE,
                    GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW,
                    GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW,
                    null, null, null));

                //---- label7 ----
                label7.setText("Year");
                panel3.add(label7, new GridConstraints(0, 3, 1, 1,
                    GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_NONE,
                    GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW,
                    GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW,
                    null, null, null));

                //---- yearField ----
                yearField.setPreferredSize(new Dimension(50, 30));
                yearField.setMinimumSize(new Dimension(50, 30));
                yearField.addKeyListener(new KeyAdapter() {
                    @Override
                    public void keyTyped(KeyEvent e) {
                        yearFieldKeyTyped(e);
                    }
                });
                panel3.add(yearField, new GridConstraints(0, 4, 1, 1,
                    GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_NONE,
                    GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW,
                    GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW,
                    null, null, null));
            }
            panel1.add(panel3, new GridConstraints(6, 3, 1, 1,
                GridConstraints.ANCHOR_WEST, GridConstraints.FILL_NONE,
                GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW,
                GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW,
                null, null, null));

            //---- label4 ----
            label4.setText("Client ID");
            label4.setFont(new Font("Tw Cen MT", Font.PLAIN, 14));
            panel1.add(label4, new GridConstraints(7, 0, 1, 1,
                GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_NONE,
                GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW,
                GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW,
                null, null, null));

            //---- clientIDcombo ----
            clientIDcombo.setMinimumSize(new Dimension(150, 30));
            panel1.add(clientIDcombo, new GridConstraints(7, 3, 1, 1,
                GridConstraints.ANCHOR_WEST, GridConstraints.FILL_NONE,
                GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW,
                GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW,
                null, null, null));
        }
        contentPane.add(panel1, new GridConstraints(0, 0, 1, 1,
            GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_NONE,
            GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW,
            GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW,
            null, null, null));

        //======== panel2 ========
        {
            panel2.setLayout(new GridLayoutManager(4, 2, new Insets(0, 0, 0, 0), -1, -1));

            //---- editButton ----
            editButton.setText("Edit");
            editButton.setMinimumSize(new Dimension(120, 30));
            editButton.addActionListener(e -> editButtonActionPerformed(e));
            panel2.add(editButton, new GridConstraints(0, 0, 1, 1,
                GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_NONE,
                GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW,
                GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW,
                null, null, null));

            //---- backButton ----
            backButton.setText("Back");
            backButton.setMinimumSize(new Dimension(120, 30));
            backButton.addActionListener(e -> backButtonActionPerformed(e));
            panel2.add(backButton, new GridConstraints(0, 1, 1, 1,
                GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_NONE,
                GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW,
                GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW,
                null, null, null));
        }
        contentPane.add(panel2, new GridConstraints(1, 0, 1, 1,
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
    private JLabel label5;
    private JLabel label8;
    private JComboBox saleCombo;
    private JLabel infoLabel;
    private JLabel label1;
    private JComboBox productCombo;
    private JLabel label2;
    private JPanel panel4;
    private JTextField quantityField;
    private JLabel existingLabel;
    private JLabel label3;
    private JPanel panel3;
    private JTextField dayField;
    private JLabel label6;
    private JTextField monthField;
    private JLabel label7;
    private JTextField yearField;
    private JLabel label4;
    private JComboBox clientIDcombo;
    private JPanel panel2;
    private JButton editButton;
    private JButton backButton;
    // JFormDesigner - End of variables declaration  //GEN-END:variables
}