import greenfoot.*;

public class gameover extends Actor
{
    protected GreenfootImage background = null;
    public gameover()
    {
        background = new GreenfootImage(200, 100);
        background.setColor(new Color(200, 230, 255));
        background.fill();
        background.setColor(new Color(100, 150, 200));
        for (int i=0; i<5; i++)
        {
            background.drawRect(i, i, 200 - i * 2 - 1, 100 - i * 2 - 1);
        }   
        setImage(background);
    }

    public void setscore(int score)
    {
        GreenfootImage img = new GreenfootImage(background);
        img.setColor(Color.BLACK);
        img.setFont(new Font("SansSerif", 18));
        img.drawString("You Scored:", 50, 40);
        img.drawString("" + score, 90, 70);
        setImage(img);
    }
}
