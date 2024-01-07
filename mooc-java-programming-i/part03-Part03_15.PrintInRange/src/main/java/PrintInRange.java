
import java.util.ArrayList;

public class PrintInRange {

    public static void main(String[] args) {
        // Try your method here
    }
    public static void printNumbersInRange(ArrayList<Integer> numbers, int begin, int end) {
        for (int number : numbers) {
            if (number <= end && number >= begin) {
                System.out.println(number);
            }
        }
    }
    
}
