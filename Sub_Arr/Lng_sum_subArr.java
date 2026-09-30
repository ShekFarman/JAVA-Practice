package Sub_Arr;

import java.util.Scanner;

public class Lng_sum_subArr {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter size");
		int size = sc.nextInt();
		
		System.out.println("Enter values");
		int[] arr=new int[size];
		for(int i=0;i<size;i++) {
			arr[i]=sc.nextInt();
		}
		System.out.println("enter a num");
		int k = sc.nextInt();
		int j=0;
		int max_num=0;
		int sum =0;
		int st =-1;
		int end = -1;
		
		for (int i =0;i<size;i++) {
			
			sum +=arr[i];
			while(sum > k) { 
				sum -=arr[j];
				i++;
			}
			
			if(sum==k) {
				int len = i-j-1;
				
				if(len > max_num) {
					max_num = len;
					st =j;
					end = i;
				}
			}
			
		}
		
		for(int i = st; i<end; i++) {
			System.out.println(arr[i]);
		}

	}
}
