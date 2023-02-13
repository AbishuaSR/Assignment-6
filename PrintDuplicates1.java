package week3.day1;

public class PrintDuplicates1 {
	public static void main(String[] args) {
		int [] a= {1,3,5,7,9,3,5,8,2,4};
		for (int i=0;i<a.length;i++) {
			for(int j=i+1;j<a.length;j++) {
				if(a[i]==a[j]) {
					System.out.println(a[i]);
				}
			}
			
			
			
			
		}
	}

}
