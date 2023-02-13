package week3.day1;

public class CharacterOccurance {
	public static void main(String[] args) {
		//declare the string
		String a="Hexaware";
		//convert string to character
		char[] b=a.toCharArray();
		//initialize temporary variable count as 0
		int count=0;
		//iterate the characters
		for(int i=0;i<b.length;i++) {
			
			///Length is a property and it will return integer
			//check the condition, if it matches increase the count value
			if(b[i]=='e') {
				count++;
				
			}
		//print the count value	
		}System.out.println("count="+count);
	}

}
