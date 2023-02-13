package week3.day1;

public class Palindrom {
	public static void main(String[] args) {
		String pal="malayalam";
		//create another string to store the reverse string
		String rev="";
		//since we are giving the input value as string we have to use length() property
		//If it is a char value we can simply give length
		for(int i=pal.length()-1;i>=0;i--) {
			//we don't have any direct iteration or property  to reverse a string
			//hence we are using this method
			rev=rev+pal.charAt(i);
					}System.out.println(rev);

		if(pal.equals(rev)) {
			System.out.println("The given string is a palindrome");
		}
		else
			
			System.out.println("The given string is not a palindrome");
		}

}

