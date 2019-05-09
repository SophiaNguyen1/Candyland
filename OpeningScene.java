/**
Sophia Nguyen
Ms. Krasteva
Oct. 2018
This file draws the opening scene for MyCreation.
*/

import java.awt.*; //gives access to the java command libraries
import hsa.Console; //gives access to the Console class file

public class OpeningScene //creates a new class called OpeningScene
{
    private Console c; //creates an instance variable of Console class so the output window can be made
    public void draw ()  //draw method (draws the opening scene)
    {
	//opening scene colors
	Color bgColor = new Color (147, 222, 255); //blue
	Color titleColor = new Color (242, 62, 62); //red
	Color cloudColor = new Color (218, 112, 214); //purple
	//background
	c.setColor (bgColor);
	for (int i = 0 ; i < 640 ; i++)
	{
	    c.drawRect (0 + i, 0 + i, 640, 500);
	}
	//clouds
	c.setColor (cloudColor); //purple
	for (int i = 0 ; i < 50 ; i++)
	{
	    c.drawOval (30 - i / 2, 50 - i / 2, i + 50, i); //cloud 1 part 1
	    c.drawOval (75 - i / 2, 65 - i / 2, i + 50, i); //cloud 1 part 2
	    c.drawOval (500 - i / 2, 65 - i / 2, i + 35, i); //cloud 2 part 1
	    c.drawOval (549 - i / 2, 50 - i / 2, i + 50, i); //cloud 2 part 2
	    c.drawOval (549 - i / 2, 75 - i / 2, i + 50, i); //cloud 2 part 3

	}
	//lollipop stick
	c.setColor (Color.white); //white
	for (int i = 0 ; i < 5 ; i++)
	{
	    c.drawLine (40 + i, 210, 40 + i, 275); //stick 1
	}
	//lollipop
	c.setColor (Color.red); //red
	for (int i = 0 ; i < 75 ; i++)
	{
	    c.drawOval (42 - i / 2, 180 - i / 2, i, i); //left lollipop
	}
	c.setColor (Color.orange); //orange
	for (int i = 0 ; i < 45 ; i++)
	{
	    c.drawOval (42 - i / 2, 180 - i / 2, i, i); //left lollipop
	}
	c.setColor (Color.yellow); //yellow
	for (int i = 0 ; i < 25 ; i++)
	{
	    c.drawOval (42 - i / 2, 180 - i / 2, i, i); //left lollipop
	}
	//text
	c.setColor (Color.pink);
	c.setFont (new Font ("Rockwell", Font.BOLD, 45));
	c.drawString ("- Sophia Nguyen -", 125, 60);
	c.setFont (new Font ("Edwardian Script ITC", Font.BOLD, 70));
	c.drawString ("presents", 175, 125);
	c.setFont (new Font ("Curlz MT", Font.BOLD, 100));
	c.drawString ("Candyland", 60, 250);
	c.setColor (titleColor);
	c.drawString ("Candyland", 65, 250);
	for (int i = 0 ; i < 250 ; i++)
	{
	    //delay
	    try
	    {
		Thread.sleep (20);
	    }
	    catch (Exception e)
	    {
	    }
	}

    }


    public OpeningScene (Console con)  //class constructor

    {
	c = con;
	draw ();
    }
}


