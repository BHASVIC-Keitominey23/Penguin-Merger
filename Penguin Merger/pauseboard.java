import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class pauseboard here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class pauseboard extends Actor
{
    protected GreenfootImage background = null;
    public pauseboard()
    {
        background = new GreenfootImage (100,180);
        background.setColor(Color.WHITE);
        background.fillRect(0,0,150,60);
        setImage(background);
    }
    public void act()
    {
        // Add your action code here.
    }
}
