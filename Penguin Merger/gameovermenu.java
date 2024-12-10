import greenfoot.*;


public class gameovermenu extends World
{
    private int score;
    private gameover gameover;
    private rankingsmenu rankingsmenu;
    public gameovermenu(int sscore)
    {    
        super(600, 400, 1);
        score = sscore;
        addObject(new gameoverdisplay(),300,100);
        addObject(new remenubutton(),200,300);
        addObject(new startgamebutton(),300,350);
        addObject(new rankingsbutton(),400,300);
        gameover=new gameover();
        gameover.setscore(score);
        addObject(gameover,300,225);
        scores.getmainscores().addscore(score);
      
        
       
    }
   
}
