package structure;

import structure.Pickup;

public class Openable extends Pickup {

    private boolean isLocked = true;
    public Openable(String description) {
        super(description);
        this.isLocked = determineLock();
    }

    private boolean determineLock() {
        int chance = randomBehaviour(0,1);
        return chance != 0;
    }

    public boolean getIsLocked() {
        return this.isLocked;
    }

    @Override
    public String toString() {
        return "["+getDescription()+"]";
    }

}
