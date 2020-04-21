package day9;

class Human{
	   //Overridden method
	   public void eat()
	   {
	      System.out.println("Human is eating");
	   }
	}
	class Overiding extends Human{
	   //Overriding method
	   public void eat(){
	      System.out.println("Boy is eating");
	   }
	   public static void main( String args[]) {
		   Overiding obj = new Overiding();
	      //This will call the child class version of eat()
	      obj.eat();
	   }
	}
