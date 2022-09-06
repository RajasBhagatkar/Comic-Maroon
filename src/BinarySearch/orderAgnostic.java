package BinarySearch;


public class orderAgnostic {
	public static void main(String[] args) {
		int[] arr = { 3, 3, 3, 5, 6, 9, 12, 14, 20, 33 };
		System.out.println(agnosticBinarySearch(arr, 20));
		int[] arr2 = {33,20,14,12,9,6,5,3,1,1};
		System.out.println(agnosticBinarySearch(arr2, 14));
	}
	
	private static int agnosticBinarySearch(int[] arr, int target) {
		int start = 0;
		int end = arr.length;
		boolean isAscending;
		
		if(arr[start] < arr[end-1]) 
			isAscending=true ;
		else 
			isAscending=false;
		
		while(start <= end) {
			if(isAscending) {
				int mid = start + (end - start)/2;
				if(arr[mid] == target)
				{
					return mid;
				}else if(arr[mid] > target){
					end = mid -1;
				}else {
					start = mid + 1;
				}
			}else {
				int mid = start + (end - start)/2;
				if(arr[mid] == target)
				{
					return mid;
				}else if(arr[mid] > target){
					start = mid + 1;
				}else {
					end = mid -1;
				}
				
			}
		}
			return Integer.MIN_VALUE;

	}
}
