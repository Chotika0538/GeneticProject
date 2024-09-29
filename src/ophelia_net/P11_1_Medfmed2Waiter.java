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
public class P11_1_Medfmed2Waiter extends javax.swing.JPanel {

    /**
     * Creates new form fmed2Waiter
     */
    public P11_1_Medfmed2Waiter() {
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
        finger1BT = new javax.swing.JToggleButton();
        finger2BT = new javax.swing.JToggleButton();
        jLabel1 = new javax.swing.JLabel();

        setPreferredSize(new java.awt.Dimension(1200, 700));
        setLayout(null);

        backBT.setBackground(new java.awt.Color(242, 242, 242));
        backBT.setFont(new java.awt.Font("Bodoni MT", 1, 18)); // NOI18N
        backBT.setText("< Back");
        backBT.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 5, 4, 0, new java.awt.Color(174, 0, 0)));
        add(backBT);
        backBT.setBounds(120, 580, 110, 40);

        finger1BT.setBackground(new java.awt.Color(139, 224, 159));
        finger1BT.setFont(new java.awt.Font("MiTNThin", 1, 24)); // NOI18N
        finger1BT.setText("รอยนิ้วมือที่ 1");
        finger1BT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                finger1BTActionPerformed(evt);
            }
        });
        add(finger1BT);
        finger1BT.setBounds(120, 130, 190, 110);

        finger2BT.setBackground(new java.awt.Color(70, 135, 86));
        finger2BT.setFont(new java.awt.Font("MiTNThin", 1, 24)); // NOI18N
        finger2BT.setForeground(new java.awt.Color(255, 255, 255));
        finger2BT.setText("รอยนิ้วมือที่ 2");
        add(finger2BT);
        finger2BT.setBounds(310, 130, 200, 110);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ophelia_net/fmed2Waiter.jpg"))); // NOI18N
        add(jLabel1);
        jLabel1.setBounds(0, 0, 1200, 700);
    }// </editor-fold>//GEN-END:initComponents

    private void finger1BTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_finger1BTActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_finger1BTActionPerformed
 /* testing panel*/
    public static void main(String[] args){
        JFrame f = new JFrame();
        f.setContentPane(new P11_1_Medfmed2Waiter());
        f.setSize(1200,700);
        f.setResizable(false);
        f.setLocationRelativeTo(null);
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backBT;
    private javax.swing.JToggleButton finger1BT;
    private javax.swing.JToggleButton finger2BT;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}
