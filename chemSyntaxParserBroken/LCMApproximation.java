package chemSyntaxParserBroken;

import java.util.Arrays;

public class LCMApproximation {

    // Method to approximate the LCM of a Double array
    public static Double approximateLCM(Double[] arr) {
        // Convert Double array to integer array
        int[] intArr = convertToIntegerArray(arr);

        // Calculate the LCM of the integer array
        int lcm = calculateLCM(intArr);

        // Convert back to Double format
        return lcm / 1000000.0; // Adjust precision as needed
    }

    // Method to convert a Double array to an integer array
    private static int[] convertToIntegerArray(Double[] arr) {
        int[] intArr = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            intArr[i] = (int) (arr[i] * 1000000); // Preserve precision by multiplying by a large number
        }
        return intArr;
    }

    // Method to calculate the LCM of an array of integers
    private static int calculateLCM(int[] arr) {
        int lcm = arr[0];
        for (int i = 1; i < arr.length; i++) {
            // Check if the current element is zero
            if (arr[i] == 0) {
                continue; // Skip the current element and move to the next one
            }
            lcm = lcm(lcm, arr[i]);
        }
        return lcm;
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
