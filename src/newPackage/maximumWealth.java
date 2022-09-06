package newPackage;

public class maximumWealth {
	public static void main(String[] args) {
		int[][] arr = { { 1, 5 }, { 7, 3 }, { 3, 5 } };
		System.out.println(solution(arr));
		int[][] arr2 = {
				{3,2,1},
				{1,2,3}
		};
		System.out.println(solution(arr2));
	}

	private static int solution(int[][] arr) {
		int maxAmount = 0;
		for (int i = 0; i < arr.length; i++) {
			int maxUntilNow = 0;

			// loop through each and add them all together
			for (int j = 0; j < arr[i].length; j++) {
				maxUntilNow += arr[i][j];
			}

			// if maxUntilNow is greater then maxAmount is switched
			if (maxUntilNow > maxAmount) {
				maxAmount = maxUntilNow;
			}

			maxUntilNow = 0;

		}
		return maxAmount;
	}
}
