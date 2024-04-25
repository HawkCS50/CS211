package Final_Project;

import java.util.*;
public class LCDetermination {

    // Method to determine the least common denominator (LCD) from a Double array
    public static int determineLCD(Double[] arr) {
        int lcd = 1;
        for (Double num : arr) {
            // Get the denominator of each number
            int denominator = getDenominator(num);
            // Update the LCD using the current denominator
            lcd = lcm(lcd, denominator);
        }
        return lcd;
    }

    // Method to get the denominator of a Double number
    private static int getDenominator(Double num) {
        String[] parts = num.toString().split("\\.");
        if (parts.length == 1) {
            // If it's an integer, denominator is 1
            return 1;
        } else {
            // If it's a decimal, count the number of digits after the decimal point
            return (int) Math.pow(10, parts[1].length());
        }
    }

    // Method to calculate the least common multiple (LCM) of two integers
    private static int lcm(int a, int b) {
        return Math.abs(a * b) / gcd(a, b);
    }

    // Method to calculate the greatest common divisor (GCD) of two integers
    private static int gcd(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return Math.abs(a);
    }
}
