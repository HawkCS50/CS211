package Worksheets;
import java.util.Arrays;
public class SortWS {
	public static void main(String[] args) {
		int[] arr = {15, 7, 2, 19, 3, 1, -10, 40, 23, -30, 45, 8, 13};
		System.out.println("Unsorted Arr: "+Arrays.toString(arr));
		increasingSelectionSort(arr);
		System.out.println("Selection Sort Increasing: " +Arrays.toString(arr));
		decreasingSelectionSort(arr);
		System.out.println("Selection Sort Decreasing: " +Arrays.toString(arr));
		insertionSort(arr,1);
		System.out.println("Selection Sort Decreasing: " +Arrays.toString(arr));
	}
	static void increasingSelectionSort(int[] arr) {
	    for (int i = 0; i < arr.length - 1; i++)
	        for (int j = i + 1; j < arr.length; j++)
	            if (arr[j] < arr[i]) {
	            	arr[i] ^= arr[j]; arr[j] ^= arr[i]; arr[i] ^= arr[j];
	            }
	}
	static void decreasingSelectionSort(int[] arr) {
	    for (int i = 0; i < arr.length - 1; i++)
	        for (int j = i + 1; j < arr.length; j++)
	            if (arr[j] > arr[i]) {
	            	arr[i] ^= arr[j]; arr[j] ^= arr[i]; arr[i] ^= arr[j];
	            }
	}
	public static void insertionSort(int[] arr, int i) {
	    if (i < arr.length) {
	        int j = i;
	        while (j > 0 && arr[j - 1] > arr[j]) {
            	arr[i] ^= arr[j]; arr[j] ^= arr[i]; arr[i] ^= arr[j];	           
            	j--;
	        }
	        insertionSort(arr, i + 1);
	    }
	}





}
