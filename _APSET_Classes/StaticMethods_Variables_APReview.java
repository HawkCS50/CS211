package _APSET_Classes;
import java.util.ArrayList;
import java.util.*;
public class StaticMethods_Variables_APReview {
    // Part E:
    static Rectangle uno = new Rectangle(17, 8);
    static Rectangle dos = new Rectangle(13, 10);

    public static void main(String[] args) {
        // Part F:
        System.out.println(uno); // OR
        System.out.println(uno.toString());

        // Part G:
        Rectangle blah = dos.doubleRectangle();

        // Part H:
        double theResult = uno.totalDiagonal(dos);
    }
    static class Werewolf {
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
    static class Rectangle {
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

}
