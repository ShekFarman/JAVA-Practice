package Task;

import java.util.Scanner;

public class Vote_eligible {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter your age ");
		int age = sc.nextInt();
		 
		String eligible=(age>=18)?"Eligible" : "Not Eligible";
		
		System.out.println(eligible);

	}

}
