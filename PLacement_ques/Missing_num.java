package PLacement_ques;

import java.util.Scanner;

public class Missing_num {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter size");
		int size1 = sc.nextInt();
		

		System.out.println("Enter values");
		int[] arr=new int[size1];
		for(int i=0;i<size1;i++) {
			arr[i]=sc.nextInt();
		}
		
		for(int i =0 ; i<size1-1;i++) {
			
			if(arr[i]+1!=arr[i+1]) {
				System.out.print(arr[i]+1+ " ");
			}
		}
	}

}
