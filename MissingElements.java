package week3.day1;

import java.util.Arrays;

public class MissingElements {
	public static void main(String[] args) {
		int [] a = {1,2,3,4,5,6,7,8,10};
		Arrays.sort(a);
		int n = a.length+1; 
		int sum =( n*(n+1)/2);
		for(int i =0; i<a.length; i++) {
			sum = sum - a[i]; 
		}
		System.out.println(sum);
}
}
