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
	public abstract void printElements();
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
	public void printElements() {
		System.out.println("Elements in Ionic Compound:");
		for (atom element : elements) {
			System.out.println(element.symbol);
		}
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
		public void printElements() {
			System.out.println("Elements in Ionic Compound:");
			for (atom element : elements) {
				System.out.println(element.symbol);
			}
		}
	}


