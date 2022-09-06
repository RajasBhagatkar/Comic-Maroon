package newPackage;

public class SearchInRange {
	public static void main(String[] args) {
		int[] arr = {1,2,3,4,5,6};
		int target = 6;
		int values = LinearSearchInRange(arr, target, 1,4);
		System.out.println(values);
	}

	private static int LinearSearchInRange(int[] arr, int target, int start, int end) {
		if(start==0 | end ==0) return -1;

		for (int i = start; i < end; i++) {
			if(arr[i]==target) return i;
		}
		return -1;
	}
}
