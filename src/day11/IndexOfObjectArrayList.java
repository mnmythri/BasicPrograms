package day11;

import java.util.ArrayList;
import java.util.Collections;

public class IndexOfObjectArrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		  ArrayList<String> fruits = new ArrayList<String>();
	      fruits.add("Orange");
	      fruits.add("Apple");
	      fruits.add("Banana");
	      fruits.add("Pineapple");
	      Collections.sort(fruits);
	      
	      for (String str : fruits) {
		         System.out.println(str);
		      }
	      
	      System.out.println("The first occurrence" + " of Apple is at index:" + fruits.indexOf("Apple")); 
	      System.out.println("The first occurrence" + " of Orange is at index:" + fruits.indexOf("Orange")); 
	      System.out.println("The first occurrence" + " of Banana is at index:" + fruits.indexOf("Banana")); 
	      System.out.println("The first occurrence" + " of Pineapple is at index:" + fruits.indexOf("Pineapple")); 
	      
		 
	}

}
