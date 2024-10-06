import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class dropper here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class dropper extends Actor
{
    private int currentpenguin;
    private int delay = 0;
    public void act()
    {
        if(Greenfoot.isKeyDown("right")&&(getX()<480))
        {
            move(5);
        }
        if(Greenfoot.isKeyDown("left")&&(getX()>120))
        {
            move(-5);
        }
        if(delay>0)
        {
            delay--;
        }
        else
        {
          if(Greenfoot.isKeyDown("space")){
            World myWorld = getWorld();
            int randomnum=((int)(Math.random()*4))+1;
            if(randomnum==1){
              myWorld.addObject(new penguinlv1(),getX(),getY());  
            }
            else if(randomnum==2){
                myWorld.addObject(new penguinlv2(),getX(),getY());      
            }
            else if(randomnum==3){
                myWorld.addObject(new penguinlv3(),getX(),getY());      
            }
            else if(randomnum==4){
                myWorld.addObject(new penguinlv4(),getX(),getY());      
            }
            delay = 15;
        }  // Add your action code here.
        }
    }
}
