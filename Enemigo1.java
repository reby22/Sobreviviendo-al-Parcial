import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Enemigo1 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Enemigo1 extends Actor
{
    int x=3;
    SimpleTimer shoot= new SimpleTimer();
    int SHOT_INTERVAL = 300;
    int MIN_SHOT = 1000; 
    int SHOT_MAX_INT= 5000;
    int randShot = MIN_SHOT +Greenfoot.getRandomNumber(SHOT_MAX_INT);
    /**
     * Act - do whatever the Enemigo1 wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        GreenfootImage myImage = getImage();
        int myNewHeight = (int)myImage.getHeight();
        int myNewWidth = (int)myImage.getWidth();
        myImage.scale(myNewWidth,myNewHeight);
        
        setLocation(getX()-x, getY());
        if((getX()>790)||(getX()<10))
        {
            x= x * -1;
        }
        if(shoot.millisElapsed()>MIN_SHOT + randShot)
        {
            getWorld().addObject(new Examen(),getX(), getY());
            shoot.mark();
            randShot = Greenfoot.getRandomNumber(SHOT_MAX_INT);
        }
    }
}
