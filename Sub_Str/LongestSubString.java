package Sub_Str;

import java.util.Scanner;

public class LongestSubString {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number :");
		String str = sc.nextLine();
		int st =0;
		int end = 0;
		int max=0;
		for(int i =0;i<str.length();i++) {
			int cnt =0;
			int sum =0;
			for (int j = i;j<str.length();j++) {
				
				if(str.charAt(j)=='1') {
					sum++;
				}else {
					sum--;
				}
				cnt++;
				if(sum==0) {
					if(cnt> max) {
						max=cnt;  
						System.out.println("\n      max: "+max);
						for(int k =i ;k<=j;k++) {
							System.out.print(str.charAt(k)+"  ");
						}
					}
				}
				
			}
			
		}
		
		
	}
}
