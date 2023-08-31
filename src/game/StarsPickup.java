package game;

import city.cs.engine.CollisionEvent;
import city.cs.engine.CollisionListener;

public class StarsPickup implements CollisionListener {

    private Cowboy cowboy;

    public StarsPickup(Cowboy c) {
        cowboy = c;
    }
    @Override
    public void collide(CollisionEvent collisionEvent) {
        if (collisionEvent.getOtherBody() instanceof Stars) {
            cowboy.addStars();
            collisionEvent.getOtherBody().destroy();
        }
    }
}
