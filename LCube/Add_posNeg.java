package LCube;

import java.util.Scanner;

public class Add_posNeg {
	public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);
		 System.out.println("enter a size :");
		 int n = sc.nextInt();
		 
		 int[] arr = new int[n];
		 System.out.println("Enter the elements:");
		 for(int i =0;i<n;i++) {
			 arr[i]=sc.nextInt();
		 }
		 int pos=0;
		 int neg=0;
		 
		 for (int i=0;i<n;i++) {
			 if(i%2==0) {
				 pos+=arr[i];
			 }
			 else {
				 neg+=arr[i];
			 }
		 }
		 System.out.println("Even index Sum :"+pos);
		 System.out.println("Even index Sum :"+neg);
		 
	}

}
