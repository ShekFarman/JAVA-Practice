package Array_tasks;

import java.util.Scanner;

public class Sum_sub_arr {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter size");
		int size = sc.nextInt();
		
		System.out.println("Enter values");
		int[] arr=new int[size];
		for(int i=0;i<size;i++) {
			arr[i]=sc.nextInt();
		}
		
		int maxsum =arr[0];
		int start =0;
		int end =0;  
		for(int i =0 ;i<size ;i++) {// -2 1 -3 4 -1 2 1 -5 4
			int sum =0;
			for(int j=i;j<size;j++) {
				sum += arr[j];
				
				if (sum < maxsum) {
					maxsum =sum;
					start =i;
					end =j;
					
				}
			}
		}
		System.out.println(maxsum);
		for(int i =start ; i<=end ;i++) {
			System.out.print(arr[i] +" ");
		}
		sc.close();
	}
}
