/**
Sophia Nguyen
Ms. Krasteva
Oct. 2018
This file draws and animates the Gummy Bears (part 2).
*/

import java.awt.*; //gives access to the java command libraries
import hsa.Console; //gives access to the Console class file
import java.lang.*; //gives access to Thread class

public class GummyBearB extends Thread //creates a new class called GummyBearB and extends the thread
{
    private Console c; //creates a private instance variable of Console class so the output window can be made
    private Color gummyColor1; //gummy bear color variable
    private int delay = 10; //delay variable
    private int gummyX = 300; //integer variable for the x location of the gummy bear

    public void drawGummyBears ()  //drawGummyBears method
    {
	//gummy colors
	Color gummyColor2 = new Color (118, 186, 0); //dark green
	Color eraseColor = new Color (255, 193, 220); //pink
	//animation
	for (int i = 0 ; i < 200 ; i++)
	{
	    synchronized (c)  //synchronizes the thread to prevent glitches
	    {
		//erase
		c.setColor (eraseColor); //pink
		c.fillRect (gummyX + 2 + i, 400, 41, 81);
		//body
		c.setColor (gummyColor2); //dark green
		c.fillOval (gummyX + 5 + i, 425, 33, 45);
		//head, toes, and hands
		c.setColor (gummyColor1); //the changing gummy color
		c.fillOval (gummyX + 10 + i, 405, 25, 25); //head
		c.fillOval (gummyX + 4 + i, 435, 10, 10); //left hand
		c.fillOval (gummyX + 30 + i, 435, 10, 10); //right hand
		c.fillOval (gummyX + 4 + i, 460, 10, 10); //left toes
		c.fillOval (gummyX + 30 + i, 460, 10, 10); //right toes
		//belly outline
		c.drawOval (gummyX + 13 + i, 438, 18, 20);
		//ears
		c.fillArc (gummyX + 10 + i, 400, 10, 25, 0, 180); //left ear
		c.fillArc (gummyX + 25 + i, 400, 10, 25, 0, 180); //right ear
		//ear shading, eyes, smile, and nose
		c.setColor (gummyColor2);
		c.fillArc (gummyX + 12 + i, 405, 6, 7, 0, 180); //left ear shading
		c.fillArc (gummyX + 27 + i, 405, 6, 7, 0, 180); //right ear shading
		//eyes
		c.fillOval (gummyX + 15 + i, 412, 5, 5); //left eye
		c.fillOval (gummyX + 26 + i, 412, 5, 5); //right eye
		//smile
		c.drawArc (gummyX + 17 + i, 417, 11, 8, 180, 180); //bottom of smile
		c.drawLine (gummyX + 17 + i, 422, gummyX + 28 + i, 422); //top of smile
		//nose
		c.fillRect (gummyX + 22 + i, 416, 3, 3);
		//eye shines and toes/hands outlines
		c.setColor (Color.white);
		c.fillOval (gummyX + 17 + i, 412, 3, 3); //left eye shine
		c.fillOval (gummyX + 28 + i, 412, 3, 3); //right eye shine
		c.drawOval (gummyX + 6 + i, 437, 5, 5); //left hand outline
		c.drawOval (gummyX + 3 + i, 437, 5, 5); //right hand outline
		c.drawOval (gummyX + 6 + i, 462, 5, 5); //left toes outline
		c.drawOval (gummyX + 32 + i, 462, 5, 5); //right toes outline
	    }
	    //delay
	    try
	    {
		Thread.sleep (delay); //the changing delay
	    }
	    catch (Exception e)
	    {
	    }

	}
    }


    public GummyBearB (Console con)  //first class constructor
    {
	c = con;
	gummyColor1 = new Color (187, 229, 114); //sets the basic gummy color (light green)
    }


    public GummyBearB (Console con, Color n)  //second class constructor with a color parameter
    {
	c = con;
	gummyColor1 = n; //sets the gummy color to n
	gummyX = 350; //sets the gummy X coordinate to 350
    }


    public GummyBearB (Console con, Color n, int t)  //third class constructor with color and delay parameters
    {
	c = con;
	gummyColor1 = n; //sets the gummy color to n
	delay = t; //sets the delay to t
	gummyX = 400; //sets the gummy X coordinate to 400
    }


    public void run ()  //run method
    {
	drawGummyBears (); //calls drawGummyBears
    }
}

//sources
//MCPT for synchronization trick
