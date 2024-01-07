
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class BooksFromFile {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // test your method here

    }
    public static List<Book> readBooks(String file) {
        List<Book> books = new ArrayList();
        try {
            Files.lines(Paths.get(file))
                    .map((line) -> line.split(","))
                    .filter(tokens -> tokens.length >= 4)
                    .map(tokens -> new Book(tokens[0], Integer.valueOf(tokens[1]), Integer.valueOf(tokens[2]),tokens[3]))
                    .forEach(book -> books.add(book));
        } catch(Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
        return books;
    }

}
