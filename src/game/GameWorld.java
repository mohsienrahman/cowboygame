package game;

import city.cs.engine.*;
import city.cs.engine.Shape;
import org.jbox2d.common.Vec2;

public class GameWorld extends World {

    static Cowboy cowboy;
    public GameWorld(){
        super();
        //populate the GameWorld with bodies (ex: platforms, collectibles, characters)

        //make a ground platform
        GroundPlatform g1 = new GroundPlatform(this);
        g1.setPosition(new Vec2(0f, -15.5f));

        GroundPlatform g2 = new GroundPlatform(this);
        g2.setPosition(new Vec2(-14f, -15.5f));

        GroundPlatform g3 = new GroundPlatform(this);
        g3.setPosition(new Vec2(14f, -15.5f));

        GroundPlatform g4 = new GroundPlatform(this);
        g4.setPosition(new Vec2(28f, -15.5f));

        GroundPlatform g5 = new GroundPlatform(this);
        g5.setPosition(new Vec2(-28f, -15.5f));

        // make a suspended platform

        Platforms p1m1 = new Platforms(this);
        p1m1.setPosition(new Vec2(-5, -5.5f));

        Platforms p2r1 = new Platforms(this);
        p2r1.setPosition(new Vec2(9, -9f));

        Platforms p3r2 = new Platforms(this);
        p3r2.setPosition(new Vec2(15, -9f));

        Platforms p4tl1 = new Platforms(this);
        p4tl1.setPosition(new Vec2(-15, -2f));

        SmallPlatforms p5s1 = new SmallPlatforms(this);
        p5s1.setPosition(new Vec2(8, -1f));

        SmallPlatforms p6s2 = new SmallPlatforms(this);
        p6s2.setPosition(new Vec2(15, -1f));

        Platforms p7t1 = new Platforms(this);
        p7t1.setPosition(new Vec2(-6, 6f));

        Platforms p8t2 = new Platforms(this);
        p8t2.setPosition(new Vec2(0, 6f));

        Platforms p9t3 = new Platforms(this);
        p9t3.setPosition(new Vec2(5, 6f));


        //make a character (with an overlaid image)

        Cowboy cowboy = new Cowboy(this);
        cowboy.setPosition(new Vec2(4,-5));
        this.cowboy = cowboy;

        ZombieCollision EC = new ZombieCollision(cowboy);

        //making the zombies (enemies)

        Zombie zombie1 = new Zombie(this);
        zombie1.setPosition(new Vec2(-12,-14));
        zombie1.setName("zombie1");

        Zombie zombie2 = new Zombie(this);
        zombie2.setPosition(new Vec2(0,10));
        zombie2.setName("zombie2");

        Zombie zombie3 = new Zombie(this);
        zombie3.setPosition(new Vec2(12,-7f));
        zombie3.setName("zombie3");

        Zombie zombie4 = new Zombie(this);
        zombie4.setPosition(new Vec2(8,0f));
        zombie3.setName("zombie3");
        zombie4.stopWalking();

        cowboy.addCollisionListener(EC);

        // making the collectibles (stars)
        StarsPickup sp = new StarsPickup(cowboy);
        Stars s1 = new Stars(this);
        s1.setPosition(new Vec2(-15f,0f));

        Stars s2 = new Stars(this);
        s2.setPosition(new Vec2(-5,-3.5f));

        Stars s3 = new Stars(this);
        s3.setPosition(new Vec2(6,8f));

        Stars s4 = new Stars(this);
        s4.setPosition(new Vec2(15,1f));

        Stars s5 = new Stars(this);
        s5.setPosition(new Vec2(18,-7f));

        Stars s6 = new Stars(this);
        s6.setPosition(new Vec2(-18,-13f));

        Stars s7 = new Stars(this);
        s7.setPosition(new Vec2(-6,8f));


        cowboy.addCollisionListener(sp);

    }

    public static Cowboy getCowboy(){
        return cowboy;
    }
}
