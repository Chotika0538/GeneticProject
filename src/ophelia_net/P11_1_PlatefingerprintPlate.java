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
public class P11_1_PlatefingerprintPlate extends javax.swing.JPanel {
    private CardLayout cd;
    private JPanel mainPanel;
    public static String BACKPAGE;
    public static final String ADDRESS = "Plate";
    private ButtonGroup group;
    /**
     * Creates new form fingerprintPlate
     */
    public P11_1_PlatefingerprintPlate(JPanel mainPanel) {
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

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        confirmBT = new javax.swing.JButton();
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

        confirmBT.setBackground(new java.awt.Color(242, 242, 242));
        confirmBT.setFont(new java.awt.Font("Bodoni MT", 1, 18)); // NOI18N
        confirmBT.setText("Confirm ");
        confirmBT.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 4, 5, new java.awt.Color(174, 0, 0)));
        confirmBT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                confirmBTActionPerformed(evt);
            }
        });
        add(confirmBT);
        confirmBT.setBounds(1020, 600, 100, 40);

        fileLB1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ophelia_net/filebg.png"))); // NOI18N
        add(fileLB1);
        fileLB1.setBounds(1040, 20, 70, 70);

        toolLB.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ophelia_net/hint.png"))); // NOI18N
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
        zoomRickoBT.setBounds(660, 280, 80, 30);

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
        zoomPoppyBT.setBounds(940, 280, 80, 30);

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
        zoomAmiBT.setBounds(660, 540, 80, 30);

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
        zoomDesmondBT.setBounds(940, 540, 80, 30);

        chooseAmi.setBackground(new java.awt.Color(143, 60, 18));
        chooseAmi.setPreferredSize(new java.awt.Dimension(25, 25));
        add(chooseAmi);
        chooseAmi.setBounds(650, 340, 20, 20);

        chooseDesmond.setBackground(new java.awt.Color(143, 60, 18));
        chooseDesmond.setPreferredSize(new java.awt.Dimension(25, 25));
        add(chooseDesmond);
        chooseDesmond.setBounds(870, 340, 20, 20);

        choosePoppy.setBackground(new java.awt.Color(143, 60, 18));
        choosePoppy.setPreferredSize(new java.awt.Dimension(25, 25));
        add(choosePoppy);
        choosePoppy.setBounds(920, 70, 20, 20);

        chooseRicko.setBackground(new java.awt.Color(143, 60, 18));
        chooseRicko.setPreferredSize(new java.awt.Dimension(25, 25));
        add(chooseRicko);
        chooseRicko.setBounds(640, 70, 20, 20);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ophelia_net/fplate.jpg"))); // NOI18N
        jLabel1.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        add(jLabel1);
        jLabel1.setBounds(0, 0, 1200, 700);
    }// </editor-fold>//GEN-END:initComponents

    private void confirmBTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_confirmBTActionPerformed
        if(!chooseAmi.isSelected() && !chooseDesmond.isSelected() && !choosePoppy.isSelected()&& !chooseRicko.isSelected())
            JOptionPane.showMessageDialog(this, "Please select before comfirm.", "Select", JOptionPane.WARNING_MESSAGE);
        else{
            P11_1_1chooseFingerEvi.checked[5]=true;
            cd.show(mainPanel, "fingerSelected");
        }
    }//GEN-LAST:event_confirmBTActionPerformed

    private void zoomRickoBTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_zoomRickoBTActionPerformed
        cd.show(mainPanel, "PlateRicko");
    }//GEN-LAST:event_zoomRickoBTActionPerformed

    private void zoomPoppyBTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_zoomPoppyBTActionPerformed
        cd.show(mainPanel, "PlateSister");
    }//GEN-LAST:event_zoomPoppyBTActionPerformed

    private void zoomAmiBTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_zoomAmiBTActionPerformed
        cd.show(mainPanel, "PlateWife");
    }//GEN-LAST:event_zoomAmiBTActionPerformed

    private void zoomDesmondBTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_zoomDesmondBTActionPerformed
        cd.show(mainPanel, "PlateWaiter");
    }//GEN-LAST:event_zoomDesmondBTActionPerformed
  /* testing panel*/
//    public static void main(String[] args){
//        JFrame f = new JFrame();
//        f.setContentPane(new P11_1_PlatefingerprintPlate());
//        f.setSize(1200,700);
//        f.setResizable(false);
//        f.setLocationRelativeTo(null);
//        f.setVisible(true);
//        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//    }
    private void addPage(){
        mainPanel.add(new P11_1_PlatefplateRicko(mainPanel,ADDRESS),"PlateRicko");
        mainPanel.add(new P11_1_PlatefplateSister(mainPanel,ADDRESS),"PlateSister");
        mainPanel.add(new P11_1_PlatefplateWaiter(mainPanel,ADDRESS),"PlateWaiter");
        mainPanel.add(new P11_1_PlatefplateWife(mainPanel,ADDRESS),"PlateWife");
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JCheckBox chooseAmi;
    private javax.swing.JCheckBox chooseDesmond;
    private javax.swing.JCheckBox choosePoppy;
    private javax.swing.JCheckBox chooseRicko;
    private javax.swing.JLabel coin;
    private javax.swing.JLabel coinLB;
    private javax.swing.JButton confirmBT;
    private javax.swing.JLabel fileLB1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel toolLB;
    private javax.swing.JButton zoomAmiBT;
    private javax.swing.JButton zoomDesmondBT;
    private javax.swing.JButton zoomPoppyBT;
    private javax.swing.JButton zoomRickoBT;
    // End of variables declaration//GEN-END:variables
}
