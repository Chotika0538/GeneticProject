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
public class chooseFingerEvi extends javax.swing.JPanel {

    /**
     * Creates new form chooseFingerEvi
     */
    public chooseFingerEvi() {
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

        wineBT = new javax.swing.JButton();
        plateBT = new javax.swing.JButton();
        spoonBT = new javax.swing.JButton();
        potBT = new javax.swing.JButton();
        waterBT = new javax.swing.JButton();
        boxBT = new javax.swing.JButton();
        coin = new javax.swing.JLabel();
        coinLB = new javax.swing.JLabel();
        toolLB = new javax.swing.JLabel();
        fileLB1 = new javax.swing.JLabel();
        plateLB = new javax.swing.JLabel();
        plateLB1 = new javax.swing.JLabel();
        navybg = new javax.swing.JLabel();

        setPreferredSize(new java.awt.Dimension(1200, 700));
        setLayout(null);

        wineBT.setBackground(new java.awt.Color(242, 242, 242));
        wineBT.setFont(new java.awt.Font("Bodoni MT", 1, 18)); // NOI18N
        wineBT.setText("CHOOSE");
        wineBT.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(255, 255, 255), new java.awt.Color(255, 255, 255), new java.awt.Color(0, 0, 0), new java.awt.Color(0, 0, 0)));
        wineBT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                wineBTActionPerformed(evt);
            }
        });
        add(wineBT);
        wineBT.setBounds(200, 290, 110, 40);

        plateBT.setBackground(new java.awt.Color(242, 242, 242));
        plateBT.setFont(new java.awt.Font("Bodoni MT", 1, 18)); // NOI18N
        plateBT.setText("CHOOSE");
        plateBT.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(255, 255, 255), new java.awt.Color(255, 255, 255), new java.awt.Color(0, 0, 0), new java.awt.Color(0, 0, 0)));
        plateBT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                plateBTActionPerformed(evt);
            }
        });
        add(plateBT);
        plateBT.setBounds(510, 240, 110, 40);

        spoonBT.setBackground(new java.awt.Color(242, 242, 242));
        spoonBT.setFont(new java.awt.Font("Bodoni MT", 1, 18)); // NOI18N
        spoonBT.setText("CHOOSE");
        spoonBT.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(255, 255, 255), new java.awt.Color(255, 255, 255), new java.awt.Color(0, 0, 0), new java.awt.Color(0, 0, 0)));
        spoonBT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                spoonBTActionPerformed(evt);
            }
        });
        add(spoonBT);
        spoonBT.setBounds(520, 510, 110, 40);

        potBT.setBackground(new java.awt.Color(242, 242, 242));
        potBT.setFont(new java.awt.Font("Bodoni MT", 1, 18)); // NOI18N
        potBT.setText("CHOOSE");
        potBT.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(255, 255, 255), new java.awt.Color(255, 255, 255), new java.awt.Color(0, 0, 0), new java.awt.Color(0, 0, 0)));
        potBT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                potBTActionPerformed(evt);
            }
        });
        add(potBT);
        potBT.setBounds(820, 240, 110, 40);

        waterBT.setBackground(new java.awt.Color(242, 242, 242));
        waterBT.setFont(new java.awt.Font("Bodoni MT", 1, 18)); // NOI18N
        waterBT.setText("CHOOSE");
        waterBT.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(255, 255, 255), new java.awt.Color(255, 255, 255), new java.awt.Color(0, 0, 0), new java.awt.Color(0, 0, 0)));
        waterBT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                waterBTActionPerformed(evt);
            }
        });
        add(waterBT);
        waterBT.setBounds(790, 480, 110, 40);

        boxBT.setBackground(new java.awt.Color(242, 242, 242));
        boxBT.setFont(new java.awt.Font("Bodoni MT", 1, 18)); // NOI18N
        boxBT.setText("CHOOSE");
        boxBT.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(255, 255, 255), new java.awt.Color(255, 255, 255), new java.awt.Color(0, 0, 0), new java.awt.Color(0, 0, 0)));
        boxBT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boxBTActionPerformed(evt);
            }
        });
        add(boxBT);
        boxBT.setBounds(210, 480, 110, 40);

        coin.setBackground(javax.swing.UIManager.getDefaults().getColor("Actions.Blue"));
        coin.setFont(new java.awt.Font("Leelawadee", 1, 20)); // NOI18N
        coin.setText("   3");
        coin.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        coin.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        add(coin);
        coin.setBounds(1110, 40, 50, 20);

        coinLB.setIcon(new javax.swing.ImageIcon("C:\\Users\\LENOVO\\Desktop\\Aom's GeneticProject\\coin.png")); // NOI18N
        add(coinLB);
        coinLB.setBounds(1100, 20, 63, 63);

        toolLB.setIcon(new javax.swing.ImageIcon("C:\\Users\\LENOVO\\Desktop\\Aom's GeneticProject\\hint.png")); // NOI18N
        add(toolLB);
        toolLB.setBounds(980, 10, 70, 80);

        fileLB1.setIcon(new javax.swing.ImageIcon("C:\\Users\\LENOVO\\Desktop\\Aom's GeneticProject\\filebg.png")); // NOI18N
        add(fileLB1);
        fileLB1.setBounds(1040, 20, 70, 70);

        plateLB.setIcon(new javax.swing.ImageIcon("C:\\Users\\LENOVO\\Desktop\\Aom's GeneticProject\\box.png")); // NOI18N
        add(plateLB);
        plateLB.setBounds(780, 50, 213, 213);

        plateLB1.setIcon(new javax.swing.ImageIcon("C:\\Users\\LENOVO\\Desktop\\Aom's GeneticProject\\plate.png")); // NOI18N
        add(plateLB1);
        plateLB1.setBounds(480, 310, 200, 200);
        plateLB1.getAccessibleContext().setAccessibleDescription("");

        navybg.setIcon(new javax.swing.ImageIcon("C:\\Users\\LENOVO\\Desktop\\Aom's GeneticProject\\navybg.jpg")); // NOI18N
        navybg.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        add(navybg);
        navybg.setBounds(0, 0, 1200, 700);
    }// </editor-fold>//GEN-END:initComponents

    private void wineBTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_wineBTActionPerformed

    }//GEN-LAST:event_wineBTActionPerformed

    private void plateBTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_plateBTActionPerformed

    }//GEN-LAST:event_plateBTActionPerformed

    private void spoonBTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_spoonBTActionPerformed

    }//GEN-LAST:event_spoonBTActionPerformed

    private void potBTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_potBTActionPerformed

    }//GEN-LAST:event_potBTActionPerformed

    private void waterBTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_waterBTActionPerformed

    }//GEN-LAST:event_waterBTActionPerformed

    private void boxBTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boxBTActionPerformed

    }//GEN-LAST:event_boxBTActionPerformed
   /* testing panel*/
    public static void main(String[] args){
        JFrame f = new JFrame();
        f.setContentPane(new chooseFingerEvi());
        f.setSize(1200,700);
        f.setResizable(false);
        f.setLocationRelativeTo(null);
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton boxBT;
    private javax.swing.JLabel coin;
    private javax.swing.JLabel coinLB;
    private javax.swing.JLabel fileLB1;
    private javax.swing.JLabel navybg;
    private javax.swing.JButton plateBT;
    private javax.swing.JLabel plateLB;
    private javax.swing.JLabel plateLB1;
    private javax.swing.JButton potBT;
    private javax.swing.JButton spoonBT;
    private javax.swing.JLabel toolLB;
    private javax.swing.JButton waterBT;
    private javax.swing.JButton wineBT;
    // End of variables declaration//GEN-END:variables
}
