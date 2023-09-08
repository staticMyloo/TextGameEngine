package structure;

import java.util.Random;
public abstract class Monster extends Character {

    private final int ap;
    private final int spawnChance;

    protected Monster(String description, int hp, int ap, int spawnChance) {
        super(description, hp);
        this.ap = ap;
        this.spawnChance = spawnChance;
    }

    public int getAp() {
        return ap;
    }

    public boolean appear() {
        int spawnThreshold = new Random().nextInt(1,100);
        return spawnChance > spawnThreshold;
    }
    @Override
    public int dealAttackDamage() {
        return ap + randomBehaviour(1,10);
    }

    @Override
    public int defendAttack(Character enemy) {
        int d = enemy.dealAttackDamage();
        setHp(getHp() - d);
        return d;
    }

    @Override
    public String toString() {
        return getDescription() + " Hp:" + getHp() + " Ap:"+ap;
    }
}
