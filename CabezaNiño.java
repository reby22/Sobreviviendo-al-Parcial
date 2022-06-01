import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class CabezaNiño here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class CabezaNiño extends Actor
{
    public CabezaNiño(){
        
    }
    /**
     * Act - do whatever the CabezaNiño wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        slideAround();
        // Add your action code here.
    }
    
    public void slideAround()
        {
            int x= getX();
            int y= getY();
        if(Greenfoot.isKeyDown("right"))
        {
            setLocation(x+1, y);
            if(hitWalls())
            {
                setLocation(x-1, y);
            }
        }
        if(Greenfoot.isKeyDown("left"))
        {
            setLocation(x-1, y);
            if(hitWalls())
            {
                setLocation(x+1, y);
            }
        }
        if(Greenfoot.isKeyDown("up"))
        {
           setLocation(x, y-1);
           if(hitWalls())
            {
                setLocation(x, y+1);
            }
        }
        if(Greenfoot.isKeyDown("down"))
        {
            setLocation(x, y+1);
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
}
