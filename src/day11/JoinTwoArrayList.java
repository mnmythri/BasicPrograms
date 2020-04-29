package day11;

import java.util.ArrayList;

public class JoinTwoArrayList {

	public static void main(String [] args)
    {
        //First ArrayList
        ArrayList<String> arraylist1=new ArrayList<String>();
        arraylist1.add("One");
        arraylist1.add("Two");
        arraylist1.add("Three");

        //Second ArrayList
        ArrayList<String> arraylist2=new ArrayList<String>();
        arraylist2.add("Four");
        arraylist2.add("Five");
        arraylist2.add("Six");

        //New ArrayList
        ArrayList<String> al= new ArrayList<String>();
        al.addAll(arraylist1);
        al.addAll(arraylist2);

        //Displaying elements of the joined ArrayList
        for(String temp: al){
            System.out.println(temp);
        }
    }

}
