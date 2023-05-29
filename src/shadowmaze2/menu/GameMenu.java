package shadowmaze2.menu;

import processing.core.PApplet;
import shadowmaze2.utils.Button;

public class GameMenu extends PApplet {

    private Button settingButton;
    private SettingMenu settingMenu;
    private Button playAdventureButton;
    private Button playVersusButton;
    private int width;
    private int height;
    private int frame;

    public GameMenu(int w, int h, int f) {
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
        // Create the buttons
        frameRate(frame);
        int buttonWidth = 200;
        int buttonHeight = 50;
        int buttonSpacing = 20;
        int x = width / 2 - buttonWidth / 2;
        int y = height / 2 - (buttonHeight * 2 + buttonSpacing) / 2;
        playAdventureButton = new Button(this, x, y + buttonHeight + buttonSpacing, buttonWidth + (2 * buttonHeight), buttonHeight, "Adventure", this::playAdventure);
        playVersusButton = new Button(this, x, y + (2 * (buttonHeight + buttonSpacing)), buttonWidth + (2 * buttonHeight), buttonHeight, "Versus", this::playVersus);
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
        background(0); // Set background color
        playAdventureButton.draw();
        playVersusButton.draw();
        fill(255);
        textAlign(CENTER, CENTER);
        textSize(24);
        text("Game Menu", width / 2, height / 2);
    }

    @Override
    public void mouseClicked() {
        playAdventureButton.checkClick(mouseX, mouseY);
        playVersusButton.checkClick(mouseX, mouseY);
    }
}
