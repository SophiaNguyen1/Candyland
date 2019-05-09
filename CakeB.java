/**
Sophia Nguyen
Ms. Krasteva
Oct. 2018
This file draws and animates the Cake (part 2).
*/

import java.awt.*; //gives access to the java command libraries
import hsa.Console; //gives access to the Console class file
import java.lang.*; //gives access to Thread class

public class CakeB extends Thread //creates a new class called CakeB and extends the thread
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
	for (int i = 0 ; i < 150 ; i++)
	{
	    //erase
	    c.setColor (eraseColor); //pink
	    c.fillRect (418 + i, 300, 61, 71);
	    //cake layers
	    c.setColor (cakeColor2); //dark purple
	    c.fillRect (420 + i, 320, 60, 40); //middle layer
	    c.fillOval (420 + i, 350, 60, 20); //bottom layer
	    c.setColor (cakeColor1); //light purple
	    c.fillOval (420 + i, 310, 60, 20); //top layer
	    //star decorations
	    c.setColor (Color.yellow); //yellow
	    c.fillStar (425 + i, 340, 10, 10); //left star
	    c.fillStar (465 + i, 340, 10, 10); //right star
	    //candle
	    c.setColor (blueColor); //blue
	    c.fillRect (447 + i, 305, 5, 15);
	    //flame
	    c.setColor (flameColor);
	    c.fillOval (446 + i, 300, 7, 7);
	    //fruit decorations
	    c.setColor (fruitColor1); //light green
	    c.fillOval (458 + i, 315, 9, 9); //green fruit 1
	    c.fillOval (465 + i, 312, 9, 9); //green fruit 2
	    c.setColor (fruitColor2); //red
	    c.fillArc (432 + i, 312, 9, 9, 180, 180); //red fruit 1
	    c.fillArc (437 + i, 314, 9, 9, 180, 180); //red fruit 1
	    //eyes
	    c.setColor (blueColor); //blue
	    c.fillOval (438 + i, 340, 6, 6); //left eye
	    c.fillOval (455 + i, 340, 6, 6); //right eye
	    //eye outlines
	    c.setColor (Color.black); //black
	    c.drawOval (438 + i, 340, 6, 6); //left eye outline
	    c.drawOval (455 + i, 340, 6, 6); //right eye outline
	    c.drawOval (441 + i, 339, 4, 4); //left eye shine outline
	    c.drawOval (458 + i, 339, 4, 4); //right eye shine outline
	    //eye shines, frosting, mouth, and candle stripes
	    c.setColor (Color.white); //white
	    c.fillOval (441 + i, 339, 4, 4); //left eye shine
	    c.fillOval (458 + i, 339, 4, 4); //right eye shine
	    //top frosting
	    c.fillOval (420 + i, 320, 7, 7); //1st frosting
	    c.fillOval (426 + i, 323, 7, 7); //2nd frosting
	    c.fillOval (432 + i, 325, 7, 7); //3rd frosting
	    c.fillOval (438 + i, 327, 7, 7); //4th frosting
	    c.fillOval (444 + i, 328, 7, 7); //5th frosting
	    c.fillOval (450 + i, 328, 7, 7); //6th frosting
	    c.fillOval (456 + i, 327, 7, 7); //7th frosting
	    c.fillOval (462 + i, 325, 7, 7); //8th frosting
	    c.fillOval (468 + i, 323, 7, 7); //9th frosting
	    c.fillOval (474 + i, 320, 7, 7); //10th frosting
	    //bottom frosting
	    c.fillOval (420 + i, 355, 7, 7); //1st frosting
	    c.fillOval (426 + i, 358, 7, 7); //2nd frosting
	    c.fillOval (432 + i, 360, 7, 7); //3rd frosting
	    c.fillOval (438 + i, 362, 7, 7); //4th frosting
	    c.fillOval (444 + i, 363, 7, 7); //5th frosting
	    c.fillOval (450 + i, 363, 7, 7); //6th frosting
	    c.fillOval (456 + i, 362, 7, 7); //7th frosting
	    c.fillOval (462 + i, 360, 7, 7); //8th frosting
	    c.fillOval (468 + i, 358, 7, 7); //9th frosting
	    c.fillOval (474 + i, 355, 7, 7); //10th frosting
	    //mouth
	    c.fillArc (440 + i, 347, 20, 10, 180, 180);
	    //candle stripes
	    c.drawLine (447 + i, 309, 451 + i, 307); //stripe 1 from top
	    c.drawLine (447 + i, 312, 451 + i, 310); //stripe 2
	    c.drawLine (447 + i, 315, 451 + i, 313); //stripe 3
	    c.drawLine (447 + i, 318, 451 + i, 316); //stripe 4
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
	for (int i = 0 ; i < 50 ; i++)
	{
	    //text
	    c.setColor (Color.black); //black
	    c.drawString ("Aaaaah!!!", 405, 270);
	    c.drawString ("It's a stranger!", 405, 280);
	    c.drawString ("Run for your lives!", 405, 290);
	    //delay
	    try
	    {
		Thread.sleep (40);
	    }
	    catch (Exception e)
	    {
	    }
	}
	//erase
	for (int i = 0 ; i < 55 ; i++)
	{
	    c.setColor (eraseColor);
	    c.drawRect (403, 248, i + 50, i);
	}
    }


    public CakeB (Console con)  //class constructor
    {
	c = con;
    }


    public void run ()  //run method
    {
	drawText (); //calls drawText method
	drawCake (); //calls drawCake method
    }
}
