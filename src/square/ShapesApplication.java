package square;

public class ShapesApplication {
    public static void main(String[] args) {
        Square square = new Square(4);
        Square square2 = new Square(8);
        Square square3 = new Square(2);
        Square[] squares = {square, square2, square3};
        // Square[] squares = {new Square(4), new Square2(8), new Square3(2)};

        Rectangle rectangle = new Rectangle(2, 4);
        Rectangle rectangle2 = new Rectangle(5, 8);
        Rectangle rectangle3 = new Rectangle(3, 6);

        Rectangle[] rectangles = {rectangle, rectangle2, rectangle3};


        Shape newSquare = new Square(5);
        Shape[] shapes = {new Square(4), new Rectangle(3, 2)};

        showShapes(shapes);
        showShapes(squares);

    }

    private static void showShapes (Shape[] shapes) {
        for (int i = 0; i < shapes.length; i++) {
            System.out.println("Name: " + shapes[i].getName());
            System.out.println(shapes);
            System.out.println("Field = " + shapes[i].field());
            System.out.println("Circuit = " + shapes[i].circuit());
            System.out.println("Diagonal = " + shapes[i].diagonal());
        }
    }

//    public static void showSquare(Square square) {
//        System.out.println();
//        System.out.println("Field = " + square.field());
//        System.out.println("Circuit = " + square.circuit());
//        System.out.println("Diagonal = " + square.diagonal());
//    }
//
//    public static void showSquares(Square[] squares) {
//        for (int i = 0; i < squares.length; i++) {
//            showSquare(squares[i]);
//        }
//    }
//
//    public static void showRectangle(Rectangle rectangle) {
//        System.out.println("Field = " + rectangle.field());
//        System.out.println("Circuit = " + rectangle.circuit());
//        System.out.println("Diagonal = " + rectangle.diagonal());
//    }
//
//    public static void showRectangles(Rectangle[] rectangles) {
//        for (int i = 0; i < rectangles.length; i++) {
//            showRectangle(rectangles[i]);
//        }
//    }
}
