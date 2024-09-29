/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ophelia_net;
import javax.swing.*;
import java.awt.*;
/**
 *
 * @author LENOVO
 */
public class MainApp extends JFrame {
    public MainApp() {
        JPanel mainPanel = new JPanel(new CardLayout());

        P1StartPage start = new P1StartPage(mainPanel);
        P2WarningPage warning = new P2WarningPage(mainPanel);

        mainPanel.add( start, "start");
        mainPanel.add(warning, "warning");
        
        this.setContentPane(mainPanel);
        this.setSize(1200,700);
        this.setResizable(false);
        this.setLocationRelativeTo(null);
        this.setVisible(true);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    
    public static void main(String[] args){
        new MainApp();
    }

    
    
}
