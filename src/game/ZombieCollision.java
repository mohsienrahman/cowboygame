package game;

import city.cs.engine.CollisionEvent;
import city.cs.engine.CollisionListener;

public class ZombieCollision implements CollisionListener {

    private Cowboy cowboy;

    public ZombieCollision(Cowboy c) {
        cowboy = c;
    }

    @Override
    public void collide(CollisionEvent collisionEvent) {
        if (collisionEvent.getOtherBody() instanceof Zombie) {
            cowboy.decreaseHealth();
            if (cowboy.getHealth() == 0) {
                cowboy.destroy();
            }
        }
    }
}