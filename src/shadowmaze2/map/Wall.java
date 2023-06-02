package shadowmaze2.map;

import processing.core.PApplet;
import processing.core.PImage;

public class Wall extends Block {

    private PImage texture;

    public Wall(PApplet parent, int size, int x, int y, PImage texture) {
        super(parent, size, x, y);
        this.texture = texture;
    }

    public void draw() {
        getParent().image(texture, getX(), getY(), getSize(), getSize());
    }
}
