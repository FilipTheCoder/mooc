
import java.util.ArrayList;
import java.util.Scanner;

public class FirstAndLast {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayList<String> list = new ArrayList<>();
        while (true) {
            String input = scanner.nextLine();
            if (input.equals("")) {
                break;
            }

            list.add(input);
        }
        String firstItem = list.get(0);
        String lastItem = list.get(list.size() - 1);
        System.out.println(firstItem);
        System.out.println(lastItem);
    }
}
