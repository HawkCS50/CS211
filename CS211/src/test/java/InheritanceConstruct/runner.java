package InheritanceConstruct;

public class runner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee A = new Employee("Yellow", 340.52);
		stats(A);
		Janitor B = new Janitor("Blue",100,true);
		stats(B);
		NovinceJanitor C = new NovinceJanitor("Blue",25);
		stats(C);
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
	private static void stats(Employee x) {
		System.out.println("HOURS: "+x.getHours());
		System.out.println("SALARY: "+x.getSalary());
		System.out.println("VACACTIONDAYS: "+x.getVacationDays());
		System.out.println("VACATIONFORM: "+x.getVacationForm());
		System.out.println(x);
	}
}
//System.out.println(
//		"I work "+a.getHours()+" weekly, make "
//+a.getSalary()+", have "
//+a.getVacationDays()+" vacation days, and fill out a "
//+a.getVacationForm()+" vacation form.");