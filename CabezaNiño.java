import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class CabezaNiño here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class CabezaNiño extends Actor
{
    int speed=1; 
    public CabezaNiño(){
        
    }
    /**
     * Act - do whatever the CabezaNiño wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        slideAround();
        collectCoca();
        maxSpeed();
        
    }
    
    public void maxSpeed()
    {
        if(speed>=5){
            speed = 5; 
        }
    }
    
    public void slideAround()
        {
            int x= getX();
            int y= getY();
        if(Greenfoot.isKeyDown("right"))
        {
            setLocation(x+speed, y);
            if(hitWalls())
            {
                setLocation(x-1, y);
            }
        }
        if(Greenfoot.isKeyDown("left"))
        {
            setLocation(x-speed, y);
            if(hitWalls())
            {
                setLocation(x+1, y);
            }
        }
        if(Greenfoot.isKeyDown("up"))
        {
           setLocation(x, y-speed);
           if(hitWalls())
            {
                setLocation(x, y+1);
            }
        }
        if(Greenfoot.isKeyDown("down"))
        {
            setLocation(x, y+speed);
            if(hitWalls())
            {
                setLocation(x, y-1);
            }
        }
        
        
            
    }
    
    public boolean hitWalls()
    {
        if(isTouching(Wall.class))
        {
            return true;
        }
        else 
        {
            return false;
        }
    }
    
    public void collectCoca()
    {
        if(isTouching(SpeedBoostCola.class)){
            speed++;
        removeTouching(SpeedBoostCola.class);
        }
    }
        int contador=0;
    public void traslador()
    {
        if(contador==9){
            if(isTouching(POO.class)){
            Greenfoot.setWorld(new SalonClases());
            contador=0;
            }
        }
    }
    public void traslador2()
    {
        if(contador>=6){
            if(isTouching(Algoritmos.class)){
            Greenfoot.setWorld(new SalonClases());
            contador=0;
            }
        }
    }
    public void traslador3()
    {
        if(contador>=3){
            if(isTouching(POO.class)){
            Greenfoot.setWorld(new SalonClases());
            contador=0;
            }
        }
    }
    
    
}
