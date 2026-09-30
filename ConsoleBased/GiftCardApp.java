package ConsoleBased;

import java.util.Scanner;

class Customer {
	int cusId;
	String cusName;
	float balance;
	String name;
	Customer[] cusArr = new Customer[100];
	
	int index =0;
	Customer(){
		 
	}
	Customer(String name,float bal,int id) {
		this.cusName = name;
		this.balance = bal;
		this.cusId = id;
	}
	
	void createCustomer() {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the name");
			String n = sc.nextLine();
		
		
		System.out.println("Enter the balance");
		float bal = sc.nextFloat();
		
		Customer cus = new Customer(name,bal,index);
		cusArr[index]=cus;
		index++;
		System.out.println("customer Created Successfully");
	}
	
	void display() {
		System.out.println("Customer Details ");
		System.out.println("-----------------");
		for(int i =0 ; i<index;i++) {
			System.out.println("Customer ID : "+cusArr[i].cusId);
			System.out.println("Customer Name : "+cusArr[i].cusName);
			System.out.println("Customer Acc Balance : "+cusArr[i].balance);	
			System.out.println();
		}
	}
	
	void topup() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the ID");
		int id = sc.nextInt();
		if(id<index && id>=0) {
			if(cusArr[id].cusId==id) {
				System.out.println("Enter the Amount to Customer Card Top-Up");
				float amt = sc.nextFloat();
				cusArr[id].balance+=amt;
			}
			else {
				System.out.println("Id Doesn't exist");
			}
		}else {
			System.out.println("Invalid ID");
		}
	}
}
class GiftCard{
	int giftCardId;
	int cusId;
	int pin;
	float cardBalance;
	String cardStatus;
	String cardLevel;
	int points;
	
	int index=0;
	
	GiftCard[] gifArr = new GiftCard[100];
	GiftCard(){}
	
	GiftCard(int id,int cusId,int pin,float cardbal,String Status,String lvl,int points){
		this.giftCardId =id;
		this.cusId = cusId;
		this.pin = pin;
		this.cardBalance = cardbal;
		this.cardStatus = Status;
		this.cardLevel = lvl;
		this.points =points;
	}
	void createCard(Customer cus) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter Customer ID");
		int cusId= sc.nextInt();
		System.out.println("Enter the pin");
		int pin = sc.nextInt();
		System.out.println("Enter the card balance");
		float cardBal= sc.nextFloat();
		System.out.println();
		cus.cusArr[cusId].balance-=cardBal;
		GiftCard gc = new GiftCard(index,cusId,pin,cardBal,"Active","Beginner",points);
		System.out.println("Card created successfully....");
		
		gifArr[index]= gc;
		index++;
	}
	
	void gcDisply(Customer cus) {
		System.out.println("Giftcard Details");
		System.out.println("-----------------");
		for(int i =0;i<index;i++) {
			System.out.println("ID : "+gifArr[i].giftCardId);
			System.out.println("Name : "+cus.cusArr[gifArr[i].cusId].cusName);
			System.out.println("GiftID : "+gifArr[i].cusId); 
			System.out.println("Card BAl : "+gifArr[i].cardBalance);
			System.out.println("Card Status : "+gifArr[i].cardStatus);
			System.out.println("Card Level : "+gifArr[i].cardLevel);
			System.out.println("Points : "+gifArr[i].points);
			System.out.println();
		}
	}
	
	void TopUp(Customer cus) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Gift card ID");
		int id = sc.nextInt();
		
		if(id<index && id>=0) {
		
		if(gifArr[id].giftCardId==id && gifArr[id].cardStatus.equalsIgnoreCase("Active")) {
			System.out.println("Enter the PIN");
			int pin = sc.nextInt();
			if (gifArr[id].pin==pin) {
				System.out.println("enter the amount");
				float amt= sc.nextFloat();
				cus.cusArr[id].balance-=amt;
				gifArr[id].cardBalance+=amt;
			}
			else {
				System.out.println("Incorrect pin");
			}
			
		}else {
			System.out.println("invalid card Id or Card may be blocked");
		}	
		
		}else {
			System.out.println("Invalid ID");
		}
		
		
		}
	
	void block() {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a Id to block");
		int id = sc.nextInt();
		
		if(id<index && id>=0) {
			
			if(gifArr[id].giftCardId==id && gifArr[id].cardStatus.equalsIgnoreCase("Active")) {
				System.out.println("Enter the PIN");
				int pin = sc.nextInt();
				if (gifArr[id].pin==pin) {
					gifArr[id].cardStatus="Blocked";
					System.out.println("Card Blocked");
				}
				else {
					System.out.println("Incorrect pin");
				}
				
			}else {
				System.out.println("invalid card Id or Card may be blocked");
			}	
			
			}else {
				System.out.println("Invalid ID");
			}
			
			
			}
	
	void close(Customer cus) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a Id to Close");
		int id = sc.nextInt();
		
		if(id<index && id>=0) {
			
			if(gifArr[id].giftCardId==id && gifArr[id].cardStatus.equalsIgnoreCase("Active")) {
				System.out.println("Enter the PIN");
				int pin = sc.nextInt();
				if (gifArr[id].pin==pin) {
					cus.cusArr[id].balance+=gifArr[id].cardBalance; 
					gifArr[id].cardBalance=0;
					gifArr[id].cardStatus ="Closed";
					System.out.println("Card Closed....Amount added to customer Account");
				}
				else {
					System.out.println("Incorrect pin");
				}
				
			}else {
				System.out.println("invalid card Id or Card may be blocked");
			}	
			
			}else {
				System.out.println("Invalid ID");
			}
			
			
	}
	
	void unBlock() {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a Id to block");
		int id = sc.nextInt();
		
		if(id<index && id>=0) {
			
			if(gifArr[id].giftCardId==id && gifArr[id].cardStatus.equalsIgnoreCase("Blocked")) {
				System.out.println("Enter the PIN");
				int pin = sc.nextInt();
				if (gifArr[id].pin==pin) {
					gifArr[id].cardStatus="Active";
					System.out.println("Card Activated...");
				}
				else {
					System.out.println("Incorrect pin");
				}
				
			}else {
				System.out.println("invalid card Id or Card may be blocked");
			}	
			
			}else {
				System.out.println("Invalid ID");
			}
			
			
	}
		
	}
	
	

