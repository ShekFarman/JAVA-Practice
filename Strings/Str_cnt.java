package Strings;

import java.util.Scanner;

public class Str_cnt {

	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		int num[]=new int[26];
		
		System.out.println("enter the text : ");
		String n=sc.nextLine();
		
		for(int i=0;i<n.length();i++) {
			
			int temp=((int)n.charAt(i));
			if(temp<91) {
				temp+=32;
			}
			temp-=97;
			num[temp]++;
		}
		
		for(int i=0;i<n.length();i++) {
		
				int temp=((int)n.charAt(i));
				if(temp<91) {
					temp+=32;
				}
				temp-=97;
				if(num[temp]>0) {
					System.out.println(n.charAt(i)+"="+num[temp]);

				}
				if(num[temp]>1) {
					num[temp]=0;
				}
			
		}

	}

}

