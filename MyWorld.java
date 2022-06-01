import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MyWorld extends World
{

    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    public MyWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(800, 500, 1); 
        prepare();
    }
    
    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {

        Uresti uresti = new Uresti();
        addObject(uresti,268,257);
        Niña niña = new Niña();
        addObject(niña,654,345);
        niña.setLocation(588,356);
        Niño niño = new Niño();
        addObject(niño,767,325);
        niña.setLocation(679,330);
        niña.setLocation(692,301);
        PlayButton playButton = new PlayButton();
        addObject(playButton,729,43);
        HelpButton helpButton = new HelpButton();
        addObject(helpButton,730,99);
        niña.setLocation(615,297);
        niño.setLocation(751,333);
        niña.setLocation(599,317);
        niño.setLocation(723,348);
        niña.setLocation(588,301);
        removeObject(niña);
        removeObject(niño);

        Niña niña2 = new Niña();
        addObject(niña2,612,302);
        niña2.setLocation(594,370);
        Niño niño2 = new Niño();
        addObject(niño2,726,308);
        ExitButton exitButton = new ExitButton();
        addObject(exitButton,722,165);
        exitButton.setLocation(738,154);
    }
}
