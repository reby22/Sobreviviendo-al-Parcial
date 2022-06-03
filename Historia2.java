import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Historia2 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Historia2 extends World
{

    /**
     * Constructor for objects of class Historia2.
     * 
     */
    public Historia2()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(800, 600, 1); 
        prepare();
    }
    
    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        CopyOfNextButton copyOfNextButton = new CopyOfNextButton();
        addObject(copyOfNextButton,742,106);
        copyOfNextButton.setLocation(751,27);
        copyOfNextButton.setLocation(722,119);
        copyOfNextButton.setLocation(735,110);
        copyOfNextButton.setLocation(761,23);
        copyOfNextButton.setLocation(725,18);
        CopyOfpreviousBotton copyOfpreviousBotton = new CopyOfpreviousBotton();
        addObject(copyOfpreviousBotton,65,30);
    }
}
