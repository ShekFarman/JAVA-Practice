package Array_tasks;

import java.util.Scanner;

public class Arr_cons {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter size");
		int size = sc.nextInt();
		

		System.out.println("Enter values");
		int[] arr=new int[size];
		for(int i=0;i<size;i++) {
			arr[i]=sc.nextInt();
		}
		for(int i =0;i<size-1;i++) {
			for(int j=0;j<size-1-i;j++) {
				if( arr[j] > arr[j+1]) {
				int temp = arr[j];
				arr[j]=arr[j+1];
				arr[j+1]=temp;
				}
			}
		}
		boolean cons =false;
		for(int i=0;i<size -1;i++) {
			if(arr[i]+1==arr[i+1]) {
				cons=true;
				break;
				}
		}
		if(cons) {
			System.out.println("Consicutive");
		}else {
			System.out.println("Not Consicutive");
		}
		
	}

}
