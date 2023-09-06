package structure;

import structure.Consumable;

public abstract class Food extends Consumable {

    private final int restoreHp;
    public Food(String description, int restoreHp) {
        super(description);
        this.restoreHp = restoreHp;
    }

    public int getRestoreHp() {
        return restoreHp;
    }
}
