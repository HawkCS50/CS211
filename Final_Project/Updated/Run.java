package Final_Project.Updated;
<<<<<<< HEAD
import java.util.*;

=======

import java.util.*;

import com.sun.tools.javac.code.Attribute.Compound;

>>>>>>> 471bf1605683397795dbd0da94500f3b1fd03127
public class Run {
	public static final atom hydrogen = new NonMetal("H", 1.008), helium = new NonMetal("He", 4.0026), lithium = new Metal("Li", 6.94), beryllium = new Metal("Be", 9.0122), boron = new NonMetal("B", 10.81), carbon = new NonMetal("C", 12.011), nitrogen = new NonMetal("N", 14.007), oxygen = new NonMetal("O", 15.999), fluorine = new NonMetal("F", 18.998), neon = new NonMetal("Ne", 20.180), sodium = new Metal("Na", 22.990), magnesium = new Metal("Mg", 24.305), aluminum = new Metal("Al", 26.982), silicon = new NonMetal("Si", 28.085), phosphorus = new NonMetal("P", 30.974), sulfur = new NonMetal("S", 32.06), chlorine = new NonMetal("Cl", 35.45), argon = new NonMetal("Ar", 39.948), potassium = new Metal("K", 39.098), calcium = new Metal("Ca", 40.078), scandium = new Metal("Sc", 44.956), titanium = new Metal("Ti", 47.867), vanadium = new Metal("V", 50.942), chromium = new Metal("Cr", 51.996), manganese = new Metal("Mn", 54.938), iron = new Metal("Fe", 55.845), cobalt = new Metal("Co", 58.933), nickel = new Metal("Ni", 58.693), copper = new Metal("Cu", 63.546), zinc = new Metal("Zn", 65.38), gallium = new Metal("Ga", 69.723), germanium = new Metal("Ge", 72.63), arsenic = new NonMetal("As", 74.922), selenium = new NonMetal("Se", 78.971), bromine = new NonMetal("Br", 79.904), krypton = new NonMetal("Kr", 83.798), rubidium = new Metal("Rb", 85.468), strontium = new Metal("Sr", 87.62), yttrium = new Metal("Y", 88.906), zirconium = new Metal("Zr", 91.224), niobium = new Metal("Nb", 92.906), molybdenum = new Metal("Mo", 95.95), technetium = new Metal("Tc", 98), ruthenium = new Metal("Ru", 101.07), rhodium = new Metal("Rh", 102.91), palladium = new Metal("Pd", 106.42), silver = new Metal("Ag", 107.87), cadmium = new Metal("Cd", 112.41), indium = new Metal("In", 114.82), tin = new Metal("Sn", 118.71), antimony = new Metal("Sb", 121.76), tellurium = new NonMetal("Te", 127.6), iodine = new NonMetal("I", 126.904), xenon = new NonMetal("Xe", 131.29), cesium = new Metal("Cs", 132.91), barium = new Metal("Ba", 137.33), lanthanum = new Metal("La", 138.91), cerium = new Metal("Ce", 140.12), praseodymium = new Metal("Pr", 140.91), neodymium = new Metal("Nd", 144.24), promethium = new Metal("Pm", 145), samarium = new Metal("Sm", 150.36), europium = new Metal("Eu", 151.96), gadolinium = new Metal("Gd", 157.25), terbium = new Metal("Tb", 158.93), dysprosium = new Metal("Dy", 162.5), holmium = new Metal("Ho", 164.93), erbium = new Metal("Er", 167.26), thulium = new Metal("Tm", 168.93), ytterbium = new Metal("Yb", 173.05), lutetium = new Metal("Lu", 174.97), hafnium = new Metal("Hf",178.49), tantalum = new Metal("Ta", 180.95), tungsten = new Metal("W", 183.84), rhenium = new Metal("Re", 186.21), osmium = new Metal("Os", 190.23), iridium = new Metal("Ir", 192.22), platinum = new Metal("Pt", 195.08), gold = new Metal("Au", 196.97), mercury = new Metal("Hg", 200.59), thallium = new Metal("Tl", 204.38), lead = new Metal("Pb", 207.2), bismuth = new Metal("Bi", 208.98), polonium = new Metal("Po", 209), astatine = new NonMetal("At", 210), radon = new NonMetal("Rn", 222), francium = new Metal("Fr", 223), radium = new Metal("Ra", 226), actinium = new Metal("Ac", 227), thorium = new Metal("Th", 232.04), protactinium = new Metal("Pa", 231.04), uranium = new Metal("U", 238.03), neptunium = new Metal("Np", 237), plutonium = new Metal("Pu", 244), americium = new Metal("Am", 243), curium = new Metal("Cm", 247), berkelium = new Metal("Bk", 247), californium = new Metal("Cf", 251), einsteinium = new Metal("Es", 252), fermium = new Metal("Fm", 257), mendelevium = new Metal("Md", 258), nobelium = new Metal("No", 259), lawrencium = new Metal("Lr", 266), rutherfordium = new Metal("Rf", 267), dubnium = new Metal("Db", 268), seaborgium = new Metal("Sg", 271), bohrium = new Metal("Bh", 270), hassium = new Metal("Hs", 277), meitnerium = new Metal("Mt", 276), darmstadtium = new Metal("Ds", 281), roentgenium = new Metal("Rg", 280), copernicium = new Metal("Cn", 285), nihonium = new Metal("Nh", 284), flerovium = new Metal("Fl", 289), moscovium = new Metal("Mc", 288), livermorium = new Metal("Lv", 293), tennessine = new Metal("Ts", 294), oganesson = new Metal("Og", 294);
	public static final atom[] table = new atom[] {hydrogen, helium, lithium, beryllium, boron, carbon, nitrogen, oxygen, fluorine, neon, sodium, magnesium, aluminum, silicon, phosphorus, sulfur, chlorine, argon, potassium, calcium, scandium, titanium, vanadium, chromium, manganese, iron, cobalt, nickel, copper, zinc, gallium, germanium, arsenic, selenium, bromine, krypton, rubidium, strontium, yttrium, zirconium, niobium, molybdenum, technetium, ruthenium, rhodium, palladium, silver, cadmium, indium, tin, antimony, tellurium, iodine, xenon, cesium, barium, lanthanum, cerium, praseodymium, neodymium, promethium, samarium, europium, gadolinium, terbium, dysprosium, holmium, erbium, thulium, ytterbium, lutetium, hafnium, tantalum, tungsten, rhenium, osmium, iridium, platinum, gold, mercury, thallium, lead, bismuth, polonium, astatine, radon, francium, radium, actinium, thorium, protactinium, uranium, neptunium, plutonium, americium, curium, berkelium, californium, einsteinium, fermium, mendelevium, nobelium, lawrencium, rutherfordium, dubnium, seaborgium, bohrium, hassium, meitnerium, darmstadtium, roentgenium, copernicium, nihonium, flerovium, moscovium, livermorium, tennessine, oganesson};	public static List<String> chemicals;
	public static final Map<String, Compound> cookbook = new HashMap<>();
<<<<<<< HEAD
	
