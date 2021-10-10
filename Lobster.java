import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Lobster here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Lobster extends Actor
{
    /**
     * Act - do whatever the Lobster wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        // Add your action code here.
       move(5);
       if (Greenfoot.getRandomNumber(100) < 10);
       {
           turn(Greenfoot.getRandomNumber(90)-45);
       }
       if (getX() <= 4 || getX() > getWorld().getWidth() -5)
       {
          turn(180); 
       }
       if (getY() <= 4 || getY() > getWorld().getWidth() -5)
       {
          turn(180); 
       }
       
       Actor crab;
       crab = getOneObjectAtOffset(0, 0, Crab.class);
        if (crab !=null)
        {
            World world;
            world = getWorld();
            world.removeObject(crab);
            Greenfoot.stop();
            Greenfoot.playSound("eatingCrab.wav");
            Crab.score = 0;
            
        
        }
    }
    
    
}
