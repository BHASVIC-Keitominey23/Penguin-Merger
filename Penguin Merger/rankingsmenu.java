import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class rankingsmenu here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class rankingsmenu extends World
{

    /**
     * Constructor for objects of class rankingsmenu.
     * 
     */
    public rankingsmenu()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1);
        addObject( new remenubutton(),540,380);
        
    }
}
