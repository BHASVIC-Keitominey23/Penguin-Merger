import greenfoot.*; 
public class sounds extends Actor
{
    //Flag to identify which song tracks are playing
    public static boolean chillplaying = false;
    public static boolean sweatplaying = false;
    public static boolean sadplaying = false;
    //Sound tracks
    private static GreenfootSound chill = new GreenfootSound("chill.wav");
    private static GreenfootSound sad = new GreenfootSound("sad.wav");
    private static GreenfootSound sweat = new GreenfootSound("sweat.wav");
    private static GreenfootSound drop = new GreenfootSound("drop.wav");
    private static GreenfootSound pop = new GreenfootSound("pop.wav");
    private static GreenfootSound cleek = new GreenfootSound("cleek.wav");
    public static void playchill()//Plays the "chill" music
    {
        //If the chill playing isn't already playing, it stops any other playing song and plays the chill one whilst adjusting the flags.
        if(!chillplaying){
            sad.stop();
            sadplaying=false;
            sweat.stop();
            sweatplaying=false;
            chill.playLoop();
            chillplaying=true;
        }
        
    }
    
    public static void playsad()//Plays the "sad" music with similar logic to playchill()
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
    public static void playsweat()//Plays the "upbeat" music with similar logic to playchill()
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
    //These procedures simply play the short sound effects
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
