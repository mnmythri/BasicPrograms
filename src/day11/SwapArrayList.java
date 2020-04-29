package day11;

import java.util.ArrayList;
import java.util.Collections;

public class SwapArrayList {

	public static void main(String a[]){
	    ArrayList<String> al = new ArrayList<String>();
	    al.add("Mythri");
	    al.add("Ramya");
	    al.add("Pandu");
	    al.add("Naveen");
	    
	    System.out.println("ArrayList before Swap:");
	    for(String temp: al){
	        System.out.println(temp);
	    }

	    //Swapping 2nd(index 1) element with the 5th(index 4) element
	    Collections.swap(al, 1, 3);

	    System.out.println("ArrayList after Swap:");
	    for(String temp: al){
	       System.out.println(temp);
	    }
	  }

}
