import greenfoot.*;


public class gameover extends Actor
{
    protected GreenfootImage background = null;
    private rankingsmenu ranking;
    public gameover()
    {
        background = new GreenfootImage (100,180);
        background.setColor(Color.WHITE);
        background.fillRect(0,0,150,60);
        setImage(background);
    }
    public void setscore(int score)
    {
        GreenfootImage img = new GreenfootImage (background);
        img.setColor(Color.BLACK);
        img.drawString("You scored: \n   " + score, 30, 20);
        setImage(img);
    }
    
}
