package Array_tasks;

import java.util.Scanner;

public class Odd_even {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter size");
		int size = sc.nextInt();
		

		System.out.println("Enter values");
		int[] arr=new int[size];
		for(int i=0;i<size;i++) {
			arr[i]=sc.nextInt();
		}
		 int j=0;
		 for(int i=1;i<size;i++) {
			 if(arr[i]%2==0) {
				 int temp = arr[i];
				 arr[i]=arr[j];
				 arr[j]=temp;
				 j++;
			 }
		 }
		 for(int i=0;i<size;i++) {
			 System.out.print(arr[i]+ " ");
			 
		 }
	}
}
