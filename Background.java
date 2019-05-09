/**
Sophia Nguyen
Ms. Krasteva
Oct. 2018
This file draws the background for MyCreation.
*/

import java.awt.*; //gives access to the java command libraries
import hsa.Console; //gives access to the Console class file

public class Background //creates a new class called Background
{
    private Console c; //creates a private instance variable of Console class so the output window can be made
    public void draw ()  //draw method (draws background)
    {
	//background colors
	Color bgColor = new Color (147, 222, 255); //blue
	Color landColor = new Color (255, 193, 220); //pink
	Color sunColor = new Color (255, 233, 94); //yellow
	Color cloudColor = new Color (218, 112, 214); //purple
	Color lollipopColor1 = new Color (242, 62, 62); //red
	Color lollipopColor2 = new Color (249, 189, 34); //orange
	Color lollipopColor3 = new Color (255, 246, 0); //yellow
	Color lollipopColor4 = new Color (50, 205, 20); //green
	Color lollipopColor5 = new Color (145, 220, 255); //blue
	Color lollipopColor6 = new Color (154, 106, 232); //purple
	Color lollipopColor7 = new Color (252, 100, 156); //pink
	Color darkBrownColor = new Color (91, 46, 44); //dark brown
	Color jelloColor = new Color (175, 238, 238); //turquoise
	Color jelloColor2 = new Color (255, 233, 229); //light cream-pink
	Color darkGoldColor = new Color (218, 165, 32); //dark gold
	Color popsicleColor = new Color (255, 140, 0); //salmon
	Color popsicleStickColor = new Color (222, 184, 135); //tan
	Color tinyLollipopColor = new Color (178, 21, 99); //plum
	Color gumdropColor = new Color (255, 81, 205); //deep pink
	Color gumdropColor2 = new Color (255, 215, 0); //gold
	Color houseColor1 = new Color (165, 79, 79); //brown
	Color frostingColor = new Color (255, 251, 244); //cream
	Color darkOrange = new Color (216, 141, 21); //dark orange
	//background
	for (int i = 0 ; i < 640 ; i++)
	{
	    //sky
	    c.setColor (bgColor); //blue
	    c.drawRect (0 + i, 0 + i, 640, 500);
	    //cotton candy land
	    c.setColor (landColor);
	    c.drawRect (0 + i, 170, 0, 500);
	}
	//upper part of cotton candy land
	for (int i = 0 ; i < 77 ; i++)
	{
	    c.drawOval (0 - i / 2, 160 - i / 2, i + 125, i);
	    c.drawOval (150 - i / 2, 175 - i / 2, i + 125, i);
	    c.drawOval (305 - i / 2, 175 - i / 2, i + 125, i);
	    c.drawOval (395 - i / 2, 160 - i / 2, i + 125, i);
	    c.drawOval (520 - i / 2, 175 - i / 2, i + 125, i);
	}
	//sun
	c.setColor (sunColor); //yellow
	for (int i = 0 ; i < 60 ; i++)
	{
	    c.drawOval (200 - i / 2, 55 - i / 2, i, i);
	    c.drawOval (201 - i / 2, 56 - i / 2, i, i);
	}
	//sun rays
	for (int i = 0 ; i < 4 ; i++)
	{
	    c.drawLine (200 + i, 0, 200 + i, 20); //top ray
	    c.drawLine (250, 5 + i, 225, 25 + i); //top right ray
	    c.drawLine (155, 5 + i, 175, 25 + i); //top left ray
	    c.drawLine (200 + i, 90, 200 + i, 110); //bottom ray
	    c.drawLine (140, 55 + i, 165, 55 + i); //left ray
	    c.drawLine (178, 75 + i, 160, 95 + i); //bottom left ray
	    c.drawLine (235, 55 + i, 260, 55 + i); //right ray
	    c.drawLine (225, 75 + i, 245, 95 + i); //bottom right ray
	}
	//clouds
	c.setColor (cloudColor); //purple
	for (int i = 0 ; i < 50 ; i++)
	{
	    c.drawOval (30 - i / 2, 50 - i / 2, i + 50, i); //cloud 1 part 1
	    c.drawOval (75 - i / 2, 65 - i / 2, i + 50, i); //cloud 1 part 2
	    c.drawOval (325 - i / 2, 65 - i / 2, i + 35, i); //cloud 2 part 1
	    c.drawOval (374 - i / 2, 50 - i / 2, i + 50, i); //cloud 2 part 2
	    c.drawOval (374 - i / 2, 75 - i / 2, i + 50, i); //cloud 2 part 3
	    c.drawOval (550 - i / 2, 50 - i / 2, i + 60, i); //cloud 3 part 1
	    c.drawOval (600 - i / 2, 75 - i / 2, i + 60, i); //cloud 3 part 2
	}
	//pond and bottom part of jello
	for (int i = 0 ; i < 80 ; i++)
	{
	    //pond
	    c.setColor (darkBrownColor); //dark brown
	    c.drawOval (150 - i / 2, 440 - i / 2, i + 100, i - 20);
	    c.setColor (jelloColor); //turquoise
	    c.drawArc (20, 460 - i / 2, 80, i, 0, 180);
	}
	//top part of jello
	c.setColor (jelloColor2); //light cream-pink
	for (int i = 0 ; i < 40 ; i++)
	{
	    c.drawArc (25, 440 - i / 2, 70, i, 0, 180);
	}
	//stones around pond
	c.setColor (darkGoldColor);
	for (int i = 0 ; i < 18 ; i++)
	{
	    c.drawOval (130 - i / 2, 405 - i / 2, i, i); //1
	    c.drawOval (150 - i / 2, 400 - i / 2, i, i); //2
	    c.drawOval (220 - i / 2, 460 - i / 2, i, i); //3
	    c.drawOval (237 - i / 2, 458 - i / 2, i, i); //4
	    c.drawOval (255 - i / 2, 455 - i / 2, i, i); //5
	    c.drawOval (274 - i / 2, 450 - i / 2, i, i); //6
	    c.drawOval (290 - i / 2, 440 - i / 2, i, i); //7
	    c.drawArc (200, 400 - i / 2, 20, i, 0, 180); //8
	}
	//cherry on top of jello and candy cane
	for (int i = 0 ; i < 15 ; i++)
	{
	    c.setColor (Color.red); //red
	    c.drawOval (59 - i / 2, 420 - i / 2, i, i); //cherry
	    c.drawArc (366 + i / 2, 160, 15, 35, 0, 180); //candy cane top
	    c.drawLine (366 + i / 2, 173, 366 + i / 2, 230); //candy cane bottom
	}
	//candy cane stripes
	c.setColor (Color.white); //white
	c.drawLine (367, 230, 373, 220); //stripe 1 from the bottom (left side)
	c.drawLine (367, 220, 373, 210); //stripe 2 from the bottom (left side)
	c.drawLine (367, 210, 373, 200); //stripe 3 from the bottom (left side)
	c.drawLine (367, 200, 373, 190); //stripe 4 from the bottom (left side)
	c.drawLine (367, 190, 373, 180); //stripe 5 from the bottom (left side)
	c.drawLine (367, 180, 373, 170); //stripe 6 from the bottom (left side)
	c.drawLine (367, 170, 373, 160); //stripe 7 from the bottom (left side)
	c.drawLine (382, 178, 388, 170); //stripe 1 from the bottom (right side)
	c.drawLine (380, 168, 384, 162); //stripe 2 from the bottom (right side)
	//popsicle
	c.setColor (popsicleColor); //salmon
	for (int i = 0 ; i < 130 ; i++)
	{
	    c.drawArc (480, 220 - i / 2, 30, i, 0, 180); //left side of popsicle
	    c.drawArc (500, 220 - i / 2, 30, i, 0, 180); //right side of popsicle
	}
	//popsicle lines
	c.setColor (darkOrange); //dark orange
	c.drawLine (495, 215, 495, 170); //left line
	c.drawLine (515, 215, 515, 170); //right line
	//lollipop sticks and popsicle sticks
	for (int i = 0 ; i < 6 ; i++)
	{
	    //big lollipop sticks
	    c.setColor (Color.white); //white
	    c.drawLine (43 + i, 210, 43 + i, 275); //lollipop stick 1
	    c.drawLine (153 + i, 150, 153 + i, 200); //lollipop stick 2
	    c.drawLine (468 + i, 150, 468 + i, 200); //lollipop stick 3
	    c.drawLine (573 + i, 210, 573 + i, 275); //lollipop stick 4
	    //tiny lollipop sticks
	    c.drawLine (100 + i / 2, 165, 100 + i / 2, 185); //tiny lollipop stick 1
	    c.drawLine (205 + i / 2, 165, 205 + i / 2, 185); //tiny lollipop stick 2
	    c.drawLine (405 + i / 2, 205, 405 + i / 2, 225); //tiny lollipop stick 3
	    //popsicle sticks
	    c.setColor (popsicleStickColor); //tan
	    c.drawLine (490 + i, 221, 490 + i, 240); //popsicle stick 1
	    c.drawLine (515 + i, 221, 515 + i, 240); //popsicle stick 2
	}
	//lollipop layer 1
	c.setColor (lollipopColor1); //red
	for (int i = 0 ; i < 75 ; i++)
	{
	    c.drawOval (45 - i / 2, 180 - i / 2, i, i); //left lollipop
	    c.drawOval (165 - i / 2, 145 - i / 2, i - 20, i - 20); //2nd left lollipop
	    c.drawOval (575 - i / 2, 180 - i / 2, i, i); //right lollipop
	    c.drawOval (480 - i / 2, 145 - i / 2, i - 20, i - 20); //2nd left lollipop
	}
	//lollipop layer 2
	c.setColor (lollipopColor2); //orange
	for (int i = 0 ; i < 65 ; i++)
	{
	    c.drawOval (45 - i / 2, 180 - i / 2, i, i); //left lollipop
	    c.drawOval (165 - i / 2, 145 - i / 2, i - 20, i - 20); //2nd left lollipop
	    c.drawOval (575 - i / 2, 180 - i / 2, i, i); //right lollipop
	    c.drawOval (480 - i / 2, 145 - i / 2, i - 20, i - 20); //2nd left lollipop
	}
	//lollipop layer 3
	c.setColor (lollipopColor3); //yellow
	for (int i = 0 ; i < 55 ; i++)
	{
	    c.drawOval (45 - i / 2, 180 - i / 2, i, i); //left lollipop
	    c.drawOval (165 - i / 2, 145 - i / 2, i - 20, i - 20); //2nd left lollipop
	    c.drawOval (575 - i / 2, 180 - i / 2, i, i); //right lollipop
	    c.drawOval (480 - i / 2, 145 - i / 2, i - 20, i - 20); //2nd left lollipop
	}
	//lollipop layer 4
	c.setColor (lollipopColor4); //green
	for (int i = 0 ; i < 45 ; i++)
	{
	    c.drawOval (45 - i / 2, 180 - i / 2, i, i); //left lollipop
	    c.drawOval (165 - i / 2, 145 - i / 2, i - 20, i - 20); //2nd left lollipop
	    c.drawOval (575 - i / 2, 180 - i / 2, i, i); //right lollipop
	    c.drawOval (480 - i / 2, 145 - i / 2, i - 20, i - 20); //2nd left lollipop
	}
	//lollipop layer 5
	c.setColor (lollipopColor5); //blue
	for (int i = 0 ; i < 35 ; i++)
	{
	    c.drawOval (45 - i / 2, 180 - i / 2, i, i); //left lollipop
	    c.drawOval (165 - i / 2, 145 - i / 2, i - 20, i - 20); //2nd left lollipop
	    c.drawOval (575 - i / 2, 180 - i / 2, i, i); //right lollipop
	    c.drawOval (480 - i / 2, 145 - i / 2, i - 20, i - 20); //2nd left lollipop
	}
	//lollipop layer 6
	c.setColor (lollipopColor6); //purple
	for (int i = 0 ; i < 25 ; i++)
	{
	    c.drawOval (45 - i / 2, 180 - i / 2, i, i); //left lollipop
	    c.drawOval (165 - i / 2, 145 - i / 2, i - 20, i - 20); //2nd left lollipop
	    c.drawOval (575 - i / 2, 180 - i / 2, i, i); //right lollipop
	    c.drawOval (480 - i / 2, 145 - i / 2, i - 20, i - 20); //2nd left lollipop
	}
	//lollipop layer 7
	c.setColor (lollipopColor7); //pink
	for (int i = 0 ; i < 12 ; i++)
	{
	    c.drawOval (45 - i / 2, 180 - i / 2, i, i); //left lollipop
	    c.drawOval (575 - i / 2, 180 - i / 2, i, i); //right lollipop
	}
	//house
	for (int i = 0 ; i < 100 ; i++)
	{
	    c.setColor (houseColor1); //brown
	    c.drawLine (260 + i, 160, 260 + i, 230); //front face
	    c.setColor (darkGoldColor); //dark gold
	    c.drawLine (260 + i, 230, 260 + i, 250); //front porch
	    c.drawArc (290, 240 - i / 2, 40, i, 0, 180); //house door outline
	    //roof
	    int a[] = {260, 310, 360 - i}; //x-coordinates
	    int b[] = {120, 80, 120}; //y-coordinates
	    c.drawPolygon (a, b, 3);
	    c.drawLine (260 + i, 120, 260 + i, 160); //middle of roof
	}
	for (int i = 0 ; i < 105 ; i++)
	{
	    c.setColor (darkBrownColor); //dark brown
	    //front of roof
	    int x[] = {260, 310, 362 - i}; //x-coordinates
	    int y[] = {160, 120, 160}; //y-coordinates
	    c.drawPolygon (x, y, 3);
	    //chimney
	    c.drawLine (330 + i / 5, 90, 330 + i / 5, 120);
	    //windows
	    c.drawLine (268 + i / 5, 180, 268 + i / 5, 200); //left window
	    c.drawLine (333 + i / 5, 180, 333 + i / 5, 200);
	}
	//line in the middle of the roof
	c.drawLine (310, 120, 310, 80);
	//house sides
	c.drawLine (268, 160, 268, 230); //left side
	c.drawLine (353, 160, 353, 230); //left side
	//house candy decorations
	for (int i = 0 ; i < 11 ; i++)
	{
	    c.setColor (frostingColor);
	    c.drawOval (265 - i / 2, 225 - i / 2, i, i); //bottom frosting 1
	    c.drawOval (275 - i / 2, 225 - i / 2, i, i); //bottom frosting 2
	    c.drawOval (285 - i / 2, 225 - i / 2, i, i); //bottom frosting 3
	    c.drawOval (295 - i / 2, 225 - i / 2, i, i); //bottom frosting 4
	    c.drawOval (325 - i / 2, 225 - i / 2, i, i); //bottom frosting 5
	    c.drawOval (335 - i / 2, 225 - i / 2, i, i); //bottom frosting 6
	    c.drawOval (345 - i / 2, 225 - i / 2, i, i); //bottom frosting 7
	    c.drawOval (355 - i / 2, 225 - i / 2, i, i); //bottom frosting 8
	    c.drawOval (300 - i / 2, 190 - i / 2, i, i); //frosting above door 1
	    c.drawOval (310 - i / 2, 190 - i / 2, i, i); //frosting above door 2
	    c.drawOval (320 - i / 2, 190 - i / 2, i, i); //frosting above door 3
	    //flower design
	    c.drawOval (310 - i / 2, 145 - i / 2, i, i); //center
	    c.drawOval (311 - i / 2, 137 - i / 2, i - 3, i - 3); //top
	    c.drawOval (311 - i / 2, 155 - i / 2, i - 3, i - 3); //bottom
	    c.drawOval (304 - i / 2, 143 - i / 2, i - 3, i - 3); //top left
	    c.drawOval (304 - i / 2, 151 - i / 2, i - 3, i - 3); //bottom left
	    c.drawOval (319 - i / 2, 143 - i / 2, i - 3, i - 3); //top right
	    c.drawOval (319 - i / 2, 151 - i / 2, i - 3, i - 3); //bottom right
	}
	//house door
	for (int i = 0 ; i < 70 ; i++)
	{
	    c.setColor (darkBrownColor);
	    c.drawArc (295, 230 - i / 2, 30, i, 0, 180); //door
	}
	c.setColor (frostingColor);
	c.drawLine (300, 230, 300, 206); //door line 1
	c.drawLine (310, 230, 310, 198); //door line 2
	c.drawLine (320, 230, 320, 206); //door line 3
	//gumdrops
	for (int i = 0 ; i < 47 ; i++)
	{
	    c.setColor (gumdropColor);
	    c.drawArc (7, 275 - i / 2, 28, i, 0, 180); //gumdrop 1
	    c.drawArc (100, 225 - i / 2, 28, i, 0, 180); //gumdrop 2
	    c.drawArc (400, 175 - i / 2, 28, i, 0, 180); //gumdrop 3
	    c.drawArc (530, 265 - i / 2, 28, i, 0, 180); //gumdrop 4
	    c.setColor (gumdropColor2);
	    c.drawArc (65, 265 - i / 2, 20, i - 15, 0, 180); //gumdrop 1
	    c.drawArc (165, 225 - i / 2, 20, i - 15, 0, 180); //gumdrop 2
	    c.drawArc (451, 230 - i / 2, 20, i - 15, 0, 180); //gumdrop 3
	    c.drawArc (595, 265 - i / 2, 20, i - 15, 0, 180); //gumdrop 4
	}
	//tiny lollipops
	for (int i = 0 ; i < 27 ; i++)
	{
	    c.setColor (tinyLollipopColor); //plum
	    c.drawOval (100 - i / 2, 155 - i / 2, i, i); //lollipop 1
	    c.drawOval (205 - i / 2, 155 - i / 2, i, i); //lollipop 2
	    c.drawOval (405 - i / 2, 195 - i / 2, i, i); //lollipop 3
	}
	//tiny lollipop stripes
	c.setColor (Color.blue);
	c.drawLine (90, 163, 100, 142); //stripe 1
	c.drawLine (100, 168, 110, 148); //stripe 2
	c.drawLine (195, 163, 205, 142); //stripe 3
	c.drawLine (205, 168, 215, 148); //stripe 4
	c.drawLine (395, 203, 405, 182); //stripe 3
	c.drawLine (405, 208, 415, 188); //stripe 4
    }


    public Background (Console con)  //class constructor


    {
	c = con;
	draw (); //calls the draw method
    }
}


