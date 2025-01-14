import greenfoot.*;

public class pausebutton extends buttons
{
    public boolean paused = false;
    private remenubutton remenubutton;
    private resumebutton resumebutton;
    private startgamebutton startgamebutton;
    
    public void act()
    {   
        World world = getWorld();
        
        if((Greenfoot.mouseClicked(this)) && paused==false)
        {
            sounds.cleek();
            remenubutton = new remenubutton();
            resumebutton = new resumebutton();
            startgamebutton = new startgamebutton();            
        
            world.addObject(remenubutton, 450, 310);
            world.addObject(resumebutton, 300, 235);
            world.addObject(startgamebutton, 150, 310);
            
           
            paused=true;
        }

        else if((Greenfoot.mouseClicked(resumebutton)||(Greenfoot.mouseClicked(this))) && paused==true) 
        {
            sounds.cleek();
            world.removeObject(remenubutton);
            world.removeObject(resumebutton);
            world.removeObject(startgamebutton);
            
            paused=false;
    
        }
    }
  
}
