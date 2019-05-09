/**
Sophia Nguyen
Ms. Krasteva
Oct. 2018
This file draws and animates the Chocolate (part 1).
*/

import java.awt.*; //gives access to the java command libraries
import hsa.Console; //gives access to the Console class file
import java.lang.*; //gives access to Thread class

public class ChocolateA extends Thread //creates a new class called ChocolateA and extends the thread
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
	for (int i = 0 ; i < 520 ; i++)
	{
	    //erase
	    c.setColor (eraseColor); //pink
	    c.fillRect (701 - i, 300, 61, 51);
	    //middle layer
	    c.setColor (chocolateColor1); //brown
	    c.fillRect (700 - i, 320, 60, 30);
	    //top layer
	    c.setColor (chocolateColor2); //bright brown
	    c.fillRect (700 - i, 310, 60, 10);
	    //eyes
	    c.setColor (chocolateColor3); //hazel
	    c.fillOval (710 - i, 327, 10, 10); //left eye
	    c.fillOval (739 - i, 327, 10, 10); //right eye
	    //blush
	    c.setColor (Color.pink); //pink
	    c.fillOval (710 - i, 337, 8, 5); //left blush
	    c.fillOval (742 - i, 337, 8, 5); //right blush
	    //eye pupils
	    c.setColor (Color.black);
	    c.fillOval (713 - i, 328, 5, 7); //left eye
	    c.fillOval (742 - i, 328, 5, 7); //right eye
	    //eye shines
	    c.setColor (Color.white);
	    c.fillOval (716 - i, 325, 6, 6); //left eye shine
	    c.fillOval (745 - i, 325, 6, 6); //right eye shine
	    //smile
	    c.drawArc (722 - i, 337, 15, 5, 184, 180);
	    //top layer designs
	    c.setColor (chocolateColor4); //dark brown
	    c.drawLine (700 - i, 320, 710 - i, 310); //line 1
	    c.drawLine (710 - i, 320, 720 - i, 310); //line 2
	    c.drawLine (720 - i, 320, 730 - i, 310); //line 3
	    c.drawLine (730 - i, 320, 740 - i, 310); //line 4
	    c.drawLine (740 - i, 320, 750 - i, 310); //line 5
	    c.drawLine (750 - i, 320, 760 - i, 310); //line 6
	    c.fillArc (704 - i, 312, 12, 12, 0, 180); //chocolate piece 1
	    c.fillOval (720 - i, 300, 12, 17); //chocolate piece 2
	    c.fillOval (730 - i, 302, 8, 17); //chocolate piece 3
	    c.fillOval (747 - i, 308, 8, 8); //chocolate piece 4
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


    public ChocolateA (Console con)  //class constructor
    {
	c = con;
    }


    public void run ()  //run method
    {
	drawChocolate (); //calls drawChocolate method
    }
}


