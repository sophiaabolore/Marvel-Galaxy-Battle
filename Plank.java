import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Plank here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Plank extends Actor
{
    /**
     * Act - do whatever the Plank wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    private int speed = Greenfoot.getRandomNumber(4) +2;
    // enables the plank to move at a random speed between 2 and 4 pixels per iteration
    //calls the "atEdge" method into action
    public void act() 
    {
        
        setLocation (getX()-speed,getY());
        atEdge();
        // Add your action code here.
    }    
    //sets the planks size to 220 by 50
    public Plank()
    {
         getImage().scale(220,50);
    }
    // if the plank reachd the other side of the  world its placed back to its starting side 
    // at a random location 
   public void atEdge()
    {
        if (getX() <0)
        {
            setLocation (1200,Greenfoot.getRandomNumber(650));
        }
    }
}
