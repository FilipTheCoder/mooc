
import java.util.ArrayList;
import java.util.Comparator;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author filip
 */
public class Books {
    private ArrayList<Book> books = new ArrayList();
    
    public void add(Book book) {
        books.add(book);
    }
    public int size() {
        return books.size();
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        for (Book book : books) {
            builder.append(book).append('\n');
            
        }
        return builder.toString();
    }
    public void sort() {
        Comparator<Book> comparator = Comparator
              .comparing(Book::getAge)
              .thenComparing(Book::getName);
        books.sort(comparator);
              
    }
    
    
}
