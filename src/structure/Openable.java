package structure;

import structure.Pickup;

import java.util.ArrayList;
import java.util.List;

public class Openable extends Pickup {

    private boolean isLocked = true;
    private ArrayList<Pickup> chestItems;
    public Openable(String description) {
        super(description);
        this.isLocked = determineLock();
    }

    public Openable(String description, Pickup[] items) {
        super(description);
        this.isLocked = determineLock();
        this.chestItems = new ArrayList<>(List.of(items));
    }

    public Openable(String description, Pickup item) {
        super(description);
        this.chestItems = new ArrayList<>();
        this.isLocked = determineLock();
        chestItems.add(item);
    }

    public ArrayList<Pickup> getChestItems() {
        return this.chestItems;
    }
    private boolean determineLock() {
        int chance = randomBehaviour(0,1);
        return chance != 0;
    }

    public boolean getIsLocked() {
        return this.isLocked;
    }


}
