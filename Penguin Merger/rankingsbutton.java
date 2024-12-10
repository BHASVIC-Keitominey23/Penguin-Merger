import greenfoot.*;


public class rankingsbutton extends buttons
{
    private int score;
   
    public void act()
    {
        if(Greenfoot.mouseClicked(this)){
           Greenfoot.setWorld(new rankingsmenu());
       }
    }
}
