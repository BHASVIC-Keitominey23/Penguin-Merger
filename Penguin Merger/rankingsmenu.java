import greenfoot.*;


public class rankingsmenu extends World
{

    
    public rankingsmenu()
    {    
        super(600, 400, 1);
        addObject( new remenubutton(),540,370);
        GreenfootImage newImage = new GreenfootImage("aice.png"); 
        newImage.scale(600, 400); 
        setBackground(newImage);
        
    }
}
