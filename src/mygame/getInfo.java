package mygame;
import java.io.*;import java.io.IOException;
import java.lang.IllegalStateException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.Paths;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class getInfo {
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
          input = new Scanner(Paths.get("characterData.txt"));
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
          
        String option ="3";
        switch(option){
          case "1":
            if(ID==1){
              System.out.println("Success!");
              System.out.println("Your ID is: "+ ID);
              System.out.println("Your level is: " + name);
              System.out.println("Your defense is: " + def);
              System.out.println("Your minimum atack is: " + atkMin);
              System.out.println("Your maximum attack is: " + atkMax);
              System.out.println("Your health is: " + health);
            }
          break;
          case "2":
            if(ID==11){
              System.out.println("Success!");
              System.out.println("Your ID is: "+ ID);
              System.out.println("Your level is: " + name);
              System.out.println("Your defense is: " + def);
              System.out.println("Your minimum atack is: " + atkMin);
              System.out.println("Your maximum attack is: " + atkMax);
              System.out.println("Your health is: " + health);
            }
          break;
          case "3":
            if(ID==111){
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

