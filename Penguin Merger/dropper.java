import greenfoot.*;
public class dropper extends Actor
{
    private penguin currentpenguin=null; //Stores the current penguin about to be dropped
    private penguin nextpenguin=null;    //Stores the next penguin to be dropped
    private int count = 0; //Defines counter variable for first penguin
    private long waittime = 0; //Defines time waited as 0.
    public void act()
    {
        World myWorld = getWorld(); //Stores current world
        if (waittime > 0) 
            {   //If full time hasn't elapsed yet
            if (System.currentTimeMillis() - waittime >= 500) //If 0.5 seconds have passed
            {
                waittime = 0; 
                setImage("crane1.png");//Changes image to closed crane
                
            }
            
            return;
            }

        if(count==0)
        { //First penguin defined 
          updatenext();
          count++;
        }
        //Sets the next penguin as the current penguin if there is no current penguin
        if (currentpenguin == null){
            currentpenguin = nextpenguin;
            myWorld.removeObject(nextpenguin);
            updatenext();
            myWorld.addObject(currentpenguin, getX(), getY()+50);
        }
        //Move the penguin right if right arrow key pressed and not too far right
        if(Greenfoot.isKeyDown("right")&&(getX()<470))
        {
            move(5);
            //Penguin being held by the dropper follows
            currentpenguin.movepenguin(5);
        }
       //Calls the corresponding background music function from the sound class depending on the key
       if(Greenfoot.isKeyDown("s"))
       {
           sounds.playsweat();
       }
       if(Greenfoot.isKeyDown("c"))
       {
           sounds.playchill();
       }
        
        //Move the dropper and penguin being held if  left key pressed and not too far left    
        if(Greenfoot.isKeyDown("left")&&(getX()>130))
        {
            move(-5);
            currentpenguin.movepenguin(-5);
        }
        
        else
        {
        //Drops the penguin if space bar pressed
        if(Greenfoot.isKeyDown("space"))
          {
            setImage("Crane2.png");
            currentpenguin.drop();
            sounds.drop(); //Play the drop sound
            waittime = System.currentTimeMillis();//Starts the timer
            currentpenguin = null; //Resets the current penguin to null as it has been dropped

           
            }
        }
    }
    //Procedure which sets another current penguin
    private void updatenext()
    {
        World myWorld = getWorld();
        int randomnum=((int)(Math.random()*4))+1; //Generates a random number between 1 to 4
        //Sets the next penguin as a new undropped penguin of the level of the random number
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
        myWorld.addObject(nextpenguin,550,150);  
        
        
    }
}
