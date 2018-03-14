import java.util.Scanner;

public class tree {
    public static void main(String[] args) {



    }

    public static void tree () {
        Scanner scanner = new Scanner(System.in);
        StringBuilder tree = new StringBuilder();
        System.out.println("Insert max value of the tree");
        int height = scanner.nextInt();
        for (int i = 0; i < height; i++) {
            for (int j = 0; j < height - i; j++) {
                tree.append(" ");
            }
        }
  }
    }




