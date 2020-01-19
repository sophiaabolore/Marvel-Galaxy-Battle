import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Blood here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Blood extends Actor
{
    /**
     * Act - do whatever the Blood wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
     
    private int speed;
   
    // sets its height and width to a random number between 30 and 5
    //sets the roatation to a random value
    // stes the speed to a random number between 5 and 10
    public Blood()
    {
        
        
        int w = Greenfoot.getRandomNumber (30) + 5;
        int h = Greenfoot.getRandomNumber (30) + 5;
        getImage ().scale (w,h);
        int rotation = Greenfoot.getRandomNumber (359);
        setRotation(rotation);
        speed = Greenfoot.getRandomNumber(10) + 5;
    }
    // sets the movement to speed 
    // if the blood is at the edge they are deleted from the world 
    public void act() 
    {
        // Add your action code here.
        move (speed);
        if (isAtEdge() == true)
        {
            getWorld().removeObject(this);
        }
    } 
}
