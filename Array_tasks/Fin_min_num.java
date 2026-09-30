package Array_tasks;

import java.util.Scanner;

public class Fin_min_num {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter size");
        int size = sc.nextInt();

        System.out.println("Enter values");
        int[] arr = new int[size];
        
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }
        
        int min=0;
        boolean minset= false;
        for(int i =0;i<size ; i++) {
        	if(arr[i]>0) {
        		if (!minset) {
                	min = arr[i];
                	minset =true;
                }
        		else if(arr[i]<min) {
        			min = arr[i];
        		}
        	}
        	
        	
        }

        int missing = min; 
        boolean found;

        while (true) {
            found = false;
            for (int i = 0; i < size; i++) {
                if (arr[i] == missing) {
                    found = true;
                    break;
                }
            }
            if (!found) {
                break; 
            }
            missing++;
        }

        System.out.println(missing);
    }
}