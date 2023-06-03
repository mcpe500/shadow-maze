package shadowmaze2.levels;

import processing.core.PApplet;
import shadowmaze2.utils.*;
import shadowmaze2.character.Player;
import shadowmaze2.character.PlayerController;
import shadowmaze2.map.*;

public class Level1 extends PApplet {

    private int width;
    private int height;
    private int frame;
    private int[][] map;
    private Block[][] textureMap;
    private Player player;
    private PlayerController playerController;

    public Level1(int w, int h, int f) {
        width = w;
        height = h;
        frame = f;
        ReadMap rm = new ReadMap("./src/assets/map.json");
        map = rm.getMap();
        player = new Player(10, 10, 50, 100, 0, 0, 0, 32);
        playerController = new PlayerController(this, player, 5);
    }

    @Override
    public void settings() {
        size(width, height);
    }

    @Override
    public void setup() {
        frameRate(frame);
        textureMap = Block.intMapToTextureMap(map, this, 32, 100, 100);
    }

    @Override
    public void draw() {
        background(0);
        player.display(this);
        playerController.handleInput();
        
        for (int i = 0; i < textureMap.length; i++) {
            for (int j = 0; j < textureMap[i].length; j++) {
                if (textureMap[i][j] != null) {
                    textureMap[i][j].draw();
                }
            }
        }
    }
}
