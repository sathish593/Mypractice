package com.example.Java8;

import java.util.ArrayList;

public class ArrayListIndex {

    public static void main(String[] args) {
	  ArrayList<Integer> arrlist = new ArrayList<Integer>(5);

	      // use add() method to add elements in the list
	     // arrlist.add(15);
	     // arrlist.add(22);
	     // arrlist.add(30);
	      //arrlist.add(40);

	      // adding element 25 at third position
	      arrlist.add(25);
	      int index =0;
	      if( arrlist.size()>=index ) {
		  arrlist.add(index, 100);
		    }
	        
	      // let us print all the elements available in list
	      for (Integer number : arrlist) {
	         System.out.println("Number = " + number);
	      }  
    }

}
