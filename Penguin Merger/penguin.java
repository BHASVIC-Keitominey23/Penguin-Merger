import greenfoot.*; 

public class penguin extends Actor
{
    private int mergepoints;
    private int xspeed=0000;
    private int yspeed=0000;
    private double friction=16;
    private double gravity=800;
    private int penglv;
    private boolean falling=false;
    public boolean dropped;
    public penguin(int spenglv, int smergepoints, boolean sdropped)
    {
        mergepoints=smergepoints;
        penglv=spenglv;
        dropped=sdropped;

        
        
    }
    
    public void act()
    {
        if(dropped){
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
    }
    }
    public void movepenguin(int x)
    {
        if(!dropped){
            
            move(x);
        }
    }
    public boolean getfalling(){
        return falling;
    }
    
    public void drop(){
        dropped=true;
        falling=true;
    }
    public void checkcollision(){
        gamemenu world = (gamemenu)getWorld();
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
                world.updatescore(penglv);
                world.removeObject(penguin1);
                world.addObject(new penguinlv2(true),getX(),getY());
                world.removeObject(this);
            }
        else if((penglv==2)&&(penguin2 != null)){
                world.updatescore(penglv);
                world.removeObject(penguin2);
                world.addObject(new penguinlv3(true),getX(),getY());
                world.removeObject(this);
            }
        else if((penglv==3)&&(penguin3 != null)){
                world.updatescore(penglv);
                world.removeObject(penguin3);
                world.addObject(new penguinlv4(true),getX(),getY());
                world.removeObject(this);
            }
        else if((penglv==4)&&(penguin4 != null)){
                world.updatescore(penglv);
                world.removeObject(penguin4);
                world.addObject(new penguinlv5(true),getX(),getY());
                world.removeObject(this);
            }
        else if((penglv==5)&&(penguin5 != null)){
                world.updatescore(penglv);
                world.removeObject(penguin5);
                world.addObject(new penguinlv6(true),getX(),getY());
                world.removeObject(this);
            }
        else if((penglv==6)&&(penguin6 != null)){
                world.updatescore(penglv);
                world.removeObject(penguin6);
                world.addObject(new penguinlv7(true),getX(),getY());
                world.removeObject(this);
            }
        else if((penglv==7)&&(penguin7 != null)){
                world.updatescore(penglv);
                world.removeObject(penguin7);
                world.addObject(new penguinlv8(true),getX(),getY());
                world.removeObject(this);
            }
        else if((penglv==8)&&(penguin8 != null)){
                world.updatescore(penglv);
                world.removeObject(penguin8);
                world.addObject(new penguinlv9(true),getX(),getY());
                world.removeObject(this);
            }
        else if((penglv==9)&&(penguin9 != null)){
                world.updatescore(penglv);
                world.removeObject(penguin9);
                world.addObject(new penguinlv1(true),getX(),getY());
                world.removeObject(this);
            }
            
        
        else{
        
            if(getY()>340){
                setLocation(getX(),340);
                falling = false;
            }
            else if(getX()>480){
                setLocation(480,getY());
                xspeed*=-0.7; 
            }
            else if(getX()<120){
                setLocation(120,getY());
                xspeed*=-0.7; 
                
            }
            else{falling=true;}
        }
        
    
        
    
    }
}
