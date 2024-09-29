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
public class P10_1chooseT1 extends javax.swing.JPanel {
    private CardLayout cd;
    private JPanel mainPanel;
    /**
     * Creates new form StartPage1
     */
    public P10_1chooseT1(JPanel mainPanel) {
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
        fileLB = new javax.swing.JLabel();
        coin = new javax.swing.JLabel();
        coinLB = new javax.swing.JLabel();
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
        backBT.setBounds(130, 590, 100, 40);

        fileLB.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ophelia_net/filebg.png"))); // NOI18N
        add(fileLB);
        fileLB.setBounds(1000, 20, 70, 70);

        coin.setFont(new java.awt.Font("Leelawadee", 1, 20)); // NOI18N
        coin.setText("   3");
        coin.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        add(coin);
        coin.setBounds(1100, 40, 50, 20);

        coinLB.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ophelia_net/coin.png"))); // NOI18N
        add(coinLB);
        coinLB.setBounds(1090, 20, 60, 60);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ophelia_net/t1.jpg"))); // NOI18N
        jLabel2.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        add(jLabel2);
        jLabel2.setBounds(0, 0, 1200, 700);
    }// </editor-fold>//GEN-END:initComponents

    private void backBTMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_backBTMouseClicked
        cd.show(mainPanel, "choosetestbg");
    }//GEN-LAST:event_backBTMouseClicked
//    /* testing panel*/
//    public static void main(String[] args){
//    JFrame f = new JFrame();
//    f.setContentPane(new P10_1chooseT1());
//    f.setSize(1200,700);
//    f.setResizable(false);
//    f.setLocationRelativeTo(null);
//    f.setVisible(true);
//    f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//}

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backBT;
    private javax.swing.JLabel coin;
    private javax.swing.JLabel coinLB;
    private javax.swing.JLabel fileLB;
    private javax.swing.JLabel jLabel2;
    // End of variables declaration//GEN-END:variables
}
