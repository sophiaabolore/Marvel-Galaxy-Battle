import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Hammers here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Hammers extends Actor
{
    /**
     * Act - do whatever the Hammers wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        // Add your action code here.
    }  
    private int hammers;
    private String text;
    private int points;
    //sets the value of points to zero
    //sets the images colour to white 
    //displays the image
     public Hammers()
    {
        points =20;
        GreenfootImage img = new GreenfootImage(100,30);
        img.setColor(Color.WHITE);
        img.drawString("Hammers: " + points, 5,25);
        setImage(img);
    }
    //add to the value of the integer points 
    // if the value of points is greater than 0, the value of points increses
    // if the value of points is 0 "out of hammers' is displayed, thor is removed from the world
    //and the game ends.
    public void addToHammers() 
    {
        points++;
        GreenfootImage img = getImage();
        img.clear();
       if(points >0 ) {
            img.drawString("Hammers: " + points, 5,25); 
        } else {
            //Greenfoot.playSound("fanfare.wav");
            img.drawString("out of Hammers!!!", 5,25);
            removeTouching (Thor.class);
            //getWorld().addObject( Won(), 600,325);
            Greenfoot.stop();
        }        
    } 
     // subtracts from the value of diamonds
    //displays updated value.
   public void removeHammers()
   {
       points--;
        GreenfootImage img = getImage();
        img.clear();
       img.drawString("Hammers: " + points, 5,25); 
        
    }
}
