package shadowmaze2.character;

import processing.core.PApplet;
import shadowmaze2.utils.Karakters;

public class Player extends Karakters {

    private float x; // Player position x-coordinate
    private float y; // Player position y-coordinate
    private float speed; // Player speed
    private float playerSize; // Size of the player square

    public Player(float x, float y, float speed, int healthPoint, int score, int posX, int posY, float playerSize) {
        super(healthPoint, score, posX, posY);
        this.x = x;
        this.y = y;
        this.speed = speed;
        this.playerSize = playerSize;
    }

    public void move(float dx, float dy) {
        x += dx;
        y += dy;
    }

    public void display(PApplet parent) {
        // Draw the player square on the screen
        parent.rect(x, y, playerSize, playerSize);
    }

    // Getter methods for accessing player position
    public float getX() {
        return x;
    }

    public float getY() {
        return y;
    }
}
