package Final_Project.Updated;

abstract class atom {
	public String symbol;
    protected double atomicMass;
	

    // Constructor
    public atom(String symbol, double atomicMass) {
        this.atomicMass = atomicMass;
    }

    // Abstract method for specific properties
    public abstract String getElementCategory();
    public abstract double getAtomicMass();
}

class Metal extends atom {
    // Constructor
    public Metal(String symbol, double atomicMass) {
        super(symbol,atomicMass);
    }
    @Override
    public String getElementCategory() {
        return "Metal";
    }
    @Override
    public double getAtomicMass() {
    	return atomicMass;
    }
}
class NonMetal extends atom {
    // Constructor
    public NonMetal(String symbol, double atomicMass) {
        super(symbol,atomicMass);
    }
    @Override
    public String getElementCategory() {
        return "NonMetal";
    }
    @Override
    public double getAtomicMass() {
    	return atomicMass;
    }
}

