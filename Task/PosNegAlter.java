package Task;

import java.util.Scanner;

public class PosNegAlter {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter size");
		int size = sc.nextInt();
		
		int[] res = new int[size];

		System.out.println("Enter values");
		int[] arr=new int[size];
		for(int i=0;i<size;i++) {
			arr[i]=sc.nextInt();
		}
		int j=0;
		int k =1;
		
		for(int i=0;i<size;i++) {
			if(arr[i]>0 && j<size) {
				res[j]=arr[i];
				j+=2;
			}
		}
		
		for(int i=0;i<size;i++) {
			if(arr[i]<0 && k<size) {
				res[k]=arr[i];
				k+=2;
			}
		}
		for(int i =0 ; i<size ; i++) {
			System.out.print(res[i]+"  ");
		}
	}

}
