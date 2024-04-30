package _APSET_Classes;

import java.util.ArrayList;
import java.util.List;

public class CombinedTable{
	public static void main(String[] args) {
		List<SingleTableObj> table = new ArrayList<SingleTableObj>() {{
			add(new SingleTableObj(4, 74, 60.0));
			add(new SingleTableObj(8, 74, 70.0));
			add(new SingleTableObj(12, 76, 75.0));
		}};

		List<CombinedTableObj> tables = new ArrayList<CombinedTableObj>() {{
			add(new CombinedTableObj(table.get(0), table.get(1)));
			add(new CombinedTableObj(table.get(1), table.get(2)));
		}};
		for(CombinedTableObj i: tables) {
			System.out.println("Can the table seat 9 people? " + i.canSeat(9));
			System.out.println("Can the table seat 11 people? " + i.canSeat(11));
			System.out.println("Desirability of the table: " + i.getDesirability());
			table.get(1).setViewQuality(90.0);
			System.out.println("Set view quality to 90.0 and get the updated desirability: " + i.getDesirability());
		}

	}
}

// Define SingleTable class that implements the Table interface
class SingleTableObj {
	private int numSeats;
	private int height;
	private double viewQuality;

	public SingleTableObj(int numSeats, int height, double viewQuality) {
		this.numSeats = numSeats;
		this.height = height;
		this.viewQuality = viewQuality;
	}


	public int getNumSeats() {
		return numSeats;
	}


	public int getHeight() {
		return height;
	}


	public double getViewQuality() {
		return viewQuality;
	}

	public void setViewQuality(double value) {
		this.viewQuality = value;
	}
}

// Define CombinedTable class that takes two Table objects
class CombinedTableObj {
	private SingleTableObj table1;
	private SingleTableObj table2;

	public CombinedTableObj(SingleTableObj table1, SingleTableObj table2) {
		this.table1 = table1;
		this.table2 = table2;
	}

	public boolean canSeat(int n) {
		if(table1.getNumSeats()+table2.getNumSeats()-2>=n) {
			return true;
		}
		return false;
	}

	public double getDesirability() {
		if (table1.getHeight() == table2.getHeight()) {
			return (table1.getViewQuality() + table2.getViewQuality()) / 2;
		} else {
			return (table1.getViewQuality() + table2.getViewQuality()) / 2 - 10;
		}
	}
}