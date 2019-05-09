/**
Sophia Nguyen
Ms. Krasteva
Oct. 2018
This file draws Meghan Hendrickson's speech (part 2).
*/

import java.awt.*; //gives access to the java command libraries
import hsa.Console; //gives access to the Console class file
import java.lang.*; //gives access to Thread class

public class MeghanHendricksonB extends Thread //creates a new class called MeghanHendricksonB and extends the thread
{
    private Console c; //creates a private instance variable of Console class so the output window can be made

    public void drawText ()  //drawText method
    {
	//erase color
	Color eraseColor = new Color (255, 193, 220); //pink
	//text font
	c.setFont (new Font ("Arial", Font.BOLD, 12));
	//draw text
	for (int i = 0 ; i < 50 ; i++)
	{
	    //text
	    c.setColor (Color.black); //black
	    c.drawString ("Wait! I just", 105, 280);
	    c.drawString ("want to be", 105, 290);
	    c.drawString ("your friend.", 105, 300);
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
	    c.drawRect (103, 258, i + 30, i);
	}
    }


    public MeghanHendricksonB (Console con)  //class constructor
    {
	c = con;
    }


    public void run ()  //run method
    {
	drawText (); //calls drawText method
    }
}



