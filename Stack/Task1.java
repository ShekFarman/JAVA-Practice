package Stack;

public class Task1 {
	public static void main(String[] args) {
		String inp = "";
		
		char[] stack = new char[inp.length()];
		
		int top = -1;
		
		for(int i = 0 ;i<inp.length();i++) {
			top++;
			stack[i]= inp.charAt(i);
		}
		
	}

}
