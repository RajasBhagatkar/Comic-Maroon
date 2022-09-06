package BinarySearch;

public class minvalueThanelement {
	public static void main(String[] args) {
		int[] arr = {2,4,6,9,11,12,14,20,36,48};
//		System.out.println(minValue(arr, 18));

		minValue(arr, 46);

	}

	private static int minValue(int[] arr, int target) {
		int start = 0;
		int end = arr.length;

		while(start <= end) {
			int mid = start + (end - start)/2;
			System.out.println(arr[mid]);
//			if(arr[mid]==target) {
//				return mid;
//			}
			if(arr[mid] > target) {
				end = mid-1;
			}else {
				start = mid+1;
			}
		}
//		return 0;
		System.out.println("this should be nearest Minimun ");
		System.out.println(arr[end]);
		return arr[end];
	}

}
