package structure;

public abstract class Character extends Entity {

    private int hp;

    public Character(String description, int hp) {
        super(description);
        this.hp = hp;
    }

    protected abstract int dealAttackDamage();
    public abstract int defendAttack(Character enemy);

    public void setHp(int hp) {
        if(hp < 0) {
            this.hp = 0;
        } else {
        this.hp = hp;
        }
    }

    public int getHp() {
        return this.hp;
    }

}
