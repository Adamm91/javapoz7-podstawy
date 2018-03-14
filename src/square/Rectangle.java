package square;

public class Rectangle implements Shape {
    private int a;
    private int b;

    public Rectangle(int a, int b) {
        this.a = a;
        this.b = b;
    }

    public int circuit () {
        return a * 2 + b * 2;
    }

    public int field () {
        return a * b;
    }

    public double diagonal () {
        return Math.sqrt(a*a + b*b);
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "a=" + a +
                ", b=" + b +
                '}';
    }

    public String getName() {
        return "Rectangle";
    }
}
