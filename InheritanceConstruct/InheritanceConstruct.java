package InheritanceConstruct;

public class InheritanceConstruct {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee A = new Employee("Yellow", 340.52);
		System.out.println("HOURS: "+A.getHours());
		System.out.println("SALARY: "+A.getSalary());
		System.out.println("VACATIONDAYS: "+A.getVacationDays());
		System.out.println("VACATIONFORM: "+A.getVacationForm());
		System.out.println(A);
		Janitor B = new Janitor("Blue",100,true);
		System.out.println("HOURS: "+B.getHours());
		System.out.println("SALARY: "+B.getSalary());
		System.out.println("VACATIONDAYS: "+B.getVacationDays());
		System.out.println("VACATIONFORM: "+B.getVacationForm());
		System.out.println("ToString: "+B);
		System.out.println("Cleaning: ");
		B.clean();
		NovinceJanitor C = new NovinceJanitor("Blue",25);
		System.out.println("HOURS: "+C.getHours());
		System.out.println("SALARY: "+C.getSalary());
		System.out.println("VACATIONDAYS: "+C.getVacationDays());
		System.out.println("VACATIONFORM: "+C.getVacationForm());
		System.out.println("ToString: "+C);
		System.out.println("Cleaning: ");
		C.clean();

		/**********************
		 * Car inheritance (part 2)
		 */
		Car c = new Car();
		System.out.println( "Call to Car's m1(): " );
		c.m1();
		System.out.println( "\nCall to Car's m2(): " );
		c.m2();
		System.out.println( "\nCall to print Car's toString(): " );
		System.out.println( c ); // calls toString()
		Truck t = new Truck();
		System.out.println( "\n\nCall to Truck's m1(): " );
		t.m1();
		System.out.println( "\nCall to Truck's m2(): " );
		t.m2();
		System.out.println( "\nCall to print Truck's toString(): " );
		System.out.println( t ); // calls toString()
		MonsterTruck mt = new MonsterTruck();
		System.out.println( "\n\nCall to MonsterTruck's m1(): " );
		mt.m1();
		System.out.println( "\nCall to MonsterTruck's m2(): " );
		mt.m2();
		System.out.println( "\nCall to print MonsterTruck's toString(): " );
		System.out.println( mt ); // calls toString()
	}
}

class Employee {
	private int baseHours;
	private double baseSalary;
	private int baseVacationDays;
	private String baseVacationForm;
	private double bonus;
	public Employee(String vacForm, double myBonus) {
		baseHours = 40;
		baseSalary = 50000.0;
		baseVacationDays = 10;
		baseVacationForm = vacForm;
		bonus = myBonus;
	}
	public int getHours() {
		return baseHours;
	}
	public double getSalary() {
		return baseSalary + bonus;
	}
	public int getVacationDays() {
		return baseVacationDays;
	}
	public String getVacationForm() {
		return baseVacationForm;
	}
	public String toString() {
		return "I work " + getHours() + " hours weekly, make $" + getSalary() + ", have " + getVacationDays() + " vacation days, and fill out a " + getVacationForm() + " vacation form.";
	}
	public void setHours(int x) {
		this.baseHours=x;
	}
	public void setSalary(double x) {
		this.baseSalary=x;
	}
	public void setVacationDays(int x) {
		this.baseVacationDays=x;
	}
}
class Janitor extends Employee {
	private boolean supplies;

	public Janitor(String vac,double bono,boolean s) {
		super(vac, bono);	
		supplies = s;
	}
	public void clean() {
		System.out.println("Workin' for the man.");
	}
	@Override
	public int getHours() {
		return super.getHours()*2;
	}
	@Override
	public double getSalary() {
		return (super.getSalary()-10000);
	}
	@Override
	public int getVacationDays() {
		return (super.getVacationDays()/2);
	}
	@Override
	public String toString() {
		return super.toString()+" "+supplies();
	}
	private String supplies() {
		if (supplies) return "I have all the supplies I need!";
		else return "BUT I NEED SUPPLIES";
	}

}
class NovinceJanitor extends Janitor {

	public NovinceJanitor(String vac, double bono) {
		super(vac, bono, false);
	}
	@Override
	public String getVacationForm() {
		String a=super.getVacationForm();
		return a+a+a+a;
	}
	@Override
	public void clean() {
		super.clean();
		System.out.println("I need more training.");
	}
}
class Car {

	public void m1() {
		System.out.println("car 1");
	}
	public void m2() {
		System.out.println("car 2");
	}
	public String toString() {
		return "vroom";
	}
}
class Truck extends Car {
	@Override
	public void m1() {
		System.out.println("truck 1");
	}
	@Override
	public void m2()
	{ super.m1(); }

	public String toString() {
		return super.toString() +
				super.toString();
	}
}

class MonsterTruck extends Truck {
	@Override
	public void m1() {
		System.out.println("monster 1");
	}
	@Override
	public void m2() { 
		super.m1();
		super.m2();
	}
	@Override
	public String toString() {
		return "monster "+super.toString();
	}
}


