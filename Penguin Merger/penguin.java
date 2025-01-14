import greenfoot.*;

public class penguin extends Actor
{
    private gamemenu gamemenu;   //Stores the gamemenu it is in     
    private int mergepoints;     //Points earned per merge
    private int xspeed=0000;     //Horizontal speed
    private int yspeed=0000;     //Vertical speed
    private int gravity;     //Speed gained due to gravity when falling
    private int penglv;          //Penguin level
    private boolean falling=false;//Falling flag
    public boolean dropped;       //Dropped flag

    public penguin(int spenglv, int smergepoints, boolean sdropped, int sgravity)//constructor
        {
           mergepoints=smergepoints;
           penglv=spenglv;
           dropped=sdropped;
           gravity=sgravity;
        }
    

    public void act()
        {
            if(dropped){
                setLocation(getX() + (int)xspeed/2000, getY() + (int)yspeed/1000);//Moves the penguin by its speed values
                checkcollision();
                checkspeed();
                if(falling){
                    yspeed += gravity;
                }
                else{
                xspeed*=0.99;//Penguins lose speed due to fricion with floor
                yspeed = 0;  //Penguins don't bounce
                turn((int)xspeed/500); //Turning animation
        
                }
            }
        }
    public void movepenguin(int x)
    {
        if(!dropped){
             move(x);//The penguins are only moved by the dropper before dropped
        }
    }
    public void drop()
    {
        dropped=true;
        falling=true;
    }
    
