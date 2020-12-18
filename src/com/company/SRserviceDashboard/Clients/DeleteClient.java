/*
 * Created by JFormDesigner on Fri Dec 04 12:47:41 EET 2020
 */

package com.company.SRserviceDashboard.Clients;
import com.company.SRserviceDashboard.SRDashboard;
import com.company.service.LogOut;
import com.company.service.Operations.*;
import com.company.objects.Clients;
import com.intellij.uiDesigner.core.GridConstraints;
import com.intellij.uiDesigner.core.GridLayoutManager;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.util.ArrayList;

/**
 * @author unknown
 */
public class DeleteClient extends JFrame {
    public DeleteClient() {
        initComponents();
    }

    private void button1ActionPerformed(ActionEvent e) {
        ArrayList<Clients> clientList;
        clientList = ClientOperations.readClients(this);
        clientsPane.setText(null);
        for (Clients c : clientList) {
            clientComboBox.addItem(c.getId());
            clientsPane.append(c + "\n");
        }
    }

    private void BackActionPerformed(ActionEvent e) {
        SRDashboard srDashboard = new SRDashboard();
        LogOut.SRback(this, srDashboard);
    }

    private void DeleteButtonActionPerformed(ActionEvent e) {
        int comboId = (int) clientComboBox.getSelectedItem();
        ClientOperations.deleteClient(this,comboId);
    }


    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents
        // Generated using JFormDesigner Evaluation license - unknown
        panel1 = new JPanel();
        button1 = new JButton();
        scrollPane1 = new JScrollPane();
        clientsPane = new JTextArea();
        panel4 = new JPanel();
        label5 = new JLabel();
        clientComboBox = new JComboBox();
        DeleteButton = new JButton();
        panel2 = new JPanel();
        Back = new JButton();

        //======== this ========
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setTitle("Edit client");
        setMinimumSize(new Dimension(450, 39));
        setResizable(false);
        var contentPane = getContentPane();
        contentPane.setLayout(new GridLayoutManager(1, 1, new Insets(0, 0, 0, 0), -1, -1));

        //======== panel1 ========
        {
            panel1.setBorder(new javax.swing.border.CompoundBorder(new javax.swing.border.TitledBorder(new javax.swing.border.
            EmptyBorder(0,0,0,0), "JF\u006frmD\u0065sig\u006eer \u0045val\u0075ati\u006fn",javax.swing.border.TitledBorder.CENTER,javax.swing
            .border.TitledBorder.BOTTOM,new java.awt.Font("Dia\u006cog",java.awt.Font.BOLD,12),
            java.awt.Color.red),panel1. getBorder()));panel1. addPropertyChangeListener(new java.beans.PropertyChangeListener()
            {@Override public void propertyChange(java.beans.PropertyChangeEvent e){if("\u0062ord\u0065r".equals(e.getPropertyName()))
            throw new RuntimeException();}});
            panel1.setLayout(new GridLayoutManager(8, 1, new Insets(0, 0, 0, 0), -1, -1));

            //---- button1 ----
            button1.setText("Display client info");
            button1.addActionListener(e -> button1ActionPerformed(e));
            panel1.add(button1, new GridConstraints(0, 0, 1, 1,
                GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_NONE,
                GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW,
                GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW,
                new Dimension(350, 20), null, null));

            //======== scrollPane1 ========
            {

                //---- clientsPane ----
                clientsPane.setMinimumSize(new Dimension(350, 100));
                clientsPane.setEditable(false);
                scrollPane1.setViewportView(clientsPane);
            }
            panel1.add(scrollPane1, new GridConstraints(1, 0, 1, 1,
                GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_NONE,
                GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW,
                GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW,
                new Dimension(750, 200), null, null));

            //======== panel4 ========
            {
                panel4.setLayout(new GridLayoutManager(1, 4, new Insets(0, 0, 0, 0), -1, -1));

                //---- label5 ----
                label5.setText("Select ID of client");
                panel4.add(label5, new GridConstraints(0, 0, 1, 1,
                    GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_NONE,
                    GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW,
                    GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW,
                    null, null, null));
                panel4.add(clientComboBox, new GridConstraints(0, 1, 1, 1,
                    GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_NONE,
                    GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW,
                    GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW,
                    null, null, null));

                //---- DeleteButton ----
                DeleteButton.setText("Delete");
                DeleteButton.addActionListener(e -> DeleteButtonActionPerformed(e));
                panel4.add(DeleteButton, new GridConstraints(0, 2, 1, 2,
                    GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_NONE,
                    GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW,
                    GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW,
                    null, null, null));
            }
            panel1.add(panel4, new GridConstraints(2, 0, 1, 1,
                GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_NONE,
                GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW,
                GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW,
                null, null, null));

            //======== panel2 ========
            {
                panel2.setLayout(new GridLayoutManager(1, 3, new Insets(0, 0, 0, 0), -1, -1));

                //---- Back ----
                Back.setText("Back");
                Back.addActionListener(e -> BackActionPerformed(e));
                panel2.add(Back, new GridConstraints(0, 1, 1, 1,
                    GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_NONE,
                    GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW,
                    GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW,
                    null, null, null));
            }
            panel1.add(panel2, new GridConstraints(4, 0, 1, 1,
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
    private JButton button1;
    private JScrollPane scrollPane1;
    private JTextArea clientsPane;
    private JPanel panel4;
    private JLabel label5;
    private JComboBox clientComboBox;
    private JButton DeleteButton;
    private JPanel panel2;
    private JButton Back;
    // JFormDesigner - End of variables declaration  //GEN-END:variables
}
