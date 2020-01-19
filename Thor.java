import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Thor here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Thor extends Actor
{
    private int vSpeed = 0;
    private int jumpStrength = 5;
    private int acceleration = 1;
    private boolean throwing = false;
   
    int counter = 15;
    // private int counter = 5;
    /**
     * Act - do whatever the Thor wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    // calls all the methods into action
    public void act() 
    {
        checkFall();
        onPlank();
        movement();
        checkForJoker();
        checkForBatman();
        checkForDwarf();
        throwing();
        checkForAsteroid();
        onGround();

        // Add your action code here.
    }   
    // sets Thors size to 150 by 170
    public Thor()
    {
        getImage().scale(150,170);
    }
    // checks whether or not "Throwing" is true.
    // if it is Thor's image changes 
    public void throwing()
    {
        if (throwing == true)
        {
            setImage("thor throwing.gif");
        }
        else if(throwing == false)
        {
            setImage("thor.gif");
        }
    }
    // checks whether or not "Jumping" is true
    // if it is Thor's image changes 

    // Enables Thor to move left and right
    // Enables Thor to jump when up key is down
    // Enables Thor to shoot hammers when space key is down
    // checks to see if thor should be throwing 
    // if so thors image is changed to to thor throwing.gif
    public void movement()
    {
        if (Greenfoot.isKeyDown("right"))
        {
            setLocation(getX() + 3, getY());
        }
        if (Greenfoot.isKeyDown("left"))
        {
            setLocation(getX() - 3, getY());
        }
        if (Greenfoot.isKeyDown("Up"))
        {

            jump();
        }

        if (Greenfoot.isKeyDown("space"))
        {

            //int r = getRotation();  
            throwing = true;

            if (counter== 15)
            {               
                ((MyWorld) getWorld()).subHammers();
                Greenfoot.playSound("EnergyGun.wav");
                getWorld().addObject (new Hammer(), getX(), getY());

                counter = 0;
            }

            
            counter++;
        }
        else 
        {
            throwing = false;
            counter = 15;
        }
        
    }
    //subtracts 5 from thors vSpeed 
    // if thors too high up in the world he is set back to his original position
    public void jump()
    {
        vSpeed = - jumpStrength;
        fall();
        if (isAtEdge())
        {
            setLocation(100,590);
        }
    }
    //returns thor to the ground
    public void fall()
    {
        setLocation (getX(), getY() + vSpeed);
        vSpeed = vSpeed + acceleration;
    }
    // checks to see if theres a plank under thor 
   
    public boolean onPlank()
    {
        Actor under = getOneObjectAtOffset(0, getImage().getHeight()/ 2, Plank.class);

        return under != null;
    }
    // checks to see if theres ground under thor
    public boolean onGround()
    {
        Actor under = getOneObjectAtOffset(0,getImage().getHeight()/2, Ground.class );
        return under != null; 
    }
   //if thor is on the ground or plank he doesnt move 
   // if he isnt he falls
    public void checkFall()
    {
        if (onPlank())
        {
            vSpeed = 0;
        }
        else 
        {
            fall();
        }

        if (onGround())
        {
            vSpeed = 0;
        }
        else 
        {
            fall();
        }
    }
   // if thor comes int contact with batman an explosion occurs
   // an explosion sound is played 
   // the batman he was in contact with is removed and thor is returned to his starting position
    public void checkForBatman()
    {
        if (isTouching(Batman.class) == true)
        {
            getWorld().addObject( new Explosion(), getX(),getY());
            Greenfoot.playSound("MetalExplosion.wav");
            removeTouching(Batman.class);
            setLocation(100,590);
        }
    }
    // if thor comes int contact with The Joker an explosion occurs
   // an explosion sound is played 
   // the Joker he was in contact with is removed and thor is returned to his starting position
    public void checkForJoker()
    {
        if (isTouching(Joker.class) == true)
        {
            getWorld().addObject( new Explosion(), getX(),getY());
            Greenfoot.playSound("MetalExplosion.wav");
            removeTouching(Joker.class);
            setLocation(100,590);
        }
    }
    // if thor comes in contact with a white dwarf his bullets are replenished for as long as theyre in
    //contact
    public void checkForDwarf()
    {
        if (isTouching(WhiteDwarf.class) == true)
        {

            ((MyWorld) getWorld()).updateHammers();

            //  ((MyWorld) getWorld()).updateHammers();
        }
    }
   //if thor comes in contact with an asteroid the asteroid is removed and a life is deducted
    public void checkForAsteroid()
    {
        if (isTouching(Asteroid.class) ==  true)
        {
            ((MyWorld)getWorld()).subLives(); 
            removeTouching(Asteroid.class);
        }
    }

}

