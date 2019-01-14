
package mygame;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class ButtonTest extends JFrame{
        private JButton buttonA, buttonB;
        private JLabel labelCount;
        
        private int clicks = 0;
    
        
    public ButtonTest(){
        createView();
        
        setTitle("Click Me");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        pack();
        setLocationRelativeTo(null); 
        setResizable(false);
        setVisible(true);
    }

   private void createView(){
       JPanel panel = new JPanel();
       getContentPane().add(panel);
       
       labelCount = new JLabel();
       labelCount.setPreferredSize(new Dimension(200, 30));
               panel.add(labelCount);
               updateA();
       buttonA = new JButton("Click Me");
       buttonA.addActionListener(
             new ButtonAActionListener());
       panel.add(buttonA);
       
       buttonB = new JButton("Reset");
       buttonB.addActionListener(
               new ActionListener(){
                   @Override
                   public void actionPerformed(ActionEvent e){
                       //clicks = 0;
                                   JOptionPane.showMessageDialog(null,"Monster does  damage");

                       updateA();
                   }
               }
       
       );
       panel.add(buttonB);
       
       
   }
   
    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run(){
                  new ButtonTest().setVisible(true);
            }   
        });
     
        }
    private void updateA() {
    labelCount.setText("Clicked " + clicks + " times");
    }
    private class ButtonAActionListener implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent e) {
        clicks++;
        updateA();
         
        }
        
    }

}

