package day11;

import java.util.ArrayList;

public class ClearArrayListClass {

	public static void main(String[] args) {
		
		 ArrayList<String> alist=new ArrayList<String>();  
	      alist.add("Mythri");
	      alist.add("Maithri");
	      alist.add("Mythree");
	      alist.add("Maithree");
	      
	  
	      //displaying elements
	      System.out.println("The set: "  + alist);
		
		// Clearing the Set using clear() method 
	      alist.clear(); 
  
        // Displaying the final Set after clearing; 
        System.out.println("The final set: " + alist); 
	}

}
