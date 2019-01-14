package mygame;

import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
public class GameBattleFrame extends JFrame{
        private JButton Attack, Defend, Item;
        private JLabel YourHP, EnemyHP;
        
      public GameBattleFrame(){
        createView();
        
        setTitle("BattleFrame");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        pack();
        setLocationRelativeTo(null); 
        setResizable(false);
        setVisible(true);
    }
    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run(){
                  new GameBattleFrame().setVisible(true);
            }   
        });


        }
   void createView(){
       JPanel panel = new JPanel();
       getContentPane().add(panel);
       getContentPane().add(panel);
       
       int playerHP = CharacterHealth.getHealth();
       int enemyHP = MonsterHealth.getHealth();


       
       YourHP = new JLabel();
       YourHP.setPreferredSize(new Dimension(200, 30));
       panel.add(YourHP);
       YourHP.setText("Your health is: " + playerHP);
       
       EnemyHP = new JLabel();
       EnemyHP.setPreferredSize(new Dimension(200, 30));
       panel.add(EnemyHP);
       EnemyHP.setText("Enemy health is: " + enemyHP);
       
       
       Attack = new JButton("Attack");
       Attack.addActionListener(
               new ActionListener(){
                   @Override
                   public void actionPerformed(ActionEvent e){
                    JOptionPane.showMessageDialog(null,"You Attack!");
                    int enemyAT = MonsterAttack.getAttack();
                    int playerAT= CharacterAttack.getAttack();
                    EnemyHP.setText("Enemy health is: " + enemyHP);


                                    


                   }
               }
       );
       panel.add(Attack);
       
       //Code For The Defend Button
       Defend = new JButton("Defend");
       Defend.addActionListener(
               new ActionListener(){
                   @Override
                   public void actionPerformed(ActionEvent e){
                    JOptionPane.showMessageDialog(null,"Monster does  damage");
                   }
               }
       );
       panel.add(Defend);
       
       
       //Code For The Item Button
       Item = new JButton("Item");
       Item.addActionListener(
               new ActionListener(){
                   @Override
                   public void actionPerformed(ActionEvent e){
                    JOptionPane.showMessageDialog(null,"You use an Item");
                   }
               }
       );

       panel.add(Item);       
      
   }//End Of Create View
    
}//End Of Class
