package Task;

import java.util.Scanner;

public class Small_num {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter 1st num");
		int num1 = sc.nextInt();
		
		System.out.println("Enter 2nd num");
		int num2 = sc.nextInt();
		
		System.out.println("Enter 3rd num");
		int num3 = sc.nextInt();
		
		if (num1< num2 && num1 < num3) {
			System.out.println("Smallest num : "+num1);
		}
		else if(num2 < num1 && num2 <num3) {
			System.out.println("Smallest num : "+num2);
		}
		else {
			System.out.println("Smallest :" + num3);
		}
	}

}
