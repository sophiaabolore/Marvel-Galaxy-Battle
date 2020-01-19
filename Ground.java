import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Ground here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Ground extends Actor
{
    /**
     * Act - do whatever the Ground wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    // calls methods into action
    public void act() 
    {
        // Add your action code here.
        scroll();
    }    
    // sets the size to 1200 by 100 pixels 
    public Ground()
    {
        getImage().scale(1200, 100);
    }
    // sets the image "Ground"
    //checks to see if it it halfway through the world
    // if so it adds another 'Ground" image to the other half of the world
    public void scroll()
    {
        if (getX()< -getImage().getWidth()/2)
        {
            setLocation(getX() + getWorld().getWidth()*2, getY());
        }
        setLocation( getX()- 7, getY());
    }
}
