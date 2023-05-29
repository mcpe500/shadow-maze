package shadowmaze2.items;
import shadowmaze2.character.*;

public class PortalGun {
    private int energy;
    private Portal portal1;
    private Portal portal2;

    public PortalGun() {
        this.energy = 100;
        this.portal1 = null;
        this.portal2 = null;
    }

    public boolean setPortal(int posX, int posY) {
        if (this.energy>=20) {
            if (portal1 == null || (portal1 != null && portal2 != null)) {
                portal1 = new Portal(posX, posY);
                return true;
            } else if (portal2 == null) {
                portal2 = new Portal(posX, posY);
                return true;
            }
            return false;
        }
        return false;
    }

    public void refill() {
        this.energy+=20;
        if (this.energy>100) this.energy = 100;
    }
}
