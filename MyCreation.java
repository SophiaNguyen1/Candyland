/**
Sophia Nguyen
Ms. Krasteva
Oct. 2018
This file runs the other classes to create MyCreation.
*/

import java.awt.*; //gives access to the java command libraries
import hsa.Console; //gives access to the Console class file


public class MyCreation //creates a new class called MyCreation
{
    Console c; //creates an instance variable of Console class so the output window can be made

    public void openingScene ()  //openingScene method
    {
	//not a thread because it's not animated
	OpeningScene o = new OpeningScene (c); //creates a new OpeningScene object and transfers it to the main console
    }


    public void background ()  //background method
    {
	//not a thread because it's not animated
	Background b = new Background (c); //creates a new Background object and transfers it to the main console
    }


    public void chocolateA ()  //chocolateA method (adds the ChocolateA thread to MyCreation)
    {
	ChocolateA d = new ChocolateA (c); //creates a new chocolateA object and transfers it to the main console
	d.start (); //starts the thread
	try
	{
	    d.join ();
	}
	catch (InterruptedException e)
	{
	}
    }


    public void gingerbreadManA ()  //gingerbreadManA method (adds the GingerbreadManA thread to MyCreation)
    {
	GingerbreadManA z = new GingerbreadManA (c); //creates a new GingerbreadManA object and transfers it to the main console
	z.run (); //starts the thread
	try
	{
	    z.join ();
	}
	catch (InterruptedException e)
	{
	}
    }


    public void cookieA ()  //cookieA method (adds the CookieA thread to MyCreation)
    {
	CookieA b = new CookieA (c); //creates a new CookieA object and transfers it to the main console
	b.start (); //starts the thread
    }


    public void cakeA ()  //cakeA method (adds the CakeA thread to MyCreation)
    {
	CakeA a = new CakeA (c); //creates a new cakeA object and transfers it to the main console
	a.run (); //starts the thread
    }


    public void gummyBearA ()  //overloaded gummyBearA method (adds the overloaded GummyBearA thread to MyCreation)
    {
	GummyBearA g1 = new GummyBearA (c); //creates a new GummyBearA object and transfers it to the main console
	g1.start (); //starts the thread
	GummyBearA g2 = new GummyBearA (c, Color.yellow); //creates a new GummyBearA object, transfers it to the main console, and gives it a color
	g2.start (); //starts the thread
	GummyBearA g3 = new GummyBearA (c, Color.green, 15); //creates a new GummyBearA object, transfers it to the main console, and gives it a color and delay time
	g3.start (); //starts the thread
	try
	{
	    g1.join ();
	    g2.join ();
	    g3.join ();
	}
	catch (InterruptedException e)
	{
	}
    }


    public void meghanHendricksonA ()  //meghanHendricksonA method (adds the MeghanHendricksonA thread to MyCreation)
    {
	MeghanHendricksonA y = new MeghanHendricksonA (c); //creates a new MeghanHendricksonA object and transfers it to the main console
	y.start (); //starts the thread
	try
	{
	    y.join ();
	}
	catch (InterruptedException e)
	{
	}
    }


    public void cakeB ()  //cakeB method (adds the CakeB thread to MyCreation)
    {
	CakeB k = new CakeB (c); //creates a new CakeB object and transfers it to the main console
	k.start (); //starts the thread
	try
	{
	    k.join ();
	}
	catch (InterruptedException e)
	{

	}
    }


    public void cookieB ()  //cookieB method (adds the CookieB thread to MyCreation)
    {
	CookieB j = new CookieB (c); //creates a new CookieB object and transfers it to the main console
	j.start (); //starts the thread
	try
	{
	    j.join ();
	}
	catch (InterruptedException e)
	{
	}
    }


    public void gingerbreadManB ()  //gingerbreadManB method (adds the GingerbreadManB thread to MyCreation)
    {
	GingerbreadManB x = new GingerbreadManB (c); //creates a new GingerbreadManB object and transfers it to the main console
	x.start (); //starts the thread
	try
	{
	    x.join ();
	}
	catch (InterruptedException e)
	{
	}
    }


    public void chocolateB ()  //chocolateB method (adds the ChocolateB thread to MyCreation)
    {
	ChocolateB f = new ChocolateB (c); //creates a new ChocolateB object and transfers it to the main console
	f.start (); //starts the thread
	try
	{
	    f.join ();
	}
	catch (InterruptedException e)
	{
	}
    }


