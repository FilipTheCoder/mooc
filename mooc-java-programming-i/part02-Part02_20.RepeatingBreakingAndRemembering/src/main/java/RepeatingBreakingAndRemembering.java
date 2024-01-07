
import java.util.Scanner;

public class RepeatingBreakingAndRemembering {

    public static void main(String[] args) {
        
        // This exercise is worth five exercise points, and it is 
        // gradually extended part by part.
        
        // If you want, you can send this exercise to the server
        // when it's just partially done. In that case the server will complain about 
        // the parts you haven't done, but you'll get points for the finished parts.
        
        Scanner scanner = new Scanner(System.in);
        System.out.println("Give numbers:");
        int sum = 0;
        int countOfNumbers = 0;
        int countOfEvens = 0;
        int countOfOdds = 0;
        while (true) {
            int number = Integer.valueOf(scanner.nextLine());
            
            if (number == -1) {
                break;
            }
            
            if(number % 2 == 0) {
                countOfEvens +=1;
            } else {
                countOfOdds +=1;
            }
            
            sum += number;
            countOfNumbers += 1;
        }
        System.out.println("Thx! Bye!");
        System.out.println("Sum: "+ sum);
        System.out.println("Numbers: "+countOfNumbers);
        if (countOfNumbers > 0) {
            double average = (double) sum/countOfNumbers;
            System.out.println("Average: " + average);
        }
        System.out.println("Even: " + countOfEvens);
        System.out.println("Odd: " + countOfOdds);

        

    }
}
