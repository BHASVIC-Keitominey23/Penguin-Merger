import greenfoot.*; 




public class penguin extends Actor
{
    private int mergepoints;
    private int xspeed=0000;
    private int yspeed=0000;
    private double friction=16;
    private double gravity=800;
    private int penglv;
    private boolean falling=true;
    private boolean dropped=false;
    public penguin(int spenglv, int smergepoints)
    {
        mergepoints=smergepoints;
        penglv=spenglv;
        
        
    }
    
    public void act()
    {
        //if(dropped){
        setLocation(getX() + (int)xspeed/1000, getY() + (int)yspeed/1000);
        checkcollision();
        if(falling){
            yspeed += gravity;
        }
        else if(falling==false){
            yspeed = 0;
            if(xspeed>0){
            xspeed -= friction;
        }
        }
    //}
    }
    public void checkcollision(){
        World world = getWorld();
        Actor penguin1 = getOneIntersectingObject(penguinlv1.class);
        Actor penguin2 = getOneIntersectingObject(penguinlv2.class);
        Actor penguin3 = getOneIntersectingObject(penguinlv3.class);
        Actor penguin4 = getOneIntersectingObject(penguinlv4.class);
        Actor penguin5 = getOneIntersectingObject(penguinlv5.class);
        Actor penguin6 = getOneIntersectingObject(penguinlv6.class);
        Actor penguin7 = getOneIntersectingObject(penguinlv7.class);
        Actor penguin8 = getOneIntersectingObject(penguinlv8.class);
        Actor penguin9 = getOneIntersectingObject(penguinlv9.class);

        if((penglv==1)&&(penguin1 != null)){
            
                world.removeObject(penguin1);
                world.addObject(new penguinlv2(),getX(),getY());
                world.removeObject(this);
            }
        else if((penglv==2)&&(penguin2 != null)){
            
                world.removeObject(penguin2);
                world.addObject(new penguinlv3(),getX(),getY());
                world.removeObject(this);
            }
        else if((penglv==3)&&(penguin3 != null)){
            
                world.removeObject(penguin3);
                world.addObject(new penguinlv4(),getX(),getY());
                world.removeObject(this);
            }
        else if((penglv==4)&&(penguin4 != null)){
            
                world.removeObject(penguin4);
                world.addObject(new penguinlv5(),getX(),getY());
                world.removeObject(this);
            }
        else if((penglv==5)&&(penguin5 != null)){
            
                world.removeObject(penguin5);
                world.addObject(new penguinlv6(),getX(),getY());
                world.removeObject(this);
            }
        else if((penglv==6)&&(penguin6 != null)){
            
                world.removeObject(penguin6);
                world.addObject(new penguinlv7(),getX(),getY());
                world.removeObject(this);
            }
        else if((penglv==7)&&(penguin7 != null)){
            
                world.removeObject(penguin7);
                world.addObject(new penguinlv8(),getX(),getY());
                world.removeObject(this);
            }
        else if((penglv==8)&&(penguin8 != null)){
            
                world.removeObject(penguin8);
                world.addObject(new penguinlv9(),getX(),getY());
                world.removeObject(this);
            }
        else if((penglv==9)&&(penguin9 != null)){
            
                world.removeObject(penguin9);
                world.removeObject(this);
            }
            
        
        else{
        
            if(getY()>340){
                setLocation(getX(),340);
                falling = false;
            }
            if(getX()>480){
                setLocation(480,getY());
                xspeed*=-0.7; 
            }
            if(getX()<120){
                setLocation(120,getY());
                xspeed*=-0.7; 
                
            }
        }
        
    
        
    
    }
}
