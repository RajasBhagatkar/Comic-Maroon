package newPackage;

import java.util.Arrays;

public class SearchInStrings {
	public static void main(String[] args) {
		
		String name = "Comic Maroon";
		char target = 'Z';
//		System.out.println(search(name, target));

//		System.out.println(search2(name, 'n'));

//		System.out.println(Arrays.toString(name.split("")));
		
//		System.out.println(search3(name, 'c'));
		
		System.out.println("ComicMaroon".contentEquals(name));
		System.out.println(new int[] {1,2,3,4,5});
		
			
	}

	static boolean search(String str, char target) {
		if(str.length()==0) return false;
		
		for (int i = 0; i < str.length(); i++) {
//			char current = str.charAt(i);
			if(target == str.charAt(i)) {
				return true;
			}

		}

		return false;
	}
	

	static boolean search2(String str, char target) {
		if(str.length()==0) return false;
		for(char ch: str.toCharArray()) {
			if(ch==target) return true;
		}
		

		return false;
	}

	static boolean search3(String str, char target) {
		if(str.length()==0) return false;

		for(String ch : str.split("")) {
			if(ch.equals(target)) {
				return true;
			}
			
		}
		

		return false;
	}
	
	
	
}
