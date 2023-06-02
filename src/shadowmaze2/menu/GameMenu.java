package shadowmaze2.menu;

import processing.core.PApplet;
import shadowmaze2.game.AdventureGameMenu;
import shadowmaze2.utils.Button;

public class GameMenu extends PApplet {

    private Button settingButton;
    private AdventureGameMenu adventureMenu;
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
        int buttonHeight = 108;
        int buttonSpacing = 20;
        int x = width / 2 - buttonWidth / 2;
        int y = height / 2 - (buttonHeight * 2 + buttonSpacing) / 2;
        playAdventureButton = new Button(this, x, y + buttonHeight + buttonSpacing, buttonWidth, buttonHeight, "Adventure", this::playAdventure, loadImage("./src/assets/texture/adventure_button.png"));
        playVersusButton = new Button(this, x, y + (2 * (buttonHeight + buttonSpacing)), buttonWidth, buttonHeight, "", this::playVersus, loadImage("./src/assets/texture/versus_button.png"));
    }

    public void playAdventure() {
        adventureMenu = new AdventureGameMenu(width, height, frame);
        PApplet.runSketch(new String[]{"GameMenu"}, adventureMenu);
        surface.setVisible(false); // Hide the current MainMenu window
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
