//
//name:        date:
//
   import java.awt.*;
   import java.awt.event.*;
   import javax.swing.*;
//
   public class PanelPix extends JPanel
   {
   
      private DisplayPix display;
   
      private ScoreboardPix scoreboard;
   
      public PanelPix()
      {
         setLayout(new BorderLayout());
      //
      // north
      //
         scoreboard = new ScoreboardPix();
         add(scoreboard,BorderLayout.NORTH);
      //
      // east
      //
         JPanel east = new JPanel();
         east.setLayout(new GridLayout(18,1));
      /******************************************************************  1 */
         JButton zero = new JButton("Zero Blue");
         zero.addActionListener(new Listener_zeroBlue());
         east.add(zero);
      /******************************************************************  2 */
         JButton negate = new JButton("Negate");
         negate.setEnabled(false);
         east.add(negate);
      /******************************************************************  3 */
         JButton gray = new JButton("Grayscale");
         gray.setEnabled(false);
         east.add(gray);
      /******************************************************************  4 */
         JButton sepia = new JButton("Sepia Tone");
         sepia.setEnabled(false);
         east.add(sepia);
      /******************************************************************  5 */
         JButton blur = new JButton("Blur");
         blur.setEnabled(false);
         east.add(blur);			
      /******************************************************************  6 */
         JButton posterize = new JButton("Posterize");
         posterize.setEnabled(false);
         east.add(posterize);			
      /******************************************************************  7 */
         JButton splash = new JButton("Color Splash");
         splash.setEnabled(false);
         east.add(splash);					
      /******************************************************************  8 */
         JButton mirrorLR = new JButton("Mirror Left-Right");
         mirrorLR.setEnabled(false);
         east.add(mirrorLR);			
      /******************************************************************  9 */
         JButton mirrorUD = new JButton("Mirror Up-Down");
         mirrorUD.setEnabled(false);
         east.add(mirrorUD);
      /****************************************************************** 10 */
         JButton flipLR = new JButton("Flip Left-Right");
         flipLR.setEnabled(false);
         east.add(flipLR);
      /****************************************************************** 11 */
         JButton flipUD = new JButton("Flip Up-Down");
         flipUD.setEnabled(false);
         east.add(flipUD);			
      /****************************************************************** 12 */
         JButton pixelate = new JButton("Pixelate");
         pixelate.setEnabled(false);
         east.add(pixelate);			
      /****************************************************************** 13 */
         JButton sunsetize = new JButton("Sunsetize");
         sunsetize.setEnabled(false);
         east.add(sunsetize);	
      /****************************************************************** 14 */
         JButton redeye = new JButton("Remove Red-Eye");
         redeye.setEnabled(false);
         east.add(redeye);									
      /****************************************************************** 15 */
         JButton detect = new JButton("Edge Detector");
         detect.setEnabled(false);
         east.add(detect);
      /****************************************************************** 16a */
         JButton encoder = new JButton("Encode");
         encoder.setEnabled(false);
         east.add(encoder);
      /****************************************************************** 16b */
         JButton decoder = new JButton("Decode");
         decoder.setEnabled(false);
         east.add(decoder);		
      
      /****************************************************************** 17 */
         JButton chromakey = new JButton("Chromakey");
         chromakey.setEnabled(false);
         east.add(chromakey);		
      
      /****************************************************************** END */      
         add(east,BorderLayout.EAST);
      //
      // center
      //
         display = new DisplayPix();
         display.addMouseListener(new Mouse());
      
         display.addKeyListener(new Key());
         display.setFocusable(true);
         add(display,BorderLayout.CENTER);
      //
      // south
      //
         JPanel south = new JPanel();
         south.setLayout(new FlowLayout());
         JButton restore = new JButton("Restore Original Image");
         restore.addActionListener(new Listener_restore());
         south.add(restore);
         JButton openimg = new JButton("Open an Image File");
         openimg.addActionListener(new Listener_openimg());
         south.add(openimg);
         JButton undo = new JButton("Undo");
         undo.setEnabled(false);
         south.add(undo);
         add(south,BorderLayout.SOUTH);
      }    
   //
   /**********************************************************************/
   //
   // pixel operation listener
   // 
      private class Listener_zeroBlue implements ActionListener
      {
         public void actionPerformed(ActionEvent e)
         {
            display.zeroBlue();
            update( display.getXval() , display.getYval() );
         }
      } 
   //  ---------->  add more Listeners here   <-----------
   
   
   
   
   
   
   
   //   
   /**********************************************************************/
   //
      private class Listener_restore implements ActionListener
      {
         public void actionPerformed(ActionEvent e)
         {
            display.resetImage();
            update( display.getXval() , display.getYval() );
         }
      }
      private class Listener_openimg implements ActionListener
      {
         public void actionPerformed(ActionEvent e)
         {
            if( display.openImage() )
            {
               update( display.getXval() , display.getYval() );
            }
         }
      }
      private class Mouse extends MouseAdapter
      {
         public void mouseClicked(MouseEvent e)
         {
            update( e.getX() , e.getY() );
         }
      }
      private class Key extends KeyAdapter
      {
         public void keyPressed(KeyEvent e)
         {
            switch( e.getKeyCode() )
            {
               case KeyEvent.VK_UP:    display.up();    
                  break;
               case KeyEvent.VK_DOWN:  display.down();  
                  break;
               case KeyEvent.VK_LEFT:  display.left();  
                  break;
               case KeyEvent.VK_RIGHT: display.right(); 
                  break;
            }
         //
            update( display.getXval() , display.getYval() );
         }
      }     
      private void update(int x, int y)
      {
      int rgb = display.getRGB(x,y);
   //
      display.update(x,y);
      scoreboard.update(display.getCol(),display.getRow(),rgb);
   //
      display.repaint();
   //
      display.requestFocus();
      }
   }
//
// end of file
//