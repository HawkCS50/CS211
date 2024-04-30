package Final_Project;
import java.text.DecimalFormat;
import java.util.*

public class FactorFinder {
	public static void Factor(Double[] arr) {
        Double[] truncatedArr = new Double[arr.length];
        double factor = Math.pow(10, 5); // 10^5 for 5 decimal places

        for (int i = 0; i < arr.length; i++) {
            truncatedArr[i] = Math.round(arr[i] * factor) / factor;
        }
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
	    private static String convertDecimalToFraction(double x){
	        if (x < 0){
	            return "-" + convertDecimalToFraction(-x);
	        }
	        double tolerance = 1.0E-6;
	        double h1=1; double h2=0;
	        double k1=0; double k2=1;
	        double b = x;
	        do {
	            double a = Math.floor(b);
	            double aux = h1; h1 = a*h1+h2; h2 = aux;
	            aux = k1; k1 = a*k1+k2; k2 = aux;
	            b = 1/(b-a);
	        } while (Math.abs(x-h1/k1) > x*tolerance);

	        return h1+"/"+k1;
	    }
	}


