import greenfoot.*;  // (Actor, World, Greenfoot, GreenfootImage)

public class CrabWorld extends World
{
    /**
     * Create the crab world (the beach). Our world has a size 
     * of 560x560 cells, where every cell is just 1 pixel.
     */
    Label scoreBoard = new Label("Worms eaten: 0");
   
    public static int score = 0;
    
    public CrabWorld() 
    {
        super(560, 560, 1);
        prepare();
    }

    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        Lobster lobster = new Lobster();
        addObject(lobster,Greenfoot.getRandomNumber(560),Greenfoot.getRandomNumber(560));
        Crab crab = new Crab();
        addObject(crab,Greenfoot.getRandomNumber(560),Greenfoot.getRandomNumber(560));
        addObject(scoreBoard, 200, 50);
        
        Worm worm = new Worm();
        addObject(worm, Greenfoot.getRandomNumber(560),Greenfoot.getRandomNumber(560));
        Worm worm1 = new Worm();
        addObject(worm1, Greenfoot.getRandomNumber(560),Greenfoot.getRandomNumber(560));
        Worm worm2 = new Worm();
        addObject(worm2, Greenfoot.getRandomNumber(560),Greenfoot.getRandomNumber(560));
        Worm worm3 = new Worm();
        addObject(worm3, Greenfoot.getRandomNumber(560),Greenfoot.getRandomNumber(560));
        Worm worm4 = new Worm();
        addObject(worm4, Greenfoot.getRandomNumber(560),Greenfoot.getRandomNumber(560));
        Worm worm5 = new Worm();
        addObject(worm5, Greenfoot.getRandomNumber(560),Greenfoot.getRandomNumber(560));
        Worm worm6 = new Worm();
        addObject(worm6, Greenfoot.getRandomNumber(560),Greenfoot.getRandomNumber(560));
        Worm worm7 = new Worm();
        addObject(worm7, Greenfoot.getRandomNumber(560),Greenfoot.getRandomNumber(560));
        Worm worm8 = new Worm();
        addObject(worm8, Greenfoot.getRandomNumber(560),Greenfoot.getRandomNumber(560));
        Worm worm9 = new Worm();
        addObject(worm9, Greenfoot.getRandomNumber(560),Greenfoot.getRandomNumber(560));
        Worm worm10 = new Worm();
        addObject(worm10, Greenfoot.getRandomNumber(560),Greenfoot.getRandomNumber(560));
        Worm worm11 = new Worm();
        addObject(worm11, Greenfoot.getRandomNumber(560),Greenfoot.getRandomNumber(560));
        Worm worm12 = new Worm();
        addObject(worm12, Greenfoot.getRandomNumber(560),Greenfoot.getRandomNumber(560));
        Worm worm13 = new Worm();
        addObject(worm13, Greenfoot.getRandomNumber(560),Greenfoot.getRandomNumber(560));
        Worm worm14 = new Worm();
        addObject(worm14, Greenfoot.getRandomNumber(560),Greenfoot.getRandomNumber(560));
        Worm worm15 = new Worm();
        addObject(worm15, Greenfoot.getRandomNumber(560),Greenfoot.getRandomNumber(560));
        Worm worm16 = new Worm();
        addObject(worm16, Greenfoot.getRandomNumber(560),Greenfoot.getRandomNumber(560));
        Worm worm17 = new Worm();
        addObject(worm17, Greenfoot.getRandomNumber(560),Greenfoot.getRandomNumber(560));
        Worm worm18 = new Worm();
        addObject(worm17, Greenfoot.getRandomNumber(560),Greenfoot.getRandomNumber(560));
        Worm worm19 = new Worm();
        addObject(worm19, Greenfoot.getRandomNumber(560),Greenfoot.getRandomNumber(560));
        Worm worm20 = new Worm();
        addObject(worm20, Greenfoot.getRandomNumber(560),Greenfoot.getRandomNumber(560));
        Worm worm21 = new Worm();
        addObject(worm21, Greenfoot.getRandomNumber(560),Greenfoot.getRandomNumber(560));
        Worm worm22 = new Worm();
        addObject(worm22, Greenfoot.getRandomNumber(560),Greenfoot.getRandomNumber(560));
        Worm worm23 = new Worm();
        addObject(worm23, Greenfoot.getRandomNumber(560),Greenfoot.getRandomNumber(560));
        Worm worm24 = new Worm();
        addObject(worm24, Greenfoot.getRandomNumber(560),Greenfoot.getRandomNumber(560));
        Worm worm25 = new Worm();
        addObject(worm25, Greenfoot.getRandomNumber(560),Greenfoot.getRandomNumber(560));
        Worm worm26 = new Worm();
        addObject(worm26, Greenfoot.getRandomNumber(560),Greenfoot.getRandomNumber(560));
        Worm worm27 = new Worm();
        addObject(worm27, Greenfoot.getRandomNumber(560),Greenfoot.getRandomNumber(560));
        Worm worm28 = new Worm();
        addObject(worm28, Greenfoot.getRandomNumber(560),Greenfoot.getRandomNumber(560));
        Worm worm29 = new Worm();
        addObject(worm29, Greenfoot.getRandomNumber(560),Greenfoot.getRandomNumber(560));
        Worm worm30 = new Worm();
        addObject(worm30, Greenfoot.getRandomNumber(560),Greenfoot.getRandomNumber(560));
        Worm worm31 = new Worm();
        addObject(worm31, Greenfoot.getRandomNumber(560),Greenfoot.getRandomNumber(560));
        Worm worm32 = new Worm();
        addObject(worm32, Greenfoot.getRandomNumber(560),Greenfoot.getRandomNumber(560));
        Worm worm33 = new Worm();
        addObject(worm33, Greenfoot.getRandomNumber(560),Greenfoot.getRandomNumber(560));
        Worm worm34 = new Worm();
        addObject(worm34, Greenfoot.getRandomNumber(560),Greenfoot.getRandomNumber(560));
        Worm worm35 = new Worm();
        addObject(worm35, Greenfoot.getRandomNumber(560),Greenfoot.getRandomNumber(560));
        Worm worm36 = new Worm();
        addObject(worm36, Greenfoot.getRandomNumber(560),Greenfoot.getRandomNumber(560));
        Worm worm37 = new Worm();
        addObject(worm37, Greenfoot.getRandomNumber(560),Greenfoot.getRandomNumber(560));
        Worm worm38 = new Worm();
        addObject(worm38, Greenfoot.getRandomNumber(560),Greenfoot.getRandomNumber(560));
        Worm worm39 = new Worm();
        addObject(worm39, Greenfoot.getRandomNumber(560),Greenfoot.getRandomNumber(560));
        Worm worm40 = new Worm();
        addObject(worm40, Greenfoot.getRandomNumber(560),Greenfoot.getRandomNumber(560));
        Worm worm41 = new Worm();
        addObject(worm41, Greenfoot.getRandomNumber(560),Greenfoot.getRandomNumber(560));
        Worm worm42 = new Worm();
        addObject(worm42, Greenfoot.getRandomNumber(560),Greenfoot.getRandomNumber(560));
        Worm worm43 = new Worm();
        addObject(worm43, Greenfoot.getRandomNumber(560),Greenfoot.getRandomNumber(560));
        Worm worm44 = new Worm();
        addObject(worm44, Greenfoot.getRandomNumber(560),Greenfoot.getRandomNumber(560));
        Worm worm45 = new Worm();
        addObject(worm45, Greenfoot.getRandomNumber(560),Greenfoot.getRandomNumber(560));
        Worm worm46 = new Worm();
        addObject(worm46, Greenfoot.getRandomNumber(560),Greenfoot.getRandomNumber(560));
        Worm worm47 = new Worm();
        addObject(worm47, Greenfoot.getRandomNumber(560),Greenfoot.getRandomNumber(560));
        Worm worm48 = new Worm();
        addObject(worm48, Greenfoot.getRandomNumber(560),Greenfoot.getRandomNumber(560));
        Worm worm49 = new Worm();
        addObject(worm49, Greenfoot.getRandomNumber(560),Greenfoot.getRandomNumber(560));
        Worm worm50 = new Worm();
        addObject(worm50, Greenfoot.getRandomNumber(560),Greenfoot.getRandomNumber(560));
        
    }
    public void act()
    {
       scoreBoard.setText("Worms eaten: " + Crab.score); 
    }
}