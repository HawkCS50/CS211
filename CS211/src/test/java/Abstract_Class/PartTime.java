package Abstract_Class;

public class PartTime extends Student{
	public PartTime(String n,int cr) {
		super(n,cr);
	}
	public double tuition() {
		return 300*super.cr(); 
	}
	public String toString() {
		return "My name is  
	}
}
