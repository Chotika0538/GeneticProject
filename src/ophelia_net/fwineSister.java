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
public class fwineSister extends javax.swing.JPanel {

    /**
     * Creates new form fwineSister
     */
    public fwineSister() {
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
        jLabel1 = new javax.swing.JLabel();

        setPreferredSize(new java.awt.Dimension(1200, 700));
        setLayout(null);

        backBT.setBackground(new java.awt.Color(242, 242, 242));
        backBT.setFont(new java.awt.Font("Bodoni MT", 1, 18)); // NOI18N
        backBT.setText("< Back");
        backBT.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 5, 4, 0, new java.awt.Color(174, 0, 0)));
        add(backBT);
        backBT.setBounds(120, 580, 110, 40);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ophelia_net/fwineSister.jpg"))); // NOI18N
        jLabel1.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        add(jLabel1);
        jLabel1.setBounds(0, 0, 1200, 700);
    }// </editor-fold>//GEN-END:initComponents
 /* testing panel*/
    public static void main(String[] args){
        JFrame f = new JFrame();
        f.setContentPane(new fwineSister());
        f.setSize(1200,700);
        f.setResizable(false);
        f.setLocationRelativeTo(null);
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backBT;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}
