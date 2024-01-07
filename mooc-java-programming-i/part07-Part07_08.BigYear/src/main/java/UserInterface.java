
import java.util.ArrayList;
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
    private final ArrayList<Observation> obseravations = new ArrayList();


    private final Scanner sc;
    private boolean stop = false;

    public UserInterface(Scanner sc) {
        this.sc = sc;
    }
    
    public void start() {
        while(!stop) {
            System.out.println(">");
            String command = sc.nextLine();
            executeCommand(command);
        }
    }

    private void executeCommand(String command) {
        switch (command) {
            case "Add":
                addBird();
                break;
            case "Observation":
                addObservation();
                break;
            case "All":
                listAll();
                break;
            case "One":
                listOne();
                break;
            case "Quit":
                this.stop = true;
                break;
            default:
                System.out.println("Unsupported command!");
                break;
            
        }
    }

    private void addBird() {
        System.out.println("Name: ");
        String name = sc.nextLine();
        System.out.println("Name in Latin: ");
        String latinName = sc.nextLine();
        
        this.obseravations.add(new Observation(new Bird(name, latinName)));
        
        
    }

    private void addObservation() {
        System.out.println("Bird? ");
        String name = sc.nextLine();
        
        for(Observation o : this.obseravations) {
            if(o.getBird().getName().equals(name)) {
                o.observed();
                return;
            }
        }
        System.out.println("Not a bird!");
    }

    private void listAll() {
        for(Observation o : this.obseravations) {
            System.out.println(o);
        }
    }

    private void listOne() {
        
        System.out.println("Bird? ");
        String name = sc.nextLine();
        
        for(Observation o : this.obseravations) {
            if(o.getBird().getName().equals(name)) {
                System.out.println(o);
                return;
            }
        }
        System.out.println("Not a bird!");
    }
    
}
