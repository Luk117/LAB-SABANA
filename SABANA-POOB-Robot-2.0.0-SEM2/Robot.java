import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Robot here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Robot extends Actor
{
    /**
     * Act - do whatever the Robot wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        robotMovement ();
        detectwallCollision();
        detectBlockCollision();
        eatPizza();
        detectHome();
        
    }    
    public void robotMovement(){
        if (Greenfoot.isKeyDown("right"))
        {
            setLocation(getX()+3, getY());
        }
        if (Greenfoot.isKeyDown("left"))
        {
            setLocation(getX()-3, getY());
        }
        if (Greenfoot.isKeyDown("up"))
        {
            setLocation(getX(), getY()-3);
        }
        if (Greenfoot.isKeyDown("down"))
        {
            setLocation(getX(), getY()+3);
        }
        
         
    }
    
    
    public void detectwallCollision(){
    Actor Wall;
    Wall = getOneObjectAtOffset(0,0,Wall.class);
    RobotWorld RobotWorld = (RobotWorld) getWorld();
        
        if (Wall!= null)
        {Greenfoot.playSound("hurt.mp3");
        
        }
    }
    
    public void detectBlockCollision(){
    Actor Block;
    Block = getOneObjectAtOffset(0,0,Block.class);
    RobotWorld RobotWorld = (RobotWorld) getWorld();
        if (Block!= null)
        {Greenfoot.playSound("hurt.mp3");
        
        }
    }

    public void eatPizza(){
    Actor Pizza;
    Pizza = getOneObjectAtOffset(0,0,Pizza.class);
    RobotWorld RobotWorld = (RobotWorld) getWorld();
    
        if (Pizza!=null){
            RobotWorld.removeObject(Pizza);
            Greenfoot.playSound("eat.mp3");
            
        }  
    }
    
    public void detectHome(){
    Actor Home;
    Home = getOneObjectAtOffset (0,0,Home.class);
    RobotWorld RobotWorld = (RobotWorld) getWorld();
        if (Home!=null){
            Greenfoot.setWorld(new RobotWorld());
            Greenfoot.playSound("yipee.mp3");
        }
    }
}
