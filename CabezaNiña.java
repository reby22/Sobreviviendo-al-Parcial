import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class CabezaNiña here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class CabezaNiña extends Actor
{
    public CabezaNiña(){
        
    }
    /**
     * Act - do whatever the CabezaNiña wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        slideAround();
    }
    
    public void moveAround(){
        if(Greenfoot.isKeyDown("right"))
        {
            setRotation(0);
            move(4);
        }
        if(Greenfoot.isKeyDown("left"))
        {
            setRotation(180);
            move(4);
        }
        if(Greenfoot.isKeyDown("up"))
        {
            setRotation(270);
            move(4);
        }
        if(Greenfoot.isKeyDown("down"))
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
            setLocation(x+3, y);
            if(hitWalls())
            {
                setLocation(x-1, y);
            }
        }
        if(Greenfoot.isKeyDown("left"))
        {
            setLocation(x-3, y);
            if(hitWalls())
            {
                setLocation(x+1, y);
            }
        }
        if(Greenfoot.isKeyDown("up"))
        {
           setLocation(x, y-3);
           if(hitWalls())
            {
                setLocation(x, y+1);
            }
        }
        if(Greenfoot.isKeyDown("down"))
        {
            setLocation(x, y+3);
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
