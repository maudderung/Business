/*
 * Created by JFormDesigner on Tue Dec 01 11:54:37 EET 2020
 */

package com.company.adminServiceDashboard;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

import com.company.adminServiceDashboard.Product.AddProducts;
import com.company.adminServiceDashboard.Product.EditProduct;
import com.company.adminServiceDashboard.Product.RemoveProduct;
import com.company.adminServiceDashboard.Sales.AdminViewSales;
import com.company.adminServiceDashboard.Sales.AdminViewSalesSR;
import com.company.adminServiceDashboard.Sales.AdminViewSalesTime;
import com.company.adminServiceDashboard.Users.AddUser;
import com.company.adminServiceDashboard.Users.EditUser;
import com.company.adminServiceDashboard.Users.RemoveUser;
import com.company.service.OpenMenu;
import com.company.service.LoginSession;
import com.company.service.LogOut;
import com.company.view.Login;
import com.intellij.uiDesigner.core.*;

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

    private void removeProductMouseClicked(MouseEvent e) {
        RemoveProduct removeProduct= new RemoveProduct();
        OpenMenu.AdminRemoveProduct(this,removeProduct);
    }

    private void addUserMouseClicked(MouseEvent e) {
        AddUser addUser=new AddUser();
        OpenMenu.AdminAddUser(this,addUser);
    }

    private void editUserMouseClicked(MouseEvent e) {
        EditUser editUser = new EditUser();
        OpenMenu.AdminEditUser(this,editUser);
    }

    private void removeUserMouseClicked(MouseEvent e) {
        RemoveUser removeUser = new RemoveUser();
        OpenMenu.AdminRemoveUser(this,removeUser);
    }

    private void ViewSalesMouseClicked(MouseEvent e) {
        AdminViewSales viewSales = new AdminViewSales();
        OpenMenu.AdminViewSales(this, viewSales);
    }

    private void viewSalesSRMouseClicked(MouseEvent e) {
        AdminViewSalesSR viewSalesSR = new AdminViewSalesSR();
        OpenMenu.AdminViewSalesSR(this, viewSalesSR);
    }

    private void viewSalesTimeMouseClicked(MouseEvent e) {
        AdminViewSalesTime viewSalesTime= new AdminViewSalesTime();
        OpenMenu.AdminViewSalesTime(this,viewSalesTime);
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
        addUser = new JLabel();
        label12 = new JLabel();
        editUser = new JLabel();
        label19 = new JLabel();
        removeUser = new JLabel();
        label7 = new JLabel();
        label8 = new JLabel();
        label9 = new JLabel();
        panel5 = new JPanel();
        viewSales = new JLabel();
        label20 = new JLabel();
        viewSalesSR = new JLabel();
        label21 = new JLabel();
        viewSalesTime = new JLabel();
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
                panel2.setBorder ( new javax . swing. border .CompoundBorder ( new javax . swing. border .TitledBorder (
                new javax . swing. border .EmptyBorder ( 0, 0 ,0 , 0) ,  "JF\u006frmDes\u0069gner \u0045valua\u0074ion"
                , javax. swing .border . TitledBorder. CENTER ,javax . swing. border .TitledBorder . BOTTOM
                , new java. awt .Font ( "D\u0069alog", java .awt . Font. BOLD ,12 )
                ,java . awt. Color .red ) ,panel2. getBorder () ) ); panel2. addPropertyChangeListener(
                new java. beans .PropertyChangeListener ( ){ @Override public void propertyChange (java . beans. PropertyChangeEvent e
                ) { if( "\u0062order" .equals ( e. getPropertyName () ) )throw new RuntimeException( )
                ;} } );
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
            removeProduct.addMouseListener(new MouseAdapter() {
                @Override
                public void mouseClicked(MouseEvent e) {
                    removeProductMouseClicked(e);
                }
            });
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
            panel4.setLayout(new GridLayoutManager(3, 5, new Insets(0, 0, 0, 0), -1, -1));

            //---- addUser ----
            addUser.setIcon(new ImageIcon(getClass().getResource("/Images/addsr.png")));
            addUser.addMouseListener(new MouseAdapter() {
                @Override
                public void mouseClicked(MouseEvent e) {
                    addUserMouseClicked(e);
                }
            });
            panel4.add(addUser, new GridConstraints(0, 0, 1, 1,
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

            //---- editUser ----
            editUser.setIcon(new ImageIcon(getClass().getResource("/Images/editsr.png")));
            editUser.addMouseListener(new MouseAdapter() {
                @Override
                public void mouseClicked(MouseEvent e) {
                    editUserMouseClicked(e);
                }
            });
            panel4.add(editUser, new GridConstraints(0, 2, 1, 1,
                GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_NONE,
                GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW,
                GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW,
                null, null, null));

            //---- label19 ----
            label19.setText("   ");
            panel4.add(label19, new GridConstraints(0, 3, 1, 1,
                GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_NONE,
                GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW,
                GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW,
                null, null, null));

            //---- removeUser ----
            removeUser.setIcon(new ImageIcon(getClass().getResource("/Images/removeSR.png")));
            removeUser.addMouseListener(new MouseAdapter() {
                @Override
                public void mouseClicked(MouseEvent e) {
                    removeUserMouseClicked(e);
                }
            });
            panel4.add(removeUser, new GridConstraints(0, 4, 1, 1,
                GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_NONE,
                GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW,
                GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW,
                null, null, null));

            //---- label7 ----
            label7.setText("Add a New User");
            label7.setFont(new Font("Tw Cen MT", Font.PLAIN, 14));
            panel4.add(label7, new GridConstraints(1, 0, 1, 1,
                GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_NONE,
                GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW,
                GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW,
                null, null, null));

            //---- label8 ----
            label8.setText("Edit Users");
            label8.setFont(new Font("Tw Cen MT", Font.PLAIN, 14));
            panel4.add(label8, new GridConstraints(1, 2, 1, 1,
                GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_NONE,
                GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW,
                GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW,
                null, null, null));

            //---- label9 ----
            label9.setText("Remove Users");
            label9.setFont(new Font("Tw Cen MT", Font.PLAIN, 14));
            panel4.add(label9, new GridConstraints(1, 4, 1, 1,
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

            //---- viewSales ----
            viewSales.setIcon(new ImageIcon(getClass().getResource("/Images/adminsale.png")));
            viewSales.addMouseListener(new MouseAdapter() {
                @Override
                public void mouseClicked(MouseEvent e) {
                    ViewSalesMouseClicked(e);
                }
            });
            panel5.add(viewSales, new GridConstraints(0, 0, 1, 1,
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

            //---- viewSalesSR ----
            viewSalesSR.setIcon(new ImageIcon(getClass().getResource("/Images/analyzeBySR.png")));
            viewSalesSR.addMouseListener(new MouseAdapter() {
                @Override
                public void mouseClicked(MouseEvent e) {
                    viewSalesSRMouseClicked(e);
                }
            });
            panel5.add(viewSalesSR, new GridConstraints(0, 2, 1, 1,
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

            //---- viewSalesTime ----
            viewSalesTime.setIcon(new ImageIcon(getClass().getResource("/Images/analyzeBytime.png")));
            viewSalesTime.addMouseListener(new MouseAdapter() {
                @Override
                public void mouseClicked(MouseEvent e) {
                    viewSalesTimeMouseClicked(e);
                }
            });
            panel5.add(viewSalesTime, new GridConstraints(0, 5, 1, 1,
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
    private JLabel addUser;
    private JLabel label12;
    private JLabel editUser;
    private JLabel label19;
    private JLabel removeUser;
    private JLabel label7;
    private JLabel label8;
    private JLabel label9;
    private JPanel panel5;
    private JLabel viewSales;
    private JLabel label20;
    private JLabel viewSalesSR;
    private JLabel label21;
    private JLabel viewSalesTime;
    private JLabel label16;
    private JLabel label17;
    private JLabel label18;
    // JFormDesigner - End of variables declaration  //GEN-END:variables
}
