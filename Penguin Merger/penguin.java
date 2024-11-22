import greenfoot.*; 

public class penguin extends Actor
{
    private int mergepoints;
    private int mass;
    private int xspeed=0000;
    private int yspeed=0000;
    private double friction=30;
    private double gravity=800;
    private int penglv;
    private boolean falling=false;
    public boolean dropped;
    public penguin(int spenglv, int smergepoints, boolean sdropped,int smass)
    {
        mergepoints=smergepoints;
        penglv=spenglv;
        dropped=sdropped;
        mass=smass;
    
    }
    
    public void act()
    {
        if(dropped){
        setLocation(getX() + (int)xspeed/1000, getY() + (int)yspeed/1000);
        checkcollision();
        checkspeed();
        if(falling){
            yspeed += gravity;

        }
        else{
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
    public int getxspeed(){
        return xspeed;
    }
    public int getyspeed(){
        return yspeed;
    }
    
    public int getMass(){
        return mass;
    }
    public void drop(){
        dropped=true;
        falling=true;
    }
    
    public void checkspeed(){
        if (xspeed>20000){
            xspeed=20000;
        }
        if(yspeed>20000){
            yspeed=20000;
        }
        if(yspeed<50){
            yspeed=0;
        }
        
        
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
                int tx = penguin1.getX();
                int ty = penguin1.getY();
                world.removeObject(penguin1);
                world.addObject(new penguinlv2(true),(getX()+tx)/2,(getY()+ty)/2);
                world.removeObject(this);
            }
        else if((penglv==2)&&(penguin2 != null)){
                world.updatescore(penglv);
                int tx = penguin2.getX();
                int ty = penguin2.getY();
                world.removeObject(penguin2);
                world.addObject(new penguinlv3(true),(getX()+tx)/2,(getY()+ty)/2);
                world.removeObject(this);
            }
        else if((penglv==3)&&(penguin3 != null)){
                world.updatescore(penglv);
                int tx = penguin3.getX();
                int ty = penguin3.getY();
                world.removeObject(penguin3);
                world.addObject(new penguinlv4(true),(getX()+tx)/2,(getY()+ty)/2);
                world.removeObject(this);
            }
        else if((penglv==4)&&(penguin4 != null)){
                world.updatescore(penglv);
                int tx = penguin4.getX();
                int ty = penguin4.getY();
                world.removeObject(penguin4);
                world.addObject(new penguinlv5(true),(getX()+tx)/2,(getY()+ty)/2);
                world.removeObject(this);
            }
        else if((penglv==5)&&(penguin5 != null)){
                world.updatescore(penglv);
                int tx = penguin5.getX();
                int ty = penguin5.getY();
                world.removeObject(penguin5);
                world.addObject(new penguinlv6(true),(getX()+tx)/2,(getY()+ty)/2);
                world.removeObject(this);
            }
        else if((penglv==6)&&(penguin6 != null)){
                world.updatescore(penglv);
                int tx = penguin6.getX();
                int ty = penguin6.getY();
                world.removeObject(penguin6);
                world.addObject(new penguinlv7(true),(getX()+tx)/2,(getY()+ty)/2);
                world.removeObject(this);
            }
        else if((penglv==7)&&(penguin7 != null)){
                world.updatescore(penglv);
                int tx = penguin7.getX();
                int ty = penguin7.getY();
                world.removeObject(penguin7);
                world.addObject(new penguinlv8(true),(getX()+tx)/2,(getY()+ty)/2);
                world.removeObject(this);
            }
        else if((penglv==8)&&(penguin8 != null)){
                world.updatescore(penglv);
                int tx = penguin8.getX();
                int ty = penguin8.getY();
                world.removeObject(penguin8);
                world.addObject(new penguinlv9(true),(getX()+tx)/2,(getY()+ty)/2);
                world.removeObject(this);
            }
        else if((penglv==9)&&(penguin9 != null)){
                world.updatescore(penglv);
                int tx = penguin9.getX();
                int ty = penguin9.getY();
                world.removeObject(penguin9);
                world.addObject(new penguinlv1(true),(getX()+tx)/2,(getY()+ty)/2);
                world.removeObject(this);
            }
            
        
        else{
            
            penguin otherpenguin = (penguin)getOneIntersectingObject(penguin.class);
            if(otherpenguin!=null){
               
                double dx = otherpenguin.getX() - getX();
                double dy = otherpenguin.getY() - getY();
                double distance = Math.sqrt(dx * dx + dy * dy);
                double radius = (getImage().getWidth())/2;
                double otherradius =(otherpenguin.getImage().getWidth())/2;
                double overlap = (radius + otherradius - distance) / 2.0;
                double nx = dx / distance;
                double ny = dy / distance;
                double maxcorrection = 5.0;
                int xcorrection = (int) Math.min(nx * overlap, maxcorrection);
                int ycorrection = (int) Math.min(ny * overlap, maxcorrection);
                setLocation(getX() - xcorrection / 2, getY() - ycorrection / 2);
                otherpenguin.setLocation(otherpenguin.getX() + xcorrection / 2, otherpenguin.getY() + ycorrection / 2);
                double dvx = otherpenguin.xspeed - xspeed;
                double dvy = otherpenguin.yspeed - yspeed;
                double dotproduct = dvx * nx + dvy * ny;
                if (dotproduct < 0) {
                    xspeed += dotproduct * nx;
                    yspeed += dotproduct * ny;
                    otherpenguin.xspeed -= dotproduct * nx;
                    otherpenguin.yspeed -= dotproduct * ny;
                }
                xspeed -= 10;
                otherpenguin.xspeed -= 10;
                yspeed -= 10;
                otherpenguin.yspeed -= 10;
                if((yspeed<100)&&(falling)){
                   yspeed=0; 
                   falling=false;
                }
                
            }
        
            if(getY()>340){
                setLocation(getX(),340);
                yspeed *= -0.7;
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
