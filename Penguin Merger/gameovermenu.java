import greenfoot.*;


public class gameovermenu extends World
{
    private int score;
    private gameover gameover;
    private rankingsmenu rankingsmenu;
    public gameovermenu(int sscore)
    {    
        super(600, 400, 1);
        sounds.playsad();
        GreenfootImage newImage = new GreenfootImage("gameoverback.jpg"); 
        newImage.scale(600, 400); 
        setBackground(newImage);
        score = sscore;
        addObject(new gameoverdisplay(),300,70);
        addObject(new remenubutton(),100,325);
        addObject(new startgamebutton(),300,275);
        addObject(new rankingsbutton(),480,340);
        gameover=new gameover();
        gameover.setscore(score);
        addObject(gameover,300,170);
        scores.getmainscores().addscore(score);
      
        
       
    }
   
}
