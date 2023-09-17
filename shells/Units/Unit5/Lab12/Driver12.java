  	//Name:    Date: 
import java.io.*;
import javax.swing.*;
public class Driver12
{
   public static PrintWriter outFile;
   public static void main(String[] args) throws Exception
   {
      String folder = JOptionPane.showInputDialog("Complete path of folder:");
      String filename = "";
      for(int k = 0; k < folder.length(); k++)
      {
         char ch = folder.charAt(k);
         if(Character.isLetterOrDigit(ch))
            filename = filename + ch;
         else
            filename = filename + '_';
      }
      outFile = new PrintWriter(new FileWriter(filename + ".txt"));
      foo(new File(folder));      //call the recursive method
      outFile.close();
      System.exit(0);
   }
   public static void foo(File f)
   {
         	/************************/
         	/*                      */
         	/* Your code goes here. */
         	/*                      */
         	/************************/
   }
}