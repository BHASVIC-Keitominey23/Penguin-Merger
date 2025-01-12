import greenfoot.*;


public class amainmenu extends World
{
    

    public amainmenu()
    {    
        super(600, 400, 1); 
        addObject(new title(),300,120);
        addObject( new startgamebutton(),300,260);
        addObject( new rankingsbutton(),300,340);
        music.playchill();
        
        
    }
}
