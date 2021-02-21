import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class RobotWorld here.
 * 
 * @Lukas Nieto (your name) 
 * @1.0 (a version number or a date)
 */
public class RobotWorld extends World
{

    /**
     * Constructor for objects of class RobotWorld.
     * 
     */
    public RobotWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(800, 600, 1);
        addObject(new Robot(), 48,50);
        addObject(new Wall(), 52,147);
        addObject(new Wall(), 159,147);
        addObject(new Wall(), 266,147);
        addObject(new Wall(), 587,147);
        addObject(new Wall(), 692,147);
        addObject(new Wall(), 791,147);
        addObject(new Block(), 427,145);
        addObject(new Home(), 751,552);
        addObject(new Scorepanel(), 71,554);
        addObject(new Pizza(), 720,46);
        addObject(new Pizza(), 433,38);
        addObject(new Pizza(), 183,302);
        addObject(new Pizza(), 682,312);
        addObject(new Pizza(), 417,537);

        prepare();
    }

    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        
        
    }
}
