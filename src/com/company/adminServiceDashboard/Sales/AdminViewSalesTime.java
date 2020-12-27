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
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.util.ArrayList;

/**
 * @author unknown
 */
public class AdminViewSalesTime extends JFrame {
    public AdminViewSalesTime() {
        initComponents();
    }

    private void initTextField(String fromDate,String toDate){
        salesField.setText("");
        ArrayList<Sales> sales=SaleOperations.readSalesByTime(this,fromDate,toDate);
        for(Sales c:sales){
            salesField.append(c.toString()+", Client: "+ ClientOperations.getClientNamesById(this,c.getClientId())+"\n");
        }
    }

    private void selectButtonActionPerformed(ActionEvent e) {
        String fromDate=Integer.parseInt(fromYearField.getText())+"-"+Integer.parseInt(fromMonthField.getText())+"-"+Integer.parseInt(fromDayField.getText());
        String toDate=Integer.parseInt(toYearField.getText())+"-"+Integer.parseInt(toMonthField.getText())+"-"+Integer.parseInt(toDayField.getText());
        initTextField(fromDate,toDate);
    }

    private void backButtonActionPerformed(ActionEvent e) {
        AdminDashboard adminDashboard = new AdminDashboard();
        LogOut.backAdmin(this,adminDashboard);
    }

    private void dayFieldKeyTyped(KeyEvent e) {
        if ((fromDayField.getText() + e.getKeyChar()).length() > 2) {
            e.consume();
        }
    }

    private void monthFieldKeyTyped(KeyEvent e) {
        if ((fromMonthField.getText() + e.getKeyChar()).length() > 2) {
            e.consume();
        }
    }

    private void yearFieldKeyTyped(KeyEvent e) {
            if ((fromYearField.getText() + e.getKeyChar()).length() > 4) {
                e.consume();
        }
    }

    private void toDayFieldKeyTyped(KeyEvent e) {
        if ((toDayField.getText() + e.getKeyChar()).length() > 2) {
            e.consume();
        }
    }

    private void toMonthFieldKeyTyped(KeyEvent e) {
        if ((toMonthField.getText() + e.getKeyChar()).length() > 2) {
            e.consume();
        }
    }

    private void toYearFieldKeyTyped(KeyEvent e) {
        if ((toYearField.getText() + e.getKeyChar()).length() > 4) {
            e.consume();
        }
    }

    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents
        // Generated using JFormDesigner Evaluation license - unknown
        panel1 = new JPanel();
        From = new JLabel();
        panel3 = new JPanel();
        label3 = new JLabel();
        fromDayField = new JTextField();
        label6 = new JLabel();
        fromMonthField = new JTextField();
        label7 = new JLabel();
        fromYearField = new JTextField();
        label2 = new JLabel();
        To = new JPanel();
        label4 = new JLabel();
        toDayField = new JTextField();
        label8 = new JLabel();
        toMonthField = new JTextField();
        label9 = new JLabel();
        toYearField = new JTextField();
        panel2 = new JPanel();
        selectButton = new JButton();
        scrollPane1 = new JScrollPane();
        salesField = new JTextArea();
        backButton = new JButton();

        //======== this ========
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setTitle("View Sales By Time Period");
        setMinimumSize(new Dimension(450, 565));
        setResizable(false);
        var contentPane = getContentPane();
        contentPane.setLayout(new GridLayoutManager(4, 1, new Insets(0, 0, 0, 0), -1, -1));

