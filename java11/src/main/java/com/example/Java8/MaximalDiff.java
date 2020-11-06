package com.example.Java8;

import java.util.LinkedList;
import java.util.List;

public class MaximalDiff {

    public MaximalDiff() {
	// TODO Auto-generated constructor stub
    }
    
    static int maximalDifference(List<Integer> a) {
	int i=0;
	int j=1;
	boolean flag = false;
	int result = 0;
	
	for (Integer integer : a) {
	    if(i == a.size()-1) {
		break;
	    }
	    
	    int first = a.get(i);
	    int second = a.get(j);
	    if(first < second) {
		flag = true;
		int diff = second-first;
		result = diff > result ? diff : result;
	    }
	    i++;
	    
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
	ip.add(4);
	ip.add(1);
	ip.add(3);
	ip.add(2);
	System.out.println(maximalDifference(ip));
	
    }

}
