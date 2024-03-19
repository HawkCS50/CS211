package minesweeper;
public class MineRunner
{
	public static void main(String[] args)
	{
		int[][] mineLayout = { { -1, 0, 0, -1, 0, -1, -1, 0, 0 },
				{ 0, 0, -1, 0, 0, -1, 0, -1, 0 },
				{ -1, -1, 0, 0, -1, 0, -1, 0, -1 },
				{ -1, 0, 0, -1, 0, 0, 0, 0, -1 },
				{ 0, 0, 0, -1, 0, -1, -1, -1, 0 },
				{ 0, 0, 0, -1, -1, -1, 0, 0, -1 } };
		Minesweeper game = new Minesweeper(mineLayout);
		System.out.println(game.countMines(1, 1)); // Expected answer: 4
		System.out.println(game.countMines(1, 8)); // Expected answer: 2
		System.out.println(game.countMines(0, 4)); // Expected answer: 3
		System.out.println(game.countMines(1, 2)); // Expected answer: -1
		System.out.println(game.countMines(4, 0)); // Expected answer: 1
		System.out.println(game.countMines(0, 8)); // Expected answer: 1
		System.out.println(game.countMines(4, 4)); // Expected answer: 6
		System.out.println(game.countMines(5, 2)); // Expected answer: 2
		System.out.println(game.countMines(5, 1)); // Expected answer: 0
		System.out.print("\n\n");
		int[][] tallyMatrix = game.allMineTallies();
		game.printMatrix(tallyMatrix);
		/* Expected output:
		 *
		 * -1 2 2 -1 3 -1 -1 2 1 * 
		 * 3 4 -1 3 4 -1 5 -1 2 * 
		 * -1 -1 3 3 -1 3 -1 4 -1 * 
		 * -1 3 3 -1 4 4 4 5 -1 *
		 *  1 1 3 -1 6 -1 -1 -1 3 * 
		 *  0 0 2 -1 -1 -1 4 3 -1 
		 *  */
	}
}