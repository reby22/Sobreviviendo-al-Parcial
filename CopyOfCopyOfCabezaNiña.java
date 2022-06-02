import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class CabezaNiña here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class CopyOfCopyOfCabezaNiña extends Actor
{
    int speed=2;
    public CopyOfCopyOfCabezaNiña(){
        
    }
    /**
     * Act - do whatever the CabezaNiña wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        slideAround();
        collectPills();
        //minSpeed();
        traslador();
        traslador2();
        traslador3();
        
    }
    
     /* void minSpeed()
    {
        if(speed>=4){
            speed = 4; 
        }
    }*/
    
    public void moveAround(){
        
        if(Greenfoot.isKeyDown("d"))
        {
            setRotation(0);
            move(4);
        }
        if(Greenfoot.isKeyDown("a"))
        {
            setRotation(180);
            move(4);
        }
        if(Greenfoot.isKeyDown("w"))
        {
            setRotation(270);
            move(4);
        }
        if(Greenfoot.isKeyDown("s"))
        {
            setRotation(90);
            move(4);
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
    
    public void collectPills()
    {
        if(isTouching(Pildora.class)){
        //speed++;
        removeTouching(Pildora.class);
        Maze2.score.add(10);
        contador++;
        }
    }
     int contador=0;
    public void traslador()
    {
        if(contador==3){
            if(isTouching(BasesDatos.class)){
            Greenfoot.setWorld(new SalonClases());
            contador=0;
            }
        }
    }
    public void traslador2()
    {
        if(contador==6){
            if(isTouching(Algoritmos.class)){
            Greenfoot.setWorld(new SalonClases2());
            contador=0;
            }
        }
    }
    public void traslador3()
    {
        if(contador==9){
            if(isTouching(POO.class)){
            Greenfoot.setWorld(new SalonClases3());
            contador=0;
            }
        }
    }
}
