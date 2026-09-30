package PLacement_ques;

import java.util.Scanner;

public class Merging_Arrays {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter size");
		int size1 = sc.nextInt();
		

		System.out.println("Enter values");
		int[] arr1=new int[size1];
		for(int i=0;i<size1;i++) {
			arr1[i]=sc.nextInt();
		}
		System.out.println("enter size");
		int size2 = sc.nextInt();
		
		System.out.println("Enter values");
		int[] arr2=new int[size2];
		for(int i=0;i<size2;i++) {
			arr2[i]=sc.nextInt();
		}
		int fsize = size1+size2;
		
		int[] narr=new int[fsize];
		for(int i=0;i<fsize;i++) {
			if(i<size1) {
				narr[i]=arr1[i];
			}
			else {
				narr[i]=arr2[i-size1];
				
			}
			
		}
		
		for(int i=0;i<fsize;i++) {
			System.out.print(narr[i]+" ");		
			}
		
		
		
	}

}
