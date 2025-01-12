import greenfoot.*; 

public class music extends Actor
{
    public static boolean chillplaying = false;
    public static boolean sweatplaying = false;
    public static boolean sadplaying = false;
    private static GreenfootSound chill = new GreenfootSound("chill.wav");
    private static GreenfootSound sad = new GreenfootSound("sad.wav");
    private static GreenfootSound sweat = new GreenfootSound("sweat.wav");
    public static void playchill()
    {
        if(!chillplaying){
            sad.stop();
            sadplaying=false;
            sweat.stop();
            sweatplaying=false;
            chill.playLoop();
            chillplaying=true;
        }
        
    }
    
    public static void playsad()
    {
        if(!sadplaying){
            sweat.stop();
            sweatplaying=false;
            chill.stop();
            chillplaying=false;
            sad.playLoop();
            sadplaying=true;
        }
       
    }
    public static void playsweat()
    {
        if(!sweatplaying){
            sad.stop();
            sadplaying=false;
            chill.stop();
            chillplaying=false;
            sweat.playLoop();
            sweatplaying=true;
        }
       
    }
    
}
