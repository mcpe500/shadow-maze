package shadowmaze2.character;

import shadowmaze2.items.*;

public class Player {
    private int posX;
    private int posY;
    private int hp;
    private PortalGun portalgun;
    private Flashlight flashlight;
    
    public Player(int posX, int posY) {
        this.posX = posX;
        this.posY = posY;
        this.hp = 100;
    }

    public void moveUp() {
        this.posY--;
    }

    public void moveDown() {
        this.posY++;
    }

    public void moveRight() {
        this.posX++;
    }

    public void moveLeft() {
        this.posX--;
    }

    public void addPortalGun() {
        this.portalgun = new PortalGun();
    }

    public void addFlashLight() {
        this.flashlight = new Flashlight();
    }
}
