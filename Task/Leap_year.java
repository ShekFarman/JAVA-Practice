package Task;

import java.util.Scanner;

public class Leap_year {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the year :");
		int year = sc.nextInt();
		
		if(year % 4 ==0 && year% 100 !=0 ) {
			System.out.println("its a Leap year !");
		}else {
			System.out.println("Not a leap year");
		}
		
	}

}
