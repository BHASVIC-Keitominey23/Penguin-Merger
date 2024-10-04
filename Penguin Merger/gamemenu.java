import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class gamemenu here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class gamemenu extends World
{

    /**
     * Constructor for objects of class gamemenu.
     * 
     */
    public gamemenu()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1); 
        addObject( new pausebutton(),570,30);
        addObject( new dropper(),300,60);
        mainscoreboard mainscore = new mainscoreboard();
        mainscore.setscore(0);
        addObject(mainscore,50,90);
        
        
        
    }
}
