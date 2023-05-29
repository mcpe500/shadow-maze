package shadowmaze2.character;

public class Portal {
    private int posX;
    private int posY;

    public Portal(int posX, int posY) {
        this.posX = posX;
        this.posY = posY;
    }

    public int getPosX() {
        return this.posX;
    }

    public int getPosY() {
        return this.posY;
    }
}
