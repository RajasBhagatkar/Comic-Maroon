package newPackage;

public class FindMin {
	public static void main(String[] args) {
		int[] arr = {18,12,-7,3,14,28};
		
		int values = findMin(new int[] {
				
		});
		System.out.println(values);
	}
	
	private static int findMin(int[] arr) {
		if(arr.length ==0) return Integer.MIN_VALUE;
		int minUntilNow = arr[0];
		for (int i : arr) {
			if(i < minUntilNow) minUntilNow = i;
		}
		return minUntilNow;
	}
}