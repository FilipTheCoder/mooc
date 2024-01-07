import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        
        // implement here the program that allows the user to enter 
        // book information and to examine them
        ArrayList<Book> books = new ArrayList();
        Scanner sc = new Scanner(System.in);
        
        while(true) {
            System.out.println("Title: ");
            String title = sc.nextLine();
            if(title.isEmpty()) {
                break;
            }
            System.out.println("Pages: ");
            int pages = Integer.parseInt(sc.nextLine());
            System.out.println("Publication year: ");
            int year = Integer.parseInt(sc.nextLine());
            
            books.add(new Book(title, pages, year));
            
            
        }
        System.out.println("What information will be printed? ");
        String answer = sc.nextLine();
        if(answer.equals("everything")) {
            for(Book book : books)
            {
                System.out.println(book);
            }
        }
        else if(answer.equals("name")) {
            for(Book book : books)
            {
                System.out.println(book.getName());
            }
        }

    }
}
