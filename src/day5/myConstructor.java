package day5;

public class myConstructor {
	
	int modelYear;
	String modelName;

	  public myConstructor(int year, String name) {
	    modelYear = year;
	    modelName = name;
	  }

	  public static void main(String[] args) {
		  myConstructor myCar = new myConstructor(1969, "Mustang");
	    System.out.println(myCar.modelYear + " " + myCar.modelName);
	  }
	}


