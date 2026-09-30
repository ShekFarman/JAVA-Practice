package Task;

import java.util.Scanner;

public class Rm_duplicates {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter size");
		int size1 = sc.nextInt();
		

		System.out.println("Enter values");
		int[] arr1=new int[size1];
		for(int i=0;i<size1;i++) {
			arr1[i]=sc.nextInt();
		}
		boolean found =false;
		int j = 0;
		for( int i=0;i<size1;i++) {
			
			while(j<i) {
				if(arr1[i]==arr1[j]) {
					found=true;
					break;
				}
				j++;
			}

			if(!found) {
				System.out.print(arr1[i]+ " ");
			}
		}
		
		
		
	}  

}
