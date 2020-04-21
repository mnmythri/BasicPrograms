package day5;

public class car {
	
	public void fullThrottle() {
		System.out.println("fullthrottle");
	}
 
	public void MaxSpeed(int speed) {
		System.out.println("max speed" +speed);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		car obj2 = new car();
		obj2.fullThrottle();
		obj2.MaxSpeed(200);
	}

}
