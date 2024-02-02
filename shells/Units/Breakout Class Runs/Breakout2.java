import acm.graphics.*;
import acm.program.*;
import acm.util.*;

import java.applet.*;
import java.awt.*;
import java.awt.event.*;

public class Breakout2 extends GraphicsProgram 
{
	
	//width of game display
	private static final int WIDTH = 400; 
	
	//height of game display
	private static final int HEIGHT = 600; 
	
	//width of paddle
	private static final int PADDLE_WIDTH = 60; 
	
	//height of paddle
	private static final int PADDLE_HEIGHT = 10; 
	
	//offset of paddle up from the bottom
	private static final int PADDLE_Y_OFFSET = 30; 
	
	//number of bricks per row
	private static final int NBRICKS_PER_ROW = 10; 
	
	//number of rows of bricks
	private static final int NBRICK_ROWS = 10; 
	
	//separation between bricks
	private static final int BRICK_SEP = 4; 
	
	//width of each brick (based on the dimensions of the game display)
	private static final int BRICK_WIDTH = WIDTH / NBRICKS_PER_ROW - BRICK_SEP;
	
	//height of brick
	private static final int BRICK_HEIGHT = 8;
	
	//radius of ball in pixels
	private static final int BALL_RADIUS = 6; 
	
	//offset of the top brick row from top
	private static final int BRICK_Y_OFFSET = 70; 
	
	//number of turns
	private static final int NTURNS = 3;
	
	//the paddle
	private GRect paddle;
	
	//the ball
	private GOval ball;
	
	//ball velocity in both directions (x-direction, and y-direction)
	private double vx, vy;
	
	//records the last x position of the mouse (see mouseMoved method)
	private double lastX;
	
	//used for mouse events (only moves the paddle every 5th mouse move)
	private int toggle = 0;
   
   private RandomGenerator rgen = RandomGenerator.getInstance();
   
   private static final int DELAY = 10;
   
   private void printGameOver()
   {
      GLabel gameOver = new GLabel("GAME OVER. TRY AGAIN?", WIDTH / 2, HEIGHT / 2);
      gameOver.setColor(Color.RED);
      add(gameOver);
   }
   private int brickCounter = 100;
   
   private void printWinner()
   {
      GLabel Winner = new GLabel("WINNER", WIDTH / 2, HEIGHT / 2); 
      Winner.setColor(Color.BLUE);
      add(Winner);
   } 
   
   private int score = 0; 
   
   private void printScore()
   {
      GLabel Score = new GLabel("SCORE: " + score, 25, 30);
   }
      
	
	//main method -- called when the program is run
	public static void main(String[] args)
	{
		String[] sizeArgs = { "width=" + WIDTH, "height=" + HEIGHT };
		new Breakout2().start(sizeArgs);
	}
	
	//run method -- called indirectly from the main method
	public void run()
	{
      for(int x = 0; x < NTURNS; x++)
      {
		   setup();
         waitForClick();
		   play();
         if(brickCounter == 0)
         {
            ball.setVisible(false);
            printWinner();
            break;
         }
         if(brickCounter > 0)
         {
            removeAll();
         }
      }
      if(brickCounter > 0)
      {    
         printGameOver();
         remove(ball);
         waitForClick();
         score = 0;
         setup();
         waitForClick();
         play();
      }                  
	}
	
	//setup method -- called from the run method
	public void setup()
	{
		createBricks();
		createPaddle();
		createBall();
		addMouseListeners();
      add(Score);
	}
	
	//createBricks method -- called from the setup method
	public void createBricks()
	{
		//make the bricks
		for(int x = 0; x < NBRICK_ROWS; x++)
		{
			for(int y = 0; y < NBRICKS_PER_ROW; y++)
			{
				GRect brick = new GRect((y * BRICK_WIDTH) + BRICK_SEP*y + BRICK_SEP/2, 
											BRICK_Y_OFFSET + (BRICK_HEIGHT * x) + BRICK_SEP*x, 
												BRICK_WIDTH, 
													BRICK_HEIGHT);
				brick.setFilled(true);
            
            if(x == 0 || x == 1)
				brick.setFillColor(Color.RED);
            else if(x == 2 || x == 3)
            brick.setFillColor(Color.ORANGE);
            else if(x == 4 || x == 5)
            brick.setFillColor(Color.YELLOW);
            else if(x == 6 || x == 7)
            brick.setFillColor(Color.GREEN);
            else if(x == 8 || x == 9)
            brick.setFillColor(Color.CYAN);
        								
				add(brick);
			}
		}
	}
	
	//createPaddle method -- called from the setup method
	public void createPaddle()
	{
		paddle = new GRect((WIDTH / 2),(HEIGHT - PADDLE_Y_OFFSET),PADDLE_WIDTH, PADDLE_HEIGHT);
      
      paddle.setFilled(true);
      paddle.setFillColor(Color.BLACK);
      
      add(paddle);
      
	}
	
	//createBall method -- called from the setup method
	public void createBall()
	{
		ball = new GOval((WIDTH / 2), (HEIGHT / 2), (BALL_RADIUS * 2), (BALL_RADIUS * 2));
      
      ball.setFilled(true);
      ball.setFillColor(Color.BLACK);
      
      add(ball);
	}
	
	//play method -- called from the run method after setup
	public void play()
	{
      waitForClick();
      startTheBall();
      while(true)
      {
		   playBall();
         if(ball.getY() >= getHeight())
         {
             break;
         } 
         if(brickCounter == 0)
         {
             break;
         }
      }             
    } 
	
