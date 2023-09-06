package structure;
import structure.Entity;

public abstract class Pickup extends Entity {

    public Pickup(String description) {
        super(description);
    }

    @Override
    protected boolean compareID(String s) {
        return super.compareID(s);
    }
}
