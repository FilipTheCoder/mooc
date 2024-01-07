package application;

import java.sql.SQLException;
import java.util.List;
import java.util.Scanner;

public class UserInterface {

    private Scanner scanner;
    private TodoDao database;

    public UserInterface(Scanner scanner, TodoDao database) {
        this.scanner = scanner;
        this.database = database;
    }

    public void start() throws SQLException {
        boolean quit = false;
        while (!quit) {
            System.out.println("");
            System.out.println("Enter command:");
            System.out.println("1) list");
            System.out.println("2) add");
            System.out.println("3) mark as done");
            System.out.println("4) remove");
            System.out.println("x) quit");

            System.out.print("> ");
            String command = this.scanner.nextLine();

            switch (command) {
                case "1":
                    listTodos();
                    break;
                case "2":
                    addTodo();
                    break;

                case "3":
                    markDone();
                    break;
                case "4":
                    removeTodo();
                    break;
                case "x":
                    quit = true;
                    System.out.println("Thank you!");
                    break;
            }

            // implement the functionality here
        }

        System.out.println("Thank you!");
    }

    private void listTodos() throws SQLException {
        System.out.println("Listing the database contents");
        List<Todo> todos = this.database.list();
        todos.forEach(todo -> System.out.println(todo));
    }

    private void addTodo() throws SQLException {
        System.out.println("Adding a new todo");
        System.out.println("Enter name");
        String name = scanner.nextLine();
        System.out.println("Enter description");
        String description = scanner.nextLine();
        Todo todo = new Todo(name, description, false);
        database.add(todo);

    }

    private void markDone() throws SQLException {
        System.out.println("Which todo should be marked as done (give the id)?");
        int id = Integer.valueOf(scanner.nextLine());
        database.markAsDone(id);
    }

    private void removeTodo() throws SQLException {
        System.out.println("Which todo should be removed (give the id)?");
        int id = Integer.valueOf(scanner.nextLine());
        database.remove(id);
    }

}
