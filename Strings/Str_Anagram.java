package Strings;

import java.util.Scanner;

public class Str_Anagram {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the String :");
		String txt = sc.nextLine();
		System.out.println("Enter the String :");
		String txt1 = sc.nextLine();
		
		int[] alpha = new int[26];
		if(txt.length()==txt1.length()) {
		for(int i =0;i<txt.length();i++) {
			 int temp = ((int)txt.charAt(i)-97);
			 int temp1 = ((int)txt1.charAt(i)-97);
			alpha[temp]++;
			alpha[temp1]++;
		}
		
		int cnt =0;
		for(int i =0 ;i<txt.length();i++) {
			int temp = ((int)txt1.charAt(i)-97);
			if(alpha[temp]!=0 && alpha[temp]%2==0) {
				cnt++;
			}
		}
		if(cnt == txt.length()) {
			System.out.println("its anagram");
		}else {
			System.out.println("Not a Anagram");
		}
	}
	}
}
