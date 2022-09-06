package newPackage;

import java.io.ObjectInputFilter.Status;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class test {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] arr = { 1, 2, 3, 4, 5,6 ,7};
		System.out.println(Arrays.toString(arr));
		swap(arr, 1, 5);
		
		System.out.print("Max Value ");
		System.out.println(max(arr));

		reverse(arr);
		System.out.println(Arrays.toString(arr));

	}

	private static void reverse(int[] arr) {
		for(int i=0; i<arr.length/2;i++) {
			swap(arr,i,arr.length-1-i);
		}
		
	}

	private static int max(int[] arr) {
//		1 2 23 9 18
		int maxItem = 0;
		for(int i=0; i<arr.length; i++) {
			if(maxItem<arr[i]) maxItem=arr[i];
		}
		
		
		return maxItem;
	}

	private static void swap(int[] arr, int i, int j) {
		try {
			int temp = arr[i];
			arr[i] = arr[j];
			arr[j] = temp;

		} catch (Exception e) {
			System.out.println(e);
		}
	}
}