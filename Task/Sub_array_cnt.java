package Task;

import java.util.Scanner;

public class Sub_array_cnt {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		 
		 System.out.println("enter size");
			int size = sc.nextInt();
			
			int total = size*(size+1)/2;
			System.out.println(total);

	}

}
