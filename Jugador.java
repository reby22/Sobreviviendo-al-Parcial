import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Jugador here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Jugador extends World
{

    /**
     * Constructor for objects of class Jugador.
     * 
     */
    public Jugador()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(800, 500, 1); 

        prepare();
        this.showText("! S E L E C C I O N A   A   T U   J U G A D O R !", 400, 25);
    }
    
    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {

        previousBotton previousBotton = new previousBotton();
        addObject(previousBotton,60,484);
        Niña2 niña2 = new Niña2();
        addObject(niña2,353,268);
        niña2.setLocation(339,286);
        Niño2 niño2 = new Niño2();
        addObject(niño2,656,267);
        niño2.setLocation(642,276);
        AlumnaButton alumnaButton = new AlumnaButton();
        addObject(alumnaButton,357,477);
        AlumnoButton alumnoButton = new AlumnoButton();
        addObject(alumnoButton,658,473);
        removeObject(previousBotton);
        CopyOfCopyOfpreviousBotton copyOfCopyOfpreviousBotton = new CopyOfCopyOfpreviousBotton();
        addObject(copyOfCopyOfpreviousBotton,92,471);
    }
}
