package Exception_handliing;

public class TryCatch {
	public static void main(String[] args) {
		int[] arr = new int[4];
		
		try {
			System.out.println(arr[5]);
		}catch(Exception e) {
			arr = new int[10];
			System.out.println(arr[5]);
		}
	}

}
