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
public class chooseT3 extends javax.swing.JPanel {

    /**
     * Creates new form chooseT3
     */
    public chooseT3() {
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
        fileLB = new javax.swing.JLabel();
        coin = new javax.swing.JLabel();
        coinLB = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setPreferredSize(new java.awt.Dimension(1200, 700));
        setLayout(null);

        backBT.setBackground(new java.awt.Color(242, 242, 242));
        backBT.setFont(new java.awt.Font("Bodoni MT", 1, 18)); // NOI18N
        backBT.setText("Next >");
        backBT.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 4, 5, new java.awt.Color(174, 0, 0)));
        backBT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backBTActionPerformed(evt);
            }
        });
        add(backBT);
        backBT.setBounds(980, 610, 100, 40);

        nextBT.setBackground(new java.awt.Color(242, 242, 242));
        nextBT.setFont(new java.awt.Font("Bodoni MT", 1, 18)); // NOI18N
        nextBT.setText("< Back");
        nextBT.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 5, 4, 0, new java.awt.Color(174, 0, 0)));
        add(nextBT);
        nextBT.setBounds(150, 610, 100, 40);

        fileLB.setIcon(new javax.swing.ImageIcon("C:\\Users\\LENOVO\\Desktop\\Aom's GeneticProject\\filebg.png")); // NOI18N
        add(fileLB);
        fileLB.setBounds(1000, 20, 70, 70);

        coin.setFont(new java.awt.Font("Leelawadee", 1, 20)); // NOI18N
        coin.setText("   3");
        coin.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        add(coin);
        coin.setBounds(1100, 40, 50, 20);

        coinLB.setIcon(new javax.swing.ImageIcon("C:\\Users\\LENOVO\\Desktop\\Aom's GeneticProject\\coin.png")); // NOI18N
        add(coinLB);
        coinLB.setBounds(1090, 20, 63, 63);

        jLabel2.setIcon(new javax.swing.ImageIcon("C:\\Users\\LENOVO\\Desktop\\Aom's GeneticProject\\t3.jpg")); // NOI18N
        jLabel2.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        add(jLabel2);
        jLabel2.setBounds(0, 0, 1200, 700);
    }// </editor-fold>//GEN-END:initComponents

    private void backBTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backBTActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_backBTActionPerformed
    /* testing panel*/
    public static void main(String[] args){
    JFrame f = new JFrame();
    f.setContentPane(new chooseT3());
    f.setSize(1200,700);
    f.setResizable(false);
    f.setLocationRelativeTo(null);
    f.setVisible(true);
    f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
}

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backBT;
    private javax.swing.JLabel coin;
    private javax.swing.JLabel coinLB;
    private javax.swing.JLabel fileLB;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JButton nextBT;
    // End of variables declaration//GEN-END:variables
}
