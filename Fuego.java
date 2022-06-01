import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Fuego here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Fuego extends Actor
{
    int MOVE=3;
    /**
     * Act - do whatever the Fuego wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        setLocation(getX(), getY()+MOVE);
        NiñaFight2 n = (NiñaFight2) getOneIntersectingObject(NiñaFight2.class);
        
        if(n!=null)
        {
            SalonClases2.vidaPersonaje.add(-1);
            if(SalonClases2.vidaPersonaje.getValue()==0){
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
