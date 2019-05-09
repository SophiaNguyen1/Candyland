/**
Sophia Nguyen
Ms. Krasteva
Oct. 2018
This file draws and animates the Gingerbread Man (part 1).
*/

import java.awt.*; //gives access to the java command libraries
import hsa.Console; //gives access to the Console class file
import java.lang.*; //gives access to Thread class

public class GingerbreadManA extends Thread //creates a new class called GingerbreadManA and extends the thread
{
    private Console c; //creates a private instance variable of Console class so the output window can be made

    public void drawGingerbreadMan ()  //drawGingerbreadMan method
    {
	//gingerbread man colours
	Color gingerColor1 = new Color (176, 101, 0); //brown
	Color gingerColor2 = new Color (227, 130, 0); //light brown
	Color eraseColor = new Color (255, 193, 220); //pink
	//animation
	for (int i = 0 ; i < 450 ; i++)
	{
	    //erase
	    c.setColor (eraseColor); //pink
	    c.fillRect (701 - i, 300, 61, 91);
	    //body
	    c.setColor (gingerColor1); //brown
	    c.fillOval (716 - i, 303, 28, 28); //head
	    c.fillRect (710 - i, 330, 40, 20); //upper torso
	    c.fillRect (718 - i, 350, 25, 30); //lower torso
	    //limbs
	    c.setColor (gingerColor2); //light brown
	    c.fillArc (700 - i, 330, 20, 20, 90, 180); //left hand
	    c.fillArc (740 - i, 330, 20, 20, 270, 180); //right hand
	    c.fillArc (718 - i, 370, 13, 20, 180, 180); //left leg
	    c.fillArc (730 - i, 370, 13, 20, 180, 180); //right leg
	    //buttons
	    c.setColor (Color.red); //red
	    c.fillOval (726 - i, 337, 9, 9); //top button
	    c.fillOval (726 - i, 346, 9, 9); //middle button
	    c.fillOval (726 - i, 355, 9, 9); //bottom button
	    //a line, eyes, and smile
	    c.setColor (Color.black); //black
	    c.drawLine (730 - i, 370, 730 - i, 385); //line between legs
	    c.fillOval (735 - i, 314, 4, 4); //left eye
	    c.fillOval (723 - i, 314, 4, 4); //right eye
	    c.drawArc (725 - i, 317, 12, 8, 185, 180); //smile
	    //button stripe designs
	    c.setColor (Color.white); //white
	    c.drawLine (726 - i, 342, 730 - i, 337); //stripe 1 from the top
	    c.drawLine (729 - i, 344, 732 - i, 340); //stripe 2
	    c.drawLine (726 - i, 351, 730 - i, 346); //stripe 3
	    c.drawLine (729 - i, 353, 732 - i, 349); //stripe 4
	    c.drawLine (726 - i, 359, 730 - i, 354); //stripe 5
	    c.drawLine (729 - i, 361, 732 - i, 357); //stripe 6
	    //frosting designs
	    c.drawArc (710 - i, 330, 5, 7, 110, 180); //left hand 1st arc
	    c.drawArc (710 - i, 336, 5, 7, 110, 180); //left hand 2nd arc
	    c.drawArc (710 - i, 342, 5, 7, 110, 180); //left hand 3rd arc
	    c.drawArc (745 - i, 330, 5, 7, 320, 100); //right hand 1st arc
	    c.drawArc (745 - i, 336, 5, 7, 320, 100); //right hand 2nd arc
	    c.drawArc (745 - i, 342, 5, 7, 320, 100); //right hand 3rd arc
	    c.drawArc (718 - i, 376, 6, 5, 180, 180); //left leg 1st arc
	    c.drawArc (724 - i, 376, 6, 5, 180, 180); //left leg 2nd arc
	    c.drawArc (731 - i, 376, 6, 5, 180, 180); //right leg 1st arc
	    c.drawArc (737 - i, 376, 6, 5, 180, 180); //right leg 2nd arc
	    //flower
	    c.setColor (Color.yellow); //yellow
	    c.fillOval (728 - i, 303, 6, 6); //flower middle
	    c.setColor (Color.pink); //pink
	    c.fillOval (725 - i, 300, 6, 6); //petal top left
	    c.fillOval (731 - i, 300, 6, 6); //petal top right
	    c.fillOval (725 - i, 306, 6, 6); //petal bottom left
	    c.fillOval (731 - i, 306, 6, 6); //petal bottom right
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


    public GingerbreadManA (Console con)  //class constructor
    {
	c = con;
    }


    public void run ()  //run method
    {
	drawGingerbreadMan (); //calls drawGingerbreadMan method
    }
}
