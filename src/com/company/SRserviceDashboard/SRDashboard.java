/*
 * Created by JFormDesigner on Tue Dec 01 11:54:37 EET 2020
 */

package com.company.SRserviceDashboard;

import java.awt.event.*;

import com.company.SRserviceDashboard.Clients.AddClientMenu;
import com.company.SRserviceDashboard.Clients.DeleteClient;
import com.company.SRserviceDashboard.Clients.EditClient;
import com.company.SRserviceDashboard.Sales.AddSale;
import com.company.SRserviceDashboard.Sales.ViewSales;
import com.company.service.LoginSession;
import com.company.service.OpenMenu;
import com.company.service.LogOut;
import com.company.view.Login;
import com.intellij.uiDesigner.core.GridConstraints;
import com.intellij.uiDesigner.core.GridLayoutManager;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;

/**
 * @author unknown
 */
public class SRDashboard extends JFrame {
    public SRDashboard() {
        initComponents();
        UserLabel.setText(LoginSession.UserType);
    }

    private void LogOutButtonActionPerformed(ActionEvent e) {
        // TODO add your code here
        Login loginForm = new Login();
        LogOut.logOut(this, loginForm);
    }

    private void AddClientMouseClicked(MouseEvent e) {
        AddClientMenu addMenu = new AddClientMenu();
        OpenMenu.SRaddClient(this, addMenu);
    }

    private void EditClientMouseClicked(MouseEvent e) {
        com.company.SRserviceDashboard.Clients.EditClient editMenu=new EditClient();
        OpenMenu.SReditClient(this,editMenu);
    }

    private void RemoveClientMouseClicked(MouseEvent e) {
        DeleteClient deleteMenu=new DeleteClient();
        OpenMenu.SRdeleteClient(this,deleteMenu);
    }

    private void addSaleMouseClicked(MouseEvent e) {
        AddSale saleAddMenu=new AddSale();
        OpenMenu.SRaddSale(this,saleAddMenu);
    }

    private void ViewSalesMouseClicked(MouseEvent e) {
        com.company.SRserviceDashboard.Sales.ViewSales viewSale=new ViewSales();
        OpenMenu.SRviewSale(this,viewSale);
    }

    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents
        // Generated using JFormDesigner Evaluation license - unknown
        splitPane1 = new JSplitPane();
        label3 = new JLabel();
        panel1 = new JPanel();
        label1 = new JLabel();
        UserLabel = new JLabel();
        LogOutButton = new JButton();
        label16 = new JLabel();
        panel2 = new JPanel();
        AddClient = new JLabel();
        label2 = new JLabel();
        EditClient = new JLabel();
        label4 = new JLabel();
        RemoveClient = new JLabel();
        label5 = new JLabel();
        label6 = new JLabel();
        label7 = new JLabel();
        label17 = new JLabel();
        panel4 = new JPanel();
        addSale = new JLabel();
        label14 = new JLabel();
        ViewSales = new JLabel();
        label8 = new JLabel();
        label9 = new JLabel();

        //======== this ========
        setAlwaysOnTop(true);
        setMinimumSize(new Dimension(720, 39));
        setBackground(Color.white);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        var contentPane = getContentPane();
        contentPane.setLayout(new GridLayoutManager(5, 1, new Insets(0, 0, 0, 0), -1, -1));

