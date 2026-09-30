package Sub_Arr;

import java.util.Scanner;

public class PosNeg_part {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter size");
		int size = sc.nextInt();
		
		System.out.println("Enter values");
		int[] arr=new int[size];
		int[] res = new int[size];
		for(int i=0;i<size;i++) {
			arr[i]=sc.nextInt();
		}
		
		int j=0;
		for (int i =0;i<size;i++) {//4 7 -2 5 -7 1 8 -3
			if(arr[i]<0) {        
				res[j]=arr[i];
				j++;
			}
		}
			
		for (int i =0;i<size;i++) {//4 7 -2 5 -7 1 8 -3
				if(arr[i]>0) {        
					res[j]=arr[i];
					j++;
				}
		}
		for(int i =0; i<size;i++) {
			System.out.print(res[i]+" ");
		}
	}

}
