package com.example.Java8;

import java.util.LinkedList;
import java.util.List;


class A{
    public A(int a) {
	
    }
}

public class MaximalDiff2 {

    public MaximalDiff2() {
	// TODO Auto-generated constructor stub
    }
   Integer v 
    
    
    
    static int maximalDifference(List<Integer> a) {
	
	String temp[] ={"a","b"};
	int j=0;
	boolean flag = false;
	int result = 0;
	
	for (Integer integer : a) {
	   
	    int pivot = a.get(j);
	    for (int i = 0; i < j; i++) {
		int first = a.get(i);
		    if(first < pivot) {
			flag = true;
			int diff = pivot-first;
			result = diff >= result ? diff : result;
		    }
	    }
	    
	    j++;
	    
	}
	
	if(flag) {
	    return result;
	}
	else {
	    return -1;
	}


    }
    
    public static void main(String[] args) {
	List<Integer> ip = new LinkedList<>();
	ip.add(7);
	ip.add(2);
	ip.add(3);
	ip.add(10);
	System.out.println(maximalDifference(ip));
	
    }

}
