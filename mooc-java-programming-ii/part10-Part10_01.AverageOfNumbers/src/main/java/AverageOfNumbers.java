
import java.util.ArrayList;
import java.util.Scanner;

public class AverageOfNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> inputs = new ArrayList();
        
        System.out.println("Input numbers, type \"end\" to stop.");
        while(true) {
            String input = scanner.nextLine();
            if(input.equals("end")) {
                break;
            }
            int value = Integer.valueOf(input);
            inputs.add(value);
            
        }
        System.out.println("average of the numbers: " + inputs.stream().mapToInt((i) -> i).average());
        

    }
}
