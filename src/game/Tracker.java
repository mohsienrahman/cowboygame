package game;

import city.cs.engine.StepEvent;
import city.cs.engine.StepListener;

public class Tracker implements StepListener {
    private GameView view;
    private Cowboy cowboy;

    public Tracker(GameView view, Cowboy cowboy) {
        this.view = view;
        this.cowboy = cowboy;
    }
    public void preStep(StepEvent e) {}
    public void postStep(StepEvent e) {
        view.setCentre(cowboy.getPosition());
    }
}
