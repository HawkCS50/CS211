package Final_Project;

import java.util.*;

public class ChemicalReaction {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt user for the number of reactants and products
        System.out.print("Enter the number of reactants: ");
        int numReactants = scanner.nextInt();
        System.out.print("Enter the number of products: ");
        int numProducts = scanner.nextInt();

        // Initialize lists to store reactants and products
        List<String> reactants = new ArrayList<>();
        List<String> products = new ArrayList<>();

        // Prompt user for reactants
        for (int i = 1; i <= numReactants; i++) {
            System.out.print("Enter the empirical formula of reactant " + i + ": ");
            String reactant = scanner.next();
            if (!syntaxEnforcer.isValid(reactant)) {
                System.out.println("Invalid formula! Please enter in the format 'C2H3Fe1'.");
                i--; // Re-prompt for the same reactant
            } else {
                reactants.add(reactant);
            }
        }

        // Prompt user for products
        for (int i = 1; i <= numProducts; i++) {
            System.out.print("Enter the empirical formula of product " + i + ": ");
            String product = scanner.next();
            if (!syntaxEnforcer.isValid(product)) {
                System.out.println("Invalid formula! Please enter in the format 'C2H3Fe1'.");
                i--; // Re-prompt for the same product
            } else {
                products.add(product);
            }
        }

        // Display reactants and products
        System.out.println("\nReactants:");
        for (String reactant : reactants) {
            System.out.println(reactant);
        }

        System.out.println("\nProducts:");
        for (String product : products) {
            System.out.println(product);
        }
        System.out.print("abcd");
        System.out.print("\b");
        scanner.close();
    }
    private static void printformula() {
    	for(reactants)
    }
}
