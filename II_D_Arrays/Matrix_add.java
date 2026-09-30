package II_D_Arrays;

import java.util.Scanner;

public class Matrix_add {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the no. of Rows");
		int row = sc.nextInt();
		System.out.println("Enter the no.of Columns");
		int col = sc.nextInt();

		int[][] mat = new int[row][col];
		
		System.out.println("Enter the elements :");
		for (int i =0 ;i<row;i++) {
			for(int j =0 ;j<col ;j++) {
				mat[i][j]=sc.nextInt();
			}
		}
		
		for(int i =0;i<3;i++) {
			for(int j =0;j<3;j++) {
				System.out.print(mat[i][j]+" ");
			}
			System.out.println();
		}
	}

}
