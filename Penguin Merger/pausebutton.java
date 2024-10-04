import greenfoot.*;

public class pausebutton extends buttons
{
    public static boolean paused = false;
    
    private pauseboard pauseboard;
    private remenubutton remenubutton;
    private resumebutton resumebutton;
    private startgamebutton startgamebutton;
    
    public void act()
    {   
        World world = getWorld();
        
        if((Greenfoot.mouseClicked(this)) && paused==false) {
            pauseboard = new pauseboard();
            remenubutton = new remenubutton();
            resumebutton = new resumebutton();
            startgamebutton = new startgamebutton();            
        
            world.addObject(pauseboard, 300, 200);
            world.addObject(remenubutton, 400, 250);
            world.addObject(resumebutton, 200, 250);
            world.addObject(startgamebutton, 300, 225);
            
           
            paused = true;
        }

        else if((Greenfoot.mouseClicked(resumebutton)||(Greenfoot.mouseClicked(this))) && paused==true) {
            world.removeObject(pauseboard);
            world.removeObject(remenubutton);
            world.removeObject(resumebutton);
            world.removeObject(startgamebutton);
            
            paused = false;
        }
    }
}
