package mygame;
import java.io.*;import java.io.IOException;
import java.lang.IllegalStateException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.Paths;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class GetEnemyData {
  private static Scanner input;
  
  public static void main(String[] args)
  {
      openFile();
      readRecords();
      closeFile();
  }
  
  public static void openFile()
  {
      try
      {
          input = new Scanner(Paths.get("enemyData.txt"));
      }
      catch(IOException ioException)
      {
          System.err.println("Error opening file...");
          System.exit(1);
      }
  }
  
  public static void readRecords()
  {
  
   try
   {
       while(input.hasNext())//While there is more to read
       {
          int ID = input.nextInt();
          String name = input.next();
          double def = input.nextDouble();
          int atkMin = input.nextInt();
          int atkMax = input.nextInt();
          int health = input.nextInt();
          
          //Store values into array tp pass to other classes
          String[] enemeyData = new String[5];
          String[] enemyData ={"0","7","2","3","4"};
          System.out.println(enemyData[1]);
              
          
        String option ="001";
        switch(option){
          case "001":
            if(ID==001){
              System.out.println("Success!");
              System.out.println("Your ID is: "+ ID);
              String str1 = new Integer(ID).toString();
              enemyData[0] = str1;
              System.out.println("Enemy is: " + name);
              //enemyData[1] = name;
              System.out.println("Enemy defense is: " + def);
              //String str3 = new Integer(def).toString();
              //enemyData[2] = def;
              System.out.println("Enemy minimum atack is: " + atkMin);
              //enemyData[3] = atkMin;
              System.out.println("Your maximum attack is: " + atkMax);
              //enemyData[4] = atkMin;
              System.out.println("Enemy health is: " + health);
              //enemyData[5] = health;
            }
          break;
          case "002":
            if(ID==002){
              System.out.println("Success!");
              System.out.println("Your ID is: "+ ID);
              System.out.println("Your level is: " + name);
              System.out.println("Your defense is: " + def);
              System.out.println("Your minimum atack is: " + atkMin);
              System.out.println("Your maximum attack is: " + atkMax);
              System.out.println("Your health is: " + health);
            }
          break;
          case "003":
            if(ID==003){
              System.out.println("Success!");
              System.out.println("Your ID is: "+ ID);
              System.out.println("Your level is: " + name);
              System.out.println("Your defense is: " + def);
              System.out.println("Your minimum atack is: " + atkMin);
              System.out.println("Your maximum attack is: " + atkMax);
              System.out.println("Your health is: " + health);
            }
          break;
       }
       }
   }
    catch (NoSuchElementException elementException)
          {
           System.err.println("File improperly formed");
          }
   catch (IllegalStateException stateException)
          {
           System.err.println("Error reading from file...");
          }
  }//end method readrecords
  
  public static void closeFile()
  {
      if (input != null)
          input.close();
  }
}

