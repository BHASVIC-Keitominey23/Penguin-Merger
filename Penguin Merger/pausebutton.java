import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class pausebutton here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class pausebutton extends buttons
{
    public static boolean paused = false;
    public void act()
    {   World myWorld = getWorld();
        
        if((Greenfoot.mouseClicked(this))&&(paused==false)){
            paused = true;
        
            
            
        }
        if((Greenfoot.mouseClicked(this))&&(paused==true)){
            paused = false;
            
            
        }
            
    }
    
    
}
