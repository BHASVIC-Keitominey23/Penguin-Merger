import greenfoot.*;

public class rankingsmenu extends World
{
    public rankingsmenu()
    {    
        super(600, 400, 1);
        addObject(new remenubutton(),540,340);
        GreenfootImage newImage = new GreenfootImage("aice.png"); 
        //The image isn't of the right size so rescale it to fit the world dimensions
        newImage.scale(600, 400); 
        setBackground(newImage);
        //Gets values of scores array
        int[] topscores = scores.getmainscores().getscores();
        showText("Top 10 Scores:",300,50);
        //Loops to present the scores in a vertical list by changing the coordinates per loop
        for (int i=0;i<10;i++)
        {
            //If a score is -1 there are not 10 scores so ---- displayed instead. Otherwise score displayed.
            if(topscores[i]==-1)
            {
               showText((i+1)+". ----",300,100+i*30); 
            }
            else
            {
                showText((i+1)+". "+topscores[i],300,100+i*30);
            }
        }
    }
}
