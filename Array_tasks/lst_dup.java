package Array_tasks;

import java.util.Scanner;

public class lst_dup {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter size");
		int size = sc.nextInt();
		
		

		System.out.println("Enter values");
		int[] arr=new int[size];
		
		for(int i=0;i<size;i++) {
			arr[i]=sc.nextInt();
		}
		//4 2 7 5 2 9 7 1 
		int dup =0;
		for(int i=0;i<size;i++) {
			for(int j=i+1;j<size;j++) {
				if(arr[i]==arr[j]) {
					dup=arr[j];
				}
			}
		}
		System.out.println(dup);
	}

}
