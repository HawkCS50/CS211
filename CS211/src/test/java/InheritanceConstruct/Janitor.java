package InheritanceConstruct;

public class Janitor extends Employee {
	private boolean supplies;
	public Janitor(String vac,double bono,boolean s) {
		super(vac, bono);	
		supplies = s;
		super.setHours(getHours()*2);
		super.setSalary(getSalary()-10000);
		super.setVacationDays(getVacationDays()/2);
	}
	public void clean() {
		System.out.println("Workin' for the man.");
	}
	@Override
	public 
	@Override
	public String toString() {
		  return "I work " + getHours() + 
				  " hours weekly, make $" + 
				  getSalary() + ", have " + 
				  getVacationDays() + 
				  " vacation days, and fill out a " + 
				  getVacationForm() + " vacation form."
				  +supplies();
		}
	private String supplies() {
		if (supplies) return "I have all the supplies I need!";
		else return "BUT I NEED SUPPLIES";
	}
	
}
