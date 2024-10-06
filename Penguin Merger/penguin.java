import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)




public class penguin extends Actor
{
    private int mergepoints;
    private int xspeed=0;
    private int yspeed= 2;
    private double gravity=1.5;
    private int penglv;
    private boolean falling=true;
    public penguin(int spenglv, int smergepoints)
    {
        mergepoints=smergepoints;
        penglv=spenglv;
        
        
    }
    
    public void act()
    {
        
        setLocation(getX() + (int)xspeed, getY() + (int)yspeed);
        checkcollision();
        if(falling){
            yspeed += gravity;
        }
        if(falling==false){
            yspeed = 0;
        }
    }
    public void checkcollision(){
        if(getY()>340){
            falling = false;
        }
    
    }
}
