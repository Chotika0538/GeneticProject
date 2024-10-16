/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package ophelia_net;

import java.awt.CardLayout;
import java.awt.Color;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author LENOVO
 */
public class P10chooseTestimony extends javax.swing.JPanel {
   private CardLayout cd;
    private JPanel mainPanel;
    private boolean[] checked={false,false,false};
    private static final String ADDRESS="choosetestbg";
    /**
     * Creates new form StartPage1
     */
    public P10chooseTestimony(JPanel mainPanel) {
        this.mainPanel = mainPanel;
        cd = (CardLayout) mainPanel.getLayout();
        initComponents();
        MainApp.setCoins();
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
        toolLB = new javax.swing.JLabel();
        fileLB1 = new javax.swing.JLabel();
        coin = new javax.swing.JLabel();
        coinLB = new javax.swing.JLabel();
        chosseT1BT = new javax.swing.JButton();
        chooseT2BT = new javax.swing.JButton();
        chooseT3BT = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        setPreferredSize(new java.awt.Dimension(1200, 700));
        setLayout(null);

        backBT.setBackground(new java.awt.Color(242, 242, 242));
        backBT.setFont(new java.awt.Font("Bodoni MT", 1, 18)); // NOI18N
        backBT.setText("<Back");
        backBT.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 5, 4, 0, new java.awt.Color(174, 0, 0)));
        backBT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backBTActionPerformed(evt);
            }
        });
        add(backBT);
        backBT.setBounds(20, 640, 100, 40);

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
        nextBT.setBounds(1070, 640, 100, 40);

        toolLB.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        toolLB.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ophelia_net/hint.png"))); // NOI18N
        toolLB.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        toolLB.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                toolLBMouseClicked(evt);
            }
        });
        add(toolLB);
        toolLB.setBounds(1000, 10, 60, 50);

        fileLB1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        fileLB1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ophelia_net/filebg.png"))); // NOI18N
        fileLB1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                fileLB1MouseClicked(evt);
            }
        });
        add(fileLB1);
        fileLB1.setBounds(1060, 10, 80, 50);

        coin.setBackground(javax.swing.UIManager.getDefaults().getColor("Actions.Blue"));
        coin.setFont(new java.awt.Font("Leelawadee", 1, 20)); // NOI18N
        coin.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        coin.setText(" 3 ");
        coin.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        add(coin);
        coin.setBounds(1132, 0, 40, 60);

        coinLB.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        coinLB.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ophelia_net/coin.png"))); // NOI18N
        coinLB.setAlignmentY(0.0F);
        coinLB.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        add(coinLB);
        coinLB.setBounds(1130, 10, 60, 50);

        chosseT1BT.setBackground(new java.awt.Color(242, 242, 242));
        chosseT1BT.setFont(new java.awt.Font("Bodoni MT", 1, 18)); // NOI18N
        chosseT1BT.setText("CHOOSE(-1 coin)");
        chosseT1BT.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, null, java.awt.Color.white, java.awt.Color.gray, null));
        chosseT1BT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chosseT1BTActionPerformed(evt);
            }
        });
        add(chosseT1BT);
        chosseT1BT.setBounds(140, 560, 170, 40);

        chooseT2BT.setBackground(new java.awt.Color(242, 242, 242));
        chooseT2BT.setFont(new java.awt.Font("Bodoni MT", 1, 18)); // NOI18N
        chooseT2BT.setText("CHOOSE(-1 coin)");
        chooseT2BT.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, null, java.awt.Color.white, java.awt.Color.gray, null));
        chooseT2BT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chooseT2BTActionPerformed(evt);
            }
        });
        add(chooseT2BT);
        chooseT2BT.setBounds(530, 560, 170, 40);

        chooseT3BT.setBackground(new java.awt.Color(242, 242, 242));
        chooseT3BT.setFont(new java.awt.Font("Bodoni MT", 1, 18)); // NOI18N
        chooseT3BT.setText("CHOOSE(-1 coin)");
        chooseT3BT.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, null, java.awt.Color.white, java.awt.Color.gray, null));
        chooseT3BT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chooseT3BTActionPerformed(evt);
            }
        });
        add(chooseT3BT);
        chooseT3BT.setBounds(910, 560, 170, 40);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ophelia_net/chooseTestimony.jpg"))); // NOI18N
        jLabel2.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        add(jLabel2);
        jLabel2.setBounds(0, 0, 1200, 700);
    }// </editor-fold>//GEN-END:initComponents

    private void chosseT1BTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chosseT1BTActionPerformed
        if(checked[0]){
            cd.show(mainPanel, "choose1");
        }else if(MainApp.coins>0){
            MainApp.coins-=1;
            MainApp.setCoins();
            checked[0]=true;
            testimonyPageLookBack.addImage(new ImageIcon(getClass().getResource("/ophelia_net/t1.jpg")).getImage());  // Static call to add the image 
            cd.show(mainPanel, "choose1");
            chosseT1BT.setBackground(Color.green);
            chosseT1BT.setText("chosen");
       }else{
           JOptionPane.showMessageDialog(this, "You're out of coins.", "conis", JOptionPane.WARNING_MESSAGE);
       }
    }//GEN-LAST:event_chosseT1BTActionPerformed

    private void chooseT2BTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chooseT2BTActionPerformed
        if(checked[1]){
            cd.show(mainPanel, "choose2");
        }else if(MainApp.coins>0){
            MainApp.coins-=1;
            MainApp.setCoins();
            checked[1]=true;
            testimonyPageLookBack.addImage(new ImageIcon(getClass().getResource("/ophelia_net/t2.jpg")).getImage());  // Static call to add the image 
            cd.show(mainPanel, "choose2");
            chooseT2BT.setBackground(Color.green);
            chooseT2BT.setText("chosen");         
       }else{
           JOptionPane.showMessageDialog(this, "You're out of coins.", "conis", JOptionPane.WARNING_MESSAGE);
       }
    }//GEN-LAST:event_chooseT2BTActionPerformed

    private void chooseT3BTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chooseT3BTActionPerformed
       if(checked[2]){
           cd.show(mainPanel,"choose3");
       }else if(MainApp.coins>0){
            MainApp.coins-=1;
            MainApp.setCoins();
            checked[2]=true;
            testimonyPageLookBack.addImage(new ImageIcon(getClass().getResource("/ophelia_net/t3.jpg")).getImage());  // Static call to add the image     
            cd.show(mainPanel, "choose3");
            chooseT3BT.setBackground(Color.green);
            chooseT3BT.setText("chosen");
       }else{
           JOptionPane.showMessageDialog(this, "You're out of coins.", "conis", JOptionPane.WARNING_MESSAGE);
       }
    }//GEN-LAST:event_chooseT3BTActionPerformed

    private void toolLBMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_toolLBMouseClicked
        // TODO add your handling code here:
        P_Hint_page.backPage=ADDRESS;
        cd.show(mainPanel,"toolPage");
    }//GEN-LAST:event_toolLBMouseClicked

    private void fileLB1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_fileLB1MouseClicked
        // TODO add your handling code here:
        P_Menu_icon.backPage=ADDRESS;
        cd.show(mainPanel,"menuBtn");
    }//GEN-LAST:event_fileLB1MouseClicked

    private void nextBTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nextBTActionPerformed
        cd.show(mainPanel,"selectWaytoCheck");
    }//GEN-LAST:event_nextBTActionPerformed

    private void backBTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backBTActionPerformed
        cd.show(mainPanel,"testbg");
    }//GEN-LAST:event_backBTActionPerformed
    /* testing panel*/
//    public static void main(String[] args){
//    JFrame f = new JFrame();
//    f.setContentPane(new P10chooseTestimony());
//    f.setSize(1200,700);
//    f.setResizable(false);
//    f.setLocationRelativeTo(null);
//    f.setVisible(true);
//    f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//}

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backBT;
    private javax.swing.JButton chooseT2BT;
    private javax.swing.JButton chooseT3BT;
    private javax.swing.JButton chosseT1BT;
    static javax.swing.JLabel coin;
    private javax.swing.JLabel coinLB;
    private javax.swing.JLabel fileLB1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JButton nextBT;
    private javax.swing.JLabel toolLB;
    // End of variables declaration//GEN-END:variables
 
    
}
