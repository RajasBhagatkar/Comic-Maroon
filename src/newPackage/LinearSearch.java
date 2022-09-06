package newPackage;

import java.util.ArrayList;

public class LinearSearch {
	public static void main(String[] args) {
		int[] values = {1,2,3,4,5,6,7,8,9,10,11};
		int value = linearSearch(values, 10);
		System.out.println(value);
		System.out.println(values[value]);
//		what is this that is the most Important
		
		
	
	}

	
	// search in the array: return the index if item found 
	// otherwise if itme not found return -1
	
	static int linearSearch(int[] arr, int target) {
		if(arr.length==0) {
			return -1;
		}
		
		// check every element
		for(int i=0; i<arr.length; i++) {
			if(arr[i]==target) {
				return i;
			}
		}
		return -1;

	}
	
}
