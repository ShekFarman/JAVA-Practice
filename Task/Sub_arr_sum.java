package Task;

import java.util.Scanner;

public class Sub_arr_sum {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		 
		 System.out.println("enter size");
			int size = sc.nextInt();
			

			System.out.println("Enter values");
			
			int[] arr=new int[size];
			
			for(int i=0;i<size;i++) {
				arr[i]=sc.nextInt();
			}
			
			for(int i = 0;i<size;i++) {
				int sum=0; 
				
				for (int j =i;j<size;j++) {
					sum+=arr[j];
					System.out.print("[");
					for(int k= i ;k<=j ;k++) {
						System.out.println(arr[k]);
						
						if(k<j) {
							System.out.print(" ");
						}
					}
					System.out.println("] Sum "+sum);
				}
			}

	}

}
