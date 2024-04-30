import java.util.*;

public class Main {
    public static void main(String[] args) {
        double repeatingDecimal = .666666; // Example repeating decimal
        int nonRepeatingPart = 0; // Non-repeating part of the decimal
        int repeatingPart = 3; // Repeating part of the decimal

        int numerator = (int) ((repeatingDecimal - nonRepeatingPart) * Math.pow(10, String.valueOf(repeatingPart).length()));
        int denominator = (int) (Math.pow(10, String.valueOf(repeatingPart).length()) - 1);

        int gcd = gcd(numerator, denominator);
        numerator /= gcd;
        denominator /= gcd;

        System.out.println(numerator + "/" + denominator);
    }

    public static int gcd(int a, int b) {
        if (b == 0) {
            return a;
        }
        return gcd(b, a % b);
    }
}