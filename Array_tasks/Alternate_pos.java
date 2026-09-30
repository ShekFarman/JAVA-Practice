package Array_tasks;

import java.util.Scanner;

public class Alternate_pos {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter size");
		int size = sc.nextInt();
		

		System.out.println("Enter values");
		int[] arr=new int[size];
		for(int i=0;i<size;i++) {
			arr[i]=sc.nextInt();
		}
		
		int[] res = new int[size];
		int j =0;
		int k=1;
		for(int i=0 ;i<size;i++) {
			if(arr[i]>=0) {
				if(j<size) {
					res[j]=arr[i];
					j+=2;
				}
			}else {
				if(k<size) {
					res[k]=arr[i];
					k+=2;
				}
			}
			
		}
		
		for(int i =0;i<size;i++) {
			System.out.print(res[i]+" ");
		}
	}
}
