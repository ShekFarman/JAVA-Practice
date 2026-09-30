package Strings;

import java.util.Scanner;

public class RevStr
{
    static String reverseString(String str){//Hello
       String empStr="";
       for(int  i=str.length()-1;i>=0;i--){
           empStr+=str.charAt(i);
       }
       return empStr;
    }
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String str = in.nextLine();
		System.out.println(RevStr.reverseString(str));
	}
}
