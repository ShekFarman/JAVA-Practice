package Task;

import java.util.Scanner;

public class Longest_Sequence {
	public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);
		 
		 System.out.println("enter size");
			int size = sc.nextInt();
			

			System.out.println("Enter values");
			
			int[] arr=new int[size];
			
			for(int i=0;i<size;i++) {
				arr[i]=sc.nextInt();
			}
			for(int i = 0;i < size-1 ;i++) {
				for(int j = 1 ;j < size-1; j++) {
					if( arr[j] > arr[j+1] ) {
						int temp = arr[j];
						arr[j] = arr[j+1];
						arr[j+1] = temp;
					}
				}
			}
			int longest =0;
			int count=0;
			for(int i=0;i<size;i++) {
				if(arr[i]==arr[i-1]) {
					continue;
				}
				if(arr[i]==arr[i-1]+1) {
					count++;
				}else {
					if (count>longest) {
						longest=count;
					}
					count=1;
				}
				System.out.println(longest);
			}

	
	}

}
