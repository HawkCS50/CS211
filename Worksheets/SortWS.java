package Worksheets;
import java.util.Arrays;
public class SortWS {
	public static void main(String[] args) {
		int[] primary = {15, 7, 2, 19, 3, 1, -10, 40, 23, -30, 45, 8, 13},
				arr=primary;
		
		System.out.println("Unsorted Arr: "+Arrays.toString(arr));
		System.out.println("Selection Sort Increasing: " +Arrays.toString(arr));
		increasingSelectionSort(arr);
		arr=primary;
		System.out.println("Selection Sort Decreasing: " +Arrays.toString(arr));
		decreasingSelectionSort(arr);
		arr=primary;
		System.out.println("Insertion Sort Increasing: " +Arrays.toString(arr));
		incInsertSort(arr,1);
		arr=primary;
		System.out.println("Insertion Sort Decreasing: " +Arrays.toString(arr));
		decInsertSort(arr,1);
	}
	
	static void increasingSelectionSort(int[] arr) {
	    for (int i = 0; i < arr.length - 1; i++)
	        for (int j = i + 1; j < arr.length; j++)
	            if (arr[j] < arr[i]) {
	            	arr[i] ^= arr[j]; arr[j] ^= arr[i]; arr[i] ^= arr[j];
	            	System.out.println(Arrays.toString(arr));
	            }
	}
	static void decreasingSelectionSort(int[] arr) {
	    for (int i = 0; i < arr.length - 1; i++)
	        for (int j = i + 1; j < arr.length; j++)
	            if (arr[j] > arr[i]) {
	            	arr[i] ^= arr[j]; arr[j] ^= arr[i]; arr[i] ^= arr[j];
	            	System.out.println(Arrays.toString(arr));
	            }
	}
	public static void incInsertSort(int[] arr, int i) {
	    if (i < arr.length) {
	        for(int j =i;j > 0 && arr[j - 1] > arr[j]; j--) {
	            int temp = arr[j];
	            arr[j] = arr[j - 1];
	            arr[j - 1] = temp;	      
            	System.out.println(Arrays.toString(arr));
	            }
	        incInsertSort(arr, i + 1);
	    }
	}
	public static void decInsertSort(int[] arr, int i) {
	    if (i < arr.length) {
	        for(int j =i;j > 0 && arr[j - 1] < arr[j]; j--) {
	            int temp = arr[j];
	            arr[j] = arr[j - 1];
	            arr[j - 1] = temp;	        
            	System.out.println(Arrays.toString(arr));
	        decInsertSort(arr, i + 1);
	    }
	}
	


	}


}
