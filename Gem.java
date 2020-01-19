import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Gem here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Gem extends Actor
{
    /**
     * Act - do whatever the Gem wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        // Add your action code here.
        
        
        setLocation (getX()- 3, getY());
        atEdge();
    }    
    public Gem()
    {
         getImage().scale(50,40);
    }
    /*public void checkForThor()
    {
       if(isTouching(Thor.class)== true)
       {
           getWorld().removeObject(this);
        }
    }*/
    public void atEdge()
    {
        if (getX() <= 0)
        {
            getWorld().removeObject(this);
        }
        else if (isTouching (Thor.class) == true)
        {
            ((MyWorld) getWorld()).update();
            
            getWorld().removeObject(this);
        }
    }
}
