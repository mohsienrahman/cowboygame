package game;

import city.cs.engine.*;

public class Cowboy extends Walker {
    private static final Shape CowboyShape = new BoxShape(1,2);
    private static final BodyImage image = new BodyImage("data/cowboycartoon.png", 4);

    private int stars;
    private int health;

    public Cowboy(World world){
        super(world, CowboyShape);
        this.addImage(image);
        health=100;
        stars=0;
    }

    public void setHealth(int health) {
        this.health = health;
        System.out.println("Health =" + health);
    }

    public int getHealth() { return health; }

    public void decreaseHealth() { setHealth(getHealth()-20); }

    public void setStars(int stars) {
        this.stars = stars;
        System.out.println("Stars = " + stars);
    }

    public int getStars() { return stars; }

    public void addStars() {
        setStars(getStars()+1);
    }


}
