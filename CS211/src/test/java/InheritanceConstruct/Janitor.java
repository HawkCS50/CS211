package InheritanceConstruct;

public class Janitor extends Employee {
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
