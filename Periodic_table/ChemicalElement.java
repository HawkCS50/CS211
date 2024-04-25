package Periodic_table;

public class ChemicalElement {
    // Private instance variables
    private String name;
    private String symbol;
    private int atomicNumber;
    private double atomicMass;

    // Constructor
    public ChemicalElement(String name, String symbol, int atomicNumber, double atomicMass) {
        this.name = name;
        this.symbol = symbol;
        this.atomicNumber = atomicNumber;
        this.atomicMass = atomicMass;
    }

    // Accessor methods
    public String getName() {
        return name;
    }

    public String getSymbol() {
        return symbol;
    }

    public int getAtomicNumber() {
        return atomicNumber;
    }

    public double getAtomicMass() {
        return atomicMass;
    }

    // Mutator methods
    public void setAtomicMass(double atomicMass) {
        this.atomicMass = atomicMass;
    }

    // toString method to display element information
    @Override
    public String toString() {
        return "ChemicalElement{" +
                "name='" + name + '\'' +
                ", symbol='" + symbol + '\'' +
                ", atomicNumber=" + atomicNumber +
                ", atomicMass=" + atomicMass +
                '}';
    }
}
