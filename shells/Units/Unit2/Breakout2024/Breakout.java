package Breakout2024;
import acm.graphics.*;
import acm.program.*;
import acm.util.*;
import java.applet.*;
import java.awt.*;
import java.awt.event.*;

public class Breakout extends GraphicsProgram
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

	//main method -- called when the program is run
	public static void main(String[] args)
	{
		String[] sizeArgs = { "width=" + WIDTH, "height=" + HEIGHT };
		new Breakout().start(sizeArgs);
	}

	//run method -- called indirectly from the main method
	public void run()
	{
		setup();
		play();
	}

	//setup method -- called from the run method
	public void setup()
	{
		createBricks();
		createPaddle();
		createBall();
		addMouseListeners();
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

                /*                       				  */
         		/* add code to correctly color the bricks */
         		/*                      				  */
         		/******************************************/


				add(brick);
			}
		}
	}

	//createPaddle method -- called from the setup method
	public void createPaddle()
	{
		/******************************************/
        /*                       				  */
        /* add code to create and add the paddle  */
        /*                      				  */
        /******************************************/
	}

	//createBall method -- called from the setup method
	public void createBall()
	{
		/******************************************/
        /*                       				  */
        /* add code to create and add the ball    */
        /*                      				  */
        /******************************************/
	}

	//play method -- called from the run method after setup
	public void play()
	{
		startTheBall();
		playBall();
	}

	//startTheBall method -- called from the play method
	public void startTheBall()
	{

		/******************************************/
        /*                      				  */
        /* create a random double between 1 and 3,*/
        /* (between 1.0 and 2.99) for vx          */
        /*                      				  */
        /* flip a coin for left or right direction*/
        /* (make vx positive or negative)   	  */
        /*                      				  */
        /* set initial y velocity to 3.0          */
        /*                      				  */
        /******************************************/

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
			pause(1);

			//check for contact along the outer walls

			/**********************************************/
        	/*                       			          */
        	/* if ball contacts the floor,		          */
        	/* reverse the y velocity 				      */
        	/*                      				      */
        	/* otherwise, if ball contacts the ceiling,	  */
        	/* reverse the y velocity 				      */
        	/*                      				      */
        	/* otherwise, if ball contacts the left wall, */
        	/* reverse the x velocity 				      */
        	/*                      				      */
        	/* otherwise, if ball contacts the right wall,*/
        	/* reverse the x velocity 				      */
        	/*                      				      */
        	/**********************************************/


			//check for collisions with bricks or paddle
			GObject collider = getCollidingObject();

			//if the ball collided with the paddle
			if(collider == paddle)
			{
				//reverse the y velocity
				vy = -vy;
			}
			//otherwise if the ball collided with a brick
			else if(collider instanceof GRect)
			{
				//reverse y velocity
				vy = -vy;
				//remove the brick
				remove(collider);
			}
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
