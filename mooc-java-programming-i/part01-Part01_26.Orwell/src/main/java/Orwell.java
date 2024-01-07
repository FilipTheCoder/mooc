
import java.util.Scanner;

public class Orwell {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // Write your program here
        System.out.println("Give a number:");
        boolean isOrwell = Integer.valueOf(scan.nextLine()) == 1984;
        if(isOrwell) {
            System.out.println("Orwell");
        }
    }
}
