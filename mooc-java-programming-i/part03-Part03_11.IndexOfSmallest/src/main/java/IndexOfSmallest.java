
import java.util.ArrayList;
import java.util.Scanner;

public class IndexOfSmallest {

    public static void main(String[] args) {
        int end = 9999;
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> numbers = new ArrayList<>();

        while(true) {
            int input = Integer.valueOf(scanner.nextLine());
            if (input == end) {
                break;
            }
            numbers.add(input);
        }
        
        int smallest = numbers.get(0);
        for (int i = 0; i < numbers.size(); i++) {
            int number = numbers.get(i);
            if(number < smallest) {
                smallest = number;
            }
        }
        System.out.println("Smallest number: " + smallest);
        for (int i = 0; i < numbers.size(); i++) {
            if (smallest == numbers.get(i)) {
                System.out.println("Found at index: " + i);
            }
        }
        
    }
}
