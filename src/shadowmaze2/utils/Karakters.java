package shadowmaze2.utils;

public class Karakters {

    private int healthPoint;
    private int score;
    private int posX;
    private int posY;

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

    public void usePortalGun() {
        // Logika penggunaan portal gun
    }

    public void useSenter() {
        // Logika penggunaan senter
    }

    public void findHolyGrenade() {
        // Logika pemilihan Holy Grenade
    }
}
