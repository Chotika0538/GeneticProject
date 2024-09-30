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
        P3Story story = new P3Story(mainPanel);
        P4Evidence evidence = new P4Evidence(mainPanel);
        P4_2Timeline timeline = new P4_2Timeline(mainPanel);
        P4_3informationRicko inforRicko = new P4_3informationRicko(mainPanel);
        P5testimonyBG testbg = new P5testimonyBG(mainPanel);
        P7AmiTestimony amitest = new P7AmiTestimony(mainPanel);
        P8DesmondTestimony desmondtest = new P8DesmondTestimony(mainPanel);
        P9PoppyTestimony poppytest = new P9PoppyTestimony(mainPanel);
        P10chooseTestimony choosetestbg = new P10chooseTestimony(mainPanel);
        P10_1chooseT1  choose1 = new P10_1chooseT1(mainPanel);
        P10_2chooseT2  choose2 = new P10_2chooseT2(mainPanel);
        P10_3chooseT3 choose3 = new P10_3chooseT3(mainPanel);
        
        mainPanel.add( start, "start");
        mainPanel.add(warning, "warning");
        mainPanel.add(story, "story");
        mainPanel.add(evidence ,"evidence");
        mainPanel.add(timeline, "timeline");
        mainPanel.add(inforRicko, "informationRicko");
        mainPanel.add(testbg, "testbg");
        mainPanel.add(amitest, "amitest");
        mainPanel.add(desmondtest, "desmondtest");
        mainPanel.add(poppytest, "poppytest");
        mainPanel.add(choosetestbg, "choosetestbg");
        mainPanel.add(choose1, "choose1");
        mainPanel.add(choose2, "choose2");
        mainPanel.add(choose3, "choose3");
        
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
