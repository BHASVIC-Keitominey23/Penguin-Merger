import greenfoot.*;

public class pausebutton extends buttons
{
    public boolean paused = false;
    
    private pauseboard pauseboard;
    private remenubutton remenubutton;
    private resumebutton resumebutton;
    private startgamebutton startgamebutton;
    private gamemenu gamemenu;
    
    public void act()
    {   
        World world = getWorld();
        
        if((Greenfoot.mouseClicked(this)) && paused==false) {
            sounds.cleek();
            pauseboard = new pauseboard();
            remenubutton = new remenubutton();
            resumebutton = new resumebutton();
            startgamebutton = new startgamebutton();            
        
            world.addObject(remenubutton, 450, 310);
            world.addObject(resumebutton, 300, 235);
            world.addObject(startgamebutton, 150, 310);
            
           
            paused=true;
        }

        else if((Greenfoot.mouseClicked(resumebutton)||(Greenfoot.mouseClicked(this))) && paused==true) {
            sounds.cleek();
            world.removeObject(pauseboard);
            world.removeObject(remenubutton);
            world.removeObject(resumebutton);
            world.removeObject(startgamebutton);
            
            paused=false;
    
        }
    }
  
}
