package game;

import city.cs.engine.*;

public class SmallPlatforms extends StaticBody {

    private static final Shape SmallPlatformShape = new BoxShape(1,0.5f);

    private static final BodyImage PlatformImage = new BodyImage("data/desertplatform.png",1);

    public SmallPlatforms(World w) {
        super(w, SmallPlatformShape);
        addImage(PlatformImage);
    }
}
