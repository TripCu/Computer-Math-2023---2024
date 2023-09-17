	//Name:      Date: 
import java.io.*;      //the File class
import java.util.*;    //the Scanner class
public class Driver04
{
   public static void main(String[] args) throws Exception
   {
      Comparable[] apple = input("data.txt");
      sort(apple);
      output(apple, "output.txt");
   }
   	
   public static Comparable[] input(String filename) throws Exception
   {	
      Scanner infile = new Scanner( new File(filename) );
      int numitems = infile.nextInt();
      Comparable[] array = new Weight[numitems];
      for(int k = 0; k < numitems; k++)
      {
         	/************************/
         	/*                      */
         	/* Your code goes here. */
         	/*                      */
         	/************************/
      }
      infile.close();
      return array;
   }
          
   public static void sort(Comparable[] array)
   {
      int maxPos;
      for(int k = 0; k < array.length; k++)
      {
         maxPos = findMax(array, array.length - k);
         swap(array, maxPos, array.length - k - 1);
      }
   }
   
         	/******************************************/
         	/*                                        */
         	/* The rest of the sort methods go here.  */
         	/*                                        */
         	/******************************************/
   
   public static void output(Object[] array, String filename) throws Exception
   {
      PrintWriter outFile = new PrintWriter(new FileWriter(filename));
      for(int k = 0; k < array.length; k++)
         outFile.println(array[k].toString());
      outFile.close();
   }
}