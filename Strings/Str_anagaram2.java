package Strings;

import java.util.Arrays;
import java.util.Scanner;

public class Str_anagaram2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the String :");
		String txt = sc.nextLine();
		System.out.println("Enter the String :");
		String txt1 = sc.nextLine();
			
		if(txt.length()!= txt1.length()) {
			System.out.println("Anagram Not Possible");
		}else {
		
		char[] ft = txt.toCharArray();
		char[] ft1 = txt1.toCharArray();
		  
//		for(int i =0;i<txt.length();i++) {
//			for(int j = 0;j<txt.length()-1-i;j++) {
//				if((int)(ft[j])>(int)(ft[j+1])) {
//					char temp = ft[j];
//					ft[j]=ft[j+1];
//					ft[j+1]=temp;
//				}
//			}
//		}

//		for(int i =0;i<txt.length();i++) {
//			for(int j = 0;j<txt.length()-1-i;j++) {
//				if((int)(ft1[j])>(int)(ft1[j+1])) {
//					char temp = ft1[j];
//					ft1[j]=ft1[j+1];
//					ft1[j+1]=temp;
//				}
//			}
//		}
		
		Arrays.sort(ft);
		Arrays.sort(ft1);
		
//		int cnt =0;
//		for(int i =0;i<txt.length();i++) {
//			if(ft[i]==ft1[i]) {
//				cnt++;
//			}
//		}
//		
		
		
		if(Arrays.equals(ft, ft1)) {
			System.out.println("Anagram is Possible");
		}
		else {
			System.out.println("Anagram not possible....");
		}
	}
}
}

