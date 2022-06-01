import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Examen here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Examen extends Actor
{
    int MOVE= 3;
    public Examen(){
        
    }
    /**
     * Act - do whatever the Examen wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        setLocation(getX(), getY()+MOVE);
        NiñaFight n = (NiñaFight) getOneIntersectingObject(NiñaFight.class);
        
        if(n!=null)
        {
            SalonClases.vidaPersonaje.add(-1);
            if(SalonClases.vidaPersonaje.getValue()==0){
                 Greenfoot.setWorld(new GameOver());
            }
            getWorld().removeObject(this);
        }
        else if(getY() > 490)
        {
            getWorld().removeObject(this);
        }
    }
}
