package game;

import city.cs.engine.*;

public class Stars extends StaticBody {

    private static final Shape StarsShape = new CircleShape(1);

    private static final BodyImage StarsImage = new BodyImage("data/Stars.png", 2f);

    public Stars(World world) {
        super(world,StarsShape);
        addImage(StarsImage);
    }
}
