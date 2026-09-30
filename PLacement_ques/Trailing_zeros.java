package PLacement_ques;

import java.util.Scanner;

public class Trailing_zeros {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int num = sc.nextInt();
		int summ=0;
		
		while(num%10==0) {
			   num/=10;
		}
		 System.out.print(num + " ");
	}

}
