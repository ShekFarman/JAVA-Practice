package Array_tasks;

import java.util.Scanner;

public class Rm_dup {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter size");
		int size = sc.nextInt();
		
		System.out.println("Enter values");
		int[] arr=new int[size];
		for(int i=0;i<size;i++) {
			arr[i]=sc.nextInt();
		}
		
		for(int i=0;i<size;i++) {
			boolean cnt =false;
			
			for(int j = 0; j < i; j++) {
				if( arr[i] == arr[j]) {
					cnt = true;
					break;
				}
			}
			if(cnt) {
				continue;
			}
		
		int count = 0;
		for(int j = 0 ;j < size ;j++) {
			if( arr[i] == arr[j]) {
				  count++;
			
			}
		
		}
			System.out.println(arr[i]+" = "+count);
		
		
		
		}
	}
}
