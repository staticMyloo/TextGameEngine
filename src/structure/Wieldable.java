package structure;

public abstract class Wieldable extends Pickup {

    private int low;
    private int high;

    public Wieldable(String description, int low, int high) {
        super(description);
        this.low = low;
        this.high = high;

    }

    protected int hit() {
        return randomBehaviour(low, high);
    }


}
