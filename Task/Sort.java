package Task;

import java.util.Scanner;

public class Sort {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int sum=0;
            while(num>0){
                int digit =num%10;
                sum+=digit;
                sum/=10;
                System.out.println("The sum of Digits are :"+digit);
                
            }
           
			
			
		}
		
	}


