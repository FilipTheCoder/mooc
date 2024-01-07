
import java.util.Scanner;

public class GiftTax {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Value of the gift?");
        int value = Integer.valueOf(scan.nextLine());
        if (value < 5000) {
            System.out.println("No tax!");
        } else if (value >= 5000 && value < 25_000) {
            double tax = 100 + (value-5000) * 0.08;
            System.out.println("Tax: " + tax );
        } else if (value >= 25_000 && value < 55_000) {
            double tax = 1700 + (value-25000) * 0.1;
            System.out.println("Tax: " + tax );
        } else if (value >= 55_000 && value < 200_000) {
            double tax = 4700 + (value-55000) * 0.12;
            System.out.println("Tax: " + tax );
        } else if (value >= 200_000 && value < 1_000_000) {
            double tax = 22100 + (value-200_000) * 0.15;
            System.out.println("Tax: " + tax );
        } else {
            double tax = 142100 + (value-1000_000) * 0.17;
            System.out.println("Tax: " + tax );
        }
    }
}
