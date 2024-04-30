package _APSET_Classes;
import java.util.*;
public class StepTracker {
	public static void main(String[] args) {
		List<device> stuff= new ArrayList<device>() {{
			add(new StepTrackerVer1(1000));
			add(new StepTrackerVer2_WithList(1000));
		}};
		for (device a:stuff) {
			System.out.println("Object type: " + a.getClass().getSimpleName());
            System.out.println("Initial active days: " + a.activeDays());
            System.out.println("Initial average steps: " + a.averageSteps());
            
            a.addDailySteps(9000);
            System.out.println("Added 9000 steps. Active days: " + a.activeDays());
            System.out.println("Average steps: " + a.averageSteps());
            
            a.addDailySteps(5000);
            System.out.println("Added 5000 steps. Active days: " + a.activeDays());
            System.out.println("Average steps: " + a.averageSteps());
            
            a.addDailySteps(13000);
            System.out.println("Added 13000 steps. Active days: " + a.activeDays());
            
            a.addDailySteps(23000);
            a.addDailySteps(1111);
            System.out.println("Added 23000 and 1111 steps. Active days: " + a.activeDays());
            System.out.println("Average steps: " + a.averageSteps());

		}
	}
}
interface device {
	void addDailySteps(int steps);
	int activeDays();
	double averageSteps();
}

class StepTrackerVer1 implements device {
	private int minStep,totStep,day,actDay;
	public StepTrackerVer1(int min) {
		minStep=min;
		totStep=0;
		day=0;
		actDay=0;
	}
	public void addDailySteps(int steps) {
		day++;
		totStep+=steps;
		if(steps>=minStep) actDay++;
	}
	public int activeDays() {return actDay;}
	public double averageSteps() {
		if (day==0) return 0.0;
		return 1.0*totStep/day;
	}
}
class StepTrackerVer2_WithList implements device {
	private int minStep,actDay;
	private List<Integer> steps;

	public StepTrackerVer2_WithList(int min) {
		steps=new ArrayList<Integer>();
		minStep=min;
		actDay=0;
	}
	public void addDailySteps(int step) {
		steps.add(step);
		if(step>=minStep) actDay++;
	}
	public int activeDays() {return actDay;}
	public double averageSteps() {
		int avgSteps=0,size=steps.size();
		if (size==0) return 0.0;
		for(int i:steps) {
			avgSteps+=i;
		}
		return 1.0*avgSteps/size;
	}
}

