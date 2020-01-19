import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class WhiteDwarf here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class WhiteDwarf extends Actor
{
    /**
     * Act - do whatever the WhiteDwarf wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    // enabled the dwarf to move 5 pixels per iteration to the left
    public void act() 
    {
        setLocation(getX()-5, getY());
        // Add your action code here.
    }    
    // sets the size of the dwarf to 100 by 100 pixels
    public  WhiteDwarf()
    {
        getImage().scale(100,100);
    }
    // if the dwarf reaches the other side of the world it is deleted 
    public void atEdge()
    {
        if (getX() <=0)
        {
            getWorld().removeObject(this);
        }
    }
}
