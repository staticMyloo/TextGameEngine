package entity;

import java.util.Random;

public abstract class Entity {

    private final String id;
    private String description;

    public Entity(String description) {
        this.id = this.getClass().getSimpleName();
        this.description = description;
    }

    protected int randomBehaviour(int x, int y) {
        return new Random().nextInt(y - x) + x;
    }

    protected boolean compareID(String s) {
        return s.equals(this.id);
    }

    public String getId() {
        return this.id;
    }
    public void setDescription(String description) {
        this.description = description;
    }

    public String getDescription() {
        return this.description;
    }
}
