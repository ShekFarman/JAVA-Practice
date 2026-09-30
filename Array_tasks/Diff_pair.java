package Array_tasks;

import java.util.Scanner;

public class Diff_pair {
	public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			System.out.println("enter size");
			int size = sc.nextInt();
			
			

			System.out.println("Enter values");
			int[] arr=new int[size];
			for(int i=0;i<size;i++) {
				arr[i]=sc.nextInt();
			}
			System.out.println("enter difference ");
			int dif = sc.nextInt();
			
			for(int i = 0; i < size - 1; i++) {
				for(int j = i+1; j<size ; j++) {
					if (arr[j] - arr[i]==dif) {
						System.out.println(arr[i]+" "+ arr[j]);
						return;
					}
					
				}
			}
	}

}
