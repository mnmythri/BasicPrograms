package Day4;

import java.util.Arrays;
import java.util.List;

public class stringCompare {

	public static void main(String[] args) {
		//creating two string object

		String s1 = "abc";
		String s2 = "abc";
		String s3 = "def";
		String s4 = "ABC";
		
		System.out.println(s1.equals(s4));//false
		System.out.println(s1.equals(s2));//true
		System.out.println(s2.equals(s3));//false
		System.out.println(s1.equals(s4));//false;
		System.out.println(s1.equalsIgnoreCase(s4));//true
		
		String a = "myt";
		String b = "myt";
		String c = "hri";
		String d = "Hi MYTHRI";
		
		System.out.println(a.compareTo(d));
		System.out.println(a.compareTo(b));
		System.out.println(b.compareTo(c));
		System.out.println(a.compareTo(d));
		System.out.println(a.compareToIgnoreCase(d));
	
		// Java String split example
		String sa = "myth/arya/rajath";
		String[] a11 = sa.split("/");
		System.out.println("split string using only regex:");
		for (String str : a11) {
			System.out.println(str);
		}
		System.out.println("split string using regex with limit:");
		String[] a21 = sa.split("/", 2);
		for (String string : a21) {
			System.out.println(string);
		}
		
	  // Java String contains()
	   System.out.println(a.contains("M"));
	   System.out.println(d.contains("M"));
	   
	   // Java String length
	   System.out.println(d.length());
	   
	    //replaceFirst(String regex, String replacement) - replace() , replaceAll()
	    System.out.println(d.replaceFirst("Hi", "Hallo"));
	   
	    // Java String substring
	    String s = "This is my program";
		s = s.substring(8,18);
		System.out.println(s);
	
		// Concatenate String
		String s11 = "Mythri";
		String s21 = "Arya";
		String s31 = s1 + s2;
		
		//using + operator
		System.out.println("Using + operator: ");
		System.out.println(s31);
		
		//using concat method
		System.out.println("Using concat method: ");
		System.out.println(s11.concat(s21));
		
		// using join method
		List<String> words = Arrays.asList(new String[]{"Hello", "World", "2019"});
		String msg = String.join(" ", words);
		System.out.println(msg);
		
		// uppercase to lower case
		System.out.println(d.toLowerCase());
		
		// lowercase to uppercase
		System.out.println(d.toUpperCase());
		
		for(int m=0; m<=d.length(); m++) {
			System.out.print(d.charAt(m)+ ",");
		}
	}

}
