/**
Sophia Nguyen
Ms. Krasteva
Oct. 2018
This file draws and animates the Chocolate (part 2).
*/

import java.awt.*; //gives access to the java command libraries
import hsa.Console; //gives access to the Console class file
import java.lang.*; //gives access to Thread class

public class ChocolateB extends Thread //creates a new class called ChocolateB and extends the thread
{
    private Console c; //creates a private instance variable of Console class so the output window can be made

    public void drawChocolate ()  //drawChocolate method
    {
	//chocolate colors
	Color chocolateColor1 = new Color (160, 82, 45); //brown
	Color chocolateColor2 = new Color (210, 105, 30); //chocolate
	Color chocolateColor3 = new Color (200, 143, 87); //hazel
	Color chocolateColor4 = new Color (139, 69, 19); //dark brown
	Color eraseColor = new Color (255, 193, 220); //pink
	//animation
	for (int i = 0 ; i < 180 ; i++)
	{
	    //erase
	    c.setColor (eraseColor); //pink
	    c.fillRect (179 + i, 300, 61, 51);
	    //middle layer
	    c.setColor (chocolateColor1); //brown
	    c.fillRect (180 + i, 320, 60, 30);
	    //top layer
	    c.setColor (chocolateColor2); //bright brown
	    c.fillRect (180 + i, 310, 60, 10);
	    //eyes
	    c.setColor (chocolateColor3); //hazel
	    c.fillOval (190 + i, 327, 10, 10); //left eye
	    c.fillOval (219 + i, 327, 10, 10); //right eye
	    //blush
	    c.setColor (Color.pink); //pink
	    c.fillOval (190 + i, 337, 8, 5); //left blush
	    c.fillOval (222 + i, 337, 8, 5); //right blush
	    //eye pupils
	    c.setColor (Color.black);
	    c.fillOval (193 + i, 328, 5, 7); //left eye
	    c.fillOval (222 + i, 328, 5, 7); //right eye
	    //eye shines
	    c.setColor (Color.white);
	    c.fillOval (196 + i, 325, 6, 6); //left eye shine
	    c.fillOval (225 + i, 325, 6, 6); //right eye shine
	    //smile
	    c.drawArc (202 + i, 337, 15, 5, 184, 180);
	    //top layer designs
	    c.setColor (chocolateColor4); //dark brown
	    c.drawLine (180 + i, 320, 190 + i, 310); //line 1
	    c.drawLine (190 + i, 320, 200 + i, 310); //line 2
	    c.drawLine (200 + i, 320, 210 + i, 310); //line 3
	    c.drawLine (210 + i, 320, 220 + i, 310); //line 4
	    c.drawLine (220 + i, 320, 230 + i, 310); //line 5
	    c.drawLine (230 + i, 320, 240 + i, 310); //line 6
	    c.fillArc (184 + i, 312, 12, 12, 0, 180); //chocolate piece 1
	    c.fillOval (200 + i, 300, 12, 17); //chocolate piece 2
	    c.fillOval (210 + i, 302, 8, 17); //chocolate piece 3
	    c.fillOval (227 + i, 308, 8, 8); //chocolate piece 4
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


    public ChocolateB (Console con)  //class constructor
    {
	c = con;
    }


    public void run ()  //run method
    {
	drawChocolate (); //calls drawChocolate method
    }
}
