package week2.day1;

import java.util.Arrays;

public class Anagram {
	public static void main(String[] args) {
		String text1="wait ";
		String text2="watch";
		
		if(text1.length()==text2.length()) {
			
			char[] array1 = text1.toCharArray();
			char[] array2 = text2.toCharArray();
			Arrays.sort(array1);
			Arrays.sort(array2);
			boolean result = Arrays.equals(array1, array2);
			
			if(result=true) {
				System.out.println(text1+"and"+text2);
			}
			else {
				System.out.println(text1+"and"+text2);
			}
		}
	}

}
