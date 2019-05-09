/**
Sophia Nguyen
Ms. Krasteva
Oct. 2018
This file draws the ending scene for MyCreation.
*/

import java.awt.*; //gives access to the java command libraries
import hsa.Console; //gives access to the Console class file

public class EndingScene //creates a new class called EndingScene
{
    private Console c; //creates an instance variable of Console class so the output window can be made
    public void draw ()  //draw method (draws ending scene)
    {
	//ending scene colors
	Color bgColor = new Color (147, 222, 255); //blue
	Color cakeColor1 = new Color (210, 175, 216); //lavender
	Color cakeColor2 = new Color (149, 114, 175); //dark purple
	Color peachColor = new Color (255, 218, 185); //peach
	Color canteloupeColor = new Color (253, 177, 75); //orange
	Color frostingColor = new Color (255, 234, 234); //ivory
	//background
	c.setColor (bgColor); //blue
	for (int i = 0 ; i < 640 ; i++)
	{
	    c.drawRect (0 + i, 0, 640, 500);
	}
	//cake middle and bottom layer
	c.setColor (cakeColor2); //dark purple
	for (int i = 0 ; i < 350 ; i++)
	{
	    c.drawRect (36 + i, 145, 200, 250); //middle layer
	    c.drawOval (210 - i / 2, 465 - i / 2, i + 200, i - 150); //bottom layer
	}
	//cake top layer
	c.setColor (cakeColor1); //light purple
	for (int i = 0 ; i < 200 ; i++)
	{
	    c.drawOval (135 - i / 2, 140 - i / 2, i + 350, i); //top layer
	}
	//decorations
	c.setColor (peachColor);
	//paper flower decoration
	for (int i = 0 ; i < 100 ; i++)
	{
	    c.drawStar (45 - i / 2, 210 - i / 2, i + 150, i - 150);
	}
	//canteloupe fruits decoration
	c.setColor (canteloupeColor);
	for (int i = 0 ; i < 70 ; i++)
	{
	    c.drawOval (210 - i / 2, 200 - i / 2, i, i); //front fruit 1
	    c.drawOval (280 - i / 2, 210 - i / 2, i, i); //front fruit 2
	    c.drawOval (350 - i / 2, 210 - i / 2, i, i); //front fruit 3
	    c.drawOval (350 - i / 2, 50 - i / 2, i - 20, i - 20); //back fruit 1
	    c.drawOval (400 - i / 2, 55 - i / 2, i - 20, i - 20); //back fruit 2
	    c.drawOval (450 - i / 2, 60 - i / 2, i - 20, i - 20); //back fruit 3
	    c.drawArc (220, 75 - i / 2, 80, i, 0, 180); //halved fruit
	}
	//stars design
	for (int i = 0 ; i < 25 ; i++)
	{
	    c.drawStar (440 - i, 270 - i, i * 2, i * 2); //small star
	}
	for (int i = 0 ; i < 65 ; i++)
	{
	    c.drawStar (505 - i, 325 - i, i * 2, i * 2); //large star
	}
	//frosting
	c.setColor (frostingColor);
	for (int i = 0 ; i < 30 ; i++)
	{
	    c.drawOval (40 - i / 2, 400 - i / 2, i, i); //frosting 1 from the left
	    c.drawOval (60 - i / 2, 420 - i / 2, i, i); //2
	    c.drawOval (82 - i / 2, 435 - i / 2, i, i); //3
	    c.drawOval (105 - i / 2, 450 - i / 2, i, i); //4
	    c.drawOval (130 - i / 2, 460 - i / 2, i, i); //5
	    c.drawOval (155 - i / 2, 470 - i / 2, i, i); //6
	    c.drawOval (183 - i / 2, 475 - i / 2, i, i); //7
	    c.drawOval (212 - i / 2, 479 - i / 2, i, i); //8
	    c.drawOval (240 - i / 2, 482 - i / 2, i, i); //9
	    c.drawOval (269 - i / 2, 482 - i / 2, i, i); //10
	    c.drawOval (298 - i / 2, 482 - i / 2, i, i); //11
	    c.drawOval (327 - i / 2, 482 - i / 2, i, i); //12
	    c.drawOval (357 - i / 2, 482 - i / 2, i, i); //13
	    c.drawOval (385 - i / 2, 482 - i / 2, i, i); //14
	    c.drawOval (415 - i / 2, 479 - i / 2, i, i); //15
	    c.drawOval (445 - i / 2, 473 - i / 2, i, i); //16
	    c.drawOval (475 - i / 2, 465 - i / 2, i, i); //17
	    c.drawOval (505 - i / 2, 455 - i / 2, i, i); //18
	    c.drawOval (532 - i / 2, 445 - i / 2, i, i); //19
	    c.drawOval (560 - i / 2, 430 - i / 2, i, i); //20
	    c.drawOval (580 - i / 2, 410 - i / 2, i, i); //21
	}
	//maple leaf design
	c.setColor (Color.red);
	for (int i = 0 ; i < 10 ; i++)
	{
	    c.drawMapleLeaf (340 - i, 38 - i, i * 2, i * 2);
	}
	//text
	c.setColor (Color.pink);
	c.setFont (new Font ("Trebuchet MS", Font.ITALIC, 90));
	c.drawString ("The End", 230, 165);
	c.setFont (new Font ("Palace Script MT", Font.BOLD, 20));
	c.drawString ("Meghan and", 255, 360);
	c.drawString ("the citizens of", 248, 390);
	c.drawString ("Candyland became", 222, 420);
	c.drawString ("best friends forever.", 220, 450);

    }


    public EndingScene (Console con)  //class constructor
    {
	c = con;
	draw ();
    }
}
