package game;

import city.cs.engine.*;

import javax.swing.*;

public class Platforms extends StaticBody {

    private static final Shape PlatformShape = new BoxShape(3,0.5f);

    private static final BodyImage PlatformImage = new BodyImage("data/desertplatform.png",2);
    public Platforms(World w) {
        super(w,PlatformShape);
        addImage(PlatformImage);
    }
}
