import greenfoot.*;


public class remenubutton extends buttons
{
    
    public void act()
    {
        if(Greenfoot.mouseClicked(this)){
            sounds.cleek();
            Greenfoot.setWorld(new amainmenu()) ;
       }
    }
}
