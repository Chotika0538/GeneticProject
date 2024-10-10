/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package ophelia_net;

import java.awt.CardLayout;
import javax.swing.ButtonGroup;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author LENOVO
 */
public class P11_1_Spoonfingerprint_1 extends javax.swing.JPanel {
 
    private CardLayout cd;
    private JPanel mainPanel;
    public static String BACKPAGE;
    public static final String ADDRESS = "Spoon1";
    private ButtonGroup group;
    
    public P11_1_Spoonfingerprint_1(JPanel mainPanel) {
        this.mainPanel = mainPanel;
        cd = (CardLayout) mainPanel.getLayout();
        initComponents();
        addPage();
        group = new ButtonGroup();
        group.add(chooseRicko);
        group.add(choosePoppy);
        group.add(chooseDesmond);
        group.add(chooseAmi);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        finger2LB = new javax.swing.JLabel();
        fileLB1 = new javax.swing.JLabel();
        toolLB = new javax.swing.JLabel();
        coin = new javax.swing.JLabel();
        coinLB = new javax.swing.JLabel();
        zoomRickoBT = new javax.swing.JButton();
        zoomPoppyBT = new javax.swing.JButton();
        zoomAmiBT = new javax.swing.JButton();
        zoomDesmondBT = new javax.swing.JButton();
        chooseAmi = new javax.swing.JCheckBox();
        chooseDesmond = new javax.swing.JCheckBox();
        choosePoppy = new javax.swing.JCheckBox();
        chooseRicko = new javax.swing.JCheckBox();
        jLabel1 = new javax.swing.JLabel();

        setPreferredSize(new java.awt.Dimension(1200, 700));
        setLayout(null);

        finger2LB.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                finger2LBMouseClicked(evt);
            }
        });
        add(finger2LB);
        finger2LB.setBounds(300, 130, 190, 90);

        fileLB1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ophelia_net/filebg.png"))); // NOI18N
        fileLB1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                fileLB1MouseClicked(evt);
            }
        });
        add(fileLB1);
        fileLB1.setBounds(1040, 20, 70, 70);

        toolLB.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ophelia_net/hint.png"))); // NOI18N
        toolLB.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                toolLBMouseClicked(evt);
            }
        });
        add(toolLB);
        toolLB.setBounds(980, 10, 70, 80);

        coin.setBackground(javax.swing.UIManager.getDefaults().getColor("Actions.Blue"));
        coin.setFont(new java.awt.Font("Leelawadee", 1, 20)); // NOI18N
        coin.setText("   3");
        coin.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        coin.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        add(coin);
        coin.setBounds(1110, 40, 50, 20);

        coinLB.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ophelia_net/coin.png"))); // NOI18N
        add(coinLB);
        coinLB.setBounds(1100, 20, 63, 63);

        zoomRickoBT.setBackground(new java.awt.Color(242, 242, 242));
        zoomRickoBT.setFont(new java.awt.Font("Bodoni MT", 1, 18)); // NOI18N
        zoomRickoBT.setText("ZOOM");
        zoomRickoBT.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(255, 255, 255), new java.awt.Color(255, 255, 255), new java.awt.Color(0, 0, 0), new java.awt.Color(0, 0, 0)));
        zoomRickoBT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                zoomRickoBTActionPerformed(evt);
            }
        });
        add(zoomRickoBT);
        zoomRickoBT.setBounds(670, 300, 80, 30);

        zoomPoppyBT.setBackground(new java.awt.Color(242, 242, 242));
        zoomPoppyBT.setFont(new java.awt.Font("Bodoni MT", 1, 18)); // NOI18N
        zoomPoppyBT.setText("ZOOM");
        zoomPoppyBT.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(255, 255, 255), new java.awt.Color(255, 255, 255), new java.awt.Color(0, 0, 0), new java.awt.Color(0, 0, 0)));
        zoomPoppyBT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                zoomPoppyBTActionPerformed(evt);
            }
        });
        add(zoomPoppyBT);
        zoomPoppyBT.setBounds(950, 300, 80, 30);

        zoomAmiBT.setBackground(new java.awt.Color(242, 242, 242));
        zoomAmiBT.setFont(new java.awt.Font("Bodoni MT", 1, 18)); // NOI18N
        zoomAmiBT.setText("ZOOM");
        zoomAmiBT.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(255, 255, 255), new java.awt.Color(255, 255, 255), new java.awt.Color(0, 0, 0), new java.awt.Color(0, 0, 0)));
        zoomAmiBT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                zoomAmiBTActionPerformed(evt);
            }
        });
        add(zoomAmiBT);
        zoomAmiBT.setBounds(670, 540, 80, 30);

        zoomDesmondBT.setBackground(new java.awt.Color(242, 242, 242));
        zoomDesmondBT.setFont(new java.awt.Font("Bodoni MT", 1, 18)); // NOI18N
        zoomDesmondBT.setText("ZOOM");
        zoomDesmondBT.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(255, 255, 255), new java.awt.Color(255, 255, 255), new java.awt.Color(0, 0, 0), new java.awt.Color(0, 0, 0)));
        zoomDesmondBT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                zoomDesmondBTActionPerformed(evt);
            }
        });
        add(zoomDesmondBT);
        zoomDesmondBT.setBounds(950, 540, 80, 30);

        chooseAmi.setBackground(new java.awt.Color(143, 60, 18));
        chooseAmi.setPreferredSize(new java.awt.Dimension(25, 25));
        add(chooseAmi);
        chooseAmi.setBounds(650, 350, 20, 20);

        chooseDesmond.setBackground(new java.awt.Color(143, 60, 18));
        chooseDesmond.setPreferredSize(new java.awt.Dimension(25, 25));
        add(chooseDesmond);
        chooseDesmond.setBounds(870, 350, 20, 20);

        choosePoppy.setBackground(new java.awt.Color(143, 60, 18));
        choosePoppy.setPreferredSize(new java.awt.Dimension(25, 25));
        add(choosePoppy);
        choosePoppy.setBounds(930, 100, 20, 20);

        chooseRicko.setBackground(new java.awt.Color(143, 60, 18));
        chooseRicko.setPreferredSize(new java.awt.Dimension(25, 25));
        add(chooseRicko);
        chooseRicko.setBounds(650, 100, 20, 20);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ophelia_net/fspoon1Main.png"))); // NOI18N
        jLabel1.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        add(jLabel1);
        jLabel1.setBounds(0, 0, 1200, 700);
    }// </editor-fold>//GEN-END:initComponents

    private void zoomRickoBTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_zoomRickoBTActionPerformed
        cd.show(mainPanel, "Spoon1Ricko");
    }//GEN-LAST:event_zoomRickoBTActionPerformed

    private void zoomPoppyBTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_zoomPoppyBTActionPerformed
        cd.show(mainPanel, "Spoon1Sister");
    }//GEN-LAST:event_zoomPoppyBTActionPerformed

    private void zoomAmiBTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_zoomAmiBTActionPerformed
        cd.show(mainPanel, "Spoon1Wife");
    }//GEN-LAST:event_zoomAmiBTActionPerformed

    private void zoomDesmondBTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_zoomDesmondBTActionPerformed
        cd.show(mainPanel, "Spoon1Waiter");
    }//GEN-LAST:event_zoomDesmondBTActionPerformed

    private void finger2LBMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_finger2LBMouseClicked
        if(!chooseAmi.isSelected() && !chooseDesmond.isSelected() && !choosePoppy.isSelected()&& !chooseRicko.isSelected())
            JOptionPane.showMessageDialog(this, "Select at least one", "Select", JOptionPane.WARNING_MESSAGE);
        else{
            cd.show(mainPanel, "Spoon2");
        }
    }//GEN-LAST:event_finger2LBMouseClicked

    private void fileLB1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_fileLB1MouseClicked
        // file Icon
        P_Menu_icon.backPage=ADDRESS;
        cd.show(mainPanel,"menuBtn");
    }//GEN-LAST:event_fileLB1MouseClicked

    private void toolLBMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_toolLBMouseClicked
        // tool Icon
        P_Hint_page.backPage=ADDRESS;
        cd.show(mainPanel,"toolPage");
    }//GEN-LAST:event_toolLBMouseClicked
  /* testing panel*/
