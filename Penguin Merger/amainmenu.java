import greenfoot.*;


public class amainmenu extends World
{
    public amainmenu()
    {    
        super(600, 400, 1); 
        addObject( new startgamebutton(),300,200);
        addObject( new rankingsbutton(),300,300);
    }
}