        //======== splitPane1 ========
        {
            splitPane1.setForeground(Color.white);
            splitPane1.setMinimumSize(new Dimension(750, 87));

            //---- label3 ----
            label3.setText("\ud835\udd4a\ud835\udd52\ud835\udd5d\ud835\udd56\ud835\udd64 \ud835\udd44\ud835\udd52\ud835\udd5f\ud835\udd52\ud835\udd58\ud835\udd56\ud835\udd5e\ud835\udd56\ud835\udd5f\ud835\udd65");
            label3.setFont(label3.getFont().deriveFont(label3.getFont().getSize() + 31f));
            label3.setIcon(new ImageIcon(getClass().getResource("/Images/Untitled.png")));
            splitPane1.setLeftComponent(label3);

            //======== panel1 ========
            {
                panel1.setBorder (new javax. swing. border. CompoundBorder( new javax .swing .border .TitledBorder (new javax. swing.
                border. EmptyBorder( 0, 0, 0, 0) , "JF\u006frmDes\u0069gner \u0045valua\u0074ion", javax. swing. border. TitledBorder. CENTER
                , javax. swing. border. TitledBorder. BOTTOM, new java .awt .Font ("D\u0069alog" ,java .awt .Font
                .BOLD ,12 ), java. awt. Color. red) ,panel1. getBorder( )) ); panel1. addPropertyChangeListener (
                new java. beans. PropertyChangeListener( ){ @Override public void propertyChange (java .beans .PropertyChangeEvent e) {if ("\u0062order"
                .equals (e .getPropertyName () )) throw new RuntimeException( ); }} );
                panel1.setLayout(new GridLayoutManager(3, 5, new Insets(0, 0, 0, 0), -1, -1));

                //---- label1 ----
                label1.setText("Logged in as");
                panel1.add(label1, new GridConstraints(1, 0, 1, 1,
                    GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_NONE,
                    GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW,
                    GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW,
                    null, null, null));
                panel1.add(UserLabel, new GridConstraints(1, 1, 1, 4,
                    GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_NONE,
                    GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW,
                    GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW,
                    null, null, null));

                //---- LogOutButton ----
                LogOutButton.setText("Logout");
                LogOutButton.addActionListener(e -> LogOutButtonActionPerformed(e));
                panel1.add(LogOutButton, new GridConstraints(2, 0, 1, 5,
                    GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_NONE,
                    GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW,
                    GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW,
                    null, null, null));
            }
            splitPane1.setRightComponent(panel1);
        }
        contentPane.add(splitPane1, new GridConstraints(0, 0, 1, 1,
            GridConstraints.ANCHOR_NORTH, GridConstraints.FILL_NONE,
            GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW,
            GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW,
            null, null, null));
        contentPane.add(label16, new GridConstraints(1, 0, 1, 1,
            GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_NONE,
            GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW,
            GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW,
            null, null, null));

