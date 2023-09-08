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
        this.inventory = new Inventory();
    }

    @Override
    public int dealAttackDamage() {
        int damageInstance = currentWeapon.hit();
        return damageInstance + (damageInstance * confidence / 100);
    }

    @Override
    public int defendAttack(Character enemy) {
        int damageInstance = enemy.dealAttackDamage();
        setHp(damageInstance - getHp());
        setConfidence(damageInstance/2);
        return damageInstance;
    }

    public int getConfidence() {
        return confidence;
    }

    public Inventory getInventory() {
        return this.inventory;
    }

    public void setConfidence(int confidence) {
        this.confidence = confidence;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return name + " " + getHp() + " " + getConfidence();
    }

}
