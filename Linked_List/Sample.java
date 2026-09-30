//package Linked_List;
//
//import java.util.Scanner;
//
//class Node{
//    int data;
//    Node address;
//    
//    public Node() {
//    	
//    }
//    
//    Node(int data,Node add){
//        this.data=data;
//        this.address = add;
//    }
//    
//    Node head = null,prev=null;
//    void insertData(){
//	    Scanner in = new Scanner(System.in);
//		 System.out.println("Enter the no of Data: ");
//            int n = in.nextInt();//3-->10,20,30
//            for(int i=0;i<n;i++){
//                int val = in.nextInt();//10
//                Node obj = new Node(val,null);
//                if(head==null){
//                    head = obj;
//                    prev=obj;
//                }
//                else{
//                    prev.address = obj;
//                    prev=obj;
//                }
//            }
//        
//    }
//    
//    void displayData(){
//    	System.out.println("Displaying data : ");
//    	Node temp = head;
//		while(temp!=null){
//			System.out.print(temp.data+" ");//40
//			temp=temp.address;//null
//	    }
//        
//    }
//    
//    void insertNode(Scanner in) {
//    	
//    }
//    
//}
//public class Sample
//{
//	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//	    Node n = new Node();   
//	    
//	    n.insertData();
//	    n.displayData();
//		
//	}
//}
