/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package ophelia_net;

import java.awt.CardLayout;
import java.awt.Color;
import javax.swing.JFrame;
import javax.swing.*;

/**
 *
 * @author LENOVO
 */
public class P11_2_2dnanega extends javax.swing.JPanel {
    private CardLayout cd;
    private JPanel mainPanel;
    public static String backPage;
    /**
     * Creates new form dnanega
     */
    public P11_2_2dnanega(JPanel mainPanel) {
        this.mainPanel = mainPanel;
        cd = (CardLayout) mainPanel.getLayout();
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        comfirmBT = new javax.swing.JButton();
        coin = new javax.swing.JLabel();
        coinLB = new javax.swing.JLabel();
        toolLB = new javax.swing.JLabel();
        fileLB1 = new javax.swing.JLabel();
        chooseRicko = new javax.swing.JCheckBox();
        chooseWaiter = new javax.swing.JCheckBox();
        chooseSister = new javax.swing.JCheckBox();
        chooseWife = new javax.swing.JCheckBox();
        backBT = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();

        setPreferredSize(new java.awt.Dimension(1200, 700));
        setLayout(null);

        comfirmBT.setBackground(new java.awt.Color(242, 242, 242));
        comfirmBT.setFont(new java.awt.Font("Bodoni MT", 1, 18)); // NOI18N
        comfirmBT.setText("Comfirm");
        comfirmBT.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(255, 255, 255), new java.awt.Color(255, 255, 255), new java.awt.Color(0, 0, 0), new java.awt.Color(0, 0, 0)));
        comfirmBT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comfirmBTActionPerformed(evt);
            }
        });
        add(comfirmBT);
        comfirmBT.setBounds(660, 600, 110, 40);

        coin.setBackground(javax.swing.UIManager.getDefaults().getColor("Actions.Blue"));
        coin.setFont(new java.awt.Font("Leelawadee", 1, 20)); // NOI18N
        coin.setText("   3");
        coin.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        coin.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        add(coin);
        coin.setBounds(1110, 40, 50, 20);

        coinLB.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ophelia_net/coin.png"))); // NOI18N
        add(coinLB);
        coinLB.setBounds(1100, 20, 60, 60);

        toolLB.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ophelia_net/hint.png"))); // NOI18N
        toolLB.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                toolLBMouseClicked(evt);
            }
        });
        add(toolLB);
        toolLB.setBounds(980, 10, 70, 80);

        fileLB1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ophelia_net/filebg.png"))); // NOI18N
        fileLB1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                fileLB1MouseClicked(evt);
            }
        });
        add(fileLB1);
        fileLB1.setBounds(1040, 20, 70, 70);

        chooseRicko.setBackground(new java.awt.Color(143, 60, 18));
        chooseRicko.setPreferredSize(new java.awt.Dimension(25, 25));
        add(chooseRicko);
        chooseRicko.setBounds(860, 530, 20, 20);

        chooseWaiter.setBackground(new java.awt.Color(143, 60, 18));
        chooseWaiter.setPreferredSize(new java.awt.Dimension(25, 25));
        add(chooseWaiter);
        chooseWaiter.setBounds(440, 530, 20, 20);

        chooseSister.setBackground(new java.awt.Color(143, 60, 18));
        chooseSister.setPreferredSize(new java.awt.Dimension(25, 25));
        add(chooseSister);
        chooseSister.setBounds(600, 530, 20, 20);

        chooseWife.setBackground(new java.awt.Color(143, 60, 18));
        chooseWife.setPreferredSize(new java.awt.Dimension(25, 25));
        add(chooseWife);
        chooseWife.setBounds(730, 530, 20, 20);

        backBT.setBackground(new java.awt.Color(242, 242, 242));
        backBT.setFont(new java.awt.Font("Bodoni MT", 1, 18)); // NOI18N
        backBT.setText("< Back");
        backBT.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 5, 4, 0, new java.awt.Color(174, 0, 0)));
        backBT.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                backBTMouseClicked(evt);
            }
        });
        backBT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backBTActionPerformed(evt);
            }
        });
        add(backBT);
        backBT.setBounds(30, 610, 110, 40);
        backBT.setEnabled(false);
        backBT.setVisible(false);

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ophelia_net/dnanega.jpg"))); // NOI18N
        jLabel7.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        add(jLabel7);
        jLabel7.setBounds(0, 0, 1200, 700);
    }// </editor-fold>//GEN-END:initComponents

    private void comfirmBTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comfirmBTActionPerformed
        if(chooseSister.isSelected() || chooseRicko.isSelected() || chooseWaiter.isSelected() || chooseWife.isSelected()){
            backBT.setEnabled(true);backBT.setVisible(true);
            comfirmBT.setEnabled(false);comfirmBT.setVisible(false);
            coin.setEnabled(false);coin.setVisible(false);
            coinLB.setEnabled(false);coinLB.setVisible(false);
            fileLB1.setEnabled(false);fileLB1.setVisible(false);
            toolLB.setEnabled(false);toolLB.setVisible(false);
            testimonyPageLookBack.dnaSelBtn.setEnabled(true);
            cd.show(mainPanel, "selectWaytoCheck");
        }else{
            JOptionPane.showMessageDialog(this, "Please Select", "Select", JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_comfirmBTActionPerformed

    private void toolLBMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_toolLBMouseClicked
        // TODO add your handling code here:
        P_Hint_page.backPage="adjust";
        cd.show(mainPanel, "toolPage");
    }//GEN-LAST:event_toolLBMouseClicked

    private void fileLB1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_fileLB1MouseClicked
        // TODO add your handling code here:
         P_Menu_icon.backPage="adjust";
         cd.show(mainPanel,"menuBtn");
    }//GEN-LAST:event_fileLB1MouseClicked

    private void backBTMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_backBTMouseClicked
        
    }//GEN-LAST:event_backBTMouseClicked

    private void backBTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backBTActionPerformed
        // TODO add your handling code here:
        cd.show(mainPanel,"testimonyPageLookBack");
    }//GEN-LAST:event_backBTActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backBT;
    private javax.swing.JCheckBox chooseRicko;
    private javax.swing.JCheckBox chooseSister;
    private javax.swing.JCheckBox chooseWaiter;
    private javax.swing.JCheckBox chooseWife;
    static javax.swing.JLabel coin;
    static javax.swing.JLabel coinLB;
    private javax.swing.JButton comfirmBT;
    private javax.swing.JLabel fileLB1;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel toolLB;
    // End of variables declaration//GEN-END:variables
}
