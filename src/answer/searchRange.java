package answer;

import java.util.Arrays;

public class searchRange {
	// sorted array
	public static void main(String[] args) {
		int[] arr = { 5, 7, 7, 8, 8, 10 };
		int target = 11;

		System.out.println(Arrays.toString(searchRange(arr, target)));

	}

private static int[] searchRange(int[] arr, int target) {
		int[] ans = { -1, -1 };
		// check for first occuranse of target first
		ans[0] = search(arr, target, true);
		ans[1] = search(arr, target, false);
		return ans;

	}

	// this function just return the index value of target
	private static int search(int[] arr, int target, boolean findStartIndex) {
		int ans = -1;
		int start = 0;
		int end = arr.length-1;
		while (start <= end) {
			int mid = start + (end - start) / 2;
//			(2start + end -  start)/2
			if (arr[mid] == target) {
				// potential answer is found
				ans = mid;
				if (findStartIndex) {
					end = mid - 1;
				} else {
					start = mid + 1;
				}
			}
			if (arr[mid] > target) {
				end = mid - 1;
			} else {
				start = mid + 1;
			}

		}
		return ans;

	}

}
