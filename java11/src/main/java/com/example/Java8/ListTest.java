package com.example.Java8;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

public class ListTest {

    public ListTest() {
	// TODO Auto-generated constructor stub
    }
    public static void main(String[] args) {
	List<Integer> list = new ArrayList();
	list.add(10);
	list.add(20);
	list.add(30);
	list.remove(0);
	list.add(10);
	int count = new HashSet<Integer>(list).size();
	list.clear();
	Iterator<Integer> itr = list.iterator();
	int i=0;
	while (itr.hasNext()) {
	    if(i==1) {
		list.remove(1);
	    }
	  
	   System.out.println(itr.next());
	   ++i;
	    
	}
	//list.forEach(i -> System.out.println(i));
    }

}
