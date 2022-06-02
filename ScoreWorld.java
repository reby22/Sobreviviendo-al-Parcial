import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class ScoreWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class ScoreWorld extends World
{
    public static Counter score = new Counter();
    public static Counter score1 = new Counter();
    public static Counter score2 = new Counter();

    /**
     * Constructor for objects of class ScoreWorld.
     * 
     */
    public ScoreWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(800, 500, 1); 
        
        addObject(score, 400,200);
        addObject(score1, 400,280);
        addObject(score2, 400,360);
        score.setValue(SalonClases3.score.getValue());
        this.showText("!  S   C   O   R   E  !", 400, 100);

        this.showText("1.", 330, 200);
        this.showText("2.", 330, 280);
        this.showText("3.", 330, 360);

        prepare();
    }
    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        previousBotton previousBotton = new previousBotton();
        addObject(previousBotton,85,472);
        
    }
}
