import java.util.Scanner;

public class Shift_operator {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Choose the option:");
		System.out.println("1.Multiply by 2 \t 2.Multiply by 4 \t 3.Multiply by 8 \t 4. Divide by 2 \t"
				+" 5.Divide by 4 \t  6.Divide by 8");
		
		int choice = sc.nextInt();
		
		System.out.println("Enter the num");
		int a = sc.nextInt();
		
		switch (choice) {
		case 1: {
			System.out.println(a<<1);
			break;
		}
		
		case 2:{
			System.out.println(a <<2);
			break;
		}
		
		case 3:{
			System.out.println(a<<3);
			break;
			
		}
		
		case 4:{
			System.out.println(a>>1);	
			break;
		}
		
		case 5:{
			System.out.println(a>>2);
			break;
		}
		
		case 6:{
			System.out.println(a>>3);
		}
		default:
			throw new IllegalArgumentException("Unexpected value: " + choice);
		}
	}

}
