package Queue;

import java.util.Scanner;

class QueueImplementation{
	int front =-1 , rear =-1,n=4;
	 int[] CirQue = new int[n];
	 
	 void enqueue(Scanner sc) {
		 if((rear+1)%n==front) {
				System.out.println("Stack OverFlow");
			}else {
				if(front ==-1) {
					front=0;
				}
				System.out.println("Enter the values :");
				CirQue[(++rear)%n]=sc.nextInt();
			}
		    
	 }
	 void display() {
		 System.out.println(rear);
			if(front==-1) {
				System.out.println("Queue is empty");
			}
			for(int i = front ; i<=(n+rear);i++) {
				System.out.println(CirQue[i%n]);
			}
		}
		
		void dequeue() {
			 if(front==-1) {
				 System.out.println("Stack UnderFlow");
			 }else {
				 System.out.println(CirQue[front]+" this data deleted");
				 front++;
				 if(front>0) {
					 rear=0;
				 }
			 }
		} 
		
		void peek() {
			if(front==-1) {
				System.out.println("The Queue is Empty...");
			}else {
				System.out.println(CirQue[front]);
			}
		}
}


public class CircularQueue {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		QueueImplementaion cirq = new QueueImplementaion();
		Scanner sc1 = new Scanner(System.in);
		
		while(true) {
			System.out.println(" 1) Enqueue \n 2) Display \n 3) Dequeue \n 4) Peek");
			switch(sc1.nextInt()) {
			case 1:{
				
				cirq.enque(sc1);
				break;
			}
			case 2:{
				cirq.display();
				break;
			} 
			case 3:{
				cirq.dequeue();
				break;
			}
			case 4:{
				cirq.peek();
				break;
			}
		}
	}

	}}
