/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package ophelia_net;

import javax.swing.JFrame;

/**
 *
 * @author LENOVO
 */
public class P11_3_2_2formatCOI extends javax.swing.JPanel {

    /**
     * Creates new form P11_3_2_2formatCOI
     */
    public P11_3_2_2formatCOI() {
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

        toolLB = new javax.swing.JLabel();
        fileLB1 = new javax.swing.JLabel();
        coin = new javax.swing.JLabel();
        coinLB = new javax.swing.JLabel();
        adjustBT = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();

        setPreferredSize(new java.awt.Dimension(1200, 700));
        setLayout(null);

        toolLB.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ophelia_net/hint.png"))); // NOI18N
        add(toolLB);
        toolLB.setBounds(980, 10, 70, 80);

        fileLB1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ophelia_net/filebg.png"))); // NOI18N
        add(fileLB1);
        fileLB1.setBounds(1040, 20, 70, 70);

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

        adjustBT.setBackground(new java.awt.Color(242, 242, 242));
        adjustBT.setFont(new java.awt.Font("Bodoni MT", 1, 18)); // NOI18N
        adjustBT.setText("Adjust >");
        adjustBT.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 4, 5, new java.awt.Color(174, 0, 0)));
        adjustBT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                adjustBTActionPerformed(evt);
            }
        });
        add(adjustBT);
        adjustBT.setBounds(980, 600, 100, 40);

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ophelia_net/formatCOI.jpg"))); // NOI18N
        jLabel7.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        add(jLabel7);
        jLabel7.setBounds(0, 0, 1200, 700);
    }// </editor-fold>//GEN-END:initComponents

    private void adjustBTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_adjustBTActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_adjustBTActionPerformed
 /* testing panel*/
    public static void main(String[] args){
        JFrame f = new JFrame();
        f.setContentPane(new P11_3_2_2formatCOI());
        f.setSize(1200,700);
        f.setResizable(false);
        f.setLocationRelativeTo(null);
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton adjustBT;
    private javax.swing.JLabel coin;
    private javax.swing.JLabel coinLB;
    private javax.swing.JLabel fileLB1;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel toolLB;
    // End of variables declaration//GEN-END:variables
}
