package structure;

public class Player extends Character
{
    private String name;
    private int confidence;
    private Wieldable currentWeapon;
    private Inventory inventory;

    public Player(String description, int hp) {
        super(description, hp);
    }

    public Player(String name, int hp, int confidence) {
        super("Player", hp);
        this.name = name;
        this.setConfidence(confidence);
    }

    @Override
    public int dealAttackDamage() {
        return 0;
    }

    @Override
    public int defendAttack(Character enemy) {
        return 0;
    }

    public int getConfidence() {
        return confidence;
    }

    public void setConfidence(int confidence) {
        this.confidence = confidence;
    }

    public String getName() {
        return name;
    }
}
