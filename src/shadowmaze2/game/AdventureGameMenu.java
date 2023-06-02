package shadowmaze2.game;

import processing.core.PApplet;
import static processing.core.PConstants.CENTER;
import shadowmaze2.utils.Button;
import shadowmaze2.levels.*;

public class AdventureGameMenu extends PApplet {

    private Button[] levels;
    private Level1 level1;
    private int width;
    private int height;
    private int frame;

    public AdventureGameMenu(int w, int h, int f) {
        width = w;
        height = h;
        frame = f;
    }

    @Override
    public void settings() {
        size(width, height);
    }

    @Override
    public void setup() {
        frameRate(frame);
        int buttonWidth = 200;
        int buttonHeight = 50;
        int buttonSpacing = 20;
        int x = width / 2 - buttonWidth / 2;
        int y = height / 2 - (buttonHeight * 2 + buttonSpacing) / 2;
        levels = new Button[5];
        for (int i = 0; i < levels.length; i++) {
            int levelIndex = i;
            levels[i] = new Button(this, x, y + i * (buttonHeight + buttonSpacing), buttonWidth + (2 * buttonHeight), buttonHeight, String.valueOf(i + 1), () -> playAdventure(levelIndex));
        }
    }

    public void playAdventure(int i) {
        // TODO: Implement the adventure mode logic
        if (i == 0) {
            level1 = new Level1(width, height, frame);
            PApplet.runSketch(new String[]{"Level1"}, level1);
            surface.setVisible(false); // Hide the current MainMenu window
        } else if (i == 1) {

        } else if (i == 2) {

        } else if (i == 3) {

        } else if (i == 4) {

        }
        System.out.println(i);
    }

    @Override
    public void draw() {
        background(0);
        for (Button level : levels) {
            level.draw();
        }
        fill(255);
        textAlign(CENTER, CENTER);
        textSize(24);
        text("Game Menu", width / 2, height / 2);
    }

    @Override
    public void mouseClicked() {
        for (Button level : levels) {
            level.checkClick(mouseX, mouseY);
        }
    }
}
