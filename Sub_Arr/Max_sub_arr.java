package Sub_Arr;

import java.util.Scanner;

public class Max_sub_arr {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter size");
		int size = sc.nextInt();
		
		System.out.println("Enter values");
		int[] arr=new int[size];
		for(int i=0;i<size;i++) {
			arr[i]=sc.nextInt();
		}
		int cur_sum =arr[0];
		int max_sum=arr[0];
		for(int i =1; i < size;i++) {
			if(cur_sum+arr[i]>arr[i]) {
				cur_sum += arr[i];
			}else {
				cur_sum = arr[i];
			}
			
			if(cur_sum >max_sum) {
				max_sum = cur_sum;
			}
		}
		System.out.println(max_sum);
	}

}
