   //Name______________________________ Date_____________
import java.io.*;
public class Driver06
{
   public static void main(String[] args) throws Exception
   {
      PrintWriter toFile = new PrintWriter(new FileWriter("output.txt"));
   
      //create the objects
      Circle c = new Circle(75);
         //Rectangle r = new Rectangle(30.0, 40.);    
         //Square s = new Square(50.0);			 	// remove the comment slashes 	
      	//Triangle t = new Triangle(37);          // when your classes are finished
      
      //test the instance methods
      toFile.println("Circle");
      toFile.println("------");
      toFile.println("Radius: " + c.getRadius());
      toFile.println("Area: " + c.findArea());
      toFile.println("Circumference: " + c.findCircumference());
      toFile.println();
   
      toFile.println("Rectangle");
      toFile.println("---------");
      toFile.println("Length: " + r.getLength());
      toFile.println("Height: " + r.getHeight());
      toFile.println("Area: " + r.findArea());
      toFile.println("Perimeter: " + r.findPerimeter());
      toFile.println("Diagonal: " + r.findDiagonal());
      toFile.println();
         
      toFile.println("Square");
      toFile.println("------");
         	/*****************************/
         	/*                           */
         	/* Test the Square class.    */
         	/*                           */
         	/*****************************/
      s.setSide(10.0);
      toFile.println("New side: " + s.getSide());
      toFile.println("New area: " + s.findArea());	
      toFile.println(); 
      
      toFile.println("Triangle");
      toFile.println("--------");
            /*****************************/
         	/*                           */
         	/* Test the Triangle class.  */
         	/*                           */
         	/*****************************/
      toFile.println();
      
      toFile.close();  //necessary!
   }
}