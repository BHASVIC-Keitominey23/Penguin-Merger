import greenfoot.*;


public class rankingsbutton extends buttons
{
    private int score;
   
    public void act()
    {
        if(Greenfoot.mouseClicked(this)){
        sounds.cleek();
           Greenfoot.setWorld(new rankingsmenu());
       }
    }
}
