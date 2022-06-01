import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Justificante here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Justificante extends Actor
{
    int MOVE= 8;
    /**
     * Act - do whatever the Justificante wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        setLocation(getX(), getY()-MOVE);
        Enemigo1 e = (Enemigo1) getOneIntersectingObject(Enemigo1.class);
        
        if(e!=null)
        {
            SalonClases.vidaEnemigo.add(-1);
            getWorld().removeObject(this);
            if(SalonClases.vidaEnemigo.getValue()==0){
                Greenfoot.setWorld(new Maze1());
            }
        }
        else if(getY() <5)
        {
            getWorld().removeObject(this);
        }
    }
}
