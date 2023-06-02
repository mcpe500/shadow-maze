package shadowmaze2.utils;

import processing.core.PApplet;

public class PlayerController {

    private PApplet parent;
    private Player player;
    private float speed;

    public PlayerController(PApplet parent, Player player, float speed) {
        this.parent = parent;
        this.player = player;
        this.speed = speed;
    }

    public void handleInput() {
        if (parent.keyPressed) {
            if (parent.key == 'w' || parent.key == 'W') {
                player.move(0, -speed);
            } else if (parent.key == 's' || parent.key == 'S') {
                player.move(0, speed);
            } else if (parent.key == 'a' || parent.key == 'A') {
                player.move(-speed, 0);
            } else if (parent.key == 'd' || parent.key == 'D') {
                player.move(speed, 0);
            }
        }
    }
}
