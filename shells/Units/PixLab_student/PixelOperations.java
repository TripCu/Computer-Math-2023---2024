   //
   // Torbert, 24 July 2013
	//
   import java.awt.Color;
   import java.awt.image.BufferedImage;
	//
   public class PixelOperations
   {
      public Color[][] getArray(BufferedImage img)
      {
         Color[][] arr;
      	//
         int numcols = img.getWidth();
         int numrows = img.getHeight();
      	//
         arr = new Color[numrows][numcols];
      	//
         for(int j = 0; j < arr.length; j++)
         {
            for(int k = 0; k < arr[0].length; k++)
            {
               int rgb = img.getRGB(k,j);
            	//
               arr[j][k] = new Color(rgb);
            }
         }
      	//
         return arr;
      }
      public void setImage(BufferedImage img, Color[][] arr)
      {
         for(int j = 0; j < arr.length; j++)
         {
            for(int k = 0; k < arr[0].length; k++)
            {
               Color tmp = arr[j][k];
               //
               int rgb = tmp.getRGB();
               //
               img.setRGB(k,j,rgb);
            }
         }
      }
      //
   	/**********************************************************************/
   	//
   	// pixel operations
   	// 
      public void zeroBlue(Color[][] arr)
      {
         for(int j = 0; j < arr.length; j++)
         {
            for(int k = 0; k < arr[0].length; k++)
            {
               Color tmp = arr[j][k];
               arr[j][k] = new Color( tmp.getRed(), tmp.getGreen(), 0 );
            }
         }
      }
   	//--------> your new methods go here   <--------------
   	
   	
   	
     
   }
   //
	// end of file
	//