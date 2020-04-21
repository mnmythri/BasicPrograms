package day5;

 class privateMethod{
	
	public static void publicMethodClassB() {
		System.out.println("Class b public Method");
	}
	
	 static void privateMethodClassB() {
		System.out.println("Class b Private Method");
	}
}
public class classAndMethods {
	
	
	public void myPublicMethod() {
		System.out.println("public method");
	}
	
	static void myStaticMethod() {
		System.out.println("static method");
	}
	
	private static void myPrivateMethod() {
		System.out.println("Private Method");
	}

	public static void main(String[] args) {
		
		classAndMethods obj1 = new classAndMethods();
		obj1.myPublicMethod();
		
		myStaticMethod();
		myPrivateMethod();
				
		privateMethod obj2 = new privateMethod();
		privateMethod.privateMethodClassB();
		privateMethod.publicMethodClassB();
		
		otherClass obj3 = new otherClass();
		otherClass.protMethod();
	}

}