	//startTheBall method -- called from the play method
	public void startTheBall()
	{
      vx = rgen.nextDouble(1.0, 3.0);
      vy = 3.0;
      
      if(rgen.nextBoolean(0.5))
      {
         vx = -vx;
      }   
		
	}
   
   public void getScore()
   {
     Score.setLabel("SCORE: " + score);

        if(score == 70)
        {
            vy = 5.0;
        }
        if(score == 100)
        {
            ball.setFillColor(Color.MAGENTA);
        }
        if(score == 200)
        {
            ball.setFillColor(Color.BLUE);
        }
        if(score == 300)
        {
            ball.setFillColor(Color.BLUE);
        }
        if(score == 400)
        {
            ball.setFillColor(Color.CYAN);
        }
        if(score == 500)
        {
            ball.setFillColor(Color.GREEN);
        }
        if(score == 600)
        {
            ball.setFillColor(Color.YELLOW);
        }
        if(score == 700)
        {
            ball.setFillColor(Color.ORANGE);
        }
        if(score == 800)
        {
            ball.setFillColor(Color.RED);
        }
        if(score == 900)
        {
            ball.setFillColor(Color.BLACK);
        }
    }
 
	
	//playBall method -- called from the play method
	public void playBall()
	{
		//continuous loop
		while(true)
		{
			//move the ball
			ball.move(vx, vy);
			//pause
			pause(DELAY);			
			//check for collisions with bricks or paddle
			GObject collider = getCollidingObject();
			
			//if the ball collided with the paddle 
			if(collider == paddle && collider != null)
			{
            vy = vy + 0.15;
            vx = vx + 0.15;
            
            if(vx > 0 && ball.getX() < (paddle.getX() + (PADDLE_WIDTH * 0.2)))
            {
 					vx = 0.5 * vx;
 					vx = -vx;
 					vy = -vy;
 				}
            else if(vx < 0 && ball.getX() < (paddle.getX() + (PADDLE_WIDTH * 0.2)))
            {
 					vx = 2 * vx;
 					vy = -vy;
 				}
            else if(vx < 0 && ball.getX() > (paddle.getX() + (PADDLE_WIDTH * 0.8)))
            {
 					vx = 0.5 * vx;
 					vx = -vx;
 					vy = -vy; 					
 				} 
            else if(vx > 0 && ball.getX() > (paddle.getX() + (PADDLE_WIDTH * 0.8)))
            {
 					vx = 2 * vx;
 					vy = -vy;
 				} 
            else vy = -vy;
			}
			//otherwise if the ball collided with a brick
			else if(collider instanceof GRect) 
			{
				//reverse y velocity
				vy = -vy;
				//remove the brick
				remove(collider);
            brickCounter--;
         }        
		
               //check for contact along the outer walls
         if(ball.getY()< 0)
         {
            vy = -vy;
         }
         else if(WIDTH - ball.getX() < BALL_RADIUS * 2)
         {
            vx = -vx;
         } 
         else if(ball.getX() < 0)
         {
            vx = -vx;
         }
         /*else if(HEIGHT - ball.getY() < BALL_RADIUS * 2)
         {
            remove(ball);
            createBall();
            pause(200);
            NTURNS--;
            play();
         }
         */
     }    
	}
	
	//getCollidingObject -- called from the playBall method
	//discovers and returns the object that the ball collided with
	private GObject getCollidingObject()
	{
		if(getElementAt(ball.getX(), ball.getY()) != null)
			return getElementAt(ball.getX(), ball.getY());
		else if(getElementAt(ball.getX()+BALL_RADIUS*2, ball.getY()) != null)
			return getElementAt(ball.getX()+BALL_RADIUS*2, ball.getY());
		else if(getElementAt(ball.getX()+BALL_RADIUS*2, ball.getY()+BALL_RADIUS*2) != null)
			return getElementAt(ball.getX()+BALL_RADIUS*2, ball.getY()+BALL_RADIUS*2);
		else if(getElementAt(ball.getX(), ball.getY()+BALL_RADIUS*2) != null)
			return getElementAt(ball.getX(), ball.getY()+BALL_RADIUS*2);
		else	
			return null;
	} 
		
	//mouseMoved method -- called by the mouseListener when the mouse is moved
	//anywhere within the boundaries of the run window
	public void mouseMoved(MouseEvent e)
	{
		//only move the paddle every 5th mouse event 
		//otherwise the play slows every time the mouse moves
		if(toggle == 5)
		{
			//get the x-coordinate of the mouse
			double eX = e.getX();
			
			//if the mouse moved to the right
	        if(eX - lastX > 0)
	        {
	        	//if paddle is not already at the right wall
	        	if(paddle.getX() < WIDTH - PADDLE_WIDTH)
	        	{
	        		//move to the right
	        		paddle.move(eX - lastX, 0);
	        	}
	        }
	        else //(if the mouse moved to the left)
	        {
	        	//if paddle is not already at the left wall
	        	if(paddle.getX() > 0)
	        	{
	        		//move to the left
	        		paddle.move(eX - lastX, 0);
	        	}
	        }
	        	
	        //record this mouse x position for next mouse event         	
	        GPoint last = new GPoint(e.getPoint());
			lastX = last.getX();
			
			//reset toggle to 1 
			toggle = 1;
		}
		else
		{
			//increment toggle by 1
			//(when toggle gets to 5 the code will move the paddle 
			// and reset toggle back to 1)
			toggle++;
		}		
	}

}
