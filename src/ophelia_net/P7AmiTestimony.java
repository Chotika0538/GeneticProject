/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package ophelia_net;

import java.awt.CardLayout;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 *
 * @author LENOVO
 */
public class P7AmiTestimony extends javax.swing.JPanel {
   private CardLayout cd;
    private JPanel mainPanel;
    /**
     * Creates new form StartPage1
     */
    public P7AmiTestimony(JPanel mainPanel) {
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

        backBT = new javax.swing.JButton();
        nextBT = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        setPreferredSize(new java.awt.Dimension(1200, 700));
        setLayout(null);

        backBT.setBackground(new java.awt.Color(242, 242, 242));
        backBT.setFont(new java.awt.Font("Bodoni MT", 1, 18)); // NOI18N
        backBT.setText("< Back");
        backBT.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 5, 4, 0, new java.awt.Color(174, 0, 0)));
        backBT.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                backBTMouseClicked(evt);
            }
        });
        add(backBT);
        backBT.setBounds(110, 600, 100, 40);

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
        nextBT.setBounds(990, 600, 100, 40);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ophelia_net/32.jpg"))); // NOI18N
        jLabel2.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        add(jLabel2);
        jLabel2.setBounds(0, 0, 1200, 700);
    }// </editor-fold>//GEN-END:initComponents

    private void nextBTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nextBTActionPerformed
        testimonyPageLookBack.addImage(new ImageIcon(getClass().getResource("/ophelia_net/32.jpg")).getImage());  // Static call to add the image
        cd.show(mainPanel, "desmondtest");
    }//GEN-LAST:event_nextBTActionPerformed

    private void backBTMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_backBTMouseClicked
        // TODO add your handling code here:
        cd.show(mainPanel, "testbg");
    }//GEN-LAST:event_backBTMouseClicked
//   /* testing panel*/
//    public static void main(String[] args){
//    JFrame f = new JFrame();
//    f.setContentPane(new P7AmiTestimony());
//    f.setSize(1200,700);
//    f.setResizable(false);
//    f.setLocationRelativeTo(null);
//    f.setVisible(true);
//    f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//}

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backBT;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JButton nextBT;
    // End of variables declaration//GEN-END:variables
}
