package shadowmaze2.map;

import processing.core.PApplet;

public class Block {

    private int size;
    private int x, y;
    private PApplet parent;

    public Block(PApplet parent, int size, int x, int y) {
        this.parent = parent;
        this.size = size;
        this.x = x;
        this.y = y;
    }

    public static Block[][] intMapToTextureMap(int[][] intMap, PApplet bParent, int bSize, int bX, int bY) {
        Block[][] blockMap = new Block[intMap.length][intMap[0].length];
        for (int i = 0; i < intMap.length; i++) {
            for (int j = 0; j < intMap[i].length; j++) {
                if (intMap[i][j] == 0) {
                    blockMap[i][j] = new Floor(bParent, bSize, bX, bY, bParent.loadImage("./src/assets/texture/stonefloor.png"));
                } else if (intMap[i][j] == 1) {
                    blockMap[i][j] = new Wall(bParent, bSize, bX, bY, bParent.loadImage("./src/assets/texture/Wall.png"))
                }
                bX += bSize; // Increment the x position for the next block
            }
            bX = 0; // Reset the x position for the next row
            bY += bSize; // Increment the y position for the next row
        }
        return blockMap;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public PApplet getParent() {
        return parent;
    }

    public void draw() {
        // Implement the drawing logic for the block
    }
}
