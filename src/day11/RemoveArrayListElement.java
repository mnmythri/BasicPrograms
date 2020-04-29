package day11;

import java.util.ArrayList;

public class RemoveArrayListElement {

	public static void main(String args[]){
	      ArrayList<String> alist=new ArrayList<String>(); 
	      alist.add("Mythri");
	      alist.add("Maithri");
	      alist.add("Mythree");
	      alist.add("Maithree");

	      //displaying elements
	      System.out.println(alist);

	      //Removing "Steve" and "Angela"
	      alist.remove("Maithri");
	      alist.remove("Maithree");

	      //displaying elements
	      System.out.println(alist);

	      //Removing 3rd element
	      alist.remove(1);

	      //displaying elements
	      System.out.println(alist);
	   }
}
