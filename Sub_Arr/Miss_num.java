package Sub_Arr;

import java.util.Scanner;

public class Miss_num {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter size");
		int size = sc.nextInt();
		
		System.out.println("Enter values");
		int[] arr=new int[size];
		
		for(int i=0;i<size;i++) {
			arr[i]=sc.nextInt();
		}
		int missing =1;
		while(true) {
			boolean fnd = false;
			
			for(int i=0;i<size;i++) {
				if(arr[i]==missing) {
					fnd = true;
					break;
				}
			}
			
			if(!fnd) {
				System.out.println(missing);
				break;
			}
			missing++;
		}
//		
		
		}
	}


