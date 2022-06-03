import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class SalonClases here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class SalonClases extends World
{   
    public static Counter vidaPersonaje = new Counter();
    public static Counter vidaEnemigo = new Counter();
    public static Counter score = new Counter(); 
    

    public SalonClases()
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

        Enemigo1 enemigo1 = new Enemigo1();
        addObject(enemigo1,393,101);
        enemigo1.setLocation(391,132);
        NiñaFight niñaFight = new NiñaFight();
        addObject(niñaFight,283,345);
        niñaFight.setLocation(76,390);
        addObject(vidaPersonaje, 700,20);
        vidaPersonaje.setValue(3);
        addObject(vidaEnemigo,100,20);
        vidaEnemigo.setValue(5);
        addObject(score,700,480);
        score.setValue(Maze.score.getValue());
    }
}
