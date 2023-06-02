package shadowmaze2;

import shadowmaze2.menu.MainMenu;
import processing.core.PApplet;

public class ShadowMaze2 extends PApplet {

    public static void main(String[] args) {
        int width = 1280;
        int height = 720;
        int frame = 60;
        PApplet.runSketch(new String[]{"shadowmaze2.ShadowMaze2"}, new MainMenu(width, height, frame));
    }

    @Override
    public void settings() {
        size(1280, 720);
    }

    @Override
    public void setup() {
        // Add your setup code here
    }

    @Override
    public void draw() {
        // Add your drawing code here
    }

}
