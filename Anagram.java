package week3.day1;

import java.util.Arrays;

public class Anagram {
	public static void main(String[] args) {
		String text1="race";
		char[] a=text1.toCharArray();
		Arrays.sort(a);
		String text2="care";
		char[] b=text2.toCharArray();
		Arrays.sort(b);
		
		//Since we have array values we can't use .equals method for string instead we use .equals for array methods
		if(Arrays.equals(a,b)) {
				System.out.println("The word is anagram");
			}else { 
				System.out.println("The word is not a anagram");
			}	
		}
	}


