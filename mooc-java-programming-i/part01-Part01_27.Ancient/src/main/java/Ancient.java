
import java.util.Scanner;

public class Ancient {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // Write your program here
        System.out.println("Give a number:");
        boolean isAncient = Integer.valueOf(scan.nextLine()) < 2015;
        if(isAncient) {
            System.out.println("Ancient history!");
        }
    }
}
