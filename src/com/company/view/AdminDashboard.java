/*
 * Created by JFormDesigner on Tue Dec 01 11:54:37 EET 2020
 */

package com.company.view;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

import com.company.adminServiceDashboard.AddProducts;
import com.company.adminServiceDashboard.EditProduct;
import com.company.service.OpenMenu;
import com.company.service.Operations.LogOut;
import com.company.service.LoginSession;
import com.intellij.uiDesigner.core.*;
import com.mysql.cj.x.protobuf.MysqlxCursor;

/**
 * @author unknown
 */
public class AdminDashboard extends JFrame {
    public AdminDashboard() {
        initComponents();
        UserLabel.setText(LoginSession.UserType);
    }

    private void LogOutButtonActionPerformed(ActionEvent e) {
        // TODO add your code here
        Login loginForm=new Login();
        LogOut.logOut(this,loginForm);
    }

    private void addProductMouseClicked(MouseEvent e) {
        AddProducts addProducts = new AddProducts();
        OpenMenu.AdminAddProduct(this,addProducts);
    }

    private void editProductMouseClicked(MouseEvent e) {
        EditProduct editProduct = new EditProduct();
        OpenMenu.AdminEditProduct(this,editProduct);
    }

    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents
        // Generated using JFormDesigner Evaluation license - unknown
        splitPane1 = new JSplitPane();
        panel2 = new JPanel();
        adminIcon = new JLabel();
        AdminImage = new JLabel();
        panel1 = new JPanel();
        label1 = new JLabel();
        UserLabel = new JLabel();
        LogOutButton = new JButton();
        panel3 = new JPanel();
        addProduct = new JLabel();
        label10 = new JLabel();
        editProduct = new JLabel();
        label11 = new JLabel();
        removeProduct = new JLabel();
        label4 = new JLabel();
        label5 = new JLabel();
        label6 = new JLabel();
        panel4 = new JPanel();
        addSR = new JLabel();
        label12 = new JLabel();
        editSR = new JLabel();
        removeSR = new JLabel();
        label7 = new JLabel();
        label8 = new JLabel();
        label9 = new JLabel();
        panel5 = new JPanel();
        label13 = new JLabel();
        label20 = new JLabel();
        label14 = new JLabel();
        label21 = new JLabel();
        label15 = new JLabel();
        label16 = new JLabel();
        label17 = new JLabel();
        label18 = new JLabel();

