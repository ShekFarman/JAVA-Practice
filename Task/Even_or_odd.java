package Task;

import java.util.Scanner;

public class Even_or_odd {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the number: ");
		int num = sc.nextInt();
		
		if(num % 2 ==0) {
			System.out.println("Its an Even number");
		}else {
			System.out.println("Its an Odd number");
		}
		
	}

}
