package Task;

import java.util.Scanner;

public class Login_validation {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter your user Name :");
		String uname = sc.nextLine();
		
		System.out.println("Enter your Password :");
		String pass = sc.nextLine();
		  
		if(uname.equalsIgnoreCase("admin") && pass.equals("1234")) {
			System.out.println("Login Successfull");
		}else {
			System.out.println("Invalid Login credential");
		}
	}

}
