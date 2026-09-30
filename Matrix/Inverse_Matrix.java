package Matrix;

import java.util.Scanner;

public class Inverse_Matrix {
		public static void main(String[] args) {
	     Scanner in=new Scanner(System.in);
	     System.out.println("enter the row size:");
	     int row=in.nextInt();
	     System.out.println("enter the col:");
	     int col=in.nextInt();
	     int [][]a=new int[row][col];
	     System.out.println("Enter the elements:");
	     for(int i=0;i<row;i++) {
	    	 for(int j=0;j<col;j++) {
	    	 a[i][j]=in.nextInt();
	    	 }
	     }
	     
	     int det=a[0][0]*a[1][1]-a[0][1]*a[1][0];
	     int temp=a[0][0];
	     a[0][0]=a[1][1];
	     a[1][1]=temp;
	     
	     a[0][1]=-a[0][1];
	     a[1][0]=-a[1][0];
	     
	     
	     System.out.println("Inverse matrix:");
	     for(int i=0;i<row;i++) {
	    	 for(int j=0;j<col;j++) {
	    		 System.out.print((double)a[i][j] / det + " ");    	 }
	    	 System.out.println();
	     }
	      
		}

	}



