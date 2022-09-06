package answer;

public class letters {
	// find the smallest greater number
	public static void main(String[] args) {
		char[] arr = { 'c', 'f', 'j' };
		char target = 'g';

		System.out.println(nextGreatestLetter(arr, target));
		System.out.println();

	}

	private static char nextGreatestLetter(char[] arr, char target) {
		int start = 0;
		int end = arr.length;

		while (start <= end) {
			int mid = start + (end - start) / 2;
			if (arr[mid] > target) {
				end = mid - 1;
			} else {
				start = mid + 1;
			}
		}
		return arr[start];

	}

}
