import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Asteroid here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Asteroid extends Actor
{
    /**
     * Act - do whatever the Asteroid wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    private boolean hasBall = false;
    // enables the asteroid to move 3 pixels per iteration
    // calls methods into action
    public void act() 
    {
        setLocation (getX()- 3, getY());
      
        checkForObstacles ();
        
    }  
    // sets the size of each asteroid produced to 80 by 70
    public Asteroid()
    {
        getImage().scale(80,70);
        
    }
    // if the asteroid's close to the other side of the world itis deleted
    public void checkForObstacles()
    {
         if (getX()<=50)
        {
            getWorld().removeObject(this);
        }
    }
    
}
