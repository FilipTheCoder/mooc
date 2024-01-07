
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
public class TextUI {
    private Scanner sc;
    private SimpleDictionary dict;

    public TextUI(Scanner sc, SimpleDictionary dict) {
        this.sc = sc;
        this.dict = dict;
    }
     public void start() {
         while (true) {
             System.out.println("Command: ");
             String command = sc.nextLine();
             if(command.equals("end")) {
                 System.out.println("Bye bye!");
                 break;
             } 
             else if(command.equals("add")) {
                 add();
             }
             else if(command.equals("search")) {
                 search();
             }
             
             else {
                 System.out.println("Unknown command");
             }
         }
     }
     
     
     public void add() {
         System.out.println("Word:");
         String word = sc.nextLine();
         System.out.println("Translation:");
         String translation = sc.nextLine();
         dict.add(word, translation);
     }
     public void search() {
         System.out.println("To be translated:");
         String word = sc.nextLine();
         String translation = dict.translate(word);
         if(translation != null) {
             System.out.println("Translation: " + translation);
             return;
         }
         System.out.println("Word " + word + " was not found");
         
     }
}
