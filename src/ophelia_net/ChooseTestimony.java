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
public class ChooseTestimony extends javax.swing.JPanel {

    /**
     * Creates new form ChooseTestimony
     */
    public ChooseTestimony() {
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

        coin = new javax.swing.JLabel();
        coinLB = new javax.swing.JLabel();
        fileLB = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();

        setPreferredSize(new java.awt.Dimension(1200, 700));
        setLayout(null);

        coin.setFont(new java.awt.Font("Leelawadee", 1, 20)); // NOI18N
        coin.setText("   3");
        coin.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        add(coin);
        coin.setBounds(1100, 40, 50, 20);

        coinLB.setIcon(new javax.swing.ImageIcon("C:\\Users\\LENOVO\\Desktop\\Aom's GeneticProject\\coin.png")); // NOI18N
        add(coinLB);
        coinLB.setBounds(1090, 20, 63, 63);

        fileLB.setIcon(new javax.swing.ImageIcon("C:\\Users\\LENOVO\\Desktop\\Aom's GeneticProject\\filebg.png")); // NOI18N
        add(fileLB);
        fileLB.setBounds(1000, 20, 70, 70);

        jLabel1.setIcon(new javax.swing.ImageIcon("C:\\Users\\LENOVO\\Desktop\\Aom's GeneticProject\\c3.png")); // NOI18N
        add(jLabel1);
        jLabel1.setBounds(800, 140, 372, 456);

        jLabel5.setIcon(new javax.swing.ImageIcon("C:\\Users\\LENOVO\\Desktop\\Aom's GeneticProject\\cfgp.png")); // NOI18N
        add(jLabel5);
        jLabel5.setBounds(20, 140, 372, 456);

        jLabel6.setIcon(new javax.swing.ImageIcon("C:\\Users\\LENOVO\\Desktop\\Aom's GeneticProject\\cdna.png")); // NOI18N
        add(jLabel6);
        jLabel6.setBounds(410, 140, 372, 456);

        jLabel7.setIcon(new javax.swing.ImageIcon("C:\\Users\\LENOVO\\Desktop\\Aom's GeneticProject\\navybg.jpg")); // NOI18N
        jLabel7.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        add(jLabel7);
        jLabel7.setBounds(0, 0, 1200, 700);
    }// </editor-fold>//GEN-END:initComponents
    /* testing panel*/
    public static void main(String[] args){
    JFrame f = new JFrame();
    f.setContentPane(new ChooseTestimony());
    f.setSize(1200,700);
    f.setResizable(false);
    f.setLocationRelativeTo(null);
    f.setVisible(true);
    f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
}

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel coin;
    private javax.swing.JLabel coinLB;
    private javax.swing.JLabel fileLB;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    // End of variables declaration//GEN-END:variables
}
