package Final_Project;

import java.util.ArrayList;

public class Solver {
    public static void main(ArrayList<double[]> matrix) {        
        // Perform row reduction algorithm 
        for (int i = 1; i < matrix.size(); i++) {
            double factor = matrix.get(i)[0] / matrix.get(0)[0];
            for (int j = 0; j < matrix.get(i).length; j++) {
                matrix.get(i)[j] -= factor * matrix.get(0)[j];
            }
        }
        // Print the row-reduced matrix
        for (double[] row : matrix) {
            for (double element : row) {
                System.out.print(element + " ");
            System.out.println();
        }
    }
}