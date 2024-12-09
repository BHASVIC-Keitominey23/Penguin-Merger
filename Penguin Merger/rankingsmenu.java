import greenfoot.*;


public class rankingsmenu extends World
{
    int[] topscores = new int[10];
    private ranking ranking;
  
   

    
    public rankingsmenu(int rscore)
    {    
        super(600, 400, 1);
        for(int i=0;i<10;i++){
            topscores[i] = 0;
        }
        addscore(rscore);
        addObject( new remenubutton(),540,370);
        GreenfootImage newImage = new GreenfootImage("aice.png"); 
        newImage.scale(600, 400); 
        setBackground(newImage);
        ranking = new ranking();
        ranking.setscore(topscores[0],topscores[1],topscores[2],topscores[3],topscores[4],topscores[5],topscores[6],topscores[7],topscores[8],topscores[9]);
        addObject(ranking,100,100);
        
        
        
    }
    public void addscore(int newscore){
        for(int i=0;i<9;i++){
            if(newscore>topscores[i]){
                topscores[i] = newscore;
                for(int k=i+1;k<9;k++){
                    topscores[k+1]=topscores[k];
                }
                break;
            }
        }
    }
    public int getscore(int index){
        return topscores[index];
    }
}
