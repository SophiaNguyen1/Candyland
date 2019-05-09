/**
Sophia Nguyen
Ms. Krasteva
Oct. 2018
This file draws and animates Meghan Hendrickson (part 1).
*/

import java.awt.*; //gives access to the java command libraries
import hsa.Console; //gives access to the Console class file
import java.lang.*; //gives access to Thread class

public class MeghanHendricksonA extends Thread //creates a new class called MeghanHendricksonA and extends the thread
{
    private Console c; //creates a private instance variable of Console class so the output window can be made
    //erase color
    private Color eraseColor = new Color (255, 193, 220); //pink
    public void drawMeghan ()  //drawMeghan method
    {
	//Meghan colors
	Color hairColor = new Color (255, 215, 0); //blonde
	Color skinColor = new Color (255, 204, 140); //peach
	Color blueColor = new Color (0, 191, 255); //blue
	Color shoeColor = new Color (145, 68, 68); //brown
	Color eraseColor = new Color (255, 193, 220); //pink
	//animation
	for (int i = 0 ; i < 100 ; i++)
	{
	    //erase
	    c.setColor (eraseColor); //pink
	    c.fillRect (-51 + i, 300, 36, 101);
	    //hair
	    c.setColor (hairColor); //blonde
	    c.fillRect (-48 + i, 312, 30, 40);
	    //skin
	    c.setColor (skinColor); //peach
	    c.fillOval (-46 + i, 300, 28, 35); //head
	    c.fillRect (-37 + i, 330, 9, 10); //neck
	    //hands
	    c.fillArc (-50 + i, 360, 6, 10, 180, 180); //left
	    c.fillArc (-21 + i, 360, 6, 10, 180, 180); //right
	    //hat
	    c.setColor (Color.red); //red
	    c.fillArc (-48 + i, 300, 30, 28, 0, 180); //hat
	    c.setColor (skinColor); //peach
	    c.fillRect (-39 + i, 305, 11, 5); //hat rectangle
	    //mouth
	    c.setColor (Color.white); //white
	    c.fillArc (-40 + i, 320, 15, 10, 180, 180);
	    //eyes
	    c.fillOval (-44 + i, 316, 9, 7); //left eyeball
	    c.fillOval (-30 + i, 316, 9, 7); //right eyeball
	    c.setColor (blueColor); //blue
	    c.fillOval (-42 + i, 317, 5, 5); //left pupil
	    c.fillOval (-28 + i, 317, 5, 5); //right pupil
	    //body
	    c.fillArc (-45 + i, 338, 25, 25, 0, 180); //upper torso
	    c.fillRect (-45 + i, 350, 25, 20); //bottom torso
	    //arms
	    c.fillArc (-50 + i, 340, 20, 50, 0, 180); //left arm
	    c.fillArc (-35 + i, 340, 20, 50, 0, 180); //right arm
	    //star design on shirt
	    c.setColor (Color.yellow); //yellow
	    c.fillStar (-40 + i, 348, 15, 15);
	    //legs
	    c.setColor (Color.black); //black
	    c.fillRect (-45 + i, 370, 10, 22); //left leg
	    c.fillRect (-30 + i, 370, 10, 22); //right leg
	    //shoes
	    c.setColor (shoeColor); //brown
	    c.fillArc (-45 + i, 385, 10, 15, 180, 180); //left shoe
	    c.fillArc (-30 + i, 385, 10, 15, 180, 180); //right shoe
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
	    c.drawString ("Hello!", 85, 280);
	    c.drawString ("What is", 85, 290);
	    c.drawString ("this place?", 85, 300);
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
	    c.drawRect (83, 258, i + 30, i);
	}
    }


    public MeghanHendricksonA (Console con)  //class constructor
    {
	c = con;
    }


    public void run ()  //run method
    {
	drawMeghan (); //calls drawMeghan method
	drawText (); //calls drawText method
    }
}


