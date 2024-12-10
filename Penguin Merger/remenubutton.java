import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class remenubutton here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class remenubutton extends buttons
{
    
    public void act()
    {
        if(Greenfoot.mouseClicked(this)){
           Greenfoot.setWorld(new amainmenu());
       }
    }
}
