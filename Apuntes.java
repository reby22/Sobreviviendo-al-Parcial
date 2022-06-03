import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Apuntes here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Apuntes extends Actor
{
    int MOVE= 8;
    /**
     * Act - do whatever the Apuntes wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        setLocation(getX(), getY()-MOVE);
        Enemigo3 e = (Enemigo3) getOneIntersectingObject(Enemigo3.class);
        
        if(e!=null)
        {
            SalonClases3.vidaEnemigo.add(-1);
            getWorld().removeObject(this);
            SalonClases3.score.add(10);
            if(SalonClases3.vidaEnemigo.getValue()==0){
                GameRecord gameRecord = new GameRecord(Greenfoot.ask("Nombre del Jugador: "), SalonClases3.score.getValue() );
                RecordsManager recordsManager = new RecordsManager("records.txt", 10);
                recordsManager.save(gameRecord);
                Greenfoot.setWorld(new ScoreWorld());
            }
        }
        else if(getY() <5)
        {
            getWorld().removeObject(this);
        }
    }
}
