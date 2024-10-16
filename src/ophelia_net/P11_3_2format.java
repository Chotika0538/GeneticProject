/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package ophelia_net;

import java.awt.CardLayout;
import javax.swing.ButtonGroup;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author Chotika
 */
public class P11_3_2format extends javax.swing.JPanel {

    private CardLayout cd;
    private JPanel mainPanel;
    private static final String ADDRESS="foodFormat";
    private ButtonGroup group;
    
    public P11_3_2format(JPanel mainPanel) {
        this.mainPanel = mainPanel;
        cd = (CardLayout) mainPanel.getLayout();
        initComponents();
        group = new ButtonGroup();
        group.add(choose16S);
        group.add(chooseCO1);
        group.add(chooseMatk);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        searchBT = new javax.swing.JButton();
        toolLB = new javax.swing.JLabel();
        fileLB1 = new javax.swing.JLabel();
        coin = new javax.swing.JLabel();
        coinLB = new javax.swing.JLabel();
        choose16S = new javax.swing.JCheckBox();
        chooseMatk = new javax.swing.JCheckBox();
        chooseCO1 = new javax.swing.JCheckBox();
        baseLB = new javax.swing.JLabel();

        setLayout(null);

        searchBT.setBackground(new java.awt.Color(242, 242, 242));
        searchBT.setFont(new java.awt.Font("Bodoni MT", 1, 18)); // NOI18N
        searchBT.setText("Search>");
        searchBT.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 4, 5, new java.awt.Color(174, 0, 0)));
        searchBT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchBTActionPerformed(evt);
            }
        });
        add(searchBT);
        searchBT.setBounds(1030, 620, 110, 50);

        toolLB.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        toolLB.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ophelia_net/hint.png"))); // NOI18N
        toolLB.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        toolLB.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                toolLBMouseClicked(evt);
            }
        });
        add(toolLB);
        toolLB.setBounds(980, 10, 60, 50);

        fileLB1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        fileLB1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ophelia_net/filebg.png"))); // NOI18N
        fileLB1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                fileLB1MouseClicked(evt);
            }
        });
        add(fileLB1);
        fileLB1.setBounds(1040, 10, 65, 50);

        coin.setBackground(javax.swing.UIManager.getDefaults().getColor("Actions.Blue"));
        coin.setFont(new java.awt.Font("Leelawadee", 1, 20)); // NOI18N
        coin.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        coin.setText(" 3 ");
        coin.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        add(coin);
        coin.setBounds(1110, 0, 40, 60);

        coinLB.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        coinLB.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ophelia_net/coin.png"))); // NOI18N
        coinLB.setAlignmentY(0.0F);
        coinLB.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        add(coinLB);
        coinLB.setBounds(1110, 10, 60, 50);

        choose16S.setBackground(new java.awt.Color(208, 208, 208));
        add(choose16S);
        choose16S.setBounds(810, 270, 20, 19);

        chooseMatk.setBackground(new java.awt.Color(208, 208, 208));
        add(chooseMatk);
        chooseMatk.setBounds(550, 270, 20, 19);

        chooseCO1.setBackground(new java.awt.Color(208, 208, 208));
        add(chooseCO1);
        chooseCO1.setBounds(680, 270, 20, 19);

        baseLB.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ophelia_net/contam_2.png"))); // NOI18N
        baseLB.setText("jLabel1");
        add(baseLB);
        baseLB.setBounds(0, 0, 1200, 700);
    }// </editor-fold>//GEN-END:initComponents

    private void searchBTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchBTActionPerformed
        if(!chooseMatk.isSelected() && !chooseCO1.isSelected() && !choose16S.isSelected())
            JOptionPane.showMessageDialog(this, "Please select before comfirm.", "Select", JOptionPane.WARNING_MESSAGE);
        else{
            if(chooseMatk.isSelected()){
                cd.show(mainPanel, "format1");
            }
            else if(chooseCO1.isSelected()){
                cd.show(mainPanel, "format2");
            }
            else if(choose16S.isSelected()){
                cd.show(mainPanel, "format3");
            }
//            P11_1_1chooseFingerEvi.checked[4]=true;
//            cd.show(mainPanel, "fingerSelected");
        }
    }//GEN-LAST:event_searchBTActionPerformed

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


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel baseLB;
    private javax.swing.JCheckBox choose16S;
    private javax.swing.JCheckBox chooseCO1;
    private javax.swing.JCheckBox chooseMatk;
    static javax.swing.JLabel coin;
    private javax.swing.JLabel coinLB;
    private javax.swing.JLabel fileLB1;
    private javax.swing.JButton searchBT;
    private javax.swing.JLabel toolLB;
    // End of variables declaration//GEN-END:variables
}
