package game;

import city.cs.engine.*;

public class GroundPlatform extends StaticBody {

    private static final Shape GroundShape = new BoxShape(30,1f);

    private static final BodyImage GroundImage = new BodyImage("data/sand1.png",2f);

    public GroundPlatform(World w) {
        super(w,GroundShape);
        addImage(GroundImage);
    }
}
