import greenfoot.*;
public class dropper extends Actor
{
    private penguin currentpenguin=null;
    private penguin nextpenguin=null;
    private int delay = 0;
    private int count = 0;
    private long waittime = 0;
    
    public void act()
    {
        World myWorld = getWorld();
        if (waittime > 0) {
            if (System.currentTimeMillis() - waittime >= 500) {
                waittime = 0; 
            }
            return;
        }

        if(count==0){
          updatenext();
          count++;
        }
        
        if (currentpenguin == null) {
            currentpenguin = nextpenguin;
            myWorld.removeObject(nextpenguin);
            updatenext();
            myWorld.addObject(currentpenguin, getX(), getY() + 10);
        }

        if(Greenfoot.isKeyDown("right")&&(getX()<480))
        {
            move(5);
            currentpenguin.movepenguin(5);
        }
        if(Greenfoot.isKeyDown("left")&&(getX()>120))
        {
            move(-5);
            currentpenguin.movepenguin(-5);
        }
        if(delay>0)
        {
            delay--;
        }
        else
        {
        if(Greenfoot.isKeyDown("space"))
          {
            currentpenguin.drop();
            waittime = System.currentTimeMillis();
            currentpenguin = null;

            delay = 15;
            }
        }
    }
    
    private void updatenext(){
        World myWorld = getWorld();
        
        int randomnum=((int)(Math.random()*4))+1;
        if(randomnum==1){
              nextpenguin=new penguinlv1(false);  
            }
        else if(randomnum==2){
                nextpenguin=new penguinlv2(false);      
            }
        else if(randomnum==3){
                nextpenguin=new penguinlv3(false);      
            }
        else if(randomnum==4){
                nextpenguin=new penguinlv4(false);      
            }
        myWorld.addObject(nextpenguin,530,30);  
        
        
    }
}
