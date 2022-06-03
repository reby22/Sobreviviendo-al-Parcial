import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class CopyOfNextButton here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class CopyOfNextButton extends Button
{
    /**
     * Act - do whatever the CopyOfNextButton wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public  void clicked(){
        Greenfoot.setWorld(new Jugador());
    }
}
