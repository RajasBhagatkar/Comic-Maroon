package BubbleSort;

import java.util.Arrays;
import java.util.Random;

public class BubbleSort {
	public static void main(String[] args) {
		int[] arr = {1,3,5,1,2};
		bubblesort(arr);
		System.out.println(Arrays.toString(arr));
	}

	static void bubblesort(int[] arr) {
		boolean swap; // to check if 
		for (int i = 0; i < arr.length; i++) {
			swap = false;
			// if no value is swaping then the array is sorted 
			for (int j = 1; j < arr.length - i; j++) {
				if(arr[j] < arr[j-1]) {
					int temp = arr[j-1];
					arr[j-1] = arr[j];
					arr[j] = temp;
					swap=true;
				}
			}
			// if you did not swap for a particular value of i, it mean ithe array is sorted hence stop the program
			if(!swap) { // !false == true
				break;
			}
		}
	}
}
