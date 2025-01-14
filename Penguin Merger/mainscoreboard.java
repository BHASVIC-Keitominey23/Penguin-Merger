import greenfoot.*;

public class mainscoreboard extends Actor {
    protected GreenfootImage background = null;

    public mainscoreboard() 
    {
        background = new GreenfootImage(100, 100);
        
        background.setColor(new Color(200, 230, 255));
        background.fill();
        background.setColor(new Color(100, 150, 200));
        //Loops to draw a rectangle to hold the text
        for (int i = 0; i < 3; i++) 
        {
            background.drawRect(i, i, 100 - i * 2 - 1, 100 - i * 2 - 1);
        }
        setImage(background);
    }

    public void setscore(int score) 
    {
        GreenfootImage img = new GreenfootImage(background);
        img.setColor(Color.BLACK); //Sets the font colour to black
        img.setFont(new Font("SansSerif",18));//Sets the font and size
        img.drawString("Score:", 20, 40);
        img.drawString("" + score, 35, 70);
        setImage(img);
    }
}
