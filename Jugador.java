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
    }
    
    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {

        Niña2 niña2 = new Niña2();
        addObject(niña2,212,302);
        Niño2 niño2 = new Niño2();
        addObject(niño2,535,313);
        niño2.setLocation(528,274);
        niña2.setLocation(217,332);
        niño2.setLocation(568,327);
        AlumnaButton alumnaButton = new AlumnaButton();
        addObject(alumnaButton,203,159);
        AlumnoButton alumnoButton = new AlumnoButton();
        addObject(alumnoButton,577,159);
        niña2.setLocation(203,241);
        niño2.setLocation(578,253);
        alumnaButton.setLocation(339,272);
        niña2.setLocation(211,199);
        alumnaButton.setLocation(217,415);
        alumnoButton.setLocation(719,318);
        niño2.setLocation(586,231);
        alumnoButton.setLocation(573,402);
        niña2.setLocation(210,181);
        niño2.setLocation(551,187);
        alumnoButton.setLocation(567,392);
        alumnoButton.setLocation(565,404);
        alumnaButton.setLocation(208,413);
        alumnaButton.setLocation(242,388);
        alumnaButton.setLocation(243,388);
        alumnoButton.setLocation(579,383);
        previousBotton previousBotton = new previousBotton();
        addObject(previousBotton,80,468);
    }
}
