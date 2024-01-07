
import java.util.Scanner;

public class FromWhereToWhere {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Where to?");
        int endingPosition = Integer.valueOf(scanner.next().trim());
        System.out.println("");
        System.out.print("Where from?");
        int startingPosition = Integer.valueOf(scanner.next().trim());
        for(int i = startingPosition; i<=endingPosition; i++) {
            System.out.println(i);
        }
    }
}
