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
    
    public static Block[][] intMapToTextureMap(int[][] intMap){
        Block[][] blockMap = new Block[intMap.length][intMap[0].length];
        for (int i = 0; i < blockMap.length; i++) {
            for (int j = 0; j < blockMap[i].length; j++) {
                
            }
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

    public void draw(PApplet parent) {
        // Implement the drawing logic for the block
    }
}
