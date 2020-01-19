import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Joker here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Joker extends Actor
{
    /**
     * Act - do whatever the Joker wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    // enables the joker to move 2 pixels per iteration
    //calls methods into action
    public void act() 
    {
        // Add your action code here.
        setLocation (getX() -2, getY());
        checkForEdge();
        //checkForThisHammer();
       
    }   
    // sets the jokers image to a size of 190 by 185
    public Joker()
    {
        getImage().scale(190,185);
    }
    // removes the joker if it reaches the other side
    // calls to subtract a gem once the joker reaches the other side 
    // if the joker if hit by a hammer, he is deleted and 25 blood drops are executed in his place
    // the hammer is also deleted
    public void checkForEdge()
    {
        if (getX() <= 0)
        {
            ((MyWorld) getWorld()).subGems();
            getWorld().removeObject(this);
            
        }
        else 
       if (isTouching (Hammer.class))
       {
           for (int j = 0; j<25; j++)
         {
          getWorld().addObject(new Blood(), getX(), getY());
        }
         removeTouching(Hammer.class);
         getWorld().removeObject(this);
        
        }
    }
   
 
}
