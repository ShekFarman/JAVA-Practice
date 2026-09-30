package Array_tasks;

import java.util.Scanner;

public class Cnt_conscutive {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter size");
		int size = sc.nextInt();
		

		System.out.println("Enter values");
		int[] arr=new int[size];
		for(int i=0;i<size;i++) {
			arr[i]=sc.nextInt();
		}
		int cnt=0;
		for(int i=0;i<size-1;i++) {
			if(arr[i]+1==arr[i+1]) {
				cnt++;
				i++;
			}
		}
		System.out.println("Count "+cnt);
	}

}
