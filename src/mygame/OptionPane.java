
package mygame;
import java.awt.event.*;
import javax.swing.JButton;
import javax.swing.JOptionPane;
import java.util.Scanner;
import javax.swing.JButton;
public class OptionPane {
 private JButton leftButton;  
 private JButton rightButton;
 
 public void main(){
    leftButton = new JButton("MOVE LEFT");
    rightButton = new JButton("MOVE RIGHT");
    leftButton.addActionListener((ActionListener) this);
    rightButton.addActionListener((ActionListener) this);
    }
}//end class test
