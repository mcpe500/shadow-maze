package shadowmaze2.utils;

import processing.core.PImage;

public class Karakters {

    private int healthPoint;
    private int score;
    private int posX;
    private int posY;
    private PImage texture;

    public Karakters(int healthPoint, int score, int posX, int posY) {
        this.healthPoint = healthPoint;
        this.score = score;
        this.posX = posX;
        this.posY = posY;
    }

    // Getter dan setter untuk atribut-atribut di atas
    public void moveUp() {
        // Logika pergerakan ke atas
        this.posY -= 1;
    }

    public void moveDown() {
        // Logika pergerakan ke bawah
        this.posY += 1;
    }

    public void moveLeft() {
        // Logika pergerakan ke kiri
        this.posX -= 1;
    }

    public void moveRight() {
        // Logika pergerakan ke kanan
        this.posX += 1;
    }

    public void decreaseHealth(int amount) {
        // Mengurangi health point karakter
        this.healthPoint -= amount;
    }

    public void increaseScore(int amount) {
        // Menambah skor karakter
        this.score += amount;
    }
}
