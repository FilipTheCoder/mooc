
import java.nio.file.Paths;
import java.util.Scanner;

public class NumbersFromAFile {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("File? ");
        String file = scanner.nextLine();
        System.out.print("Lower bound? ");
        int lowerBound = Integer.valueOf(scanner.nextLine());
        System.out.print("Upper bound? ");
        int upperBound = Integer.valueOf(scanner.nextLine());
        int count = 0;
        try(Scanner fileScanner = new Scanner(Paths.get(file))) {
            while(fileScanner.hasNextLine()) {
                int n = Integer.valueOf(fileScanner.nextLine());
                if(lowerBound <= n && upperBound >= n) {
                    System.out.println(n);
                    count++;
                }
            }
        }
        catch (Exception e) {
            System.out.println("Failed reading: " + file);
        }
        System.out.println("Numbers: "+count);

    }

}