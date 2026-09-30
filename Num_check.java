
import java.util.Scanner;

public class Num_check {
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter the number");
		int num = scan.nextInt();
		
		if (num ==0) {
			System.out.println("its 0 !.... Enter a valid number");
		}else if(num<0) {
			System.out.println(num + " Its a negative Integer");
		}else {
			System.out.println(num + " Its a  positive Integer");
		}
		
		scan.close();
	}

}
