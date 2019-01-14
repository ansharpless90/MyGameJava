//Author: Adrian Sharpless
//Last modification date: 10/10/2017
package mygame;

import javax.swing.JOptionPane;

public class BattleMenu {
    
    
    public static void main(String[] args) {

    }
    public static String getChoice(){
            String choice = 
            JOptionPane.showInputDialog("Attack Defend Item ");
    
    return choice;
    }
    
    public static void  displayChoice(String choice){
        switch (choice) {
            case "Attack":
                JOptionPane.showMessageDialog(null,"You attack! ");
                break;
            case "Defend":
                JOptionPane.showMessageDialog(null, "You defend!");
                break;
            case "Magic":
                JOptionPane.showMessageDialog(null, "You use magic!");
                break;
            default:
                break;
        }
    }


}
