package chemSyntaxParserBroken;

import java.util.*;

public class Run {
	public static List<String> chemicals;
	public static ArrayList<String> reactants = new ArrayList<>(), 
			products = new ArrayList<>(), 
			temp=new ArrayList<>();
	public static void main(String[] args) {
		reactants.add("H3P1O14");
		reactants.add("K1O1H1");
		products.add("K3P1O4");
		products.add("H2O1");

		//		Scanner scanner = new Scanner(System.in);
		//		// Prompt user for the number of reactants and products\
		//		System.out.print("Enter the number of reactants: ");
		//		int numReactants = scanner.nextInt();
		//		System.out.print("Enter the number of products: ");
		//		int numProducts = scanner.nextInt();

		// Initialize lists to store reactants and products


		// Prompt user for reactants
		//		for (int i = 1; i <= numReactants; i++) {
		//			System.out.print("Enter the empirical formula of reactant " + i + ": ");
		//			String reactant = scanner.next();
		//			if (!syntax.check(reactant)) {
		//				System.out.println("Invalid formula! Please enter in the format 'C2H3Fe1'.");
		//				i--; // Re-prompt for the same reactant
		//			} else {
		//				reactants.add(reactant);
		//			}
		//		}
		//
		//		// Prompt user for products
		//		for (int i = 1; i <= numProducts; i++) {
		//			System.out.print("Enter the empirical formula of product " + i + ": ");
		//			String product = scanner.next();
		//			if (!syntax.check(product)) {
		//				System.out.println("Invalid formula! Please enter in the format 'C2H3Fe1'.");
		//				i--; // Re-prompt for the same product
		//			} else {
		//				products.add(product);
		//			}
		//		}
		//scanner.close();
		temp.addAll(reactants);
		temp.addAll(products);
		chemicals=new ArrayList<>(temp);
		// Display reactants and products
		System.out.println("\nReactants:");
		for (String reactant : reactants) {
			System.out.println(reactant);
		}
		System.out.println("\nProducts:");
		for (String product : products) {
			System.out.println(product);
		}
		//Organizing the weights so they can be transferred to a matrix.
		Map<String, Double[]> compounds = new HashMap<>();
		for(String element:syntax.parse(reactants)) 
			compounds.put(element, syntax.parseElem(element));
		 System.out.println("\nCompounds Map:");
	        for (Map.Entry<String, Double[]> entry : compounds.entrySet()) {
	            System.out.println(entry.getKey() + ": " + Arrays.toString(entry.getValue()));
	        }
		printMatrix(Solver.MapToMatrix(compounds));
		Double[] weights=Solver.extractWeights(Solver.MapToMatrix(compounds));
		printChemicalReaction(reactants,products,weights);
		System.out.print("abcd");
		//System.out.print("H coefficinets of " + reactants.get(0)+ " are "+syntax.parse(reactants.get(0), "H"));
		//
		//        System.out.print((reactants+products));
		//        CAN I CONCATENATE LISTS

	}

	public static void printChemicalReaction(List<String> reactants, List<String> products, Double[] coefficients) {
		StringBuilder reaction = new StringBuilder();

		// Append reactants with coefficients
		for (int i = 0; i < reactants.size(); i++) {
			if (i > 0) {
				reaction.append(" + ");
			}
			if (coefficients.length > i) {
				reaction.append(coefficients[i]).append(" ").append(reactants.get(i));
			} else {
				reaction.append(reactants.get(i));
			}
		}

		// Append equal sign
		reaction.append(" = ");

		// Append products with coefficients
		for (int i = 0; i < products.size(); i++) {
			if (i > 0) {
				reaction.append(" + ");
			}
			if (coefficients.length > reactants.size() + i) {
				reaction.append(coefficients[reactants.size() + i]).append(" ").append(products.get(i));
			} else {
				reaction.append(products.get(i));
			}
		}

		// Print the chemical reaction
		System.out.println(reaction.toString());
	}

	public static void printMatrix(Double[][] matrix) {
		// Print matrix dimensions
		System.out.println("Matrix dimensions: " + matrix.length + "x" + (matrix.length > 0 ? matrix[0].length : 0));

		// Check for null matrix
		if (matrix == null || matrix.length == 0 || matrix[0] == null || matrix[0].length == 0) {
			System.out.println("Matrix is empty or null.");
			return;
		}

		// Print matrix elements
		for (Double[] row : matrix) {
			for (Double num : row) {
				System.out.print(num + " ");
			}
			System.out.println();
		}
	}
}


