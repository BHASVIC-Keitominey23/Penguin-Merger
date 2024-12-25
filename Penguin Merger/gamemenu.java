import greenfoot.*;

public class gamemenu extends World
{
    public int score = 0;
    private mainscoreboard mainscore;
    private pausebutton pause;
    
  
    public gamemenu()
    {    
        super(600, 400, 1);
        addObject(new limit(),140,60);
        addObject(new limit(),200,60);
        addObject(new limit(),260,60);
        addObject(new limit(),320,60);
        addObject(new limit(),380,60);
        addObject(new limit(),450,60);
        addObject(new plat(0),300,375);
        addObject(new plat(0),300,392);
        addObject(new plat(90),110,235);
        addObject(new plat(90),490,235);
        
    
        pause = new pausebutton();
        addObject(pause,562,37);
        addObject( new dropper(),300,50);
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
