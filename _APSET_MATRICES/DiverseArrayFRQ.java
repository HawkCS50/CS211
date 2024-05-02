package _APSET_MATRICES;

public class DiverseArrayFRQ {
	public static void main(String[] args) {
		int[][] diverseArr = {
			    {1, 3, 2, 7,3},
			    {10, 10, 4, 6, 2},
			    {5, 3, 5, 9, 6},
			    {7, 6, 4, 2, 1}
			};
		int[][] nondiverseArr = {
			    {1, 1, 5, 3, 4},
			    {12, 7, 6, 1, 9},
			    {8, 11, 10, 2, 5},
			    {3, 2, 3, 0, 6}
			};
		print2DArray(diverseArr);
		if(isDiverse(diverseArr)) System.out.println("Array above is diverse");
		print2DArray(nondiverseArr);
		if(!isDiverse(nondiverseArr)) System.out.println("Array above is not diverse");
		}
	public static int arraySum(int[] arr) {
		int b=0;
		for(int i:arr) 
			b+=i;
		return b;
	}
	public static int[] rowSums(int[][] arr) {
		int[] p = new int[arr.length];
		for(int i=0;i<arr.length;i++) {
			int[] a=arr[i];
			int tot=0;
			for(int j:a) 
				tot+=j;
			p[i]=tot;
		}
		for(int g:p) System.out.println(g);
		return p;
	}
	public static boolean isDiverse(int[][] arr2D) {
	    int[] rowSums = rowSums(arr2D);
	    for (int i = 0; i < rowSums.length - 1; i++) {
	        for (int j = i + 1; j < rowSums.length; j++) {
	            if (rowSums[i] == rowSums[j]) {
	                return false; // Found duplicate row sum, array is not diverse
	            }
	        }
	    }
	    return true; // No duplicate row sums found, array is diverse
	}

	public static void print2DArray(int[][] arr) {
	    System.out.println("Array: \n");
		for (int[] row : arr) {
	        for (int num : row) {
	            System.out.print(num + " ");
	        }
	        System.out.println();
	    }
	}
}
