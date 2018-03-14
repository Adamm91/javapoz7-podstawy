package monsters;

public class Troll implements Monster {

    private String name;
    private int bless;
    private int health;

    public Troll(String name, int bless) {
        this.name = name;
        this.bless = bless;
    }

    @Override
    public int attack() {
        return 5 * bless * bless;
    }

    @Override
    public int defence() {
        return bless * 2;
    }

    @Override
    public int getHealth() {
        return health;
    }

    @Override
    public boolean isAlive() {
        return health > 0;
    }
}
