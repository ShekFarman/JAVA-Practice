package Sub_Str;

import java.util.Scanner;

public class Loop_Sub {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the String :");
		String txt = sc.nextLine();
		System.out.println("Enter the String :");
		String txt1 = sc.nextLine();
		for(int k = 0; k <= txt.length() ; k++) {
			for(int i = k;i < txt.length(); i++ ) {
				String emp ="";
				for(int j = k ;j <= i; j++) {
					emp+=txt.charAt(i);
					
				}
				if(txt1.equals(emp)) {
					System.out.println("Founded a SubString....");
				}
				
			}
		}
		
	}

}
