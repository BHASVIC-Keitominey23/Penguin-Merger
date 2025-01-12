import greenfoot.*;


public class remenubutton extends buttons
{
    
    public void act()
    {
        if(Greenfoot.mouseClicked(this)){
           Greenfoot.setWorld(new amainmenu()) ;
       }
    }
}
