  

public class Char_check {
	public static void main(String[] args) {
//		Scanner scan = new Scanner(System.in);
//		
//		System.out.println("Enter the Character");
//		char ch = scan.next().charAt(0);
//		
//		if((ch>='A'&& ch<='Z') ||( ch >='a' && ch<='z')) {
//			System.out.println(ch +" is an Alphabet");
//		}else {
//			System.out.println("Not an Alphabet");
//		}
		int sum=0;
		for(int i =0; i<=10;i++) {
			if(i%2==0) {
				sum+=i;
				System.out.println(i);
			}
			
		}
		System.out.println(sum);
	}

}
