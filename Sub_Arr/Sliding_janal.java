package Sub_Arr;

import java.util.Scanner;

public class Sliding_janal {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter size");
		int size = sc.nextInt();
		
		System.out.println("Enter values");
		int[] arr=new int[size];
		for(int i=0;i<size;i++) {
			arr[i]=sc.nextInt();
		}
		
		System.out.println("enter the target:");
		int target = sc.nextInt();
		int sum =0;
		for (int i =0 ; i< size ; i++) {
			sum+=arr[i];
			if(sum==target) {
				for(int j=0;j<=i;j++) {
					System.out.print(arr[j]+" ");
				}
			}
			
		}
	}

}
