
import java.util.Scanner;

public class AgeOfTheOldest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int age = 0;
        while(true) {
            String input = scanner.nextLine();
            if(input.equals("")) {
                break;
            }
            int inputtedAge = Integer.valueOf(input.split(",")[1]);
            
            if(age < inputtedAge) {
                age = inputtedAge;
            }
        }
        System.out.println("Age of the oldest: " + age);
        
        

    }
}
