import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Wind here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Wind extends Actor
{
    private int trans= 255;
    /**
     * Act - do whatever the Wind wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    // set the transperancy of the wind to the int trans
    //subtracts 5 from the value of trans per iteration 
    //removes the object once trans is less than 10
    public void act() 
    {
        getImage().setTransparency(trans);
        // Add your action code here.
        if (trans <10)
        {
            getWorld().removeObject(this);
        }
        else 
        {
          trans = trans - 5;  
        }
    } 
    //sets the size of this image to 50 by 70 pixels
    // sets this images rotation to 
    public Wind()
    {
        getImage().scale(50,75);
        setRotation(340);
    }
}
