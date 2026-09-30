package Matrix;

import java.util.Scanner;

public class Transpose_Matrix {
	public static void main(String[] args) {
		Scanner in =new Scanner(System.in);
		System.out.println("enter the row size:");
		int row=in.nextInt();
		System.out.println("enter the col size:");

		int col=in.nextInt();
		int [][]a=new int[row][col];
		System.out.println("Enter the values:");
		for(int i=0;i<row;i++) {
			for(int j=0;j<col;j++ ) {
				a[i][j]=in.nextInt();

			}
			
		}
      System.out.println("The Transpose Matrix:");
		for(int i=0;i<row;i++) {
			for(int j=0;j<col;j++ ) {
System.out.print(a[j][i]+" ");
			}
			System.out.println();
		}
	}


}
