package LCube;

import java.util.Scanner;

public class Product_ofArr {
	public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);
		 System.out.println("enter a size :");
		 int n = sc.nextInt();
		 
		 int[] arr = new int[n];
		 System.out.println("Enter the elements:");
		 for(int i =0;i<n;i++) {
			 arr[i]=sc.nextInt();
		 }
		 
		 for(int i=0;i<n;i++) {
			 int prod =1;
			 for(int j=0;j<n;j++) {
				 if(i!=j) {
					 prod*=arr[j];
				 }
			 }
			 System.out.print(prod+" ");
		 }
	}
}
