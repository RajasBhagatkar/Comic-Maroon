package newPackage;

public class EventDigits {
	public static void main(String[] args) {
		int[] arr = {18, 124, 9, 1764, 98 , 12};
		int values = findNumbers(arr);
		System.out.println(values);
		System.out.println(even(0));
		
		System.out.println(digit2(16));
//		System.out.println(digit2(-1002020));
		
	}
	private static int digit2(int i) {
		return (int)(Math.log10(i) + 1);
	}
	static int findNumbers(int[] nums) {
		int count = 0;
		// find no of nos that have even number fo digits
		for(int num : nums) {
			if(even(num)) {
				count++;
			}
		}
		return count;
	}
	//funcion to check wheather the number container even digits of number or not
	private static boolean even(int nums) {
//		convert int string and get the length
		// count the number of digits
		int count = 0;
		while(nums > 0) {
			nums = nums/10;
			count++;
		}
		if (count%2==0) {
			return true;
		}
		return false;

	}

}
