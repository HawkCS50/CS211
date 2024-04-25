package Final_Project.Updated;


abstract class Compound {
    protected atom[] elements;

    // Constructor
    public Compound(atom[] elements) {
        this.elements = elements;
    }

    // Abstract methods
    public abstract double getCompoundMass();
    public abstract boolean isSoluble();
}

class IonicCompound extends Compound {
    // Constructor
    public IonicCompound(atom[] elements) {
        super(elements);
    }

    @Override
    public double getCompoundMass() {
        double compoundMass = 0.0;
        for (atom element : elements) {
            compoundMass += element.getAtomicMass();
        }
        return compoundMass;
    }
    @Override
    public boolean isSoluble() { 
        return true; 
    }
}
class CovalentCompound extends Compound {
    // Constructor
    public CovalentCompound(atom[] elements) {
        super(elements);
    }

    @Override
    public double getCompoundMass() {
        double compoundMass = 0.0;
        for (atom element : elements) {
            compoundMass += element.getAtomicMass();
        }
        return compoundMass;
    }
    @Override
    public boolean isSoluble() { 
        return false; 
    }
}


