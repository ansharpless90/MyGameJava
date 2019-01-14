//Author: Adrian Sharpless
//Last modification date: 10/24/2017

package mygame;

import javax.swing.JOptionPane;

public class BattleLoop {
    
    int playerHP = CharacterHealth.getHealth();
    int playerIT = CharacterItem.getItem();
    int playerDEF = CharacterDefense.getDefense();
    int enemyHP = MonsterHealth.getHealth();
    int playerAT= CharacterAttack.getAttack();
    int enemyAT = MonsterAttack.getAttack();
    static int cont = 5;
    public BattleLoop(){
        attackMethod();
        defendMethod();
        itemMethod();
    }    


  
    public static void main(String[] args) {
        System.out.println("Helol");
        while(cont >= 1)
        {
            
            cont --;
        }


    }

    public int attackMethod(){
      enemyHP -= playerAT;
      JOptionPane.showMessageDialog(null,"You do " + playerAT + " damage");
      if(enemyHP >0){
          playerHP -= enemyAT;
          JOptionPane.showMessageDialog(null,"Monster does " + enemyAT + " damage");
      }
           
      return playerHP;
    }
      
    public int defendMethod(){
      enemyAT =  enemyAT/2;
      playerHP -= enemyAT;
            
      return playerHP;
    }
        
    public int itemMethod(){
      playerHP += 10;
      playerHP -= enemyAT;
      
      return playerHP;
    }

}//end of class BattleLoop      


