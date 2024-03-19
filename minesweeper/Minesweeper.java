package minesweeper;

public class Minesweeper {
	private int[][] map;
	public Minesweeper(int[][] mat) {
		map = mat;
	} 
	/* * The inBounds method takes in a row and column 
	  number for a position on the * board. It returns whether 
	  or not the row and column number are within * the bounds 
	  of the board. */
	public boolean inBounds(int row, int col) {
		if (row>-1 && row<map.length) 
			if(col>-1 && col<map[0].length)
				return true;
		return false;
	} 
	/* * The countMines method takes in a row and column
	   number that represent a space * or position on the board
	   . It returns how many mines surround the space. Mines * 
	   are represented by the number -1. If the space has a `
	   mine in it, then just * return -1 and don't count the 
	   number of mines surrounding it. */
	public int countMines(int theRow, int theCol) {
		if (map[theRow][theCol]==-1) return -1;
		int count=0,i,j;
		for (i=theRow-1;i<=theRow+1;i++)
			for (j=theCol-1;j<=theCol+1;j++)
				if (inBounds(i,j) && map[i][j]==-1) count++;
		return count;
	}
//	public int countMines(int theRow, int theCol) {
//	    if (map[theRow][theCol] == -1) return -1;
//	    int count = 0;
//	    for (int i = theRow - 1; i <= theRow + 1; i++) {
//	        for (int j = theCol - 1; j <= theCol + 1; j++) {
//	            if (i >= 0 && i < map.length && j >= 0 && j < map[0].length && map[i][j] == -1) {
//	                count++;
//	            }
//	        }
//	    }
//	    return count;
//	}
	/* * The allMineTallies method creates a new matrix that
	 * keeps track of * all the mine counts for every position 
	 * on the board, returning this * new matrix. In other words, 
	 * it will call the countMines() method * for every position 
	 * on the board and place these counts in a new matrix. */
	public int[][] allMineTallies() {
		int i,j,I=map.length,J=map[0].length;
		int[][] show = new int[I][J];
		for(i=0;i<I;i++)
			for(j=0;j<J;j++)
				show[i][j]=countMines(i,j);
		return show;
	}
	/* * The printMatrix method takes in any matrix and prints 
	 * it out * in row-major order. */
	public void printMatrix(int[][] matrix) {
		for(int[] i:matrix) {
			for(int j:i)
				System.out.print(j+" ");
			System.out.println();
		}
		
	}

}
