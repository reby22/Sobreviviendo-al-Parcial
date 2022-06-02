import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class BalaBasesDatos here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class BalaBasesDatos extends Actor
{
    int MOVE=3;
    
    /**
     * Act - do whatever the BalaBasesDatos wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        setLocation(getX(), getY()+MOVE);
        NiñaFight3 n = (NiñaFight3) getOneIntersectingObject(NiñaFight3.class);
        
        if(n!=null)
        {
            SalonClases3.vidaPersonaje.add(-1);
            if(SalonClases3.vidaPersonaje.getValue()==0){
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
