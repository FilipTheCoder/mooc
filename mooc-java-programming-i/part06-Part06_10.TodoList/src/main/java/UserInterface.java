
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
        this.list = list;
        this.sc = sc;
    }
    
    public void start() {
        while(true) {
            System.out.println("Command:");
            String command = sc.nextLine();
            if(command.equals("stop")) {
                break;
            }
            else if(command.equals("add")) {
                System.out.println("To add:");
                String task = sc.nextLine();
                list.add(task);
            }
            else if(command.equals("remove")) {
                System.out.println("Which one is removed?");
                int id = sc.nextInt();
                list.remove(id);
            }
            else if(command.equals("list")) {
                list.print();
            }
            else {
                System.out.println("unknown command");
            }
            
        }
    }
}
