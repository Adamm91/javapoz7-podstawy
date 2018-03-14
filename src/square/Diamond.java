package square;

public class Diamond implements Shape{

    private int a;

    public Diamond(int a) {
        this.a = a;
    }

    @Override
    public int field() {
        return 0;
    }

    @Override
    public int circuit() {
        return 4 * a;
    }

    @Override
    public double diagonal() {
        return 0;
    }

    @Override
    public String toString() {
        return "Diamond{" +
                "a=" + a +
                '}';
    }

    public String getName() {
        return "Diamond";
    }
}