        //======== this ========
        setAlwaysOnTop(true);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new Dimension(625, 39));
        var contentPane = getContentPane();
        contentPane.setLayout(new GridLayoutManager(4, 1, new Insets(0, 0, 0, 0), -1, -1));

        //======== splitPane1 ========
        {
            splitPane1.setMinimumSize(new Dimension(834, 70));

            //======== panel2 ========
            {
                panel2.setBorder(new javax.swing.border.CompoundBorder(new javax.swing.border.TitledBorder(new
                javax.swing.border.EmptyBorder(0,0,0,0), "JF\u006frmD\u0065sig\u006eer \u0045val\u0075ati\u006fn",javax
                .swing.border.TitledBorder.CENTER,javax.swing.border.TitledBorder.BOTTOM,new java
                .awt.Font("Dia\u006cog",java.awt.Font.BOLD,12),java.awt
                .Color.red),panel2. getBorder()));panel2. addPropertyChangeListener(new java.beans.
                PropertyChangeListener(){@Override public void propertyChange(java.beans.PropertyChangeEvent e){if("\u0062ord\u0065r".
                equals(e.getPropertyName()))throw new RuntimeException();}});
                panel2.setLayout(new GridLayoutManager(1, 2, new Insets(0, 0, 0, 0), -1, -1));

                //---- adminIcon ----
                adminIcon.setIcon(new ImageIcon(getClass().getResource("/Images/adminIcon.png")));
                panel2.add(adminIcon, new GridConstraints(0, 0, 1, 1,
                    GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_NONE,
                    GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW,
                    GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW,
                    null, null, null));

                //---- AdminImage ----
                AdminImage.setIcon(new ImageIcon(getClass().getResource("/Images/admin.png")));
                panel2.add(AdminImage, new GridConstraints(0, 1, 1, 1,
                    GridConstraints.ANCHOR_SOUTHEAST, GridConstraints.FILL_HORIZONTAL,
                    GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW,
                    GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW,
                    null, null, null));
            }
            splitPane1.setLeftComponent(panel2);

            //======== panel1 ========
            {
                panel1.setMinimumSize(new Dimension(250, 95));
                panel1.setLayout(new GridLayoutManager(4, 9, new Insets(0, 0, 0, 0), -1, -1));

                //---- label1 ----
                label1.setText("Logged in as");
                panel1.add(label1, new GridConstraints(1, 0, 1, 1,
                    GridConstraints.ANCHOR_WEST, GridConstraints.FILL_NONE,
                    GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW,
                    GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW,
                    null, null, null));
                panel1.add(UserLabel, new GridConstraints(1, 1, 1, 4,
                    GridConstraints.ANCHOR_WEST, GridConstraints.FILL_NONE,
                    GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW,
                    GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW,
                    null, null, null));

                //---- LogOutButton ----
                LogOutButton.setText("Logout");
                LogOutButton.addActionListener(e -> LogOutButtonActionPerformed(e));
                panel1.add(LogOutButton, new GridConstraints(2, 0, 1, 7,
                    GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_NONE,
                    GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW,
                    GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW,
                    null, null, null));
            }
            splitPane1.setRightComponent(panel1);
        }
        contentPane.add(splitPane1, new GridConstraints(0, 0, 1, 1,
            GridConstraints.ANCHOR_NORTHWEST, GridConstraints.FILL_NONE,
            GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW,
            GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW,
            null, null, null));

        //======== panel3 ========
        {
            panel3.setLayout(new GridLayoutManager(2, 5, new Insets(0, 0, 0, 0), -1, -1));

            //---- addProduct ----
            addProduct.setIcon(new ImageIcon(getClass().getResource("/Images/addproduct.png")));
            addProduct.addMouseListener(new MouseAdapter() {
                @Override
                public void mouseClicked(MouseEvent e) {
                    addProductMouseClicked(e);
                }
            });
            panel3.add(addProduct, new GridConstraints(0, 0, 1, 1,
                GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_NONE,
                GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW,
                GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW,
                null, null, null));

            //---- label10 ----
            label10.setText("                              ");
            panel3.add(label10, new GridConstraints(0, 1, 1, 1,
                GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_NONE,
                GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW,
                GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW,
                null, null, null));

            //---- editProduct ----
            editProduct.setIcon(new ImageIcon(getClass().getResource("/Images/editproduct.png")));
            editProduct.addMouseListener(new MouseAdapter() {
                @Override
                public void mouseClicked(MouseEvent e) {
                    editProductMouseClicked(e);
                }
            });
            panel3.add(editProduct, new GridConstraints(0, 2, 1, 1,
                GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_NONE,
                GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW,
                GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW,
                null, null, null));

            //---- label11 ----
            label11.setText("                              ");
            panel3.add(label11, new GridConstraints(0, 3, 1, 1,
                GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_NONE,
                GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW,
                GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW,
                null, null, null));

            //---- removeProduct ----
            removeProduct.setIcon(new ImageIcon(getClass().getResource("/Images/deleteproduct.png")));
            panel3.add(removeProduct, new GridConstraints(0, 4, 1, 1,
                GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_NONE,
                GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW,
                GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW,
                null, null, null));

            //---- label4 ----
            label4.setText("Add Product");
            label4.setFont(new Font("Tw Cen MT", Font.PLAIN, 14));
            panel3.add(label4, new GridConstraints(1, 0, 1, 1,
                GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_NONE,
                GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW,
                GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW,
                null, null, null));

            //---- label5 ----
            label5.setText("Edit Product");
            label5.setFont(new Font("Tw Cen MT", Font.PLAIN, 14));
            panel3.add(label5, new GridConstraints(1, 2, 1, 1,
                GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_NONE,
                GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW,
                GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW,
                null, null, null));

            //---- label6 ----
            label6.setText("Remove Product");
            label6.setFont(new Font("Tw Cen MT", Font.PLAIN, 14));
            panel3.add(label6, new GridConstraints(1, 4, 1, 1,
                GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_NONE,
                GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW,
                GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW,
                null, null, null));
        }
        contentPane.add(panel3, new GridConstraints(1, 0, 1, 1,
            GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_NONE,
            GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW,
            GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW,
            null, null, null));

        //======== panel4 ========
        {
            panel4.setLayout(new GridLayoutManager(3, 4, new Insets(0, 0, 0, 0), -1, -1));

            //---- addSR ----
            addSR.setIcon(new ImageIcon(getClass().getResource("/Images/addsr.png")));
            panel4.add(addSR, new GridConstraints(0, 0, 1, 1,
                GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_NONE,
                GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW,
                GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW,
                null, null, null));

            //---- label12 ----
            label12.setText("   ");
            panel4.add(label12, new GridConstraints(0, 1, 1, 1,
                GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_NONE,
                GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW,
                GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW,
                null, null, null));

            //---- editSR ----
            editSR.setIcon(new ImageIcon(getClass().getResource("/Images/editsr.png")));
            panel4.add(editSR, new GridConstraints(0, 2, 1, 1,
                GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_NONE,
                GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW,
                GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW,
                null, null, null));

            //---- removeSR ----
            removeSR.setIcon(new ImageIcon(getClass().getResource("/Images/removeSR.png")));
            panel4.add(removeSR, new GridConstraints(0, 3, 1, 1,
                GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_NONE,
                GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW,
                GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW,
                null, null, null));

            //---- label7 ----
            label7.setText("Add Sales Representative");
            label7.setFont(new Font("Tw Cen MT", Font.PLAIN, 14));
            panel4.add(label7, new GridConstraints(1, 0, 1, 1,
                GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_NONE,
                GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW,
                GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW,
                null, null, null));

            //---- label8 ----
            label8.setText("Edit Sales Representative");
            label8.setFont(new Font("Tw Cen MT", Font.PLAIN, 14));
            panel4.add(label8, new GridConstraints(1, 2, 1, 1,
                GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_NONE,
                GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW,
                GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW,
                null, null, null));

            //---- label9 ----
            label9.setText("Remove Sales Representative");
            label9.setFont(new Font("Tw Cen MT", Font.PLAIN, 14));
            panel4.add(label9, new GridConstraints(1, 3, 1, 1,
                GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_NONE,
                GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW,
                GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW,
                null, null, null));
        }
        contentPane.add(panel4, new GridConstraints(2, 0, 1, 1,
            GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_NONE,
            GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW,
            GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW,
            null, null, null));

        //======== panel5 ========
        {
            panel5.setLayout(new GridLayoutManager(3, 6, new Insets(0, 0, 0, 0), -1, -1));

            //---- label13 ----
            label13.setIcon(new ImageIcon(getClass().getResource("/Images/adminsale.png")));
            panel5.add(label13, new GridConstraints(0, 0, 1, 1,
                GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_NONE,
                GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW,
                GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW,
                null, null, null));

            //---- label20 ----
            label20.setText("                          ");
            panel5.add(label20, new GridConstraints(0, 1, 1, 1,
                GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_NONE,
                GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW,
                GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW,
                null, null, null));

            //---- label14 ----
            label14.setIcon(new ImageIcon(getClass().getResource("/Images/analyzeBySR.png")));
            panel5.add(label14, new GridConstraints(0, 2, 1, 1,
                GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_NONE,
                GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW,
                GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW,
                null, null, null));

            //---- label21 ----
            label21.setText("            ");
            panel5.add(label21, new GridConstraints(0, 4, 1, 1,
                GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_NONE,
                GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW,
                GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW,
                null, null, null));

            //---- label15 ----
            label15.setIcon(new ImageIcon(getClass().getResource("/Images/analyzeBytime.png")));
            panel5.add(label15, new GridConstraints(0, 5, 1, 1,
                GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_NONE,
                GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW,
                GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW,
                null, null, null));

            //---- label16 ----
            label16.setText("View All Sales");
            label16.setFont(new Font("Tw Cen MT", Font.PLAIN, 14));
            panel5.add(label16, new GridConstraints(1, 0, 1, 1,
                GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_NONE,
                GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW,
                GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW,
                null, null, null));

            //---- label17 ----
            label17.setText("View Sales by Representative");
            label17.setFont(new Font("Tw Cen MT", Font.PLAIN, 14));
            panel5.add(label17, new GridConstraints(1, 2, 1, 1,
                GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_NONE,
                GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW,
                GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW,
                null, null, null));

            //---- label18 ----
            label18.setText("View Sales by Time Period");
            label18.setFont(new Font("Tw Cen MT", Font.PLAIN, 14));
            panel5.add(label18, new GridConstraints(1, 5, 1, 1,
                GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_NONE,
                GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW,
                GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW,
                null, null, null));
        }
        contentPane.add(panel5, new GridConstraints(3, 0, 1, 1,
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
    private JSplitPane splitPane1;
    private JPanel panel2;
    private JLabel adminIcon;
    private JLabel AdminImage;
    private JPanel panel1;
    private JLabel label1;
    private JLabel UserLabel;
    private JButton LogOutButton;
    private JPanel panel3;
    private JLabel addProduct;
    private JLabel label10;
    private JLabel editProduct;
    private JLabel label11;
    private JLabel removeProduct;
    private JLabel label4;
    private JLabel label5;
    private JLabel label6;
    private JPanel panel4;
    private JLabel addSR;
    private JLabel label12;
    private JLabel editSR;
    private JLabel removeSR;
    private JLabel label7;
    private JLabel label8;
    private JLabel label9;
    private JPanel panel5;
    private JLabel label13;
    private JLabel label20;
    private JLabel label14;
    private JLabel label21;
    private JLabel label15;
    private JLabel label16;
    private JLabel label17;
    private JLabel label18;
    // JFormDesigner - End of variables declaration  //GEN-END:variables
}