//    public static void main(String[] args){
//        JFrame f = new JFrame();
//        f.setContentPane(new P11_1_Spoonfingerprint_1());
//        f.setSize(1200,700);
//        f.setResizable(false);
//        f.setLocationRelativeTo(null);
//        f.setVisible(true);
//        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//    }
private void addPage(){
        mainPanel.add(new P11_1_SpoonfspoonRicko_1(mainPanel,ADDRESS),"Spoon1Ricko");
        mainPanel.add(new P11_1_SpoonfspoonSister_1(mainPanel,ADDRESS),"Spoon1Sister");
        mainPanel.add(new P11_1_SpoonfspoonWaiter_1(mainPanel,ADDRESS),"Spoon1Waiter");
        mainPanel.add(new P11_1_SpoonfspoonWife_1(mainPanel,ADDRESS),"Spoon1Wife");
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JCheckBox chooseAmi;
    private javax.swing.JCheckBox chooseDesmond;
    private javax.swing.JCheckBox choosePoppy;
    private javax.swing.JCheckBox chooseRicko;
    private javax.swing.JLabel coin;
    private javax.swing.JLabel coinLB;
    private javax.swing.JLabel fileLB1;
    private javax.swing.JLabel finger2LB;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel toolLB;
    private javax.swing.JButton zoomAmiBT;
    private javax.swing.JButton zoomDesmondBT;
    private javax.swing.JButton zoomPoppyBT;
    private javax.swing.JButton zoomRickoBT;
    // End of variables declaration//GEN-END:variables
}
