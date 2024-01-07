
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        ArrayList<Item> items = getInput(scanner);
        System.out.println("==Items==");
        for(Item item : items) {
            System.out.println(item);
        }

    }
    
    public static ArrayList<Item> getInput(Scanner sc) {
        ArrayList<Item> items = new ArrayList();
        while(true) {
            System.out.println("Identifier? (empty will stop)");
            String id = sc.nextLine();
            if (id.isEmpty()) {
                break;
            }
            System.out.println("Name? (empty will stop)");
            String name = sc.nextLine();
            if (name.isEmpty()) {
                break;
            }
            Item item = new Item(id, name);
            if(!items.contains(item)) {
                items.add(item);
            }
        }
        return items;
    }
}
