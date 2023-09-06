package structure;

public class Valuable extends Consumable {

    private final int value;
    public Valuable(String description, int value) {
        super(description);
        this.value = value;
    }

    protected int getValue() {
        return value;
    }
}

