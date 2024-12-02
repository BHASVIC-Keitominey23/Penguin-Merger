import greenfoot.*;


public class startgamebutton extends buttons
{
    /**
     * Act - do whatever the startgamebutton wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
       if(Greenfoot.mouseClicked(this)){
           Greenfoot.setWorld(new gamemenu());
       }
    }
}
