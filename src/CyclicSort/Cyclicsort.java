package CyclicSort;

import java.util.Arrays;

public class Cyclicsort {
	public static void main(String[] args) {
//		3,5,2,1,4  // n=5
		// 0 1 2 3 4 
		// 1 2 3 4 5
		// when given nos from range 1, N => use cyclic sort
		int[] arr = {3,5,2,1,4};
		cyclicSort(arr);
		System.out.println(Arrays.toString(arr));
	}

	private static void cyclicSort(int[] arr) {
		int length = arr.length-1;
		int start = 0;
		while(start <= length) {
			if(arr[start] == start+1) {
				start++;
				continue;
			}
			swap(arr, arr[start]-1, start);
		}
	}

	private static void swap(int[] arr, int i, int j) {
		int temp = arr[j];
		arr[j] = arr[i];
		arr[i] = temp;
		
	}

}
