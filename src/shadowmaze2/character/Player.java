package shadowmaze2.character;

import shadowmaze2.utils.Karakters;

public class Player extends Karakters {

    private float x; // Player position x-coordinate
    private float y; // Player position y-coordinate
    private float speed; // Player speed

    public Player(float x, float y, float speed, int healthPoint, int score, int posX, int posY) {
        super(healthPoint, score, posX, posY);
        this.x = x;
        this.y = y;
        this.speed = speed;
    }

    public void move(float dx, float dy) {
        x += dx;
        y += dy;
    }

    public void display() {
        // Draw the player on the screen
        // Example: ellipse(x, y, playerSize, playerSize);

    }

    // Getter methods for accessing player position
    public float getX() {
        return x;
    }

    public float getY() {
        return y;
    }
}
