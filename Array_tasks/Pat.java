package Array_tasks;

import java.util.Scanner;

public class Pat {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter size");
		int size = sc.nextInt();
		
		System.out.println("Enter values");
		int[] arr=new int[size];
		for(int i=0;i<size;i++) {
			arr[i]=sc.nextInt();
		}
		
		for(int i=0 ; i<size ;i++) {
			for(int j = i ; j<size ; j++) {
				for(int k =i; k<=j;k++) {
					System.out.print(arr[k]+" ");
				}
				System.out.println();
			}
		}
	}

}
