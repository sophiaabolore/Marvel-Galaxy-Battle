import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Hammer here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Hammer extends Actor
{
    /**
     * Act - do whatever the Hammer wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    private int speed;
    // makes the hammer move 5 pixels per iteration
    // calls the method to produce "Smoke" along with the Hammmer
    public void act() 
    {
       
        setLocation (getX() + 5, getY());
        move(speed);
        
         addSmoke();
       
       
        // Add your action code here.
    }   
    //sets the rotation of the hammer to 200
    // sets the size of the hammer to 100 by 100
    public Hammer()
    {
        setRotation (200);
       
        getImage().scale(100,100);
     
    }
    //adds smoke to the world at the location of the Hammer
    public void addSmoke()
    {
        getWorld().addObject(new Wind(), getX() - 10, getY());
    }
   
    
    
}
