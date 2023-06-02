package shadowmaze2.menu;

import shadowmaze2.utils.Button;
import processing.core.PApplet;

public class MainMenu extends PApplet {
    
    private Button settingButton;
    private SettingMenu settingMenu;
    private Button playGameButton;
    private GameMenu playGameMenu;
    private int width;
    private int height;
    private int frame;
    
    public MainMenu(int w, int h, int f) {
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
//        background(loadImage("./src/assets/texture/background_maze.png"));
        int buttonWidth = 200;
        int buttonHeight = 100;
        int buttonSpacing = 20;
        int x = width / 2 - buttonWidth / 2;
        int y = height / 2 - (buttonHeight * 2 + buttonSpacing) / 2;
        settingButton = new Button(this, x, y, buttonWidth, buttonHeight, "Settings", this::changeToSetting, loadImage("./src/assets/texture/settings_button.png"));
        playGameButton = new Button(this, x, y + buttonHeight + buttonSpacing, buttonWidth, buttonHeight, "Start", this::changeToPlay, loadImage("./src/assets/texture/start_button.png"));
    }
    
    public void changeToSetting() {
        settingMenu = new SettingMenu(width, height, frame);
        PApplet.runSketch(new String[]{"SettingMenu"}, settingMenu);
        surface.setVisible(false); // Hide the current MainMenu window
    }
    
    public void changeToPlay() {
        playGameMenu = new GameMenu(width, height, frame);
        PApplet.runSketch(new String[]{"GameMenu"}, playGameMenu);
        surface.setVisible(false); // Hide the current MainMenu window
    }
    
    @Override
    public void draw() {
        background(0); // Set background color
        settingButton.draw();
        playGameButton.draw();
        fill(255);
        textAlign(CENTER, CENTER);
        textSize(24);
//        text("Hello, World!", width / 2, height / 2);
    }
    
    @Override
    public void mouseClicked() {
        settingButton.checkClick(mouseX, mouseY);
        playGameButton.checkClick(mouseX, mouseY);
    }
}
