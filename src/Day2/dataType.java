package Day2;

public class dataType {	
	
	private static void pri() {
		
		final int number ;
		number = 10;    
	    System.out.println(number);
	}

	public static void pub() {
		int num;
		num = 20;
		System.out.println(num);
	}
	
	protected static void pro() {
		int no;
		no = 30;
		System.out.println(no);
		
	}
public static void main(String[] args) {
	
	pri();
	pub();
	pro();
}


}