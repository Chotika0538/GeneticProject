/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package ophelia_net;

import java.awt.CardLayout;
import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 *
 * @author LENOVO
 */
public class P11_1_Medfmed1Ricko extends javax.swing.JPanel {

     private CardLayout cd;
    private JPanel mainPanel;
    public static String BACKPAGE;
    
    public P11_1_Medfmed1Ricko(JPanel mainPanel , String back) {
        this.mainPanel = mainPanel;
        cd = (CardLayout) mainPanel.getLayout();
        BACKPAGE=back;
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

        backBT = new javax.swing.JButton();
        finger2LB = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setPreferredSize(new java.awt.Dimension(1200, 700));
        setLayout(null);

        backBT.setBackground(new java.awt.Color(242, 242, 242));
        backBT.setFont(new java.awt.Font("Bodoni MT", 1, 18)); // NOI18N
        backBT.setText("< Back");
        backBT.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 5, 4, 0, new java.awt.Color(174, 0, 0)));
        backBT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backBTActionPerformed(evt);
            }
        });
        add(backBT);
        backBT.setBounds(120, 580, 110, 40);

        finger2LB.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                finger2LBMouseClicked(evt);
            }
        });
        add(finger2LB);
        finger2LB.setBounds(320, 120, 180, 90);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ophelia_net/fmed1Ricko.jpg"))); // NOI18N
        add(jLabel1);
        jLabel1.setBounds(0, 0, 1200, 700);
    }// </editor-fold>//GEN-END:initComponents

    private void backBTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backBTActionPerformed
        cd.show(mainPanel,BACKPAGE);
    }//GEN-LAST:event_backBTActionPerformed

    private void finger2LBMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_finger2LBMouseClicked
//        cd.show(mainPanel, "Med2Ricko");
    }//GEN-LAST:event_finger2LBMouseClicked
  /* testing panel*/
//    public static void main(String[] args){
//        JFrame f = new JFrame();
//        f.setContentPane(new P11_1_Medfmed1Ricko());
//        f.setSize(1200,700);
//        f.setResizable(false);
//        f.setLocationRelativeTo(null);
//        f.setVisible(true);
//        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backBT;
    private javax.swing.JLabel finger2LB;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}
