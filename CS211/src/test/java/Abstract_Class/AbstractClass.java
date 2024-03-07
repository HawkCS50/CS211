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
}

// FullTime class
class FullTime extends Student {
	private static final double fulltution = 3600;

	public FullTime(String name, int creditHours) {
		super(name, creditHours);
	}

	@Override
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

	@Override
	public double tuition() {
		return parttuion * getCreditHours();
	}

	@Override
	public String toString() {
		return "My name is " + getName() + ", I don’t study all the time, and I pay $" + tuition() + " for school.";
	}
}

// StudentRunner class
public class AbstractClass {
	public static void main(String[] args) {
		// Create a full-time student.
		FullTime fullTimeStudent = new FullTime("Alice", 15);

		// Create a part-time student.
		PartTime partTimeStudent = new PartTime("Bob", 4);

		// For the part-time student:
		// Print out the name and how much tuition is paid.
		System.out.println(partTimeStudent.toString());
		protFullTime protfullTimeStudent = new protFullTime("Alice", 15);
		protPartTime protPartTimeStudent = new protPartTime("Bob", 4);
		System.out.println("\nProtected ver.\n"+ protPartTimeStudent.toString());
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
}

class protFullTime extends protStudent {
	private static final double fulltution = 3600;

	public protFullTime(String name, int creditHours) {
		super(name, creditHours);
	}

	@Override
	public double tuition() {
		return fulltution;
	}
}

class protPartTime extends protStudent {
	private static final double parttuion = 300;

	public protPartTime(String name, int creditHours) {
		super(name, creditHours);
	}

	@Override
	public double tuition() {
		return parttuion * creditHours;
	}

	@Override
	public String toString() {
		return "My name is " + name + ", I don’t study all the time, and I pay $" + tuition() + " for school.";
	}
}
