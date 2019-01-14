
package mygame;
import java.security.SecureRandom;
public class CharacterAttack {
    private int attack;
    public CharacterAttack()
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
