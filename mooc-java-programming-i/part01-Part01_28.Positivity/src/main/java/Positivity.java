
import java.util.Scanner;

public class Positivity {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // Write your program here
        System.out.println("Give a number:");
        boolean isPositive = Integer.valueOf(scan.nextLine()) > 0;
        if(isPositive) {
            System.out.println("The number is positive.");
        } else {
            System.out.println("The number is not positive.");
        }
    }
}
