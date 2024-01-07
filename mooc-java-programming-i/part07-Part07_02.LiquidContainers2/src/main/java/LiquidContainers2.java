
import java.util.Scanner;

public class LiquidContainers2 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        Container first = new Container();
        Container second = new Container();

        while (true) {
            System.out.println("First: " + first);
            System.out.println("Second: " + second);

            String input = scan.nextLine();
            if (input.equals("quit")) {
                break;
            }
            String[] lineTokens = input.split(" ");
            String command = lineTokens[0];
            int value = Integer.valueOf(lineTokens[1]);
            if(command.equals("add")) {
                first.add(value);
            }
            else if (command.equals("move")) {
                if(first.contains() < value) {
                    second.add(first.contains());
                } else {
                    second.add(value);
                }
                
                first.remove(value);
                
                

            }
            else if(command.equals("remove")) {
                
                second.remove(value);
                
            }

        }
    }

}
