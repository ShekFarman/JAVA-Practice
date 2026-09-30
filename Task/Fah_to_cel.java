package Task;

import java.util.Scanner;


public class Fah_to_cel {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the Celsius value \t");
		
		float cel = sc.nextFloat();
		
		float fah =(cel*9/5)+32;
		
		System.out.println("Fahrenheit value is : "+ fah);
		
	}
}
