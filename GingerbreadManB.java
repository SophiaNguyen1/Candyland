/**
Sophia Nguyen
Ms. Krasteva
Oct. 2018
This file draws and animates the Gingerbread Man (part 2).
*/

import java.awt.*; //gives access to the java command libraries
import hsa.Console; //gives access to the Console class file
import java.lang.*; //gives access to Thread class

public class GingerbreadManB extends Thread //creates a new class called GingerbreadManB and extends the thread
{
    private Console c; //creates a private instance variable of Console class so the output window can be made

    public void drawGingerbreadMan ()  //drawGingerbreadMan method
    {
	//gingerbread man colours
	Color gingerColor1 = new Color (176, 101, 0); //brown
	Color gingerColor2 = new Color (227, 130, 0); //light brown
	Color eraseColor = new Color (255, 193, 220); //pink
	//animation
	for (int i = 0 ; i < 175 ; i++)
	{
	    //erase
	    c.setColor (eraseColor); //pink
	    c.fillRect (249 + i, 300, 61, 91);
	    //body
	    c.setColor (gingerColor1); //brown
	    c.fillOval (266 + i, 303, 28, 28); //head
	    c.fillRect (260 + i, 330, 40, 20); //upper torso
	    c.fillRect (268 + i, 350, 25, 30); //lower torso
	    //limbs
	    c.setColor (gingerColor2); //light brown
	    c.fillArc (250 + i, 330, 20, 20, 90, 180); //left hand
	    c.fillArc (290 + i, 330, 20, 20, 270, 180); //right hand
	    c.fillArc (268 + i, 370, 13, 20, 180, 180); //left leg
	    c.fillArc (280 + i, 370, 13, 20, 180, 180); //right leg
	    //buttons
	    c.setColor (Color.red); //red
	    c.fillOval (276 + i, 337, 9, 9); //top button
	    c.fillOval (276 + i, 346, 9, 9); //middle button
	    c.fillOval (276 + i, 355, 9, 9); //bottom button
	    //a line, eyes, and smile
	    c.setColor (Color.black); //black
	    c.drawLine (280 + i, 370, 280 + i, 385); //line between legs
	    c.fillOval (285 + i, 314, 4, 4); //left eye
	    c.fillOval (273 + i, 314, 4, 4); //right eye
	    c.drawArc (275 + i, 317, 12, 8, 185, 180); //smile
	    //button stripe designs
	    c.setColor (Color.white); //white
	    c.drawLine (276 + i, 342, 280 + i, 337); //stripe 1 from the top
	    c.drawLine (279 + i, 344, 282 + i, 340); //stripe 2
	    c.drawLine (276 + i, 351, 280 + i, 346); //stripe 3
	    c.drawLine (279 + i, 353, 282 + i, 349); //stripe 4
	    c.drawLine (276 + i, 359, 280 + i, 354); //stripe 5
	    c.drawLine (279 + i, 361, 282 + i, 357); //stripe 6
	    //frosting designs
	    c.drawArc (260 + i, 330, 5, 7, 110, 180); //left hand 1st arc
	    c.drawArc (260 + i, 336, 5, 7, 110, 180); //left hand 2nd arc
	    c.drawArc (260 + i, 342, 5, 7, 110, 180); //left hand 3rd arc
	    c.drawArc (295 + i, 330, 5, 7, 320, 100); //right hand 1st arc
	    c.drawArc (295 + i, 336, 5, 7, 320, 100); //right hand 2nd arc
	    c.drawArc (295 + i, 342, 5, 7, 320, 100); //right hand 3rd arc
	    c.drawArc (268 + i, 376, 6, 5, 180, 180); //left leg 1st arc
	    c.drawArc (274 + i, 376, 6, 5, 180, 180); //left leg 2nd arc
	    c.drawArc (281 + i, 376, 6, 5, 180, 180); //right leg 1st arc
	    c.drawArc (287 + i, 376, 6, 5, 180, 180); //right leg 2nd arc
	    //flower
	    c.setColor (Color.yellow); //yellow
	    c.fillOval (278 + i, 303, 6, 6); //flower middle
	    c.setColor (Color.pink); //pink
	    c.fillOval (275 + i, 300, 6, 6); //petal top left
	    c.fillOval (281 + i, 300, 6, 6); //petal top right
	    c.fillOval (275 + i, 306, 6, 6); //petal bottom left
	    c.fillOval (281 + i, 306, 6, 6); //petal bottom right
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


    public GingerbreadManB (Console con)  //class constructor
    {
	c = con;
    }


    public void run ()  //run method
    {
	drawGingerbreadMan (); //calls drawGingerbreadMan method
    }
}

