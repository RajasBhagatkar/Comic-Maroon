package BinarySearch;

import java.util.Random;

public class MillionNumberGenratorSorted {
	public static void main(String[] args) {
		genrateRandomSortedNumbers(1000);
//		Random rand = new Random();
//		System.out.println(rand.nextInt(1000000));

	}

	private static void genrateRandomSortedNumbers(int range) {
		Random random = new Random();
		int count = 0;
		int million = 1000000;
		System.out.print(" { ");
		while (count < range) {
			int oldRandom = 0;
			int newRandom = random.nextInt(million);
			// new number should be greather than the previous number 
			if(newRandom > oldRandom) {
				System.out.print(newRandom+",");
				million--;
			}
			
//			System.out.print(newRandom + ",");
			count++;
		}
		System.out.print(" } ");

	}

}
