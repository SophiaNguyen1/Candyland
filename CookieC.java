/**
Sophia Nguyen
Ms. Krasteva
Oct. 2018
This file draws and animates the Cookie (part 3).
*/

import java.awt.*; //gives access to the java command libraries
import hsa.Console; //gives access to the Console class file
import java.lang.*; //gives access to Thread class

public class CookieC extends Thread //creates a new class called CookieC and extends the thread
{
    private Console c; //creates a private instance variable of Console class so the output window can be made

    public void drawCookie ()  //drawCookie method
    {
	//cookie colors
	Color cookieColor = new Color (205, 133, 63); //peru
	Color cookieColor2 = new Color (160, 82, 45); //brown
	Color eraseColor = new Color (255, 193, 220); //pink
	//animation
	for (int i = 0 ; i < 250 ; i++)
	{
	    //erase
	    c.setColor (eraseColor); //pink
	    c.fillRect (502 - i, 300, 61, 61);
	    //cookie circle
	    c.setColor (cookieColor); //light brown
	    c.fillOval (500 - i, 300, 60, 60);
	    //eyebrows, eye irises, nose, and chocolate chips
	    c.setColor (cookieColor2); //dark brown
	    c.drawLine (515 - i, 313, 525 - i, 313); //left eyebrow
	    c.drawLine (535 - i, 313, 545 - i, 313); //right eyebrow
	    c.fillOval (527 - i, 328, 7, 7); //nose
	    c.fillOval (515 - i, 318, 10, 10); //left iris
	    c.fillOval (536 - i, 318, 10, 10); //right iris
	    //chocolate chips
	    c.fillRect (520 - i, 307, 5, 5); //rectangular chocolate chip 1
	    c.fillRect (540 - i, 306, 5, 5); //rectangular chocolate chip 2
	    c.fillRect (510 - i, 330, 5, 5); //rectangular chocolate chip 3
	    c.fillRect (545 - i, 327, 5, 5); //rectangular chocolate chip 4
	    c.fillRect (515 - i, 348, 5, 5); //rectangular chocolate chip 5
	    c.fillRect (545 - i, 345, 5, 5); //rectangular chocolate chip 6
	    c.fillRect (530 - i, 350, 5, 5); //rectangular chocolate chip 7
	    c.fillArc (527 - i, 305, 8, 8, 0, 180); //arc chocolate chip 1
	    c.fillArc (508 - i, 316, 8, 8, 90, 180); //arc chocolate chip 2
	    c.fillArc (507 - i, 337, 8, 8, 310, 180); //arc chocolate chip 3
	    c.fillArc (546 - i, 332, 8, 8, 180, 180); //arc chocolate chip 4
	    //eye pupils and cookie outline
	    c.setColor (Color.black); //black
	    c.fillOval (517 - i, 320, 6, 6); //left pupil
	    c.fillOval (538 - i, 320, 6, 6); //right pupil
	    c.drawOval (500 - i, 300, 60, 60); //outline
	    //eye shines
	    c.setColor (Color.white); //white
	    c.fillOval (521 - i, 318, 3, 3); //left eye shine
	    c.fillOval (542 - i, 318, 3, 3); //right eye shine
	    //mouth
	    c.fillArc (518 - i, 330, 25, 15, 180, 180);
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


    public CookieC (Console con)  //class constructor
    {
	c = con;
    }


    public void run ()  //run method
    {
	drawCookie (); //calls drawCookie method
    }
}
