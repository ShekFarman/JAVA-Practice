package Lesson_notes;

import java.util.Scanner;

public class major_elment {
	public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);
		 
		 System.out.println("enter size");
			int size = sc.nextInt();
			

			System.out.println("Enter values");
			int[] arr=new int[size];
			for(int i=0;i<size;i++) {
				arr[i]=sc.nextInt();
			}
			 
			for(int i =0 ;i<size;i++) {
				 int count =0;
				 
				 for(int j=0;j<size;j++) {
					 if(arr[i]==arr[j]) {
						 count++;
					 }
				 }
				 if (count> size/2) {
					 System.out.print(arr[i]+" ");
					 break;
				 }
			}
	}

}
