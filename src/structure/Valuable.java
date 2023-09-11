package structure;

public class Valuable extends Consumable {

    private final int value;
    private boolean hasAdmired;
    public Valuable(String description, int value) {
        super(description);
        this.value = value;
        this.hasAdmired = false;
    }

    public int getValue() {
        return value;
    }

    public boolean isHasAdmired() {
        return hasAdmired;
    }

    public void setHasAdmired(boolean b) {
        this.hasAdmired = b;
    }
}

