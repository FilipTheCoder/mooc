
import java.util.Scanner;

public class AverageOfPositiveNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sumOfPositives = 0;
        int numberOfPositiveInputs = 0;
        while (true) {
            int input = Integer.valueOf(scanner.nextLine());
            
            if (input < 0 ) {
                continue;
            }
            
            if (input == 0) {
                break;
            }
            
            sumOfPositives = sumOfPositives + input;
            numberOfPositiveInputs = numberOfPositiveInputs +1;
            
        }
        if (numberOfPositiveInputs == 0) {
            System.out.println("Cannot calculate the average");
        } else {
            double average = (double)sumOfPositives / numberOfPositiveInputs;
            System.out.println(average);
        }
        
    }
}
