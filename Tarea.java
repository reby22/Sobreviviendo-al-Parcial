import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Tarea here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Tarea extends Actor
{
    int MOVE= 8;
    /**
     * Act - do whatever the Tarea wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        setLocation(getX(), getY()-MOVE);
        Enemigo2 e = (Enemigo2) getOneIntersectingObject(Enemigo2.class);
        
        if(e!=null)
        {
            SalonClases2.vidaEnemigo.add(-1);
            getWorld().removeObject(this);
            if(SalonClases2.vidaEnemigo.getValue()==0){
                Greenfoot.setWorld(new Maze1());
            }
        }
        else if(getY() <5)
        {
            getWorld().removeObject(this);
        }
    }
}
