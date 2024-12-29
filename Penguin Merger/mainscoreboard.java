import greenfoot.*;

public class mainscoreboard extends Actor {
    protected GreenfootImage background = null;

    public mainscoreboard() {
        background = new GreenfootImage(100, 100); // Adjusted dimensions for the scoreboard
        // Draw the frosty background with rounded edges
        background.setColor(new Color(200, 230, 255)); // Frosty blue
        background.fill(); // Fill the entire rectangle
        background.setColor(new Color(100, 150, 200)); // Border color
        for (int i = 0; i < 3; i++) { // Simulate rounded edges with smaller rectangles
            background.drawRect(i, i, 100 - i * 2 - 1, 100 - i * 2 - 1);
        }
        setImage(background);
    }

    public void setscore(int score) {
        GreenfootImage img = new GreenfootImage(background); // Copy the background
        img.setColor(Color.BLACK); // Text color
        img.setFont(new Font("SansSerif",18)); // Adjusted font size for the smaller dimensions
        img.drawString("Score:", 20, 40); // Position the label
        img.drawString("" + score, 35, 70); // Display the score below the label
        setImage(img);
    }
}
