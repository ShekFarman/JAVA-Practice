package Strings;

import java.util.Scanner;

public class Next_alphabet {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the alpha :");
		String str= sc.nextLine();
		String op ="";  
		for(int i = 0 ; i<str.length();i++) {
			char c = str.charAt(i);
			int val = ((int)c)-96;
			int temp = val %26 +97;
			op += ((char)temp);
		}
		System.out.println(op);
	}

}
