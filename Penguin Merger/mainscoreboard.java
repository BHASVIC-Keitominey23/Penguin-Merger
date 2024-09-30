import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class mainscoreboard here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class mainscoreboard extends Actor
{
    protected GreenfootImage background = null;
    public mainscoreboard()
    {
        background = new GreenfootImage (100,180);
        background.setColor(Color.WHITE);
        background.fillRect(0,0,150,60);
        setImage(background);
    }
    public void setscore(int score)
    {
        GreenfootImage img = new GreenfootImage (background);
        img.setColor(Color.BLACK);
        img.drawString("Score: \n   " + score, 30, 20);
        setImage(img);
    }
    public void act()
    {
        // Add your action code here.
    }
}
