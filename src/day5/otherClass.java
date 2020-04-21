package day5;

public class otherClass {
	
	protected static void protMethod() {
		System.out.println("protected method from other class");
	}

	public static void main(String[] args) {
		
		car obj3 = new car();
		obj3.fullThrottle();
		obj3.MaxSpeed(300);
				

	}

}
