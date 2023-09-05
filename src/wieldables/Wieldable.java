package wieldables;

import pickups.Pickup;

public abstract class Wieldable extends Pickup {

    private int ap;
    private int durability;

    public Wieldable(int ap, int durability) {
        this.ap = ap;
        this.durability = durability;
    }

    public int getAp() {
        return ap;
    }

    public int getDurability() {
        return durability;
    }

}