    public void gummyBearB ()  //overloaded gummyBearB method (adds the overloaded GummyBearB thread to MyCreation)
    {
	GummyBearB g4 = new GummyBearB (c); //creates a new GummyBearB object and transfers it to the main console
	g4.start (); //starts the thread
	GummyBearB g5 = new GummyBearB (c, Color.yellow); //creates a new GummyBearB object, transfers it to the main console, and gives it a color
	g5.start (); //starts the thread
	GummyBearB g6 = new GummyBearB (c, Color.green, 5); //creates a new GummyBearB object, transfers it to the main console, and gives it a color and delay time
	g6.start (); //starts the thread
	try
	{
	    g4.join ();
	    g5.join ();
	    g6.join ();
	}
	catch (InterruptedException e)
	{
	}
    }


    public void meghanHendricksonB ()  //meghanHendricksonB method (adds the MeghanHendricksonB thread to MyCreation)
    {
	MeghanHendricksonB w = new MeghanHendricksonB (c); //creates a new MeghanHendricksonB object and transfers it to the main console
	w.start (); //starts the thread
	try
	{
	    w.join ();
	}
	catch (InterruptedException e)
	{
	}
    }


    public void chocolateC ()  //chocolateC method (adds the ChocolateC thread to MyCreation)
    {
	ChocolateC u = new ChocolateC (c); //creates a new ChocolateB object and transfers it to the main console
	u.start (); //starts the thread
	try
	{
	    u.join ();
	}
	catch (InterruptedException e)
	{
	}
    }


    public void gingerbreadManC ()  //gingerbreadManC method (adds the GingerbreadManC thread to MyCreation)
    {
	GingerbreadManC p = new GingerbreadManC (c); //creates a new GingerbreadManC object and transfers it to the main console
	p.start (); //starts the thread
	try
	{
	    p.join ();
	}
	catch (InterruptedException e)
	{
	}
    }


    public void cookieC ()  //cookieC method (adds the CookieC thread to MyCreation)
    {
	CookieC q = new CookieC (c); //creates a new CookieC object and transfers it to the main console
	q.start (); //starts the thread
	try
	{
	    q.join ();
	}
	catch (InterruptedException e)
	{
	}
    }



    public void gummyBearC ()  //overloaded gummyBearC method (adds the overloaded GummyBearC thread to MyCreation)
    {
	GummyBearC g7 = new GummyBearC (c); //creates a new GummyBearC object and transfers it to the main console
	g7.start (); //starts the thread
	GummyBearC g8 = new GummyBearC (c, Color.yellow); //creates a new GummyBearC object, transfers it to the main console, and gives it a color
	g8.start (); //starts the thread
	GummyBearC g9 = new GummyBearC (c, Color.green, 15); //creates a new GummyBearC object, transfers it to the main console, and gives it a color and delay time
	g9.start (); //starts the thread
	try
	{
	    g7.join ();
	    g8.join ();
	    g9.join ();
	}
	catch (InterruptedException e)
	{
	}
    }


    public void cakeC ()  //cakeC method (adds the CakeC thread to MyCreation)
    {
	CakeC l = new CakeC (c); //creates a new CakeC object and transfers it to the main console
	l.start (); //starts the thread
	try
	{
	    l.join ();
	}
	catch (InterruptedException e)
	{

	}
    }


    public void endingScene ()  //endingScene method
    {
	//not a thread because it's not animated
	EndingScene e = new EndingScene (c); //creates a new EndingScene object and transfers it to the main console
    }


    public MyCreation ()  //class constructor
    {
	c = new Console ("Candyland"); //creates a new Console object window and gives it a title
    }


    public static void main (String[] args)  //main method
    {
	MyCreation m = new MyCreation (); //creates instance variable of MyCreation and constructs a new MyCreation object
	m.openingScene (); //executes openingScene method
	m.background (); //executes background method
	m.chocolateA (); //executes chocolateA method
	m.gingerbreadManA (); //executes gingerbreadManA method
	m.cookieA (); //executes cookieA method
	m.cakeA (); //executes cakeA method
	m.gummyBearA (); //executes gummyBearA method
	m.meghanHendricksonA (); //executes meghanHendricksonA method
	m.cakeB (); //executes cakeB method
	m.cookieB (); //executes cookieB method
	m.gingerbreadManB (); //executes gingerbreadManB method
	m.chocolateB (); //executes chocolateB method
	m.gummyBearB (); //executes gummyBearB method
	m.meghanHendricksonB (); //executes meghanHendricksonB method
	m.chocolateC (); //executes chocolateC method
	m.gingerbreadManC (); //executes gingerbreadManC method
	m.cookieC (); //executes cookieC method
	m.gummyBearC (); //executes gummyBearC method
	m.cakeC (); //executes cakeC method
	m.endingScene (); //executes endingScene method
    }
}


