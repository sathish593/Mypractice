package com.example.Java8;

import java.util.ArrayList;
import java.util.List;

public class Shaktiman {

    public static void main(String[] args) {

	Long[] arr = { -5l, -4l, 0l, 1l, 6l, -2l, 3l, -4l, -5l, 3l, 4l };
	long power = calculatePow(java.util.Arrays.asList(arr));
	System.out.println("\nShaktiman should be deployed with initial power " + power);
    }

    static Long calculatePow(java.util.List<Long> arr) {
	Long least = 0l, curr = 0l;
	for (Long i : arr) {
	    // System.out.print(curr + " ");
	    curr += i;
	    if (curr < least)
		least = curr;
	}
	return least < 0l ? (1l - least) : 1l;
    }
}
