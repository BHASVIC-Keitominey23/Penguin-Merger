import greenfoot.*;

public class gamemenu extends World
{
    private int score = 0;
    private mainscoreboard mainscore;
  
    public gamemenu()
    {    
        super(600, 400, 1); 
        addObject( new pausebutton(),570,30);
        addObject( new dropper(),300,60);
        mainscore = new mainscoreboard();
        mainscore.setscore(0);
        addObject(mainscore,50,90);
        
        
        
    }
    public void updatescore(int level){
        if(level==1){
            score=score+1;
            mainscore.setscore(score);
        }
        else if(level==2){
            score=score+2;
            mainscore.setscore(score);
        }
        else if(level==3){
            score=score+4;
            mainscore.setscore(score);
        }
        else if(level==4){
            score=score+8;
            mainscore.setscore(score);
        }
        else if(level==5){
            score=score+16;
            mainscore.setscore(score);
        }
        else if(level==6){
            score=score+32;
            mainscore.setscore(score);
        }
        else if(level==7){
            score=score+64;
            mainscore.setscore(score);
        }
        else if(level==8){
            score=score+128;
            mainscore.setscore(score);
        }
        else if(level==9){
            score=score+256;
            mainscore.setscore(score);
        }
        
        
    }
}
