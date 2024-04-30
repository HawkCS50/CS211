package chemSyntaxParserBroken;

import java.util.*;

public class Solver {
    public static Double[][] MapToMatrix(Map<String, Double[]> compounds) {
        int rows = compounds.size();
        int cols = Run.chemicals.size();
        Double[][] matrix = new Double[rows][cols];
        int rowIndex = 0;
        for (Map.Entry<String, Double[]> entry : compounds.entrySet()) {
            matrix[rowIndex++] = entry.getValue();
        }
        return matrix;
    }

    // Method to row reduce a 2D array
    public static Double[] extractWeights(Double[][] matrix) {
        // Row reduce the array
        Double[][] reducedArray = rowReduce(matrix);
        Run.printMatrix(reducedArray);
        // Extract the last column and find the Least Common Multiple (LCM)
        Double[] lastColumn = new Double[reducedArray.length];
        int cols = reducedArray[0].length;
        for (int i = 0; i < reducedArray.length; i++) {
            lastColumn[i] = Math.abs(reducedArray[i][cols - 1]);
        }
        Double lcm=3.0;
        //Double lcm = 1.0*LCDetermination.determineLCD(lastColumn);
        // Multiply each number in the last column by the LCM
        for (int i = 0; i < reducedArray.length; i++) {
            lastColumn[i] *= lcm;
        }
        // Fill the last entry with the LCM
        lastColumn[reducedArray.length - 1] = lcm;
        System.out.println(lcm);
        return lastColumn;
    }

    private static Double[][] rowReduce(Double[][] matrix) {
        int numRows = matrix.length;
        int numCols = matrix[0].length;

        for (int row = 0; row < numRows; row++) {
            // Find the leading entry in this row
            int leadingCol = -1;
            for (int col = 0; col < numCols; col++) {
                if (matrix[row][col] != 0) {
                    leadingCol = col;
                    break;
                }
            }

            // If there's a leading entry, make it 1 and perform row operations
            if (leadingCol != -1) {
                // Make the leading entry 1
                Double leadingEntry = matrix[row][leadingCol];
                for (int col = leadingCol; col < numCols; col++) {
                    matrix[row][col] /= leadingEntry;
                }

                // Perform row operations to make all other entries in the leading column zero
                for (int otherRow = 0; otherRow < numRows; otherRow++) {
                    if (otherRow != row && matrix[otherRow][leadingCol] != 0) {
                        Double factor = -matrix[otherRow][leadingCol];
                        for (int col = leadingCol; col < numCols; col++) {
                            matrix[otherRow][col] += factor * matrix[row][col];
                        }
                    }
                }
            }
        }

        return matrix;
    }
}
