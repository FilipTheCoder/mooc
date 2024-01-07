
import java.nio.file.Paths;
import java.util.Scanner;

public class RecordsFromAFile {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Name of the file:");
        String fileName = scanner.nextLine();
        try(Scanner fileScanner = new Scanner(Paths.get(fileName))) {
            while(fileScanner.hasNextLine()) {
                 String[] lineTokens = fileScanner.nextLine().split(",");
                 String name = lineTokens[0];
                 int age = Integer.valueOf(lineTokens[1]);
                 if(age == 1) {
                     System.out.println(name + ", age: " + age + " year");
                     continue;
                 }
                 System.out.println(name + ", age: " + age + " years");
            }
        }
        catch (Exception e) {
            System.out.println("Error reading file: " + e.getMessage());
        }
        

    }
}
