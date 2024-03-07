package InheritanceConstruct;

public class Truck extends Car {
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