    public void checkspeed(){//Makes sure speed doesn't get too high or low
        if (Math.abs(xspeed)>20000)
        {
            xspeed=20000;
        }
        if(Math.abs(yspeed)>20000)
        {
            yspeed=20000;
        }
        //Sets low speeds to 0 to avoid jittering
        if(Math.abs(yspeed)<50)
        {
            yspeed=0;
        }
        if(Math.abs(xspeed)<50)
        {
            xspeed=0;  
        }
        
    }
    
    
    public void checkcollision()
    {
        gamemenu world = (gamemenu)getWorld(); //Copy of the current world
        //Stores information of any possible intersecting penguins
        Actor penguin1 = getOneIntersectingObject(penguinlv1.class);
        Actor penguin2 = getOneIntersectingObject(penguinlv2.class);
        Actor penguin3 = getOneIntersectingObject(penguinlv3.class);
        Actor penguin4 = getOneIntersectingObject(penguinlv4.class);
        Actor penguin5 = getOneIntersectingObject(penguinlv5.class);
        Actor penguin6 = getOneIntersectingObject(penguinlv6.class);
        Actor penguin7 = getOneIntersectingObject(penguinlv7.class);
        Actor penguin8 = getOneIntersectingObject(penguinlv8.class);
        Actor penguin9 = getOneIntersectingObject(penguinlv9.class);
        //Checks if the two touching penguins are of the same level. If they are, then a merge happens.
        if((penglv==1)&&(penguin1 != null)){
                world.updatescore(penglv); //Adds the points of the merge to the main score
                int tx = penguin1.getX();  //Temporarily stores the x and y coordinates of the other penguin.
                int ty = penguin1.getY();
                world.removeObject(penguin1);
                world.addObject(new penguinlv2(true),(getX()+tx)/2,(getY()+ty)/2);//Adds a new penguin of the next level to the coordinates in between the two merged penguins.
                world.removeObject(this);
                //Removes both penguins
                sounds.pop();//Calls the sound object to play the pop sound
            }
        else if((penglv==2)&&(penguin2 != null)){
                world.updatescore(penglv);
                int tx = penguin2.getX();
                int ty = penguin2.getY();
                world.removeObject(penguin2);
                world.addObject(new penguinlv3(true),(getX()+tx)/2,(getY()+ty)/2);
                world.removeObject(this);
                sounds.pop();
            }
        else if((penglv==3)&&(penguin3 != null)){
                world.updatescore(penglv);
                int tx = penguin3.getX();
                int ty = penguin3.getY();
                world.removeObject(penguin3);
                world.addObject(new penguinlv4(true),(getX()+tx)/2,(getY()+ty)/2);
                world.removeObject(this);
                sounds.pop();
            }
        else if((penglv==4)&&(penguin4 != null)){
                world.updatescore(penglv);
                int tx = penguin4.getX();
                int ty = penguin4.getY();
                world.removeObject(penguin4);
                world.addObject(new penguinlv5(true),(getX()+tx)/2,(getY()+ty)/2);
                world.removeObject(this);
                sounds.pop();
            }
        else if((penglv==5)&&(penguin5 != null)){
                world.updatescore(penglv);
                int tx = penguin5.getX();
                int ty = penguin5.getY();
                world.removeObject(penguin5);
                world.addObject(new penguinlv6(true),(getX()+tx)/2,(getY()+ty)/2);
                world.removeObject(this);
                sounds.pop();
            }
        else if((penglv==6)&&(penguin6 != null)){
                world.updatescore(penglv);
                int tx = penguin6.getX();
                int ty = penguin6.getY();
                world.removeObject(penguin6);
                world.addObject(new penguinlv7(true),(getX()+tx)/2,(getY()+ty)/2);
                world.removeObject(this);
                sounds.pop();
            }
        else if((penglv==7)&&(penguin7 != null)){
                world.updatescore(penglv);
                int tx = penguin7.getX();
                int ty = penguin7.getY();
                world.removeObject(penguin7);
                world.addObject(new penguinlv8(true),(getX()+tx)/2,(getY()+ty)/2);
                world.removeObject(this);
                sounds.pop();
            }
        else if((penglv==8)&&(penguin8 != null)){
                world.updatescore(penglv);
                int tx = penguin8.getX();
                int ty = penguin8.getY();
                world.removeObject(penguin8);
                world.addObject(new penguinlv9(true),(getX()+tx)/2,(getY()+ty)/2);
                world.removeObject(this);
                sounds.pop();
            }
        else if((penglv==9)&&(penguin9 != null)){
                world.updatescore(penglv);
                int tx = penguin9.getX();
                int ty = penguin9.getY();
                world.removeObject(penguin9);
                world.addObject(new penguinlv1(true),(getX()+tx)/2,(getY()+ty)/2);
                world.removeObject(this);
                sounds.pop();
            }
            
        
        else
            {
                //Checks if another penguin that isn't of the same type is intersecting
                penguin otherpenguin = (penguin)getOneIntersectingObject(penguin.class);
                if(otherpenguin!=null)
                {
                    //Calculates the hoizontal and vertical distances between the penguins
                    double dx = otherpenguin.getX() - getX();
                    double dy = otherpenguin.getY() - getY();
                    //Calculates the euclidean distance between them
                    double distance = Math.sqrt(dx * dx + dy * dy);
                    //Calculates the radius of each penguin by halving the image widths
                    double radius = (getImage().getWidth())/2;
                    double otherradius =(otherpenguin.getImage().getWidth())/2;
                    //Calculates the overlap of the penguins
                    double overlap = (radius + otherradius - distance) / 2.0;
                    //Normalises the direction vectors
                    double nx = dx / distance;
                    double ny = dy / distance;
                    //Limits the maximum correction
                    int maxcorrection = 5;
                    int xcorrection = (int) Math.min(nx * overlap, maxcorrection);
                    int ycorrection = (int) Math.min(ny * overlap, maxcorrection);
                    //Adjusts the penguins positions to solve overlap
                    setLocation(getX() - xcorrection / 2, getY() - ycorrection / 2);
                    otherpenguin.setLocation(otherpenguin.getX() + xcorrection / 2, otherpenguin.getY() + ycorrection / 2);
                    //Calculates relative speeds between the penguins
                    int dvx = otherpenguin.xspeed - xspeed;
                    int dvy = otherpenguin.yspeed - yspeed;
                    //Calculates the dot product of the relative speeds
                    double dotproduct = dvx * nx + dvy * ny;
                    //Adjusts the velocities if the dot product is negative
                    if (dotproduct < 0) 
                        {
                        xspeed += dotproduct * nx;
                        yspeed += dotproduct * ny;
                        otherpenguin.xspeed -= dotproduct * nx;
                        otherpenguin.yspeed -= dotproduct * ny;
                        }
                    //Applies friction due to collision
                    xspeed *= 0.99;
                    otherpenguin.xspeed *= 0.99;
                    yspeed *= 0.99;
                    otherpenguin.yspeed *= 0.99;
                    //Checks if the penguin is touching the limit and ends the game if true
                    Actor limit = getOneIntersectingObject(limit.class);
                    if(limit!=null)
                        {
                        Greenfoot.setWorld(new gameovermenu(world.score));
                        }
                    //Sets the penguin to not falling if the dot product is below the threshold
                    if(150>Math.abs(dotproduct))
                        {
                           yspeed=0; 
                           otherpenguin.yspeed=0;
                           falling=false;
                           otherpenguin.falling=false;
                       
                        }
                    else
                        {
                            otherpenguin.falling=true;
                            falling=true;
                        }
                    
            }
            int height = getImage().getHeight();
            int butt = getY() + height / 2; //Calculates bottom of penguin
            int width = getImage().getWidth(); 
            int left = getX() - width / 2;  //Calculates left side of penguin
            int right = getX() + width / 2; //Calculates right side of penguin
            
            if(butt>365){   //If below floor
                setLocation(getX(),365-height/2);   //Adjust to on the floor
                falling = false;
            }
            else if(right>480){ //If touching right wall
                setLocation(480 - width / 2, getY());   //Adjusts to right wall
                xspeed*=-0.8; //Applies friction due to collision
            }
            else if(left<120){
                setLocation(120 + width / 2, getY());   //Adjusts to left wall
                xspeed*=-0.8; //Applies friction due to collision
                
            }
            
            else{
                falling=true; //If not touching wall or floor, it's falling    
            }
            }
        }
    }

