package mygame;
import java.io.*;import java.io.IOException;
import java.lang.IllegalStateException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.Paths;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class ReadTextFile {
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
   System.out.printf("%-10s%-12s%-10s%-10s%-10s%-10s%n", 
                     "CharacterID |","Character name |","Defense |","AttackMin |", "AttackMax |", "Health |");
   
   try
   {
       while(input.hasNext())//While there is more to read
       {
           //display record contents 
                             //"%-10s%-12s%-12s%-10s %-10s%-10s%n"
           System.out.printf("%-17d%-12s%7.2f%-12s%-12s%-12d%n", input.nextInt(),
                   input.next(), input.nextDouble(),input.nextInt(),  input.nextInt(), input.nextInt());
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
