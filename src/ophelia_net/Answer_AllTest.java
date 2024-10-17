/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package ophelia_net;

import java.awt.CardLayout;
import javax.swing.JPanel;

/**
 *
 * @author Chotika
 */
public class Answer_AllTest extends javax.swing.JPanel {

    private CardLayout cd;
    private JPanel mainPanel;
   public static String backPage;
    private static final String ADDRESS="AllTestAnswer";
    public Answer_AllTest(JPanel mainPanel) {
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

        jScrollPane1 = new javax.swing.JScrollPane();
        jPanel1 = new javax.swing.JPanel();
        nextBT = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();

        setLayout(new java.awt.BorderLayout());

        jScrollPane1.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        jScrollPane1.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);

        jPanel1.setBackground(new java.awt.Color(40, 35, 35));
        jPanel1.setPreferredSize(new java.awt.Dimension(1200, 3300));
        jPanel1.setLayout(null);

        nextBT.setBackground(new java.awt.Color(242, 242, 242));
        nextBT.setFont(new java.awt.Font("Bodoni MT", 1, 18)); // NOI18N
        nextBT.setText("Next>");
        nextBT.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 4, 5, new java.awt.Color(174, 0, 0)));
        nextBT.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                nextBTMouseClicked(evt);
            }
        });
        jPanel1.add(nextBT);
        nextBT.setBounds(1060, 3230, 100, 40);

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ophelia_net/fingerP_ans3.png"))); // NOI18N
        jLabel3.setText("jLabel3");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(0, 1160, 1200, 700);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ophelia_net/fingerP_ans2.png"))); // NOI18N
        jLabel2.setText("jLabel2");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(0, 480, 1200, 700);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ophelia_net/fingerP_ans1.png"))); // NOI18N
        jLabel1.setText("jLabel1");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(0, 0, 1200, 550);

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ophelia_net/DNA_ans.png"))); // NOI18N
        jPanel1.add(jLabel4);
        jLabel4.setBounds(0, 1860, 1200, 700);

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ophelia_net/comtam_ans.png"))); // NOI18N
        jPanel1.add(jLabel5);
        jLabel5.setBounds(0, 2550, 1200, 700);

        jScrollPane1.setViewportView(jPanel1);

        add(jScrollPane1, java.awt.BorderLayout.CENTER);
    }// </editor-fold>//GEN-END:initComponents

    private void nextBTMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_nextBTMouseClicked
        // TODO add your handling code here:
//        if(backPage.equals("pickKiller")){
//            
//        }
//        else  if(backPage.equals("ChooseWrong")){
//            
//        }
        cd.show(mainPanel, "Newspaper");
    }//GEN-LAST:event_nextBTMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton nextBT;
    // End of variables declaration//GEN-END:variables
}
