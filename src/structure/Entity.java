package structure;

import java.util.Random;

public abstract class Entity {

    private String id;
    private String description;

    public Entity(String description) {
        this.id = this.getClass().getSimpleName();
        this.description = description;
    }

    protected int randomBehaviour(int x, int y) {
        return new Random().nextInt(y - x) + x;
    }

    protected boolean compareID(String s) {
        if(this.id == null) {
            return false;
        }
        return this.id.trim().equalsIgnoreCase(s);
    }

    public String getId() {
        return this.id;
    }
    public void setDescription(String description) {
        this.description = description;
    }

    public void setId(String s) {
        this.id = s;
    }

    public String getDescription() {
        return this.description;
    }
}
