package Sub_Arr;

import java.util.Scanner;

public class Min_size {
	public static void main(String[] args) {
		
	
	  Scanner sc = new Scanner(System.in);
      System.out.println("enter size");
      int size = sc.nextInt();
      
      int[] arr = new int[size];
      
      System.out.println("Enter araival");
      int[] dep = new int[size];
      
      for (int i = 0; i < size; i++) {
          arr[i] = sc.nextInt();
      }
      System.out.println("Enter departure ");
      for (int i = 0; i < size; i++) {
          dep[i] = sc.nextInt();
      }
      
//      for (int i=0;i<size;i++) {
//    	  for(int j =0;j<size-1-i;j++) {
//    		  if (arr[j]>arr[j+1]) {
//    			  int temp = arr[j+1];
//    			  arr[j+1] = arr[j];
//    			  arr[j] = temp;
//    		  }
//    	  }
//      }
//      
//      for (int i=0;i<size;i++) {
//    	  for(int j =0;j<size-1-i;j++) {
//    		  if (dep[j]>dep[j+1]) {
//    			  int temp = dep[j+1];
//    			  dep[j+1] = dep[j];
//    			  dep[j] = temp;
//    		  }
//    	  }
//      }
//      int i=0;
//      int j =0;
//      int platform =0;
//      int max_plat=0;
//
//     
//    	 while(i<size && j<size) {
//    			if(arr[i]<=dep[j]) {
//    				  platform++;  
//    				  i++;
//    				  
//    				  if(platform > max_plat) {
//    					  max_plat = platform;
//    				  }
//    			}else {
//    					platform--;
//    					j++;
//    			}	
//    	}

    int temp =1;	 
     for(int i=0;i<size;i++) {
    	 int count =1;
    	 
    	 for(int j =0;j<size;j++) {
    		 if( i !=  j) {
    			 if(arr[i]>=dep[j]&& arr[i]<= dep[j]) {
    				 count++;
    			 }
    		 }
    	 }
    	 if(count> temp) {
    		 temp =count;
    	 }
     }
     System.out.println(temp);
    
	}   

}
