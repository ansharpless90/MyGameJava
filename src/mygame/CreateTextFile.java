
package mygame;

import java.io.FileNotFoundException;
//import java.lang.SecurityException;
import java.util.Formatter;
import java.util.FormatterClosedException;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class CreateTextFile
{
        private static Formatter output;

        public static void main(String[] args)
        {
         openFile();
         addRecords();
         closeFile();
        }

public static void openFile()
{
   try
   {
    output = new Formatter("characterData.txt"); //open the file
   }

   catch(SecurityException securityException)
   {
    System.err.println("Write permission denied. Terminating.");
    System.exit(1);
   }

   catch (FileNotFoundException fileNotFoundException)
   {
    System.err.println("Error opening file. Terminanting.");
    System.exit(1);
   }
}

//add records to the file
public static void addRecords()
{
  Scanner input = new Scanner(System.in);
  System.out.printf("%s%n%s%n? ", 
  "Enter characterID, character name, Defense, AttackMin, AttackMax, and health."
    , "Enter end-of-file indicator to end input.");
  while (input.hasNextInt())//loop until end-of-file indicator
  {
      try
      {
          //output new record to file: assumes valid input
          output.format("%d %s %.2f %d %d %d %n", input.nextInt(),
                  input.next(), input.nextDouble(), input.nextInt(), input.nextInt(), input.nextInt());
          System.out.println("Writing...");
      }
      catch (FormatterClosedException formatterClosedException)
      {
       System.err.println("Error writing to file.");
       break;
      }
      catch(NoSuchElementException elementException)
      {
       System.err.println("Invalid input. Please try again");
       input.nextLine();
      }
      
      System.out.print("-- ");
  }//end file
}//end method addRecords

//close file
public static void closeFile()
{
    if (output != null)
        output.close();
}
}//end class text file