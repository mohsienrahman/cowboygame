package game;

import city.cs.engine.*;
import city.cs.engine.Shape;
import org.jbox2d.common.Vec2;

import javax.swing.JFrame;

import java.awt.*;
import java.io.IOException;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;

/**
 * Your main game entry point
 */
public class Game {


    /** Initialise a new Game. */
    public Game() {

        //1. make an empty game world
        GameWorld world = new GameWorld();


        //2. make a view to look into the game world
        GameView view = new GameView(world, 900,650 );
        view.setZoom(25f);
        //optional: draw a 1-metre grid over the view
        //view.setGridResolution(1);

        CowboyController cc = new CowboyController(world.getCowboy());
        view.addKeyListener(cc);

        GiveFocus gf = new GiveFocus(view);
        view.addMouseListener(gf);

        Tracker tracker = new Tracker(view, world.getCowboy());
        world.addStepListener(tracker);

        //3. create a Java window (frame) and add the game
        //   view to it
        final JFrame frame = new JFrame("City Game");
        frame.add(view);

        // enable the frame to quit the application
        // when the x button is pressed
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationByPlatform(true);
        // don't let the frame be resized
        frame.setResizable(false);
        // size the frame to fit the world view
        frame.pack();
        // finally, make the frame visible
        frame.setVisible(true);

        //optional: uncomment this to make a debugging view
        //JFrame debugView = new DebugViewer(world, 500, 500);

        // start our game world simulation!
        world.start();
    }

    /** Run the game. */
    public static void main(String[] args) {

        new Game();
    }
}
