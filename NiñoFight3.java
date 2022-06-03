import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class niña here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class NiñoFight3 extends Actor
{
    int speed = 10;
    SimpleTimer shoot= new SimpleTimer();
    int SHOT_INTERVAL = 300;
    
    public NiñoFight3()
    {
        GreenfootImage myImage = getImage();
        int myNewHeight = (int)myImage.getHeight()/4;
        int myNewWidth = (int)myImage.getWidth()/4;
        myImage.scale(myNewWidth,myNewHeight);
    }
    /**
     * Act - do whatever the niña wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        slideAround();
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
        if(Greenfoot.isKeyDown("space")&& shoot.millisElapsed()>SHOT_INTERVAL)
        {
            getWorld().addObject(new Apuntes(),x,y);
            shoot.mark();
            
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
