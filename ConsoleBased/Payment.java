package ConsoleBased;

import java.util.Scanner;

abstract class Payments{
	int TransId =0;
	String CusName;
	float Amount= 100;
	double final_amt;
	String cardno;
	String mode;
	Payments[] payArr=new Payments[100];
	Payments() {}
	
	void store() {
		
	}
	
	 Payments(int id , String name , float amt,String card) {
		this.TransId =id;
		this.CusName = name;
		this.Amount = amt;
		this.cardno =card;
	}
	abstract void validate();
	abstract void process();
	abstract void transaction_fee();
	abstract void cashback();
	
	void display() {
		for (int i =0 ;i<TransId;i++) {
			System.out.println("ID :"+payArr[i].TransId);
			System.out.println("Name : "+payArr[i].CusName);
			System.out.println("init amt :"+payArr[i].Amount);
			System.out.println("Acc Num :"+payArr[i].cardno);
			System.out.println("Mode of Payment :"+payArr[i].mode);
			System.out.println();
		}
	}
	
	void calcFinalAmt(double tf , double cb) {
		final_amt = (Amount + tf) -cb;
		System.out.println("Final Amount : "+ final_amt);
		System.out.println();
		
	}
}

class CreditCard extends Payments{
	double final_amt;
	String cardNo;
	double cb;
	double tf;
	
	
	CreditCard(int id,String name,float amt,String card_num,String mode) {
		super(id,name,amt,card_num);
		this.cardNo = card_num;
		this.mode =mode;
		
	}

	CreditCard(){}
	void cashback() {
		double cb = Amount * 0.05;
		this.cb=cb;
	}
	void transaction_fee() {
		double tf = Amount*0.02;
		this.tf = tf;
	}
	
	void process() {
		transaction_fee();
		cashback();
		calcFinalAmt(tf,cb);
	}
	
	void validate() {
		if(cardNo.matches("\\d{16}")) {
			System.out.println("Credit Card");
			System.out.println("card Validated ");
			process();
		}else {
			System.out.println("Card Number is Invalid....");
		}
	}
}

class UPI extends Payments{
	double final_amt;
	String cardNo;
	double cb;
	double tf;
	
	UPI(){}
	
	UPI(int id,String name,float amt,String card_num,String mode) {
		super(id,name,amt,card_num); 
		this.cardNo = card_num;
		this.mode = mode;
	}
	
	void cashback() {
		double cb = Amount * 0.02;
		this.cb=cb;
	}
	void transaction_fee() {
		double tf = Amount*0.005;
		this.tf = tf;
	}
	void process() {
		transaction_fee();
		cashback();
		calcFinalAmt(tf,cb);
	}
	
	void validate() {
		System.out.println("UPI");
		if(cardNo.contains("@")) {   
			System.out.println("card Validated ");
			
			process();
		}else {
			System.out.println("Card Number is Invalid....");
		}
	}
}

class NetBanking extends Payments{
	double final_amt;
	String cardNo;
	double cb;
	double tf;    
	
	NetBanking() {
	
	}
	NetBanking(int id,String name,float amt,String card_num,String mode) {
		super(id,name,amt,card_num);
		this.cardNo = card_num;
		this.mode = mode;
	}
	
	void cashback() {
		double cb = Amount * 0.01;
		this.cb=cb;
	}
	void transaction_fee() {
		double tf = Amount*0.01;
		this.tf = tf;
	}
	
	void process() {
		transaction_fee();
		cashback();
		calcFinalAmt(tf, cb);
	}
	
	void validate() {
		if(cardNo.matches("\\d{10}")) {
			System.out.println("Netbanking");
			System.out.println("card Validated ");
			process();
		}else {
			System.out.println("Card Number is Invalid....");
		}
	}
}
public class Payment {
	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	
		while(true) {
			System.out.println("Enter the mode of Transaction \n 1) Credit Card\n 2) UPI \n 3) Net Banking ");
			System.out.println("Enter the Choice : ");
			int n = sc.nextInt();
			
			CreditCard md = new CreditCard();
			
			switch (n) {
			case 1: {
				System.out.println("Enter your Name");
				String name = sc.next();
				
				System.out.println("Enter your Enter your amount");
				float amt = sc.nextFloat();
				
				System.out.println("Enter your Card Number");
				String Card_num= sc.next();
				System.out.println();
				
				CreditCard cc = new CreditCard(md.TransId, name, amt, Card_num,"Credit Card");
				cc.validate();			
				break;

			}
			case 2:{
				
				System.out.println("Enter your Name");
				String name = sc.next();
				
				System.out.println("Enter your Enter your amount");
				float amt = sc.nextFloat();
				
				System.out.println("Enter your UPI ID");
				String Card_num= sc.next();
				System.out.println();
				
				UPI up = new UPI(md.TransId, name, amt, Card_num,"UPI");
				up.validate();
				
				break;
			}
			case 3:{
				System.out.println("Enter your Name");
				String name = sc.next();
				
				System.out.println("Enter your Enter your amount");
				float amt = sc.nextFloat();
				
				System.out.println("Enter your Acc Number");
				String Card_num= sc.next();
				System.out.println();
				
				NetBanking nb = new NetBanking(md.TransId, name, amt, Card_num,"Net Banking");
				nb.validate();
				
				break;
			}
			case 4:{
				md.display();
				break;
					
			}
			
		
	} 
		}
}
}
