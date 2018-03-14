package monsters;

public class Dragon implements Monster {


    private int attack;
    private int defence;
    private int health;

    public Dragon(int attack, int defence, int health) {
        this.attack = attack;
        this.defence = defence;
        this.health = health;
    }

    @Override
    public int attack() {
        return 30;
    }

    @Override
    public int defence() {
        return 50;
    }

    @Override
    public int getHealth() {
        return health;
    }

    @Override
    public boolean isAlive() {
        return getHealth() > 0;
    }
}
