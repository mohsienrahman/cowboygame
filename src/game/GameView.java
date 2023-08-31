package game;

import city.cs.engine.UserView;
import city.cs.engine.World;

import javax.swing.*;
import java.awt.*;

public class GameView extends UserView {
    private final Image background = new ImageIcon("data/desert.gif").getImage();

    public GameView(GameWorld w, int width, int height) {
        super(w, width, height);
    }

    @Override
    protected void paintBackground(Graphics2D g) {
        g.drawImage(background, 0, 0, this);
    }

    protected void paintForeground(Graphics2D g) {
        Font font = new Font("Arial", Font.BOLD, 30);
        Font Large = new Font("Arial", Font.BOLD,100);
        g.setFont(font);
        g.setColor(Color.black);
        g.drawString("Health:" + GameWorld.getCowboy().getHealth(), 20, 50);
        g.drawString("Stars:" + GameWorld.getCowboy().getStars(), 20, 80);
        if (GameWorld.getCowboy().getHealth() == 0) {
            g.setColor(Color.red);
            g.setFont(Large);
            g.drawString("Game Over", 200,350);
        } else if (GameWorld.getCowboy().getStars() == 7) {
            g.setColor(Color.white);
            g.setFont(new Font("Arial", Font.BOLD,50));
            g.drawString("Winner\nWinner Chicken\nDinner", 100,350);
        }
    }
}


