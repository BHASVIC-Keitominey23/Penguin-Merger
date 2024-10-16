import greenfoot.*;
public class dropper extends Actor
{
    private penguin currentpenguin=null;
    private penguin nextpenguin=null;
    private int delay = 0;
    private int count = 0;
    
    public void act()
    {
        World myWorld = getWorld();
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
            wait3secs();
            currentpenguin = null;

            delay = 15;
            }
        }
    }
    private void wait3secs(){
        long lastAdded = System.currentTimeMillis();
        long time =System.currentTimeMillis();
        while(time < lastAdded + 1500){
            lastAdded=time;
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
