
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;

public class LiteracyComparison {
    
    public static void main(String[] args) {
        try {
            Files.lines(Paths.get("literacy.csv"))
                    .map(line -> Literacy.parseLine(line))
                    .sorted()
                    .forEach(l -> System.out.println(l));
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
