import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Lives here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Lives extends Actor
{
    /**
     * Act - do whatever the Lives wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        // Add your action code here.
    }   
      
    
    private String text;
    private int points;
    //sets the value of points to zero
    //sets the images colour to white 
    //displays the image
     public Lives()
    {
        points =3;
        GreenfootImage img = new GreenfootImage(100,30);
        img.setColor(Color.WHITE);
        img.drawString("Lives: " + points, 5,25);
        setImage(img);
    }
     //add to the value of the integer points 
    // if the value of points is greater than 0, the value of points increses
    // if the value of points is 0 "you Lose' is displayed and the game ends.
    public void addToLives() 
    {
        points++;
        GreenfootImage img = getImage();
        img.clear();
      // if(points >0) {
            img.drawString("Lives: " + points, 5,25); 
         /*else {
            //Greenfoot.playSound("fanfare.wav");
            img.drawString("You Lose!!!", 5,25);
            Greenfoot.stop();
            //getWorld().addObject( Won(), 600,325);
            
        }  */      
    } 
     // subtracts from the value of lives
    //displays updated value.
    public void removeLives()
    {
        points --;
         GreenfootImage img = getImage();
        img.clear();
        img.drawString("Lives: " + points, 5,25); 
         if(points >0) {
            img.drawString("Lives: " + points, 5,25); 
        } else {
            //Greenfoot.playSound("fanfare.wav");
            img.drawString("You Lose!!!", 5,25);
            Greenfoot.stop();
            //getWorld().addObject( Won(), 600,325);
            
        }  
     
    }
}
