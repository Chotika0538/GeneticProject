/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package ophelia_net;

//import com.formdev.flatlaf.FlatDarkLaf;
//import com.formdev.flatlaf.FlatIntelliJLaf;
//import com.formdev.flatlaf.FlatLaf;
//import com.formdev.flatlaf.FlatLightLaf;
//import com.formdev.flatlaf.FlatPropertiesLaf;
//import com.formdev.flatlaf.themes.FlatMacDarkLaf;
//import com.formdev.flatlaf.themes.FlatMacLightLaf;
import java.awt.CardLayout;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.UIManager;

/**
 *
 * @author Chotika
 */
public class True_criminal extends javax.swing.JPanel {

     private CardLayout cd;
    private JPanel mainPanel;
    
    public True_criminal(JPanel mainPanel) {
        this.mainPanel = mainPanel;
        cd = (CardLayout) mainPanel.getLayout();
        initComponents();
    }
//    public static void main(String[] args) {
////        try{
////            UIManager.setLookAndFeel( new FlatMacLightLaf());
////        }
////        catch(Exception e){
////            System.err.println( "Failed to initialize LaF" );
////        }
//        JFrame jFrame = new JFrame();
//        jFrame.setContentPane(new True_criminal());
//        
//        jFrame.setVisible(true);
//        jFrame.setSize(1200, 700);
//        jFrame.setLocationRelativeTo(null);
//        jFrame.setResizable(false);
//        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//    }

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
        news_1 = new javax.swing.JLabel();
        news_2 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();

        setPreferredSize(new java.awt.Dimension(1200, 700));

        jScrollPane1.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        jScrollPane1.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);

        jPanel1.setBackground(new java.awt.Color(47, 46, 62));
        jPanel1.setPreferredSize(new java.awt.Dimension(1185, 1300));
        jPanel1.setLayout(null);

        news_1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ophelia_net/NewsContent_1.png"))); // NOI18N
        jPanel1.add(news_1);
        news_1.setBounds(0, 0, 1185, 680);

        news_2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ophelia_net/NewsContent_2.png"))); // NOI18N
        news_2.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        news_2.setVerticalTextPosition(javax.swing.SwingConstants.TOP);
        jPanel1.add(news_2);
        news_2.setBounds(0, 670, 1185, 510);

        jButton1.setFont(new java.awt.Font("Segoe UI Light", 1, 24)); // NOI18N
        jButton1.setText("End");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1);
        jButton1.setBounds(460, 1200, 250, 60);

        jScrollPane1.setViewportView(jPanel1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 1200, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 1240, Short.MAX_VALUE)
                .addGap(0, 546, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_jButton1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel news_1;
    private javax.swing.JLabel news_2;
    // End of variables declaration//GEN-END:variables
}
