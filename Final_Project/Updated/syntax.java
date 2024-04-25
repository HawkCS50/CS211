package Final_Project.Updated;
import java.util.*;
public class syntax {
	private static final String[] ELEMENT_SYMBOLS = {
			"H", "He", "Li", "Be", "B", "C", "N", "O", "F", "Ne", 
			"Na", "Mg", "Al", "Si", "P", "S", "Cl", "Ar", "K", "Ca", 
			"Sc", "Ti", "V", "Cr", "Mn", "Fe", "Co", "Ni", "Cu", "Zn", 
			"Ga", "Ge", "As", "Se", "Br", "Kr", "Rb", "Sr", "Y", "Zr", 
			"Nb", "Mo", "Tc", "Ru", "Rh", "Pd", "Ag", "Cd", "In", "Sn", 
			"Sb", "Te", "I", "Xe", "Cs", "Ba", "La", "Ce", "Pr", "Nd", 
			"Pm", "Sm", "Eu", "Gd", "Tb", "Dy", "Ho", "Er", "Tm", "Yb", 
			"Lu", "Hf", "Ta", "W", "Re", "Os", "Ir", "Pt", "Au", "Hg", 
			"Tl", "Pb", "Bi", "Po", "At", "Rn", "Fr", "Ra", "Ac", "Th", 
			"Pa", "U", "Np", "Pu", "Am", "Cm", "Bk", "Cf", "Es", "Fm", 
			"Md", "No", "Lr", "Rf", "Db", "Sg", "Bh", "Hs", "Mt", "Ds", 
			"Rg", "Cn", "Nh", "Fl", "Mc", "Lv", "Ts", "Og"
	};
	private static boolean isElementSymbol(String symbol) {
		// Check if the symbol exists in the array
		for (String elementSymbol : ELEMENT_SYMBOLS) {
			if (elementSymbol.equals(symbol)) {
				return true;
			}
		}
		return false;
	}
	/*parsing for a list of all elements in the entire chemical equation.
	Stores them in a string list*/
	public static List<String> parse(ArrayList<String> compounds) {
		List<String> elements= new ArrayList<>();
		for(String compound:compounds)
			elements.addAll(parse(compound));
		return elements;
	}
	/*This method, given a string, loops until it identifies an element, 
	then recurses to identify another element and isolate it into a List<String>
	entry so that it can ultimately return a concatenated list (via the .addAll method)
	to the method that has called it.*/
	public static List<String> parse(String formula) {
	    for (int i = 0; i < formula.length(); i++) {
	        if (Character.isDigit(formula.charAt(i))) {
	            if (isElementSymbol(formula.substring(0, i))) {
	                List<String> elements = new ArrayList<>(List.of(formula.substring(0, i)));
	                elements.addAll(parse(formula.substring(i + 1)));
	                return elements;
	            }
	        }
	    }
	    return Collections.emptyList();
	}
	public static boolean check(String formula) {
		for(int i=0;i<formula.length();i++) {
			if (Character.isDigit(formula.charAt(i)))
				if(isElementSymbol(formula.substring(0,i))) {
					if(i!=formula.length()-1) {
						if(check(formula.substring(i+1)))
							return true;
						else 
							return false;
					}
					else 
						return true;
				}
				else {
					System.out.print("Element " +formula.substring(0,i)+"is unknown");
					return false;
				}
		}
		return false;
	}
	public static Double[] parseElem(String element) {
	    Double[] coeff = new Double[(r+p)];
	    
	    for (int i = 0; i < r;i++) { // Iterate over reactants size instead
	        coeff[i] = 1.0*parseElemRecurse(Run.chemicals.get(i), element);
	    }
	    for (int i=r;i<(r+p);i++) {
	    	 coeff[i] = -1.0*parseElemRecurse(Run.chemicals.get(i), element);
	    }
	    return coeff;
	}

	private static int parseElemRecurse(String formula, String element) {
		int count=0;
		for(int i=0;i<formula.length();i++) {
			if (Character.isDigit(formula.charAt(i))) {
				if(formula.substring(0,i).equals(element))//.equals cuz comparing strings.
					count+=Character.getNumericValue(formula.charAt(i));
				if(i!=formula.length()-1) { 
					return parseElemRecurse(formula.substring(i+1),element)+count;
				}
			}
		}
		return count;
	}
    public static atom[] convertToAtomsArray(List<String> elementNames) {
        List<atom> result = new ArrayList<>();

        // Iterate through the element names
        for (String name : elementNames) {
            // Find the corresponding atom object by name
            atom foundAtom = findAtomByName(name);
            if (foundAtom != null) {
                result.add(foundAtom);
            }
        }

        // Convert the ArrayList to an array
        return result.toArray(new atom[result.size()]);
    }

    // Helper method to find atom by name
    private static atom findAtomByName(String name) {
        for (atom a:Run.table) {
            if (a.symbol.equals(name)) {
                return a;
            }
        }
        return null; // Return null if atom not found
    }
}

