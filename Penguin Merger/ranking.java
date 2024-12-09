import greenfoot.*;


public class ranking extends Actor
{
    protected GreenfootImage background = null;
    public ranking()
    {
        background = new GreenfootImage (100,180);
        background.setColor(Color.WHITE);
        background.fillRect(0,0,150,60);
        setImage(background);
    }
    public void setscore(int score1,int score2, int score3, int score4, int score5, int score6, int score7, int score8, int score9, int score10)
    {
        GreenfootImage img = new GreenfootImage (background);
        img.setColor(Color.BLACK);
        img.drawString("Score: \n   " + score1 + "\n" + score2+ "\n" + score3+ "\n" + score4+ "\n" + score5+ "\n" + score6+ "\n" + score7+ "\n" + score8+ "\n" + score9+ "\n" + score10,30,20);
        setImage(img);
    }
    public void act()
    {
        
    }
}