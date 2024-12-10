import greenfoot.*;


public class rankingsmenu extends World
{
    public rankingsmenu()
    {    
        super(600, 400, 1);

        addObject( new remenubutton(),540,340);
        GreenfootImage newImage = new GreenfootImage("aice.png"); 
        newImage.scale(600, 400); 
        setBackground(newImage);
        
        int[] topscores = scores.getinstance().getscores();

        showText("Top 10 Scores:",300,50);
        for (int i=0;i<10;i++) {
            if(topscores[i]==-1){
               showText((i+1)+". ----",300,100 +i*30); 
            }
            else{showText((i+1)+". "+topscores[i],300,100 +i*30);}
        }
        
        
        
    }
    
   
}
