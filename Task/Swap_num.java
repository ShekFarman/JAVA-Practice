import java.util.Scanner;

public class Swap_num {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the numbers");
		int a = sc.nextInt();
		int b = sc.nextInt();		
		System.out.println("num 1 ="+a +"\t num 2 ="+b);
		
		a= a+b;
		b= a-b;
		a= a-b;		
		System.out.println("After Swaping");
	System.out.println("num 1= "+ a +"\t num 2 =" + b);
		
		
	}

}
   