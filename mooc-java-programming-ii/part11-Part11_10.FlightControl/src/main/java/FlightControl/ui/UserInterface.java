/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FlightControl.ui;

import FlightControl.domain.Flight;
import FlightControl.domain.Plane;
import java.util.Scanner;
import FlightControl.logic.FlightControl;

/**
 *
 * @author filip
 */
public class UserInterface {

    private Scanner sc;
    private FlightControl control = new FlightControl();

    public UserInterface(Scanner sc) {
        this.sc = sc;
    }

    public void start() {
        assetControl();
        System.out.println();
        flightControl();
        System.out.println();
    }

    public void assetControl() {
        System.out.println("Airport Asset Control");
        System.out.println("--------------------");
        System.out.println();
        boolean end = false;
        while (!end) {
            System.out.println("Choose an action:");
            System.out.println("[1] Add an airplane");
            System.out.println("[2] Add a flight");
            System.out.println("[x] Exit Airport Asset Control");

            System.out.print("> ");
            String answer = sc.nextLine();

            switch (answer) {
                case "1":
                    addPlane();
                    break;
                case "2":
                    addFlight();
                    break;
                case "x":
                    end = true;
                    break;
                default:
                    System.out.println("Unsupported option, please choose from list");
                    break;

            }
        }
    }

    private void addPlane() {
        System.out.print("Give the airplane id: ");
        String id = sc.nextLine();
        System.out.print("Give the airplane capacity: ");
        int capacity = Integer.parseInt(sc.nextLine());

        this.control.addPlane(id, capacity);
    }

    private void addFlight() {
        System.out.print("Give the airplane id: ");
        Plane plane = askForPlane();
        System.out.print("Give the departure airport id: ");
        String departureID = sc.nextLine();
        System.out.print("Give the target airport id: ");
        String destinationID = sc.nextLine();

        this.control.addFlight(plane, departureID, destinationID);
    }

    private Plane askForPlane() {
        Plane plane = null;
        while (plane == null) {
            String id = sc.nextLine();
            plane = control.getPlane(id);

            if (plane == null) {
                System.out.println("No airplane with the id " + id + ".");
            }
        }

        return plane;
    }

    public void flightControl() {
        System.out.println("Flight Control");
        System.out.println("------------");
        System.out.println();
        boolean end = false;
        while (!end) {
            System.out.println("Choose an action:");
            System.out.println("[1] Print airplanes");
            System.out.println("[2] Print flights");
            System.out.println("[3] Print airplane details");
            System.out.println("[x] Quit");

            System.out.print("> ");
            String answer = sc.nextLine();
            switch (answer) {
                case "1":
                    printPlanes();
                    break;
                case "2":
                    printFlights();
                    break;
                case "3":
                    planeDetails();
                    break;
                case "x":
                    end = true;
                    break;
            }
        }
    }

    private void printPlanes() {
        for (Plane plane : this.control.getPlanes()) {
            System.out.println(plane);

        }
    }

    private void printFlights() {
        for (Flight flight : this.control.getFlights()) {
            System.out.println(flight);
        }
    }

    private void planeDetails() {
        System.out.print("Give the airplane id: ");
        Plane plane = askForPlane();
        System.out.println(plane);
        System.out.println();
    }

}
