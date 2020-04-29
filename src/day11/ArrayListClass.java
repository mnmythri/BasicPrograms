package day11;

import java.util.*;  
class ArrayListClass{  
   public static void main(String args[]){  
      ArrayList<String> alist=new ArrayList<String>();  
      alist.add("Mythri");
      alist.add("Maithri");
      alist.add("Mythree");
      alist.add("Maithree");
      
  
      //displaying elements
      System.out.println(alist);
  
      //Adding "Steve" at the fourth position
      alist.add(3, "MnMythri");
  
      //displaying elements
      System.out.println(alist);
   }  
}
