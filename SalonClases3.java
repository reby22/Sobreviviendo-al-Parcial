import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class SalonClases3 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class SalonClases3 extends World
{
    
public static Counter vidaPersonaje = new Counter();
    public static Counter vidaEnemigo = new Counter();
    public static Counter score = new Counter();
   public SalonClases3()
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
        vidaEnemigo.setValue(15);
        NiñaFight3 niñaFight3 = new NiñaFight3();
        addObject(niñaFight3,121,374);
        niñaFight3.setLocation(85,377);
        addObject(score,700,480);
        score.setValue(Maze2.score.getValue());
        Enemigo3 enemigo3 = new Enemigo3();
        addObject(enemigo3,434,165);
        enemigo3.setLocation(410,143);
        enemigo3.act();
    }
}
