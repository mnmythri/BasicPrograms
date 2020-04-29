package day11;

import java.util.ArrayList;

public class ChangeArrayListClass {

	public static void main(String args[]){  
	      ArrayList<String> alist=new ArrayList<String>();  
	      alist.add("Mythri");
	      alist.add("Maithri");
	      alist.add("Mythree");
	      alist.add("Maithree");
	      
	  
	      //displaying elements
	      System.out.println(alist);
	  
	      //Adding "mYTHRImN" at the fourth position
	      alist.set(0, "mYTHRImN");
	  
	      //displaying elements
	      System.out.println(alist);
	   }  

}
