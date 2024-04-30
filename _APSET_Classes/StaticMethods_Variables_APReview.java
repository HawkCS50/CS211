package _APSET_Classes;

import java.util.ArrayList;
import java.util.List;
import java.util.*;

public class StaticMethods_Variables_APReview {

    // Part E:
    static Rectangle uno = new Rectangle(17, 8);
    static Rectangle dos = new Rectangle(13, 10);

    public static void main(String[] args) {
        // Part F:
        System.out.println("System.out.println(uno): " + uno); // OR
        System.out.println("System.out.println(uno.toString()): " + uno.toString());

        // Part G:
        Rectangle blah = dos.doubleRectangle();
        System.out.println("blah = dos.doubleRectangle(): " + blah);
        // Part H:
        double theResult = uno.totalDiagonal(dos);
        System.out.println("theResult = uno.totalDiagonal(dos): " + theResult);

        Werewolf bud = new Werewolf("Arooo!");
        System.out.println("Werewolf bud = new Werewolf(\"Arooo!\"): " + Werewolf.isOverPopulated()); // false

        Werewolf teenWolf = new Werewolf("Bark!");
        System.out.println("Werewolf teenWolf = new Werewolf(\"Bark!\"): " + Werewolf.isOverPopulated()); // false

        Werewolf imposter = new Werewolf("Meow!");
        System.out.println("Werewolf imposter = new Werewolf(\"Meow!\"): " + Werewolf.isOverPopulated()); // false

        Werewolf akela = new Werewolf("Howl");
        System.out.println("Werewolf akela = new Werewolf(\"Howl\"): " + Werewolf.isOverPopulated()); // true

        akela.addTooth(0.05);
        System.out.println("akela.addTooth(0.05): " + akela.hasHealthyTeeth()); // true

        akela.addTooth(0.12);
        System.out.println("akela.addTooth(0.12): " + akela.hasHealthyTeeth()); // true

        akela.addTooth(0.34);
        System.out.println("akela.addTooth(0.34): " + akela.hasHealthyTeeth()); // false

        akela.addTooth(0.01);
        System.out.println("akela.addTooth(0.01): " + akela.hasHealthyTeeth()); // true

        akela.addTooth(0.99);
        System.out.println("akela.addTooth(0.99): " + akela.hasHealthyTeeth()); // false

    }
}

class Werewolf {
    private String scream;
    private static int currentWolfPopulation;
    private final static int OVERPOPULATION_LIMIT = 3;
    private final static double TOOTH_DECAY_LIMIT = 0.15;
    private List<Double> toothDecayList;

    public Werewolf(String noise) {
        scream = noise;
        toothDecayList = new ArrayList<>();
        currentWolfPopulation++;
    }

    public static boolean isOverPopulated() {
        return currentWolfPopulation > OVERPOPULATION_LIMIT;
    }

    public void addTooth(double levelToothDecay) {
        toothDecayList.add(levelToothDecay);
    }

    public boolean hasHealthyTeeth() {
        long numHealthyTeeth = toothDecayList.stream().filter(d -> d < TOOTH_DECAY_LIMIT).count();
        return (double) numHealthyTeeth / toothDecayList.size() >= 0.70;
    }
}

class Rectangle {
    private int len, wid;

    public Rectangle(int length, int width) {
        len = length;
        wid = width;
    }

    public int getLength() {
        return len;
    }

    public int getWidth() {
        return wid;
    }

    public double diagonal() {
        return Math.sqrt(len * len + wid * wid);
    }

    public String toString() {
        return "Length: " + len + ", Width: " + wid;
    }

    // Part A
    public double totalArea(Rectangle other) {
        return this.area() + other.area();
    }

    // Part B
    public double totalDiagonal(Rectangle other) {
        return this.diagonal() + other.diagonal();
    }

    // Part C
    public Rectangle doubleRectangle() {
        return new Rectangle(2 * len, 2 * wid);
    }

    // Part D
    public static Rectangle someRect(Rectangle rect1, Rectangle rect2, Rectangle rect3) {
        Random random = new Random();
        int chance = random.nextInt(4);

        switch (chance) {
            case 0:
                return rect1;
            case 1:
                return rect2;
            case 2:
                return rect3;
            default:
                return new Rectangle(rect1.len, rect1.wid); // Return the current object
        }
    }

    // Private method to calculate the area
    private double area() {
        return len * wid;
    }
}