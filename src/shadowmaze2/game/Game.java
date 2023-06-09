package shadowmaze2.game;

import processing.core.PApplet;
import static processing.core.PConstants.CENTER;
import shadowmaze2.utils.Button;

public class Game extends PApplet {
    private Button[] levels;
    private Button playVersusButton;
    private int width;
    private int height;
    private int frame;

    public Game(int w, int h, int f) {
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
            levels[i] = new Button(this, x, y + i * (buttonHeight + buttonSpacing), buttonWidth + (2 * buttonHeight), buttonHeight, String.valueOf(i), this::playAdventure);
        }
        playVersusButton = new Button(this, x, y + levels.length * (buttonHeight + buttonSpacing), buttonWidth + (2 * buttonHeight), buttonHeight, "Versus", this::playVersus);
    }

    public void playAdventure() {
        // TODO: Implement the adventure mode logic
        System.out.println("adv");
    }

    public void playVersus() {
        // TODO: Implement the versus mode logic
        System.out.println("versus");
    }

    @Override
    public void draw() {
        background(0);
        for (Button level : levels) {
            level.draw();
        }
        playVersusButton.draw();
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
        playVersusButton.checkClick(mouseX, mouseY);
    }
}
