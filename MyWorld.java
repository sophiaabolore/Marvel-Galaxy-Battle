import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MyWorld extends World
{
    private Background img0, img1;
    private Ground img2, img3;
    
    private int [] asteroidX = {};
    private Gems gems;
    private Lives lives;
    private Hammers hammers;
    
    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    
    //adds objects to the world
    //sets the scrolling images of the background 
    // sets the scrolling images of the Ground 
    // sets the order in which objects appear
    //sets a for loops for the reoccurence of asteroids and planks
    public MyWorld()
    {    
         super(1200, 650, 1,false); 
         setPaintOrder (Thor.class,Asteroid.class,Plank.class,Joker.class, Batman.class,Gem.class, Ground.class);
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        img0 = new Background ();
        addObject(img0, getWidth()/2, getHeight()/2);
        
        img1 = new Background ();
        addObject(img1, getWidth()/2 + getWidth(), getHeight()/2);
        
        img2 = new Ground();
        addObject(img2, getWidth()/2,650);
        
         img3 = new Ground();
        addObject(img3, getWidth()/2 + getWidth(),650);
        
        int x = 25;
        addObject( new Thor(), 100,590);
        gems = new Gems();
        addObject (gems, 50,325);
        lives = new Lives();
        addObject(lives, 50, 525);
        hammers = new Hammers();
        addObject( hammers, 50, 125);
        
        for (int t=0; t< asteroidX.length; t++)
        {
            addObject(new Asteroid(), asteroidX[t], 190);
            x = x + 25;
        }
      
      for (int pa=0; pa<5; pa++)
        {
            addObject(new Plank(), Greenfoot.getRandomNumber(1200), Greenfoot.getRandomNumber(650));
            
        }
      
     
    }
    // calls the methods to add asteroids,jokers,batmen,gems,and white dwarfs
    // calls for the scrolling between the background images.
    public void act()
    {
        
            addAsteroids();
            addGems();
            addJoker();
            addBatman();
            addDwarfs();
            img0.scroll();
            img1.scroll();
            
    }
    //adds an asteroid to the world at 750 by 550 0.1 percent of the time
     public void addAsteroids()
    {  
        if (Greenfoot.getRandomNumber (1000) < 1)
        {
            addObject (new Asteroid (),750,550);
        }
    }
    // adds a gem to the world at a random position 0.5 percent of the time
    public void addGems()
    {
        if(Greenfoot.getRandomNumber(1000) < 5)
        {
            addObject(new Gem(), Greenfoot.getRandomNumber(1200),Greenfoot.getRandomNumber(600) );
        }
    }
    // add a white dwarf to the world 0.1% of the time at the right side of the screen
    public void addDwarfs()
    {
        if (Greenfoot.getRandomNumber(1000) < 1)
        {
            addObject(new WhiteDwarf(), 1200,Greenfoot.getRandomNumber(600));
        }
    }
   // Updates the value of the scoreboard "Gems" when it increases
    public void update()
    {
        gems.addToGems();
    }
    // Updates the value of the scoreboard "Gems" when it decreases
    public void subGems()
    {
      gems.removeGems();  
    }
    // Updates the value of the scoreboard "Lives" when it increases
    public void addLife()
    {
        lives.addToLives();
    }
    // Updates the value of the scoreboard "Lives" when it decreases
    public void subLives()
    {
        lives.removeLives();
    }
    // Updates the value of the scoreboard "Hammers" when it increases
    public void updateHammers()
    {
        hammers.addToHammers();
    }
 //  // Updates the value of the scoreboard "Lives" when it decreases
    public void subHammers()
    {
        hammers.removeHammers();
    }
    // adds a batman to the left side of the world at a random position
    //0.5% of the time
    public void addBatman()
    {
        if (Greenfoot.getRandomNumber(1000)< 5)
        {
            addObject( new Batman(), 1200, Greenfoot.getRandomNumber (650));
        }
    }
     // adds a joker to the left side of the world at a random position
    //0.5% of the time
     public void addJoker()
    {
        if (Greenfoot.getRandomNumber(1000)< 5)
        {
            addObject( new Joker(), 1200, Greenfoot.getRandomNumber (650));
        }
    }
   
}
    

