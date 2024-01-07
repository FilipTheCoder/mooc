
import java.util.Scanner;

public class Adulthood {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // Write your program here 
        boolean isAdult = Integer.valueOf(scan.nextLine()) >= 18;
        if(isAdult) {
            System.out.println("You are an adult");
        } else {
            System.out.println("You are not an adult");
        }
    }
}
