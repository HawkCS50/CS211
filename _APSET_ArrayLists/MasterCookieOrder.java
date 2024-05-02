package _APSET_ArrayLists;
import java.util.*;

class MasterCookieOrder {
    public static void main(String[] args) {
        MasterOrder goodies = new MasterOrder();
        goodies.addOrder(new CookieOrder("Chocolate Chip", 1));
        goodies.addOrder(new CookieOrder("Shortbread", 5));
        goodies.addOrder(new CookieOrder("Macaroon", 2));
        goodies.addOrder(new CookieOrder("Chocolate Chip", 3));

        System.out.println("Total Boxes: " + goodies.getTotalBoxes());
        System.out.println("Removed Chocolate Chip: " + goodies.removeVariety("Chocolate Chip"));
        System.out.println("Total Boxes after removal: " + goodies.getTotalBoxes());
    }
}

class MasterOrder{
	private ArrayList<CookieOrder> orders;

	public MasterOrder() {
		orders = new ArrayList<>();
	}

	public void addOrder(CookieOrder theOrder) {
		orders.add(theOrder);
	}

	public int getTotalBoxes() {
		int totalBoxes = 0;
		for (CookieOrder order : orders) {
			totalBoxes += order.getNumBoxes();
		}
		return totalBoxes;
	}

	public int removeVariety(String cookieVar) {
		int totalRemoved = 0;
		for (int i = orders.size() - 1; i >= 0; i--) {
			if (orders.get(i).getVariety().equals(cookieVar)) {
				totalRemoved += orders.get(i).getNumBoxes();
				orders.remove(i);
			}
		}
		return totalRemoved;
	}

}


class CookieOrder {
	private String variety;
	private int numBoxes;

	public CookieOrder(String variety, int numBoxes) {
		this.variety = variety;
		this.numBoxes = numBoxes;
	}

	public String getVariety() {
		return variety;
	}

	public int getNumBoxes() {
		return numBoxes;
	}
}
