/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FlightControl.ui;

import FlightControl.domain.Airplane;
import FlightControl.domain.Flight;
import FlightControl.logic.FlightControl;
import java.util.Scanner;

/**
 *
 * @author shota
 */
public class TextUI {
    private FlightControl flightControl;
    private Scanner scanner;

    public TextUI(FlightControl flightControl, Scanner scanner) {
        this.flightControl = flightControl;
        this.scanner = scanner;
    }

    public void start() {
        // let's start in two parts -- first start the asset control,
        // then the flight control
        startAssetControl();
        System.out.println();
        startFlightControl();
        System.out.println();
    }

    private void startAssetControl() {
        System.out.println("Airport Asset Control");
        System.out.println("--------------------");
        System.out.println();

        while (true) {
            System.out.println("Choose an action:");
            System.out.println("[1] Add an airplane");
            System.out.println("[2] Add a flight");
            System.out.println("[x] Exit Airport Asset Control");

            System.out.print("> ");
            String answer = scanner.nextLine().trim();

            if (answer.equals("1")) {
                addAirplane();
            } else if (answer.equals("2")) {
                addFlight();
            } else if (answer.equals("x")) {
                break;
            } else {
                System.out.println("Invalid input. Please enter 1, 2, or x.");
            }
        }
    }

    private void addAirplane() {
        System.out.print("Give the airplane id: ");
        String id = scanner.nextLine().trim();
        
        System.out.print("Give the airplane capacity: ");
        
        while (!scanner.hasNextInt()) {
            System.out.print("Please enter a valid integer for capacity: ");
            scanner.next();
        }
        int capacity = Integer.parseInt(scanner.nextLine().trim());

        this.flightControl.addAirplane(id, capacity);
    }

    private void addFlight() {
        System.out.print("Give the airplane id: ");
        Airplane airplane = askForAirplane();
        System.out.print("Give the departure airport id: ");
        String departureID = scanner.nextLine().trim();
        System.out.print("Give the target airport id: ");
        String destinationID = scanner.nextLine().trim();

        this.flightControl.addFlight(airplane, departureID, destinationID);
    }

    private void startFlightControl() {
        System.out.println("Flight Control");
        System.out.println("------------");
        System.out.println();

        while (true) {
            System.out.println("Choose an action:");
            System.out.println("[1] Print airplanes");
            System.out.println("[2] Print flights");
            System.out.println("[3] Print airplane details");
            System.out.println("[x] Quit");

            System.out.print("> ");
            String answer = scanner.nextLine().trim();
            
            if (answer.equals("1")) {
                printAirplanes();
            } else if (answer.equals("2")) {
                printFlights();
            } else if (answer.equals("3")) {
                printAirplaneDetails();
            } else if (answer.equals("x")) {
                break;
            } else {
                System.out.println("Invalid input. Please enter 1, 2, 3, or x.");
            }
        }
    }

    private void printAirplanes() {
        for (Airplane plane : flightControl.getAirplanes()) {
            System.out.println(plane);
        }
    }

    private void printFlights() {
        for (Flight flight : flightControl.getFlights()) {
            System.out.println(flight);
        }
    }

    private void printAirplaneDetails() {
        System.out.print("Give the airplane id: ");
        Airplane plane = askForAirplane();
        System.out.println(plane);
        System.out.println();
    }

    private Airplane askForAirplane() {
        Airplane airplane = null;
        while (airplane == null) {
            System.out.println("Give the airplane id: ");
            String id = scanner.nextLine().trim();
            
            airplane = flightControl.getAirplane(id);

            if (airplane == null) {
                System.out.println("No airplane with the id " + id + ".");
            }
        }

        return airplane;
    }
}
