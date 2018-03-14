package monsters;

public class StrategicGame {
    public static void main(String[] args) {
        Monster[] teamA = {new Troll("abc", 5), new Troll("def", 2)};
        Monster[] teamB = {new Ghoul("a", 2),
                           new Ghoul("b", 3),
                           new Ghoul("c", 2)
        };

        showArmy(teamA);
        showArmy(teamB);
    }

    public static void showArmy (Monster[] monsters) {
        System.out.println("Army has " + monsters.length + " units");
        System.out.println("Army has " + computeArmyPower(monsters) + " power in total");
    }

    private static int computeArmyPower(Monster[] monsters) {
        int sum = 0;
        for (int i = 0; i < monsters.length; i++) {
            sum += monsters[i].attack();
        }
        return sum;
    }
}
