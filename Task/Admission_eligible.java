package Task;

import java.util.Scanner;

public class Admission_eligible {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the Mark1 :");
		int mark1=sc.nextInt();
		
		System.out.println("Enter the Mark2 :");
		int mark2=sc.nextInt();
		
		System.out.println("Enter the Mark 3 :");
		int mark3=sc.nextInt();
		
		System.out.println("Enter the Mark 4  :");
		int mark4=sc.nextInt();
		
		System.out.println("Enter the Mark 5 :");
		int mark5=sc.nextInt();
		
		System.out.println("Enter the Attendence percentage :");
		int att = sc.nextInt();
		
		int total = mark1+mark2+mark3+mark4+mark5;
		double avg= total/5;
		
		System.out.println("your percentage is"+avg +"%");
		
		if (avg >=65 && att >= 75) {
			System.out.println("You  are eligible");
		}else {
			System.out.println("you are not eligible");
		}
		}

}
