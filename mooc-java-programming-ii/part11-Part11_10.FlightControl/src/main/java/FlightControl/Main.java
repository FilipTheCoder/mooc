package FlightControl;

import FlightControl.ui.UserInterface;
import java.util.Scanner;


public class Main {

    public static void main(String[] args) {
        // Write the main program here. It is useful to create some classes of your own.
        Scanner sc = new Scanner(System.in);
        new UserInterface(sc).start();
    }
}
