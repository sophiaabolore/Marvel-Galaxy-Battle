import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Gems here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Gems extends Actor
{
    /**
     * Act - do whatever the Gems wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    
    public void act() 
    {
        // Add your action code here.
        
    }    
    private int gems;
    private String text;
    private int points;
    //sets the value of points to zero
    //sets the images colour to white 
    //displays the image
     public Gems()
    {
        points =0;
        GreenfootImage img = new GreenfootImage(100,30);
        img.setColor(Color.WHITE);
        img.drawString("Gems: " + points, 5,25);
        setImage(img);
    }
    //add to the value of the integer points 
    // if the value of points is less than 10, the value of points increses
    // if the value of points is ten it plays a sound, displays the "Big Win" image
    // removes the Thor char and ends the game
    public void addToGems() 
    {
        points++;
        GreenfootImage img = getImage();
        img.clear();
       if(points <10 ) {
            img.drawString("Gems: " + points, 5,25); 
        } else {
            //Greenfoot.playSound("fanfare.wav");
           img.drawString("You win!!!", 5,25);
            Greenfoot.playSound("fanfare.wav");
            getWorld().addObject(new Won(), 600,325);
            removeTouching(Thor.class);
            //getWorld().addObject( Won(), 600,325);
            Greenfoot.stop();
        }        
    } 
    // subtracts from the value of gems
    //displays updated value.
   public void removeGems()
   {
       points--;
        GreenfootImage img = getImage();
        img.clear();
      img.drawString("Gems: " + points, 5,25); 
    
    }
}
