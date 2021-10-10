import greenfoot.*;


/**
 * This class defines a crab. Crabs live on the beach.
 */
public class Crab extends Actor
{
    //public static int score = 0;
    public static int score;
    public Crab()
    {
        score = 0;
    }
    
    public void act()
    {
       
        if(Greenfoot.isKeyDown("up"))
            move(5);

        if (Greenfoot.isKeyDown("left"))
            turn(-10);
        if (Greenfoot.isKeyDown("right"))
            turn(10);
        if(Greenfoot.isKeyDown("down"))
            move(-5);
        Actor worm;
        Actor lobster;
        Actor crab;
        worm = getOneObjectAtOffset(0, 0, Worm.class);
        lobster = getOneObjectAtOffset(0, 0, Lobster.class);
        
        if (worm !=null)
        {
            World world;
            world = getWorld();
            world.removeObject(worm);
            score = score +1;
            Greenfoot.playSound("eatingWorm.wav");
        
        }
        if (getWorld().getObjects(Worm.class).isEmpty())
        {  
            Greenfoot.stop();
            score = 0;
        }
        
        //if(score >= 50)
        //{
            //Greenfoot.stop();
            
            //Crab.score = 0;
        //}
    }

}


