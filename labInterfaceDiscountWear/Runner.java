package labInterfaceDiscountWear;
interface Discountable {
    double originalPrice();
    double discountPrice();
}

interface Wearable {
    String getName();
    int numItemsInSet();
}

class Paper implements Discountable {
    public String paperType;
    private double originalPrice;

    public Paper(String paperType, double originalPrice) {
        this.paperType = paperType;
        this.originalPrice = originalPrice;
    }

    @Override
    public double originalPrice() {
        return originalPrice;
    }

    @Override
    public double discountPrice() {
        return originalPrice * 0.85; // 15% discount
    }
}

class EarringSet implements Discountable, Wearable {
    private double originalPrice;
    private String name;
    private int numItemsInSet;

    public EarringSet(double originalPrice, String name, int numItemsInSet) {
        this.originalPrice = originalPrice;
        this.name = name;
        this.numItemsInSet = numItemsInSet;
    }

    @Override
    public double originalPrice() {
        return originalPrice;
    }

    @Override
    public double discountPrice() {
        return originalPrice - 50; // $50 discount
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public int numItemsInSet() {
        return numItemsInSet;
    }
}

public class Runner {
    public static void main(String[] args) {
        Paper paper = new Paper("Notebook", 10.0);
        System.out.println("Paper:");
        System.out.println("Type: " + paper.paperType);
        System.out.println("Original Price: $" + paper.originalPrice());
        System.out.println("Discounted Price: $" + paper.discountPrice());

        System.out.println();

        EarringSet earringSet = new EarringSet(100.0, "Skull Earrings", 2);
        System.out.println("Earring Set:");
        System.out.println("Name: " + earringSet.getName());
        System.out.println("Number of Items in Set: " + earringSet.numItemsInSet());
        System.out.println("Original Price: $" + earringSet.originalPrice());
        System.out.println("Discounted Price: $" + earringSet.discountPrice());
    }
}
