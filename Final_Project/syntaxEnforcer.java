package Final_Project;

public class syntaxEnforcer {
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
	public static boolean isValid(String formula) {
		for(int i=0;i<formula.length();i++) {
			if (Character.isDigit(formula.charAt(i)))
				if(isElementSymbol(formula.substring(0,i))) {
					if(i!=formula.length()-1) {
						if(isValid(formula.substring(i+1)))
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
}

