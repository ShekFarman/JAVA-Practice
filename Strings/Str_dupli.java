package Strings;

import java.util.Scanner;

public class Str_dupli {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] al = new int[26];
		System.out.println("Enter the text");
		String txt = sc.nextLine();
		
		
		for(int i =0;i<txt.length();i++) {
			 int temp = ((int)txt.charAt(i)-97);
			al[temp]++;
		}
		
		for(int i = 0;i<txt.length();i++) {
			int temp = ((int)txt.charAt(i)-97);
			if(al[temp]>1) {
				System.out.print((char)(temp+97)+" ");
				al[temp]=0;
			}
		}
	}

}
