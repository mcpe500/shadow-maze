package shadowmaze2.character;

import shadowmaze2.items.*;

public class Player {
    private float x; // Player position x-coordinate
    private float y; // Player position y-coordinate
    private float speed; // Player speed

    public Player(float startX, float startY, float playerSpeed) {
        x = startX;
        y = startY;
        speed = playerSpeed;
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
