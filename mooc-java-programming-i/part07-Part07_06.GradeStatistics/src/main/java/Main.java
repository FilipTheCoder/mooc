
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Points points = new Points(50);
        System.out.println("Enter point totals, -1 stops:");
        while(true) {
            int p = Integer.valueOf(scanner.nextLine());
            if(p == -1) {
                break;
            }
            points.add(p);
            
            
        }
        System.out.println(points);
    }
}
