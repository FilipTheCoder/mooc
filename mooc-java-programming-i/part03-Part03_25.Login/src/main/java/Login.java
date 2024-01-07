
import java.util.Scanner;

public class Login {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String username1 = "alex";
        String username2 = "emma";
        String password1 = "sunshine";
        String password2 = "haskell";
        
        
        System.out.println("Enter username:");
        String inputtedUsername = scanner.nextLine();
        System.out.println("Enter password:");
        String inputtedPassword = scanner.nextLine();
        
        if((inputtedUsername.equals(username1) && inputtedPassword.equals(password1)) || (inputtedUsername.equals(username2) && inputtedPassword.equals(password2))) {
            System.out.println("You have successfully logged in!");
        } else {
            System.out.println("Incorrect username or password!");
        }
        

    }
}
