package Queue;

import java.util.Scanner;

class QueueImplementaion{
	int front =-1,rear =-1;
	int n=6;
	int[] queue = new int[n];
	  
	void enque(Scanner sc) {
		if(rear==n-1) {
			System.out.println("Stack OverFlow");
		}else {
			if(front ==-1) {
				front=0;
			}
			System.out.println("Enter the values :");
			queue[++rear]=sc.nextInt();
		}
	}
	
	void display() {
		if(front==-1) {
			System.out.println("Queue is empty");
		}
		for(int i = front ; i<=rear;i++) {
			System.out.println(queue[i]);
		}
	}
	
	void dequeue() {
		 if(front==-1) {
			 System.out.println("Stack UnderFlow");
		 }else {
			 System.out.println(queue[front]+" this data deleted");
			 front++;
			 if(front>rear) {
				 front = -1;
				 rear =-1;
			 }
		 }
	} 
	
	void peek() {
		if(front==-1) {
			System.out.println("The Queue is Empty...");
		}else {
			System.out.println(queue[front]);
		}
	}
}
public class LinearQueue {
	public static void main(String[] args) {
		
	QueueImplementaion qi = new QueueImplementaion();
	Scanner sc = new Scanner(System.in);
	
	while(true) {
		System.out.println(" 1) Enqueue \n 2) Display \n 3) Dequeue \n 4) Peek");
		switch(sc.nextInt()) {
		case 1:{
			
			qi.enque(sc);
			break;
		}
		case 2:{
			qi.display();
			break;
		} 
		case 3:{
			qi.dequeue();
			break;
		}
		case 4:{
			qi.peek();
			break;
		}
	}
	}
}
}