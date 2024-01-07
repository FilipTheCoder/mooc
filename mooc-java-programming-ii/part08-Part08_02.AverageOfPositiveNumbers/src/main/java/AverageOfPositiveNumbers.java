
import java.util.ArrayList;
import java.util.Scanner;

public class AverageOfPositiveNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        int count = 0;
        while (true) {
            int value = scanner.nextInt();
            if (value > 0) {
                sum += value;
                count++;
            } else if (value == 0) {
                break;
            }
        }
        if (count == 0) {
            System.out.println("Cannot calculate the average");
            return;
        }
        System.out.println((double) sum / count);

    }
}
