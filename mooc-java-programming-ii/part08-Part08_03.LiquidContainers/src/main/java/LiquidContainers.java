
import java.util.Scanner;

public class LiquidContainers {

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
            int volume = Integer.valueOf(lineTokens[1]);

            switch (command) {
                case "add":

                    first.add(volume);
                    break;
                case "remove":
                    second.remove(volume);
                    break;
                case "move":
                    if (volume > first.getAmount()) {
                        volume = first.getAmount();
                    }
                    first.remove(volume);
                    second.add(volume);
                    break;
                default:
                    System.out.println("unsuported command");
                    break;
            }

        }
    }

}
