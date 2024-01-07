
import java.util.Scanner;

public class NumberOfStrings {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        String input = scanner.nextLine();
        int count = 0;
        while(!input.equals("end")) {
            count++;
            input = scanner.nextLine();
        }
        System.out.println(count);
                
    }
}