        //======== panel1 ========
        {
            panel1.setBorder(new javax.swing.border.CompoundBorder(new javax.swing.border.TitledBorder(new javax.swing.border.EmptyBorder
            (0,0,0,0), "JF\u006frmD\u0065sig\u006eer \u0045val\u0075ati\u006fn",javax.swing.border.TitledBorder.CENTER,javax.swing.border
            .TitledBorder.BOTTOM,new java.awt.Font("Dia\u006cog",java.awt.Font.BOLD,12),java.awt
            .Color.red),panel1. getBorder()));panel1. addPropertyChangeListener(new java.beans.PropertyChangeListener(){@Override public void
            propertyChange(java.beans.PropertyChangeEvent e){if("\u0062ord\u0065r".equals(e.getPropertyName()))throw new RuntimeException()
            ;}});
            panel1.setLayout(new GridLayoutManager(3, 2, new Insets(0, 0, 0, 0), -1, -1));

            //---- From ----
            From.setText("From:");
            From.setVerticalAlignment(SwingConstants.BOTTOM);
            panel1.add(From, new GridConstraints(0, 0, 1, 1,
                GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_NONE,
                GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW,
                GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW,
                null, null, null));

            //======== panel3 ========
            {
                panel3.setLayout(new GridLayoutManager(3, 6, new Insets(0, 0, 0, 0), -1, -1));

                //---- label3 ----
                label3.setText("Day");
                panel3.add(label3, new GridConstraints(2, 0, 1, 1,
                    GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_NONE,
                    GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW,
                    GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW,
                    null, null, null));

                //---- fromDayField ----
                fromDayField.setMinimumSize(new Dimension(30, 30));
                fromDayField.setPreferredSize(new Dimension(30, 30));
                fromDayField.addKeyListener(new KeyAdapter() {
                    @Override
                    public void keyTyped(KeyEvent e) {
                        dayFieldKeyTyped(e);
                    }
                });
                panel3.add(fromDayField, new GridConstraints(2, 1, 1, 1,
                    GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_NONE,
                    GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW,
                    GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW,
                    null, null, null));

                //---- label6 ----
                label6.setText("Month");
                panel3.add(label6, new GridConstraints(2, 2, 1, 1,
                    GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_NONE,
                    GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW,
                    GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW,
                    null, null, null));

                //---- fromMonthField ----
                fromMonthField.setPreferredSize(new Dimension(30, 30));
                fromMonthField.setMinimumSize(new Dimension(30, 30));
                fromMonthField.addKeyListener(new KeyAdapter() {
                    @Override
                    public void keyTyped(KeyEvent e) {
                        monthFieldKeyTyped(e);
                    }
                });
                panel3.add(fromMonthField, new GridConstraints(2, 3, 1, 1,
                    GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_NONE,
                    GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW,
                    GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW,
                    null, null, null));

                //---- label7 ----
                label7.setText("Year");
                panel3.add(label7, new GridConstraints(2, 4, 1, 1,
                    GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_NONE,
                    GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW,
                    GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW,
                    null, null, null));

                //---- fromYearField ----
                fromYearField.setPreferredSize(new Dimension(50, 30));
                fromYearField.setMinimumSize(new Dimension(50, 30));
                fromYearField.addKeyListener(new KeyAdapter() {
                    @Override
                    public void keyTyped(KeyEvent e) {
                        yearFieldKeyTyped(e);
                    }
                });
                panel3.add(fromYearField, new GridConstraints(2, 5, 1, 1,
                    GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_NONE,
                    GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW,
                    GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW,
                    null, null, null));
            }
            panel1.add(panel3, new GridConstraints(0, 1, 1, 1,
                GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_NONE,
                GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW,
                GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW,
                null, null, null));

            //---- label2 ----
            label2.setText("To:");
            panel1.add(label2, new GridConstraints(1, 0, 1, 1,
                GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_NONE,
                GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW,
                GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW,
                null, null, null));

            //======== To ========
            {
                To.setLayout(new GridLayoutManager(1, 6, new Insets(0, 0, 0, 0), -1, -1));

                //---- label4 ----
                label4.setText("Day");
                To.add(label4, new GridConstraints(0, 0, 1, 1,
                    GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_NONE,
                    GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW,
                    GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW,
                    null, null, null));

                //---- toDayField ----
                toDayField.setMinimumSize(new Dimension(30, 30));
                toDayField.setPreferredSize(new Dimension(30, 30));
                toDayField.addKeyListener(new KeyAdapter() {
                    @Override
                    public void keyTyped(KeyEvent e) {
                        toDayFieldKeyTyped(e);
                    }
                });
                To.add(toDayField, new GridConstraints(0, 1, 1, 1,
                    GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_NONE,
                    GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW,
                    GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW,
                    null, null, null));

                //---- label8 ----
                label8.setText("Month");
                To.add(label8, new GridConstraints(0, 2, 1, 1,
                    GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_NONE,
                    GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW,
                    GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW,
                    null, null, null));

                //---- toMonthField ----
                toMonthField.setPreferredSize(new Dimension(30, 30));
                toMonthField.setMinimumSize(new Dimension(30, 30));
                toMonthField.addKeyListener(new KeyAdapter() {
                    @Override
                    public void keyTyped(KeyEvent e) {
                        toMonthFieldKeyTyped(e);
                    }
                });
                To.add(toMonthField, new GridConstraints(0, 3, 1, 1,
                    GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_NONE,
                    GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW,
                    GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW,
                    null, null, null));

                //---- label9 ----
                label9.setText("Year");
                To.add(label9, new GridConstraints(0, 4, 1, 1,
                    GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_NONE,
                    GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW,
                    GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW,
                    null, null, null));

                //---- toYearField ----
                toYearField.setPreferredSize(new Dimension(50, 30));
                toYearField.setMinimumSize(new Dimension(50, 30));
                toYearField.addKeyListener(new KeyAdapter() {
                    @Override
                    public void keyTyped(KeyEvent e) {
                        toYearFieldKeyTyped(e);
                    }
                });
                To.add(toYearField, new GridConstraints(0, 5, 1, 1,
                    GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_NONE,
                    GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW,
                    GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW,
                    null, null, null));
            }
            panel1.add(To, new GridConstraints(1, 1, 1, 1,
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

        //======== panel2 ========
        {
            panel2.setLayout(new GridLayoutManager(1, 1, new Insets(0, 0, 0, 0), -1, -1));

            //---- selectButton ----
            selectButton.setText("Select");
            selectButton.addActionListener(e -> selectButtonActionPerformed(e));
            panel2.add(selectButton, new GridConstraints(0, 0, 1, 1,
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

        //======== scrollPane1 ========
        {

            //---- salesField ----
            salesField.setMinimumSize(new Dimension(400, 300));
            salesField.setPreferredSize(new Dimension(750, 300));
            scrollPane1.setViewportView(salesField);
        }
        contentPane.add(scrollPane1, new GridConstraints(2, 0, 1, 1,
            GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_NONE,
            GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW,
            GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW,
            null, null, null));

        //---- backButton ----
        backButton.setText("Back");
        backButton.addActionListener(e -> backButtonActionPerformed(e));
        contentPane.add(backButton, new GridConstraints(3, 0, 1, 1,
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
    private JLabel From;
    private JPanel panel3;
    private JLabel label3;
    private JTextField fromDayField;
    private JLabel label6;
    private JTextField fromMonthField;
    private JLabel label7;
    private JTextField fromYearField;
    private JLabel label2;
    private JPanel To;
    private JLabel label4;
    private JTextField toDayField;
    private JLabel label8;
    private JTextField toMonthField;
    private JLabel label9;
    private JTextField toYearField;
    private JPanel panel2;
    private JButton selectButton;
    private JScrollPane scrollPane1;
    private JTextArea salesField;
    private JButton backButton;
    // JFormDesigner - End of variables declaration  //GEN-END:variables
}
