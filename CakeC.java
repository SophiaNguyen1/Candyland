/**
Sophia Nguyen
Ms. Krasteva
Oct. 2018
This file draws and animates the Cake (part 3).
*/

import java.awt.*; //gives access to the java command libraries
import hsa.Console; //gives access to the Console class file
import java.lang.*; //gives access to Thread class

public class CakeC extends Thread //creates a new class called CakeC and extends the thread
{
    private Console c; //creates a private instance variable of Console class so the output window can be made
    //erase color
    private Color eraseColor = new Color (255, 193, 220); //pink
    public void drawCake ()  //drawCake method
    {
	//Cake colors
	Color cakeColor1 = new Color (210, 175, 216); //lavender
	Color cakeColor2 = new Color (149, 114, 175); //dark purple
	Color blueColor = new Color (30, 144, 255); //blue
	Color flameColor = new Color (255, 140, 0); //orange
	Color fruitColor1 = new Color (204, 255, 160); //light green
	Color fruitColor2 = new Color (255, 67, 38); //red
	//animation
	for (int i = 0 ; i < 250 ; i++)
	{
	    //erase
	    c.setColor (eraseColor); //pink
	    c.fillRect (571 - i, 300, 61, 71);
	    //cake layers
	    c.setColor (cakeColor2); //dark purple
	    c.fillRect (570 - i, 320, 60, 40); //middle layer
	    c.fillOval (570 - i, 350, 60, 20); //bottom layer
	    c.setColor (cakeColor1); //light purple
	    c.fillOval (570 - i, 310, 60, 20); //top layer
	    //star decorations
	    c.setColor (Color.yellow); //yellow
	    c.fillStar (575 - i, 340, 10, 10); //left star
	    c.fillStar (615 - i, 340, 10, 10); //right star
	    //candle
	    c.setColor (blueColor); //blue
	    c.fillRect (597 - i, 305, 5, 15);
	    //flame
	    c.setColor (flameColor);
	    c.fillOval (596 - i, 300, 7, 7);
	    //fruit decorations
	    c.setColor (fruitColor1); //light green
	    c.fillOval (608 - i, 315, 9, 9); //green fruit 1
	    c.fillOval (615 - i, 312, 9, 9); //green fruit 2
	    c.setColor (fruitColor2); //red
	    c.fillArc (582 - i, 312, 9, 9, 180, 180); //red fruit 1
	    c.fillArc (587 - i, 314, 9, 9, 180, 180); //red fruit 1
	    //eyes
	    c.setColor (blueColor); //blue
	    c.fillOval (588 - i, 340, 6, 6); //left eye
	    c.fillOval (605 - i, 340, 6, 6); //right eye
	    //eye outlines
	    c.setColor (Color.black); //black
	    c.drawOval (588 - i, 340, 6, 6); //left eye outline
	    c.drawOval (605 - i, 340, 6, 6); //right eye outline
	    c.drawOval (591 - i, 339, 4, 4); //left eye shine outline
	    c.drawOval (608 - i, 339, 4, 4); //right eye shine outline
	    //eye shines, frosting, mouth, and candle stripes
	    c.setColor (Color.white); //white
	    c.fillOval (591 - i, 339, 4, 4); //left eye shine
	    c.fillOval (608 - i, 339, 4, 4); //right eye shine
	    //top frosting
	    c.fillOval (570 - i, 320, 7, 7); //1st frosting
	    c.fillOval (576 - i, 323, 7, 7); //2nd frosting
	    c.fillOval (582 - i, 325, 7, 7); //3rd frosting
	    c.fillOval (588 - i, 327, 7, 7); //4th frosting
	    c.fillOval (594 - i, 328, 7, 7); //5th frosting
	    c.fillOval (600 - i, 328, 7, 7); //6th frosting
	    c.fillOval (606 - i, 327, 7, 7); //7th frosting
	    c.fillOval (612 - i, 325, 7, 7); //8th frosting
	    c.fillOval (618 - i, 323, 7, 7); //9th frosting
	    c.fillOval (624 - i, 320, 7, 7); //10th frosting
	    //bottom frosting
	    c.fillOval (570 - i, 355, 7, 7); //1st frosting
	    c.fillOval (576 - i, 358, 7, 7); //2nd frosting
	    c.fillOval (582 - i, 360, 7, 7); //3rd frosting
	    c.fillOval (588 - i, 362, 7, 7); //4th frosting
	    c.fillOval (594 - i, 363, 7, 7); //5th frosting
	    c.fillOval (600 - i, 363, 7, 7); //6th frosting
	    c.fillOval (606 - i, 362, 7, 7); //7th frosting
	    c.fillOval (612 - i, 360, 7, 7); //8th frosting
	    c.fillOval (618 - i, 358, 7, 7); //9th frosting
	    c.fillOval (624 - i, 355, 7, 7); //10th frosting
	    //mouth
	    c.fillArc (590 - i, 347, 20, 10, 180, 180);
	    //candle stripes
	    c.drawLine (597 - i, 309, 601 - i, 307); //stripe 1 from top
	    c.drawLine (597 - i, 312, 601 - i, 310); //stripe 2
	    c.drawLine (597 - i, 315, 601 - i, 313); //stripe 3
	    c.drawLine (597 - i, 318, 601 - i, 316); //stripe 4
	    //delay
	    try
	    {
		Thread.sleep (5);
	    }
	    catch (Exception e)
	    {
	    }
	}
    }


    public void drawText ()  //drawText method
    {
	//text font
	c.setFont (new Font ("Arial", Font.BOLD, 12));
	//draw text
	for (int i = 0 ; i < 80 ; i++)
	{
	    //text
	    c.setColor (Color.black); //black
	    c.drawString ("Sure, you can", 305, 270);
	    c.drawString ("be our friend!", 305, 280);
	    c.drawString ("Welcome to Candyland!", 305, 290);
	    //delay
	    try
	    {
		Thread.sleep (60);
	    }
	    catch (Exception e)
	    {
	    }
	}
	//erase
	for (int i = 0 ; i < 35 ; i++)
	{
	    c.setColor (eraseColor);
	    c.drawRect (303, 260, i + 100, i);
	}
    }


    public CakeC (Console con)  //class constructor
    {
	c = con;
    }


    public void run ()  //run method
    {
	drawCake (); //calls drawCake method
	drawText (); //calls drawText method
    }
}
