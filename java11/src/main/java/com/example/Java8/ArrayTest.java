package com.example.Java8;

public class ArrayTest {

    public ArrayTest() {
	// TODO Auto-generated constructor stub
    }
    static void increment(int[] i) {
	i[i.length-1]++;
	
    }
    
    public static void main(String[] args) {
	int[] a = {1};
	increment(a);
	System.out.println(a[0]);
	
	
	double d = 100/-0;
	if(d == Double.POSITIVE_INFINITY) {
	    System.out.println("sdsd");
	}else {
	    System.out.println("sdsdsddssd");
	}
    }

}
