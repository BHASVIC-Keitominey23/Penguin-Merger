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
        pauseboard pauseboard=new pauseboard();
        remenubutton remenubutton = new remenubutton();
        resumebutton resumebutton = new resumebutton();
        startgamebutton startgamebutton = new startgamebutton();
        
        if(pausebutton.paused==true){
            addObject(pauseboard,300,200);
            addObject(new remenubutton(),400,250);
            addObject(new resumebutton(),200,250);
            addObject(new startgamebutton(),300,225);
        }
        if(pausebutton.paused==false){
            removeObject(pauseboard,300,200);
            addObject(new remenubutton(),400,250);
            addObject(new resumebutton(),200,250);
            addObject(new startgamebutton(),300,225);
        }
    }
}
