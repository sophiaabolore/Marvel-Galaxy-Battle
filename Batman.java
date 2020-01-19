import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Batman here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Batman extends Actor
{
    /**
     * Act - do whatever the Batman wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        // Add your action code here.
        setLocation (getX() - 3, getY());
        checkForHammer();
        
    }   
    public Batman()
    {
        getImage().scale(200,155);
    }
    public void checkForEdge()
    {
        if (getX() <= 0)
        {
            ((MyWorld) getWorld()).subGems();
            getWorld().removeObject(this);
            
        }
    }
    
    public void checkForHammer()
    {
       if (isTouching (Hammer.class))
       {
           for (int b = 0; b<25; b++)
         {
          getWorld().addObject(new Blood(), getX(), getY());
        }
         removeTouching(Hammer.class);
         getWorld().removeObject(this);
         
        }
    }
}
