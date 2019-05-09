/**
Sophia Nguyen
Ms. Krasteva
Oct. 2018
This file draws and animates the Cake (part 1).
*/

import java.awt.*; //gives access to the java command libraries
import hsa.Console; //gives access to the Console class file
import java.lang.*; //gives access to Thread class

public class CakeA implements Runnable //creates a new class called CakeA and implements the Runnable interface
{
    private Console c; //creates a private instance variable of Console class so the output window can be made

    public void drawCake ()  //drawCake method
    {
	//Cake colors
	Color cakeColor1 = new Color (210, 175, 216); //lavender
	Color cakeColor2 = new Color (149, 114, 175); //dark purple
	Color blueColor = new Color (30, 144, 255); //blue
	Color flameColor = new Color (255, 140, 0); //orange
	Color fruitColor1 = new Color (204, 255, 160); //light green
	Color fruitColor2 = new Color (255, 67, 38); //red
	Color eraseColor = new Color (255, 193, 220); //pink
	//animation
	for (int i = 0 ; i < 280 ; i++)
	{
	    synchronized (c)  //synchronizes the thread to prevent glitches
	    {
		//erase
		c.setColor (eraseColor); //pink
		c.fillRect (701 - i, 300, 61, 71);
		//cake layers
		c.setColor (cakeColor2); //dark purple
		c.fillRect (700 - i, 320, 60, 40); //middle layer
		c.fillOval (700 - i, 350, 60, 20); //bottom layer
		c.setColor (cakeColor1); //light purple
		c.fillOval (700 - i, 310, 60, 20); //top layer
		//star decorations
		c.setColor (Color.yellow); //yellow
		c.fillStar (705 - i, 340, 10, 10); //left star
		c.fillStar (745 - i, 340, 10, 10); //right star
		//candle
		c.setColor (blueColor); //blue
		c.fillRect (727 - i, 305, 5, 15);
		//flame
		c.setColor (flameColor);
		c.fillOval (726 - i, 300, 7, 7);
		//fruit decorations
		c.setColor (fruitColor1); //light green
		c.fillOval (738 - i, 315, 9, 9); //green fruit 1
		c.fillOval (745 - i, 312, 9, 9); //green fruit 2
		c.setColor (fruitColor2); //red
		c.fillArc (712 - i, 312, 9, 9, 180, 180); //red fruit 1
		c.fillArc (717 - i, 314, 9, 9, 180, 180); //red fruit 1
		//eyes
		c.setColor (blueColor); //blue
		c.fillOval (718 - i, 340, 6, 6); //left eye
		c.fillOval (735 - i, 340, 6, 6); //right eye
		//eye outlines
		c.setColor (Color.black); //black
		c.drawOval (718 - i, 340, 6, 6); //left eye outline
		c.drawOval (735 - i, 340, 6, 6); //right eye outline
		c.drawOval (721 - i, 339, 4, 4); //left eye shine outline
		c.drawOval (738 - i, 339, 4, 4); //right eye shine outline
		//eye shines, frosting, mouth, and candle stripes
		c.setColor (Color.white); //white
		c.fillOval (721 - i, 339, 4, 4); //left eye shine
		c.fillOval (738 - i, 339, 4, 4); //right eye shine
		//top frosting
		c.fillOval (700 - i, 320, 7, 7); //1st frosting
		c.fillOval (706 - i, 323, 7, 7); //2nd frosting
		c.fillOval (712 - i, 325, 7, 7); //3rd frosting
		c.fillOval (718 - i, 327, 7, 7); //4th frosting
		c.fillOval (724 - i, 328, 7, 7); //5th frosting
		c.fillOval (730 - i, 328, 7, 7); //6th frosting
		c.fillOval (736 - i, 327, 7, 7); //7th frosting
		c.fillOval (742 - i, 325, 7, 7); //8th frosting
		c.fillOval (748 - i, 323, 7, 7); //9th frosting
		c.fillOval (754 - i, 320, 7, 7); //10th frosting
		//bottom frosting
		c.fillOval (700 - i, 355, 7, 7); //1st frosting
		c.fillOval (706 - i, 358, 7, 7); //2nd frosting
		c.fillOval (712 - i, 360, 7, 7); //3rd frosting
		c.fillOval (718 - i, 362, 7, 7); //4th frosting
		c.fillOval (724 - i, 363, 7, 7); //5th frosting
		c.fillOval (730 - i, 363, 7, 7); //6th frosting
		c.fillOval (736 - i, 362, 7, 7); //7th frosting
		c.fillOval (742 - i, 360, 7, 7); //8th frosting
		c.fillOval (748 - i, 358, 7, 7); //9th frosting
		c.fillOval (754 - i, 355, 7, 7); //10th frosting
		//mouth
		c.fillArc (720 - i, 347, 20, 10, 180, 180);
		//candle stripes
		c.drawLine (727 - i, 309, 731 - i, 307); //stripe 1 from top
		c.drawLine (727 - i, 312, 731 - i, 310); //stripe 2
		c.drawLine (727 - i, 315, 731 - i, 313); //stripe 3
		c.drawLine (727 - i, 318, 731 - i, 316); //stripe 4
	    }
	    //delay
	    try
	    {
		Thread.sleep (15);
	    }
	    catch (Exception e)
	    {
	    }
	}
    }


    public CakeA (Console con)  //class constructor
    {
	c = con;
    }


    public void run ()  //run method
    {
	drawCake (); //calls drawCake method
    }
}

//sources
//MCPT for synchronization trick


