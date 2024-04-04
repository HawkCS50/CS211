package Worksheets;
import java.util.ArrayList;
import java.util.Arrays;

public class APCOMPSCIFRQ05 {

	public  static void main(String[] args) {
		int[]a= {50,50,20,80,53};
		StudentRecord b = new StudentRecord(a);
		System.out.println(b.finalAverage());
	}
}
class StudentRecord {
	private int[] scores;
	
	public StudentRecord(int[] s) {
		scores=s;
	}
	private double average() {
		int sum=0;
		for (int a:scores) sum+=a;
		return 1.0*sum/scores.length;
	}
	private boolean hasImproved() {
		int temp=scores[0];
		for (int a:scores) if (a<temp) return false;
		return true;
	}
	public double finalAverage() {
		double avg=average();
		if (hasImproved()) for(int a=scores.length/2;a>-1;a--) avg-=scores[a]/scores.length;
		return avg;
	}
}
class StepTracker {
	private int StepGoal,TotalSteps,Days,ActiveDays;
	public StepTracker(int n) {
		StepGoal=n; }
	public double averageSteps() {
		return 1.0*TotalSteps/Days;
	}
	public void addDailySteps(int n) {
		TotalSteps+=n;
		if (n>TotalSteps) {
			ActiveDays++;
		}
	}
	public int activeDays() {
		return ActiveDays;
	}
}