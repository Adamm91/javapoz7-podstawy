package monsters;

public class Ghoul implements Monster{

    private static int DEFAULT_ATTACK;
    private String name;
    private double power;
    private int health;

    public Ghoul(String name, double power) {
        this.name = name;
        this.power = power;
    }

    @Override
    public int attack() {
        return 5;
    }

    @Override
    public int defence() {
        return 10;
    }

    @Override
    public int getHealth() {
        return 70;
    }

    @Override
    public boolean isAlive() {
        return health > - 30;
    }
}
