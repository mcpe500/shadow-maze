package shadowmaze2.menu;

import shadowmaze2.utils.Button;
import processing.core.PApplet;

public class MainMenu extends PApplet {

    private Button settingButton;
    private SettingMenu settingMenu;
    private Button playGameButton;
    private SettingMenu playGameMenu;
    private int width;
    private int height;

    @Override
    public void settings() {
        size(width, height);
    }

    public MainMenu(int w, int h) {
        width = w;
        height = h;
    }

    @Override
    public void setup() {
        // Create the buttons
        int buttonWidth = 200;
        int buttonHeight = 50;
        int buttonSpacing = 20;
        int x = width / 2 - buttonWidth / 2;
        int y = height / 2 - (buttonHeight * 2 + buttonSpacing) / 2;
        settingButton = new Button(this, x, y, buttonWidth, buttonHeight, "Settings", this::changeToSetting);
        playGameButton = new Button(this, x, y, buttonWidth + (2 * buttonHeight), buttonHeight, "Start", this::changeToPlay);
    }

    public void changeToSetting() {
        settingMenu = new SettingMenu(width, height);
        PApplet.runSketch(new String[]{"SettingMenu"}, settingMenu);
        surface.setVisible(false); // Hide the current MainMenu window
    }


    public void changeToPlay() {
        settingMenu = new SettingMenu(width, height);
        PApplet.runSketch(new String[]{"SettingMenu"}, settingMenu);
        surface.setVisible(false); // Hide the current MainMenu window
    }

    @Override
    public void draw() {
        background(0); // Set background color
        settingButton.draw();
        fill(255);
        text("Hello, World!", width / 2, height / 2);
    }

    @Override
    public void mouseClicked() {
        settingButton.checkClick(mouseX, mouseY);
    }
}
