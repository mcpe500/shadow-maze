package shadowmaze2.levels;

import processing.core.PApplet;
import shadowmaze2.utils.*;
import shadowmaze2.map.*;

public class Level1 extends PApplet {

    private int width;
    private int height;
    private int frame;
    private int[][] map;
    private Block[][] textureMap;

    public Level1(int w, int h, int f) {
        width = w;
        height = h;
        frame = f;
        ReadMap rm = new ReadMap("./src/assets/map.json");
        map = rm.getMap();
    }

    @Override
    public void settings() {
        size(width, height);
    }

    @Override
    public void setup() {
        frameRate(frame);

    }

    public void draw() {
        new Floor(this, 10, 10, 10, loadImage("./src/assets/texture/stonefloor.png"));
    }
}
