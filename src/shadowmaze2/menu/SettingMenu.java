package shadowmaze2.menu;

import processing.core.PApplet;

public class SettingMenu extends PApplet {

    private int width;
    private int height;

    @Override
    public void settings() {
        size(width, height);
    }

    public SettingMenu(int w, int h) {
        width = w;
        height = h;
    }

    @Override
    public void setup() {
        // Add your setup code for the SettingMenu
    }
    
    public void back(){
        
    }

    @Override
    public void draw() {
        background(255); // Set background color for the SettingMenu
        fill(0);
        text("Setting Menu", width / 2, height / 2);
    }
}
