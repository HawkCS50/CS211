package sortingNotes;

public class insertionSort {
	public static void main(String[] args) {
		int[] array = {5, 2, 8, 3, 1, 6};

		// Print the original array using memory addresses
		for (int i : array) {
			System.out.print(i + " ");
		}
		System.out.println();
		sort(array);
		for (int i : array) {
			System.out.print(i + " ");
		}
	}
	public static void sort(int[] something) {
		for (int i= 0; i<something.length; i++) {
			for (int j: something) {
				if (something[i]<j) {
					something[i]^=j;
					j^=something[i];
					something[i]^=j;
				}
				System.out.print(j);
			}
		System.out.print(" ");
		}
	}

}
