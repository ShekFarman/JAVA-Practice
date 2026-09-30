import java.util.Scanner;

public class Max_chk {
	public static void main(String[] args) {
	
		Scanner scan = new Scanner(System.in);
		int a , b,c,d;
		System.out.println("Enter the numbers ");
		a= scan.nextInt();
		b=scan.nextInt();
		c= scan.nextInt();
		d=scan.nextInt();
		
		int chk1 = (a > b) ? a :b;
		int chk2 = (c > d) ? c :d;
		int max = (chk1 > chk2) ? chk1 :chk2;
		
		System.out.println("The Max num is "+max);
		
	}

}
