import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Historia1 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Historia1 extends World
{

    /**
     * Constructor for objects of class Historia1.
     * 
     */
    public Historia1()
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
        NextButton nextButton = new NextButton();
        addObject(nextButton,680,120);
        nextButton.setLocation(731,572);
        nextButton.setLocation(740,567);
        previousBotton previousBotton = new previousBotton();
        addObject(previousBotton,69,580);
        removeObject(previousBotton);
        nextButton.setLocation(746,28);
        previousBotton previousBotton2 = new previousBotton();
        addObject(previousBotton2,68,35);
        previousBotton2.setLocation(89,577);
        previousBotton2.setLocation(49,24);
        nextButton.setLocation(734,21);
        previousBotton2.setLocation(103,24);
        previousBotton2.setLocation(109,32);
        previousBotton2.setLocation(102,41);
    }
}
