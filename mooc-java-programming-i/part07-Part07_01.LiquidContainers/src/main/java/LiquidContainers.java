
import java.util.Scanner;

public class LiquidContainers {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int first = 0;
        int second = 0;

        while (true) {
            System.out.println("First: " + first + "/100");
            System.out.println("Second: " + second + "/100");
            
            String input = scan.nextLine();
            if (input.equals("quit")) {
                break;
            }
            String[] lineTokens = input.split(" ");
            String command = lineTokens[0];
            int value = Integer.valueOf(lineTokens[1]);
            if(command.equals("add")) {
                
                if(first + value <= 100 && value > 0) {
                    first += value;
                }
                else if(first + value > 100) {
                    first = 100;
                }
            }
            else if (command.equals("move")) {
                
                if(value > first) {
                    value = first;
                }
                if(value <= 0) {
                    continue;
                }
                if(second + value <= 100) {
                    first -= value;
                    second += value;
                } else {
                    first -= value;
                    second = 100;
                }

            }
            else if(command.equals("remove")) {
                if(value < 0) {
                    continue;
                }
                if(second - value < 0) {
                    second = 0;
                } else {
                    second -= value;
                }
                
                
            }

        }
    }

}
