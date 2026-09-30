package Linked_List;

import java.util.Scanner;

class Node{
    int data;
    Node address;
    
       Node() {
    	
    }
    
    Node(int data,Node add){
        this.data=data;
        this.address = add;
    }
    
    Node head = null,prev=null;
    void insertData(){
	    Scanner in = new Scanner(System.in);
		 System.out.println("Enter the no of Data: ");
            int n = in.nextInt();
            for(int i=0;i<n;i++){
                int val = in.nextInt();
                Node obj = new Node(val,null);
                if(head==null){
                    head = obj;
                    prev=obj;
                }
                else{
                    prev.address = obj;
                    prev=obj;
                }
            }
        
    }
    
    void displayData(){
    	System.out.println("Displaying data : ");
    	Node temp = head;
		while(temp!=null){
			System.out.print(temp.data+" ");
			temp=temp.address;
	    }
        
    }
    
    void insertNode(Scanner in) {
    	System.out.println("\nEnter a value : ");
    	int val = in.nextInt();    
    	System.out.println("Enter the Position : ");
    	int pos = in.nextInt();
    	
    	Node newNode = new Node(val,null);
    	
    	if(pos==1) {
    		newNode.address = head;
    		head = newNode;
    	}else {
    	Node temp = head;
    	for(int i =0; i < pos-2; i++) {
    		temp = temp.address;
    	}
    	if(temp.address==null) {
    		prev = newNode;
 
    	}
    	newNode.address = temp.address;
    	temp.address = newNode;
    	}
    }
    }

public class Singly_List
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
	    Node n = new Node();   
	    
	    n.insertData();
	    n.displayData();
		n.insertNode(sc);
		n.displayData();
	}
}
