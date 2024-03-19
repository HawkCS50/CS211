package Abstract_Class;

// Abstract class Student
abstract class Student {
	private String name;
	private int creditHours;

	public Student(String name, int creditHours) {
		this.name = name;
		this.creditHours = creditHours;
	}
	public abstract double tuition();
	// Getters and setters
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getCreditHours() {
		return creditHours;
	}
	public void setCreditHours(int creditHours) {
		this.creditHours = creditHours;
	}
	public String toString() {
		return getName() + " is taking " + getCreditHours() + " credit hours and is paying $"+ tuition();
	}
}
// FullTime class
class FullTime extends Student {
	private static final double fulltution = 3456.99;

	public FullTime(String name, int creditHours) {
		super(name, creditHours);
	}
	public double tuition() {
		return fulltution;
	}
}

// PartTime class
class PartTime extends Student {
	private static final double parttuion = 300;

	public PartTime(String name, int creditHours) {
		super(name, creditHours);
	}
	public double tuition() {
		return parttuion * getCreditHours();
	}
	@Override
	public String toString() {
		return super.toString()+"\nMy name is " + getName() + ", I don't study all the time, and I pay $" + tuition() + " for school.";
	}
}

// StudentRunner class
class AbstractClass {
	public static void main(String[] args) {
		// Create full-time students.
		FullTime fullAlice = new FullTime("Alice", 15), 
				fullBrian = new FullTime("Brian",33);
		// Create part-time students.
		PartTime partHuzzah= new PartTime("Huzzah", 4), 
				partBob = new PartTime("Bob",6);
		Student[] MaCS211 = {fullAlice,fullBrian,partHuzzah,partBob};
		for(Student a:MaCS211) {
			System.out.println(a);
			if(a instanceof FullTime)
				System.out.println("I\'m "+a.getName()+
						". It\'s great to be a full-time student!");
		}
		// Print out the name and how much tuition is paid.
//		System.out.println(partTimeStudent.toString());
//		protFullTime protfullTimeStudent = new protFullTime("Alice", 15);
//		protPartTime protPartTimeStudent = new protPartTime("Bob", 4);
//		System.out.println("\nProtected ver.\n"+ protPartTimeStudent.toString());
//		
	}
}


// Abstract class Student (Second Way)
abstract class protStudent {
	protected String name;
	protected int creditHours;

	public protStudent(String name, int creditHours) {
		this.name = name;
		this.creditHours = creditHours;
	}
	public abstract double tuition();
	public String toString() {
		return name + " is taking " +creditHours + " credit hours and is paying $"+ tuition();
	}
}

class protFullTime extends protStudent {
	private static final double fulltution = 3600;

	public protFullTime(String name, int creditHours) {
		super(name, creditHours);
	}

	public double tuition() {
		return fulltution;
	}
}

class protPartTime extends protStudent {
	private static final double parttuion = 300;

	public protPartTime(String name, int creditHours) {
		super(name, creditHours);
	}

	public double tuition() {
		return parttuion * creditHours;
	}
	public String toString() {
		return super.toString()+"\nMy name is " + name + ", I don't study all the time, and I pay $" + tuition() + " for school.";
	}

}
