/*
 * Created by JFormDesigner on Tue Dec 01 11:54:37 EET 2020
 */

package com.company.view;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

import com.company.service.LogOut;
import com.company.service.LoginSession;
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

    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents
        // Generated using JFormDesigner Evaluation license - unknown
        splitPane1 = new JSplitPane();
        panel2 = new JPanel();
        AdminImage = new JLabel();
        panel1 = new JPanel();
        label1 = new JLabel();
        UserLabel = new JLabel();
        LogOutButton = new JButton();
        label2 = new JLabel();

        //======== this ========
        setAlwaysOnTop(true);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new Dimension(625, 39));
        var contentPane = getContentPane();
        contentPane.setLayout(new GridLayoutManager(3, 1, new Insets(0, 0, 0, 0), -1, -1));

        //======== splitPane1 ========
        {

            //======== panel2 ========
            {
                panel2.setBorder (new javax. swing. border. CompoundBorder( new javax .swing .border .TitledBorder (new javax.
                swing. border. EmptyBorder( 0, 0, 0, 0) , "JFor\u006dDesi\u0067ner \u0045valu\u0061tion", javax. swing. border
                . TitledBorder. CENTER, javax. swing. border. TitledBorder. BOTTOM, new java .awt .Font ("Dia\u006cog"
                ,java .awt .Font .BOLD ,12 ), java. awt. Color. red) ,panel2. getBorder
                ( )) ); panel2. addPropertyChangeListener (new java. beans. PropertyChangeListener( ){ @Override public void propertyChange (java
                .beans .PropertyChangeEvent e) {if ("bord\u0065r" .equals (e .getPropertyName () )) throw new RuntimeException
                ( ); }} );
                panel2.setLayout(new GridLayoutManager(1, 1, new Insets(0, 0, 0, 0), -1, -1));

                //---- AdminImage ----
                AdminImage.setIcon(new ImageIcon(getClass().getResource("/Images/admin.png")));
                panel2.add(AdminImage, new GridConstraints(0, 0, 1, 1,
                    GridConstraints.ANCHOR_SOUTHEAST, GridConstraints.FILL_HORIZONTAL,
                    GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW,
                    GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW,
                    null, null, null));
            }
            splitPane1.setLeftComponent(panel2);

            //======== panel1 ========
            {
                panel1.setLayout(new GridLayoutManager(4, 9, new Insets(0, 0, 0, 0), -1, -1));

                //---- label1 ----
                label1.setText("Logged in as");
                panel1.add(label1, new GridConstraints(1, 0, 1, 1,
                    GridConstraints.ANCHOR_NORTHEAST, GridConstraints.FILL_NONE,
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
                panel1.add(LogOutButton, new GridConstraints(2, 0, 1, 7,
                    GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_NONE,
                    GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW,
                    GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW,
                    null, null, null));
            }
            splitPane1.setRightComponent(panel1);
        }
        contentPane.add(splitPane1, new GridConstraints(0, 0, 1, 1,
            GridConstraints.ANCHOR_NORTHEAST, GridConstraints.FILL_NONE,
            GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW,
            GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW,
            null, null, null));

        //---- label2 ----
        label2.setText("ADMI NIGGAA");
        label2.setFont(label2.getFont().deriveFont(label2.getFont().getSize() + 6f));
        contentPane.add(label2, new GridConstraints(0, 0, 2, 1,
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
    private JLabel AdminImage;
    private JPanel panel1;
    private JLabel label1;
    private JLabel UserLabel;
    private JButton LogOutButton;
    private JLabel label2;
    // JFormDesigner - End of variables declaration  //GEN-END:variables
}
