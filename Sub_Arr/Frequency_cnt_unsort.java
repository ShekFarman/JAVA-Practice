package Sub_Arr;

import java.util.Scanner;

public class Frequency_cnt_unsort {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter size");
		int size = sc.nextInt();
		
		System.out.println("Enter values");
		int[] arr=new int[size];
		for(int i=0;i<size;i++) {
			arr[i]=sc.nextInt();
		}
		 for (int i = 0 ;i < size ; i++) {
			 for(int j = 0; j < size-i-1; j++) {
				 if(arr[j]>arr[j+1]) {
					 int temp = arr[j+1];
					 arr[j+1]=arr[j];
					 arr[j]=temp;
				 }
			 }
		 }
		 
		 int cnt = 1;
		 for(int i = 1;i < size; i++) {
			 if(arr[i]==arr[i-1]) {
				 cnt++;
			 }else {
				 System.out.println(arr[i-1]+" -> "+cnt);
				 cnt=1;
			 }
		 }
		 System.out.println(arr[ size-1 ]+" -> "+cnt);
	}

}
