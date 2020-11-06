package com.example.Java8;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

public class ArraySort {

    public ArraySort() {
	// TODO Auto-generated constructor stub
    }
    
    public static void main(String[] args) {
	int[] arr = {8,1,4,6,4};
	Arrays.sort(arr);
	
	for (int sys = 0; sys < arr.length; sys++) {
	    System.out.println(arr[sys]);
	}
    }

}
