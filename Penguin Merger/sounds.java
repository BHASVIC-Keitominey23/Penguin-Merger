import greenfoot.*; 

public class sounds extends Actor
{
    public static boolean chillplaying = false;
    public static boolean sweatplaying = false;
    public static boolean sadplaying = false;
    private static GreenfootSound chill = new GreenfootSound("chill.wav");
    private static GreenfootSound sad = new GreenfootSound("sad.wav");
    private static GreenfootSound sweat = new GreenfootSound("sweat.wav");
    private static GreenfootSound drop = new GreenfootSound("drop.wav");
    private static GreenfootSound pop = new GreenfootSound("pop.wav");
    private static GreenfootSound cleek = new GreenfootSound("cleek.wav");
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
    public static void drop(){
        drop.play();
    }
    public static void pop(){
        pop.play();
    }
    public static void cleek(){
        cleek.play();
    }
}
