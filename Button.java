import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public abstract class Button extends Actor
{
    public void act()
    {
        GreenfootImage image = getImage();
        
        if(Greenfoot.mouseMoved(this)){
            image.setTransparency(150);
        } else if(Greenfoot.mouseMoved(getWorld())){
            image.setTransparency(255);
        }
        
        
        if(Greenfoot.mouseClicked(this)){
            clicked();
        }
    }
    
    public abstract void clicked();
}
