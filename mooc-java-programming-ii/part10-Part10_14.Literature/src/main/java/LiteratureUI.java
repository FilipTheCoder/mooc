
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
public class LiteratureUI {
    private Books books = new Books();
    private Scanner sc = new Scanner(System.in);
    
    public void start() {
        while(true) {
            System.out.println("Input the name of the book, empty stops:");
            String name = sc.nextLine();
            if(name.isEmpty()) {
                break;
            }
            System.out.println("Input the age recommendation: ");
            int age = Integer.valueOf(sc.nextLine());
            Book b = new Book(name,age);
            books.add(b);
        }
        
        System.out.println(books.size() + " books in total.");
        books.sort();
        
        System.out.println("Books:");
        System.out.println(books);
    }
}
