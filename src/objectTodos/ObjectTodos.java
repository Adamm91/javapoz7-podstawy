package objectTodos;

import java.util.Scanner;

public class ObjectTodos {

    String todo;
    String status;
    String date;
    String firstName;
    String lastName;

    public String getTodo() {
        return todo;
    }

    public void setTodo(String todo) {
        this.todo = todo;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    @Override
    public String toString() {
        return "ObjectTodos{" +
                "todo='" + todo + '\'' +
                ", status='" + status + '\'' +
                ", date='" + date + '\'' +
                ", owner='" + firstName + " " + lastName + '\'' +
                '}';
    }


}
