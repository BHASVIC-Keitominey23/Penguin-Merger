import greenfoot.*;


public class rankingsbutton extends buttons
{
    private int score;
    public rankingsbutton(){
    
    }
    public void act()
    {
        if(Greenfoot.mouseClicked(this)){
           Greenfoot.setWorld(new rankingsmenu());
       }
    }
}
