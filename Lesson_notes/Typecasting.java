package Lesson_notes;

public class Typecasting {
	
	/**
	 * Type Casting:
	 * 
	 *  i) Implicit Typecasting
	 *  ii) Explicit Typecasting
	 */
	public static void main(String[] args) {
		
		int a = 5; //4 byte
		double d = a; //8 byte
		//small to large doesnt need 
		System.out.println("Widening "+ d);// OP : 5.0
		
		int b= 75;
		char c=(char)b;
		System.out.println("Narrowing" +c);
		
		
	}

}
