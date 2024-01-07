
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author filip
 */
public class UserInterface {
    
    private TodoList list;
    private Scanner sc;

    public UserInterface(TodoList list, Scanner sc) {
        this.sc = sc;
        this.list = list;
    }
    
    public void start() {
        boolean shouldStop = false;
        while(!shouldStop) {
            System.out.println("Command: ");
            String command = sc.nextLine();
            shouldStop = executeCommand(command);
        }
    }
    
    public boolean executeCommand(String command) {
        switch (command) {
            case "stop":
                return true;
            case "add":
                AddTodo();
                break;
            case "remove":
                RemoveTodo();
                break;
            case "list":
                System.out.println(this.list);
                break;
            default:
                System.out.println("Unsupported comand");
                break;
        }
        return false;
    }

    private void AddTodo() {
        System.out.println("To add: ");
        String todo = sc.nextLine();
        list.add(todo);
    }

    private void RemoveTodo() {
        System.out.println("Which one is removed? ");
        int index = sc.nextInt();
        list.remove(index);
    }
    
    
    
    
}
