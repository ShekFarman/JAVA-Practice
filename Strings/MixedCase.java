package Strings;

import java.util.Scanner;

public class MixedCase {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the alpha :");
		String str= sc.nextLine();
		String op ="";  
		for(int i = 0 ; i<str.length();i++) {
			char c = str.charAt(i);
			int val = ((int)c);
			
			if(val<91) {
				if(val==90) {
					val+=7;
				}else {
				val+=33;
				}
			}else {
				if(val==122) {
					val=65;
				}else {    
					val-=31;
				}
			}
			op += ((char)val);
			
		}
		System.out.println(op);
	}
}
