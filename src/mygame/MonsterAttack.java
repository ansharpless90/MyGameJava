
package mygame;

import java.security.SecureRandom;

public class MonsterAttack {
    private int attack;
    public MonsterAttack()
    {
        this.attack = attack;
    }
    public void setAttack(int attack)
    {
        this.attack = attack;
    }
           
    public static int getAttack()
    {
        SecureRandom  randomNumbers = new SecureRandom();
        int randomValue = randomNumbers.nextInt();
        
        int face = randomNumbers.nextInt(6);
        System.out.println(face);
        return face;
    }
   
}