	public static void main(String[] args) {
        // Display the home dialogue in a loop
        boolean r=true;
        while(r) {
            Dialogue.home();
        }        
    }
    
    // Method to create a compound and add it to the cookbook
    public static void creation(String s) {
        // Convert input string into an array of atoms
        atom[] elements = syntax.convertToAtomsArray(syntax.parse(s));
        
        // Check if any element in the compound is a metal
        boolean m = false;
        for (atom a : elements) {
            if (a.getElementCategory().equals("Metal")) 
                m = true;
        }
        
        // Create an ionic or covalent compound based on the presence of a metal
        Compound temp;
        if (m) 
            temp = new IonicCompound(elements);
        else 
            temp = new CovalentCompound(elements);
        
        // Add the compound to the cookbook
        cookbook.put(s, temp);
    }
    
    // Method to display compound statistics
    public static void stats(Compound s) {
        // Print compound mass and solubility in water
        System.out.println("Compound Mass: " + s.getCompoundMass()+"\nSoluble in water? "+ s.isSoluble()+"\nElements: ");
        s.printElements();
    }
    
    // Method to print the symbols of atoms in all compounds stored in the cookbook
    public static void printAtomSymbols() {
        for (Map.Entry<String, Compound> entry : cookbook.entrySet()) {
            String chemicalName = entry.getKey();
            Compound compound = entry.getValue();

            System.out.println("Chemical Name: " + chemicalName);
            atom[] elements = compound.elements;
            for (atom a : elements) {
                System.out.println("Atom Symbol: " + a.symbol);
            }
            System.out.println();
        }
    }
    
    // Method to check if a compound exists in the cookbook
    public static boolean hasEntryInCookbook(String chemicalName) {
        return cookbook.containsKey(chemicalName);
    }
}
=======
	public static final
	public static void main(String[] args) {
		boolean r=true;
		while(r) {
			Dialogue.home();
		}        
	}
	
	public static void creation(String s) {
	    atom[] elements = syntax.convertToAtomsArray(syntax.parse(s));
	    boolean m = false;
	    for (atom a : elements) {
	        if (a.getElementCategory().equals("Metal")) // Added parentheses ()
	            m = true;
	    }
	    Final_Project.Updated.Compound temp;
	    if (m) 
	        temp = new IonicCompound(elements);
	    else 
	        temp = new CovalentCompound(elements);
	    
	    cookbook.put(s, temp);
	}
	public static void stats(Compound s) {
		System.out.println("Compound Mass: " + s.getCompoundMass()
		+"\nSolubility in Water: " + s.getSolubility());
	}
}
>>>>>>> 471bf1605683397795dbd0da94500f3b1fd03127
