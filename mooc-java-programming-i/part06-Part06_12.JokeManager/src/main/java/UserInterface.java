
import java.util.Random;
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
    private JokeManager manager;
    private Scanner sc;

    public UserInterface(JokeManager manager, Scanner sc) {
        this.manager = manager;
        this.sc = sc;
    }
    
    public void start() {
        while (true) {
            System.out.println("Commands:");
            System.out.println(" 1 - add a joke");
            System.out.println(" 2 - draw a joke");
            System.out.println(" 3 - list jokes");
            System.out.println(" X - stop");
            String command = sc.nextLine();
            if (command.equals("X")) {
                break;
            }
            if (command.equals("1")) {
                System.out.println("Write the joke to be added:");
                String joke = sc.nextLine();
                manager.addJoke(joke);
            } else if (command.equals("2")) {
                System.out.println("Drawing a joke.");
                String joke = manager.drawJoke();

                
                System.out.println(joke);
            } else if (command.equals("3")) {
                System.out.println("Printing the jokes.");
                manager.printJokes();
            }
        }
    }
}
