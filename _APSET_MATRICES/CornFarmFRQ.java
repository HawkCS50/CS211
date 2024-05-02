package _APSET_MATRICES;
import java.util.Random;

public class CornFarmFRQ {
	public static void main(String[] args) {
		CornFarm farm = new CornFarm(5, 5);
		int[][] cornGrowth = farm.getAllCornGrowth();
		for (int[] row : cornGrowth) {
			for (int val : row) {
				System.out.print(val + " ");
			}
			System.out.println();
		}
	}
}

class CornFarm {
	private boolean[][] farm;

	public CornFarm(int rows, int cols) {
		farm = new boolean[rows][cols];
		Random rand = new Random();
		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < cols; j++) {
				farm[i][j] = rand.nextBoolean(); // Randomly load true and false values into farm
			}
		}
	}
	public boolean isOutsideTheFarm(int row, int col) {
		return row < 0 || row >= farm.length || col < 0 || col >= farm[0].length;
	}

	public int getCornGrowthInSpace(int row, int col) {
		if (!isOutsideTheFarm(row, col) && farm[row][col]) {
			return 11;
		}
		int count = 0;
		for (int r = row - 1; r <= row + 1; r++) {
			for (int c = col - 1; c <= col + 1; c++) {
				if (!isOutsideTheFarm(r, c) && farm[r][c]) {
					count++;
				}
			}
		}
		return count;
	}

	public int[][] getAllCornGrowth() {
		int[][] answer = new int[farm.length][farm[0].length];
		for (int r = 0; r < farm.length; r++) {
			for (int c = 0; c < farm[r].length; c++) {
				answer[r][c] = getCornGrowthInSpace(r, c);
			}
		}
		return answer;
	}
}
