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
        if(penglv==1){
            Actor penguin1 = getOneIntersectingObject(penguinlv1.class);
            if(penguin1 != null){
                world.addObject(new penguinlv2(),((this.getX()+(penguin1.getX())/2,((this.getY())+(penguin1.getY()))/2;
                world.removeObject(this);
                world.removeObject(penguin1);
            }
            
        }
        
        if(getY()>340){
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
