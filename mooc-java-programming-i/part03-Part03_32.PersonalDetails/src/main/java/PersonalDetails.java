
import java.util.ArrayList;
import java.util.Scanner;

public class PersonalDetails {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> years = new ArrayList<>();
        String longestName = "";
        while(true) {
            String input = scanner.nextLine();
            
            if(input.isEmpty()) {
                break;
            }
            
            String[] parts = input.split(",");
            
            int year = Integer.valueOf(parts[1]);
            years.add(year);
            String name = parts[0];
            if(longestName.length() < name.length()) {
                longestName = name;
            }
            
        }
        System.out.println("Longest name: " + longestName);
        double av = average(years);
        System.out.println("Average of the birth years: " + av);

    }
    
    public static double average(ArrayList<Integer> numbers) {
        return (double) sum(numbers) / numbers.size();
    }
    
    public static int sum(ArrayList<Integer> numbers) {
        int sum = 0;
        for (int number : numbers) {
            sum += number;
        } 
        return sum;
    }
}
