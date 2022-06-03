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
        GreenfootImage myImage = getImage();
        int myNewHeight = (int)myImage.getHeight()*2;
        int myNewWidth = (int)myImage.getWidth()*2;
        myImage.scale(myNewWidth,myNewHeight);
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
                
                GameRecord gameRecord = new GameRecord(Greenfoot.ask("Nombre del Jugador: "), SalonClases.score.getValue() );
                RecordsManager recordsManager = new RecordsManager("records.txt", 10);
                recordsManager.save(gameRecord);
                 Greenfoot.setWorld(new ScoreWorld());
            }
            getWorld().removeObject(this);
        }
        else if(getY() > 490)
        {
            getWorld().removeObject(this);
        }
    }
}
