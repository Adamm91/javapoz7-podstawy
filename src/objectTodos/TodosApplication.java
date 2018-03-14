package objectTodos;

import java.security.acl.Owner;
import java.util.Arrays;
import java.util.Scanner;

public class TodosApplication {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int answer;
        ObjectTodos[] listTodos = new ObjectTodos[10];

        do {
            TodosView.menuView();
            answer = scanner.nextInt();
            scanner.nextLine();
            switch (answer) {
                case 1:
                    TodosView.showView();
                    list(listTodos);
                    break;
                case 2:
                    TodosView.addView();
                    addTodos(scanner, listTodos);
                    break;
                case 3:
                    TodosView.deleteView();
                    break;
            }
        } while (answer != 0);



    }

    public static ObjectTodos addTodos (Scanner scanner, Object[] objects) {
        ObjectTodos todo = new ObjectTodos();

        System.out.println("What to do...");
        todo.todo = scanner.nextLine();

        System.out.println("Status");
        todo.status = scanner.nextLine();
        System.out.println("Date (dd-mm-yyyy)");
        todo.date = scanner.nextLine();
        System.out.println("First name");
        todo.firstName = scanner.nextLine();
        System.out.println("Last name");
        todo.lastName = scanner.nextLine();
        return todo;
    }

    public static void list (Object[] objects) {
        for (int i = 0; i < objects.length; i++) {
            if (objects[i] != null)
            System.out.println((i + 1) + ". " + String.valueOf(objects[i]));
        }
    }


}
