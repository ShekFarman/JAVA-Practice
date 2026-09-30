package Strings;

import java.util.Scanner;

public class Cnt_num {
	public static void main(String[] args) {
		
		 Scanner sc = new Scanner(System.in);
		 System.out.println("Enter the String :");
		 String n = sc.nextLine();
		 
		 String temp ="";
		
		 for(int i =0;i<n.length();i++) {
			 int count =1;
			
			 for (int j =i;j<n.length();j++) {
				 if( n.charAt(i)==n.charAt(j)) {
					 count++;
				 }else {
					 break;
				 }
			 }
			 temp+=count;
			 temp+=n.charAt(i);
		 }
		 System.out.println(temp);
	}
}


