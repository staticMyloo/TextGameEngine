package wieldables;

public abstract class Wieldable {

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
