package PLacement_ques;

import java.util.Scanner;

public class Rotation {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	
	int size = sc.nextInt();

	int[] arr=new int[size];
	for(int i=0;i<size;i++) {
		arr[i]=sc.nextInt();
	}
	System.out.println(arr[size-1]);
	System.out.println("Enter the rotation");
	int rot=sc.nextInt();
	
	for(int i=0;i<rot;i++) {
		int temp=arr[size-1];
		for (int j =size-1;j>0;j--) {
			arr[j]=arr[j-1];
			
			}
		arr[0]=temp;
		}
	for(int i=0;i<size;i++) {
		System.out.print(arr[i]+" ");		
		}
	
	}
}

