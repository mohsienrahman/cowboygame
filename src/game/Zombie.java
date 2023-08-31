package game;

import city.cs.engine.*;
import org.jbox2d.common.Vec2;

public class Zombie extends Walker implements StepListener {

    private static final BodyImage ZombieImage = new BodyImage("data/cowboyzombie.png", 4.5f);

    private static final Shape ZombieShape = new BoxShape(1,2);

    private final int SPEED = 2;

    private float left, right;
    private final int RANGE = 3;

    public Zombie(World world) {
        super(world, ZombieShape);
        addImage(ZombieImage);
        world.addStepListener(this);
        startWalking(SPEED);
    }

    @Override
    public void setPosition(Vec2 position) {
        super.setPosition(position);
        left = position.x-RANGE;
        right = position.x+RANGE;
    }

    @Override
    public void preStep(StepEvent stepEvent) {
        if (getPosition().x > right){
            startWalking(-SPEED);
        }
        if (getPosition().x < left){
            startWalking(SPEED);
        }
    }

    @Override
    public void postStep(StepEvent stepEvent) {

    }
}

