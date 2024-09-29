/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package ophelia_net;

import java.awt.Color;
import javax.swing.JFrame;
import javax.swing.*;

/**
 *
 * @author LENOVO
 */
public class P11_2_2dnanega extends javax.swing.JPanel {

    /**
     * Creates new form dnanega
     */
    public P11_2_2dnanega() {
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

        chooseBT = new javax.swing.JButton();
        coin = new javax.swing.JLabel();
        coinLB = new javax.swing.JLabel();
        toolLB = new javax.swing.JLabel();
        fileLB1 = new javax.swing.JLabel();
        chooseT1 = new javax.swing.JCheckBox();
        chooseT2 = new javax.swing.JCheckBox();
        chooseT3 = new javax.swing.JCheckBox();
        chooseT4 = new javax.swing.JCheckBox();
        jLabel7 = new javax.swing.JLabel();

        setPreferredSize(new java.awt.Dimension(1200, 700));
        setLayout(null);

        chooseBT.setBackground(new java.awt.Color(242, 242, 242));
        chooseBT.setFont(new java.awt.Font("Bodoni MT", 1, 18)); // NOI18N
        chooseBT.setText("CHOOSE");
        chooseBT.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(255, 255, 255), new java.awt.Color(255, 255, 255), new java.awt.Color(0, 0, 0), new java.awt.Color(0, 0, 0)));
        chooseBT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chooseBTActionPerformed(evt);
            }
        });
        add(chooseBT);
        chooseBT.setBounds(540, 590, 110, 40);

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
        add(toolLB);
        toolLB.setBounds(980, 10, 70, 80);

        fileLB1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ophelia_net/filebg.png"))); // NOI18N
        add(fileLB1);
        fileLB1.setBounds(1040, 20, 70, 70);

        chooseT1.setBackground(new java.awt.Color(143, 60, 18));
        chooseT1.setPreferredSize(new java.awt.Dimension(25, 25));
        add(chooseT1);
        chooseT1.setBounds(860, 530, 20, 20);

        chooseT2.setBackground(new java.awt.Color(143, 60, 18));
        chooseT2.setPreferredSize(new java.awt.Dimension(25, 25));
        add(chooseT2);
        chooseT2.setBounds(440, 530, 20, 20);

        chooseT3.setBackground(new java.awt.Color(143, 60, 18));
        chooseT3.setPreferredSize(new java.awt.Dimension(25, 25));
        add(chooseT3);
        chooseT3.setBounds(600, 530, 20, 20);

        chooseT4.setBackground(new java.awt.Color(143, 60, 18));
        chooseT4.setPreferredSize(new java.awt.Dimension(25, 25));
        add(chooseT4);
        chooseT4.setBounds(730, 530, 20, 20);

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ophelia_net/dnanega.jpg"))); // NOI18N
        jLabel7.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        add(jLabel7);
        jLabel7.setBounds(0, 0, 1200, 700);
    }// </editor-fold>//GEN-END:initComponents

    private void chooseBTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chooseBTActionPerformed
     
        
    }//GEN-LAST:event_chooseBTActionPerformed
   /* testing panel*/
    public static void main(String[] args){
        JFrame f = new JFrame();
        f.setContentPane(new P11_2_2dnanega());
        f.setSize(1200,700);
        f.setResizable(false);
        f.setLocationRelativeTo(null);
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton chooseBT;
    private javax.swing.JCheckBox chooseT1;
    private javax.swing.JCheckBox chooseT2;
    private javax.swing.JCheckBox chooseT3;
    private javax.swing.JCheckBox chooseT4;
    private javax.swing.JLabel coin;
    private javax.swing.JLabel coinLB;
    private javax.swing.JLabel fileLB1;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel toolLB;
    // End of variables declaration//GEN-END:variables
}
