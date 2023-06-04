package shadowmaze2.character;

import javax.naming.PartialResultException;

import processing.core.PApplet;

public class PlayerController extends PApplet {

    private PApplet parent;
    private Player player;
    private float speed;
    private float dx;
    private float dy;
    private boolean allowOppositeMovement;
    private long lastKeyPressTime;
    private boolean pressed;

    private static final long OPPOSITE_MOVEMENT_DELAY = 1000; // Adjust the delay as needed

    public PlayerController(PApplet parent, Player player, float speed) {
        this.parent = parent;
        this.player = player;
        this.speed = speed;
        this.dx = 0;
        this.dy = 0;
        this.allowOppositeMovement = true;
        this.lastKeyPressTime = 0;
        this.pressed = false;
    }

    // public void handleInput() {
    //     dx = 0;
    //     dy = 0;

    //     if (parent.keyPressed && !pressed) {
    //         if (parent.key == 'w' || parent.key == 'W') {
    //             dy = -speed;
    //         } else if (parent.key == 's' || parent.key == 'S') {
    //             dy = speed;
    //         }
            
    //         if (parent.key == 'a' || parent.key == 'A') {
    //             dx = -speed;
    //         } else if (parent.key == 'd' || parent.key == 'D') {
    //             dx = speed;
    //         }
    //         pressed = true;
    //         player.move(dx, dy);
    //     }

    //     if (!parent.keyPressed && pressed) {
    //         pressed = false;
    //     }
    // }
// public void handleInput() {
//     dx = 0;
//     dy = 0;

//     if (parent.keyPressed && !pressed) {
//         if (parent.key == 'w' || parent.key == 'W') {
//             dy = -speed * Math.sin(Math.atan2(cameraHeight / zoomFactor, mouseX - x));
//             dy += speed * Math.cos(Math.atan2(y + playerSize/2 - y, mouseWidth/zoomFactor - x - width/2)) / 4;
//         } else if (parent.key == 's' || parent.key == 'S') {
//             dy = speed * Math.sin(Math.atan2(cameraHeight / zoomFactor, mouseX - x));
//             dy -= speed * Math.cos(Math.atan2(y + playerSize/2 - y, mouseWidth/zoomFactor - x - width/2)) / 4;
//         }
        
//         if (parent.key == 'a' || parent.key == 'A') {
//             dx = -speed * Math.sin(Math.atan2(mouseHeight / zoomFactor, x - mouseX)) + 3;
//             dx -= speed * Math.cos(Math.atan2((height/2)-cameraHeight/zoomFactor, (width/2)+mouseWidth/zoomFactor-(x+width)/2)) / 4;
//         } else if (parent.key == 'd' || parent.key == 'D') {
//             dx = speed * Math.sin(Math.atan2(mouseHeight / zoomFactor, x - mouseX)) - 3;
//             dx += speed * Math.cos(Math.atan2((height/2)-cameraHeight/zoomFactor, (width/2)+mouseWidth/zoomFactor-(x+width)/2)) / 4;
//         }
//         pressed = true;
//         player.move(dx, dy);
//     }

//     if (!parent.keyPressed && pressed) {
//         pressed = false;
//     }
// }
    // public void handleInput() {
    //     dx = 0;
    //     dy = 0;

    //     if (parent.keyPressed) {
    //         long currentTime = System.currentTimeMillis();
    //         long elapsedTimeSinceLastKeyPress = currentTime - lastKeyPressTime;

    //         if (allowOppositeMovement || elapsedTimeSinceLastKeyPress >= OPPOSITE_MOVEMENT_DELAY) {
    //             if (parent.key == 'w' || parent.key == 'W') {
    //                 dy = -speed;
    //             } else if (parent.key == 's' || parent.key == 'S') {
    //                 dy = speed;
    //             }

    //             if (parent.key == 'a' || parent.key == 'A') {
    //                 dx = -speed;
    //             } else if (parent.key == 'd' || parent.key == 'D') {
    //                 dx = speed;
    //                 allowOppositeMovement = false;
    //             }
    //             lastKeyPressTime = currentTime;
    //         }
    //     }
    //     player.move(dx, dy);
    // }
}