package InheritanceConstruct;

public class Employee {
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
