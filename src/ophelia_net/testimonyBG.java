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
public class testimonyBG extends javax.swing.JPanel {

    /**
     * Creates new form testimonyBG
     */
    public testimonyBG() {
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

        nextBT = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();

        setPreferredSize(new java.awt.Dimension(1200, 700));
        setLayout(null);

        nextBT.setBackground(new java.awt.Color(242, 242, 242));
        nextBT.setFont(new java.awt.Font("Bodoni MT", 1, 18)); // NOI18N
        nextBT.setText("Next >");
        nextBT.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 4, 5, new java.awt.Color(174, 0, 0)));
        nextBT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nextBTActionPerformed(evt);
            }
        });
        add(nextBT);
        nextBT.setBounds(1000, 590, 100, 40);

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ophelia_net/testimonyBG.jpg"))); // NOI18N
        jLabel7.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        add(jLabel7);
        jLabel7.setBounds(0, 0, 1200, 700);
    }// </editor-fold>//GEN-END:initComponents

    private void nextBTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nextBTActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nextBTActionPerformed
    /* testing panel*/
    public static void main(String[] args){
    JFrame f = new JFrame();
    f.setContentPane(new testimonyBG());
    f.setSize(1200,700);
    f.setResizable(false);
    f.setLocationRelativeTo(null);
    f.setVisible(true);
    f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
}


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel7;
    private javax.swing.JButton nextBT;
    // End of variables declaration//GEN-END:variables
}
