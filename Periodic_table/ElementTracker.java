package Periodic_table;

import java.util.ArrayList;
import java.util.Scanner;

public class ElementTracker {
    private ArrayList<ChemicalElement> elementList;
    private Scanner scanner;

    // Constructor
    public ElementTracker() {
        elementList = new ArrayList<>();
        scanner = new Scanner(System.in);
    }

    // Method to add a new chemical element
    public void addElement() {
        System.out.println("Enter element name:");
        String name = scanner.nextLine();

        System.out.println("Enter element symbol:");
        String symbol = scanner.nextLine();

        System.out.println("Enter atomic number:");
        int atomicNumber = scanner.nextInt();

        System.out.println("Enter atomic mass:");
        double atomicMass = scanner.nextDouble();

        // Create a new ChemicalElement object and add it to the list
        ChemicalElement newElement = new ChemicalElement(name, symbol, atomicNumber, atomicMass);
        elementList.add(newElement);
        System.out.println("Element added successfully!");
    }

    // Method to view all elements in the tracker
    public void viewElements() {
        if (elementList.isEmpty()) {
            System.out.println("No elements in the tracker.");
        } else {
            System.out.println("List of Elements:");
            for (ChemicalElement element : elementList) {
                System.out.println(element);
            }
        }
    }

    // Method to update the atomic mass of an element
    public void updateAtomicMass() {
        System.out.println("Enter the symbol of the element you want to update:");
        String symbol = scanner.next();

        // Search for the element by symbol
        boolean found = false;
        for (ChemicalElement element : elementList) {
            if (element.getSymbol().equalsIgnoreCase(symbol)) {
                found = true;
                System.out.println("Enter the new atomic mass:");
                double newAtomicMass = scanner.nextDouble();
                element.setAtomicMass(newAtomicMass);
                System.out.println("Atomic mass updated successfully!");
                break;
            }
        }
        if (!found) {
            System.out.println("Element with symbol " + symbol + " not found.");
        }
    }
}
