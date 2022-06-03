import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class SalonClases2 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class SalonClases2 extends World
{
    public static Counter vidaPersonaje = new Counter();
    public static Counter vidaEnemigo = new Counter();
    public static Counter score = new Counter();
   public SalonClases2()
    {
        super(800, 500, 1); 

        prepare();
        this.showText("Profesor", 100, 45);
        this.showText("Alumno", 700, 45);
        this.showText("!PELEA POR TU CALIFICACION!", 400, 25);
        this.showText("Score", 700, 450);
    }

    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {

        addObject(vidaPersonaje, 700,20);
        vidaPersonaje.setValue(3);
        addObject(vidaEnemigo,100,20);
        vidaEnemigo.setValue(10);
        NiñaFight2 niñaFight2 = new NiñaFight2();
        addObject(niñaFight2,121,374);
        niñaFight2.setLocation(85,377);
        Enemigo2 enemigo2 = new Enemigo2();
        addObject(enemigo2,414,162);
        addObject(score,700,480);
        score.setValue(Maze1.score.getValue());
    }
}
