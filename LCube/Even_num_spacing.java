package LCube;

import java.util.Scanner;

public class Even_num_spacing {
	public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);
		 System.out.println("enter a size :");
		 int n = sc.nextInt();
		 
		 int i =1;
		 while(i<n) {
			 if(i%2==0) {
				 System.out.print(i+" ");
			 }else if (i==7){
				 System.out.print(" ");
			 }
			 i++;
		 }
	}

}
