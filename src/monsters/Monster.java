package monsters;

public abstract class Monster {

    private final int hp;
    private final int ap;

    protected Monster(int hp, int ap) {
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
