package entity.character.monsters;

import entity.character.Character;

public abstract class Monster extends Character {

    private final int hp;
    private final int ap;

    protected Monster(String description, int hp, int ap) {
        super(description);
        this.hp = hp;
        this.ap = ap;
    }

    public int getAp() {
        return ap;
    }

    public int getHp() {
        return hp;
    }
}
