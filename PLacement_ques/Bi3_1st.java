package PLacement_ques;

import java.util.Scanner;

public class Bi3_1st {
	
	public static int min_moves(int logs[]) {
		int n = logs.length;
		
		
		int sum=0;
		for(int i=0;i<n;i++) {
			sum+=logs[i];
		}
		
		if(sum%n!=0) {
			return -1;
		}
		int target =sum/n;
		int moves =0;
		for(int i=0;i<n-1;i++) {
			while(logs[i]> target) {
				logs[i]--;
				logs[i+1]++;
				moves++;
			}
			while(logs[i]< target) {
				logs[i]++;
				logs[i+1]--;
				moves++;
			}
			
		}
		
		
		return moves;    
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int size = sc.nextInt();
	
		int[] logs=new int[size];
		for(int i=0;i<size;i++) {
			logs[i]=sc.nextInt();
		}
		int res = min_moves(logs);
		
		if (res==-1) {
			System.out.println("not balancing");
		}else {
			System.out.println("Balancing the moves are "+ res);
		}
	}
	
	

}