class Purchase {
	int sum;
	int index =0;
	int noPro;
	int transID ;
	int cusId;
	int points;
	Purchase[] transRec = new Purchase[100];
	Purchase(){}
	
	 Purchase(int id,int transation,int noPro,int total,int points){
			this.cusId = id;
			this.transID =transation;
			this.noPro = noPro;
			this.sum = total;
			this.points = points;
			
		}

	void sales(GiftCard g) {
		int total=0;
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter number of products");
	 int n = sc.nextInt();
	
	for (int i=0;i<n;i++) {
		System.out.println("enter the price of the "+(i+1)+" product");
		total+=sc.nextInt();
	}
	System.out.println("Total : "+total);
	
	System.out.println("Enter Gift card ID");
	int id = sc.nextInt();
	
	if(id<g.index && id>=0) {
	
	if(g.gifArr[id].giftCardId==id && g.gifArr[id].cardStatus.equalsIgnoreCase("Active")) {
		System.out.println("Enter the PIN");
		int pin = sc.nextInt();
		if (g.gifArr[id].pin==pin) {
			g.gifArr[id].cardBalance-=total;
			
			int diff = total/500;
			g.gifArr[id].points+=diff*50;
		
			Purchase pr = new Purchase(id,index,n,total,points);
			transRec[index]= pr ;
			index++;
			
			if(g.gifArr[id].points<0 && g.gifArr[id].points>=200) {
				g.gifArr[id].cardLevel="Bronze";
			}else if (g.gifArr[id].points<200 && g.gifArr[id].points>=500) {
				g.gifArr[id].cardLevel ="Silver";
			}else if(g.gifArr[id].points<500 && g.gifArr[id].points>=1000) {
				g.gifArr[id].cardLevel ="Gold";
			}else {
				g.gifArr[id].cardLevel="platinum";
			}
		}
		else {
			System.out.println("Incorrect pin");
		}
		
	}else {
		System.out.println("invalid card Id or Card may be blocked");
	}	
	
	}else {
		System.out.println("Invalid ID");
	}
}
	void history(Customer cus) {
		System.out.println("Transation History ");
		System.out.println("---------------------");
		for (int i=0;i<index;i++) {
			System.out.println("Customer Name : "+cus.cusArr[i].cusName);
			System.out.println("Customer ID : "+transRec[i].cusId);
			System.out.println("Transaction ID : "+transRec[i].transID );
			System.out.println("Products : "+transRec[i].noPro);
			System.out.println("Total : "+transRec[i].sum);
			System.out.println();
		}
	}
	
}     
public class GiftCardApp {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Customer cus = new Customer();
		GiftCard g = new GiftCard();
		Purchase p = new Purchase();
		while(true) {
			System.out.println(" 1) Create Customer\n 2) Display\n"
					+ " 3) Create GiftCard\n 4) Dispplay Giftcard\n 5) Top-Up \n 6) Purchase\n"
					+ " 7) Block\n 8) Close\n 9) UnBlock\n10) Top-Up Cust Acc\n"
					+ "11) Summary");
			int n = sc.nextInt();
			
			switch (n) {
			case 1: {
				cus.createCustomer();
				break;
			}case 2:{
				cus.display();
				break;
			}case 3:{
				g.createCard(cus);
				break;
			}case 4:{
				g.gcDisply(cus);
				break;
			}case 5:{
				g.TopUp(cus);
				break;
			}case 6:{
				p.sales(g);
				break;
			}
			case 7:{
				g.block();
				break;
			}
			case 8:{
				g.close(cus);
				break;
			}
			case 9:{
				g.unBlock();
				break;
			}
			case 10:{
				cus.topup();
			}
			case 11:{
				cus.display();
				g.gcDisply(cus);
				p.history(cus);
			}
			}
				
		}
	}
}