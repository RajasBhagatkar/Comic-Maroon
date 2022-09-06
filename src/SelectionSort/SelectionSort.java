package SelectionSort;

import java.util.Arrays;

public class SelectionSort {
	public static void main(String[] args) {
		//select element and put its correct index 
		int[] arr = {23,45,3,45,23,45,13,3};

		selectionSort(arr);

		System.out.println(Arrays.toString(arr));

	}

	static void selectionSort(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			// find the maximum item in the reminaing array and swap with correct index
			int last = arr.length-i-1;
			int maxIndex = getMaxIndex(arr, 0, last);
			swap(arr, maxIndex, last);
			
		}
	}
	private static int getMaxIndex(int[] arr, int start, int last) {
		int max = start;

		for (int index = start; index <= last; index++) {
			if(arr[index] > arr[max]) {
				max = index;
			}
		}
		return max;

	}
	
	private static void swap(int[] arr, int i, int j) {
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
		
	}

}