        //======== panel2 ========
        {
            panel2.setLayout(new GridLayoutManager(4, 14, new Insets(0, 0, 0, 0), -1, -1));

            //---- AddClient ----
            AddClient.setIcon(new ImageIcon(getClass().getResource("/Images/addclient.png")));
            AddClient.setPreferredSize(new Dimension(50, 50));
            AddClient.setMaximumSize(new Dimension(50, 50));
            AddClient.setMinimumSize(new Dimension(100, 100));
            AddClient.setHorizontalAlignment(SwingConstants.LEFT);
            AddClient.addMouseListener(new MouseAdapter() {
                @Override
                public void mouseClicked(MouseEvent e) {
                    AddClientMouseClicked(e);
                }
            });
            panel2.add(AddClient, new GridConstraints(0, 0, 1, 1,
                GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_NONE,
                GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW,
                GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW,
                null, null, null));

            //---- label2 ----
            label2.setText("                  ");
            panel2.add(label2, new GridConstraints(0, 2, 1, 1,
                GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_NONE,
                GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW,
                GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW,
                null, null, null));

            //---- EditClient ----
            EditClient.setIcon(new ImageIcon(getClass().getResource("/Images/editclient.png")));
            EditClient.setHorizontalAlignment(SwingConstants.CENTER);
            EditClient.addMouseListener(new MouseAdapter() {
                @Override
                public void mouseClicked(MouseEvent e) {
                    EditClientMouseClicked(e);
                }
            });
            panel2.add(EditClient, new GridConstraints(0, 5, 1, 1,
                GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_NONE,
                GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW,
                GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW,
                null, null, null));

            //---- label4 ----
            label4.setText("                  ");
            panel2.add(label4, new GridConstraints(0, 7, 1, 1,
                GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_NONE,
                GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW,
                GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW,
                null, null, null));

            //---- RemoveClient ----
            RemoveClient.setIcon(new ImageIcon(getClass().getResource("/Images/removeclient.png")));
            RemoveClient.addMouseListener(new MouseAdapter() {
                @Override
                public void mouseClicked(MouseEvent e) {
                    RemoveClientMouseClicked(e);
                }
            });
            panel2.add(RemoveClient, new GridConstraints(0, 10, 1, 1,
                GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_NONE,
                GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW,
                GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW,
                null, null, null));

            //---- label5 ----
            label5.setText("Add Client");
            label5.setFont(new Font("Tw Cen MT", Font.PLAIN, 14));
            panel2.add(label5, new GridConstraints(1, 0, 1, 1,
                GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_NONE,
                GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW,
                GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW,
                null, null, null));

            //---- label6 ----
            label6.setText("Edit Client");
            label6.setFont(new Font("Tw Cen MT", Font.PLAIN, 14));
            panel2.add(label6, new GridConstraints(1, 5, 1, 1,
                GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_NONE,
                GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW,
                GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW,
                null, null, null));

            //---- label7 ----
            label7.setText("Remove Client");
            label7.setFont(new Font("Tw Cen MT", Font.PLAIN, 14));
            panel2.add(label7, new GridConstraints(1, 10, 1, 1,
                GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_NONE,
                GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW,
                GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW,
                null, null, null));
            panel2.add(label17, new GridConstraints(2, 5, 1, 1,
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

        //======== panel4 ========
        {
            panel4.setLayout(new GridLayoutManager(3, 14, new Insets(0, 0, 0, 0), -1, -1));

            //---- addSale ----
            addSale.setIcon(new ImageIcon(getClass().getResource("/Images/adddeal.png")));
            addSale.addMouseListener(new MouseAdapter() {
                @Override
                public void mouseClicked(MouseEvent e) {
                    addSaleMouseClicked(e);
                }
            });
            panel4.add(addSale, new GridConstraints(0, 0, 1, 1,
                GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_NONE,
                GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW,
                GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW,
                new Dimension(100, 100), null, null));

            //---- label14 ----
            label14.setText("                  ");
            panel4.add(label14, new GridConstraints(0, 2, 1, 1,
                GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_NONE,
                GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW,
                GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW,
                null, null, null));

            //---- ViewSales ----
            ViewSales.setIcon(new ImageIcon(getClass().getResource("/Images/viewDeal.png")));
            ViewSales.setMaximumSize(new Dimension(100, 100));
            ViewSales.setMinimumSize(new Dimension(100, 100));
            ViewSales.addMouseListener(new MouseAdapter() {
                @Override
                public void mouseClicked(MouseEvent e) {
                    ViewSalesMouseClicked(e);
                }
            });
            panel4.add(ViewSales, new GridConstraints(0, 7, 1, 1,
                GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_NONE,
                GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW,
                GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW,
                null, null, null));

            //---- label8 ----
            label8.setText("Add Sale");
            label8.setFont(new Font("Tw Cen MT", Font.PLAIN, 14));
            panel4.add(label8, new GridConstraints(1, 0, 1, 1,
                GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_NONE,
                GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW,
                GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW,
                null, null, null));

            //---- label9 ----
            label9.setText("View Sales");
            label9.setFont(new Font("Tw Cen MT", Font.PLAIN, 14));
            panel4.add(label9, new GridConstraints(1, 7, 1, 1,
                GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_NONE,
                GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW,
                GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW,
                null, null, null));
        }
        contentPane.add(panel4, new GridConstraints(3, 0, 1, 1,
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
    private JLabel label3;
    private JPanel panel1;
    private JLabel label1;
    private JLabel UserLabel;
    private JButton LogOutButton;
    private JLabel label16;
    private JPanel panel2;
    private JLabel AddClient;
    private JLabel label2;
    private JLabel EditClient;
    private JLabel label4;
    private JLabel RemoveClient;
    private JLabel label5;
    private JLabel label6;
    private JLabel label7;
    private JLabel label17;
    private JPanel panel4;
    private JLabel addSale;
    private JLabel label14;
    private JLabel ViewSales;
    private JLabel label8;
    private JLabel label9;
    // JFormDesigner - End of variables declaration  //GEN-END:variables
}
