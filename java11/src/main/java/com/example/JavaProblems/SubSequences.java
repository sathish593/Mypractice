package com.example.JavaProblems;

/* Java code to generate all possible subsequences. 
Time Complexity O(n * 2^n) */

import java.math.BigInteger;
class SubSequences {
    static int arr[] = new int[] { 1, 2, 3, 4 };

    static void printSubsequences(int n) {
	/* Number of subsequences is (2**n -1) */
	int opsize = (int) Math.pow(2, n);

	/* Run from counter 000..1 to 111..1 */
	for (int counter = 1; counter < opsize; counter++) {
	    String result ="";
	    for (int j = 0; j < n; j++) {
		/*
		 * Check if jth bit in the counter is set If set then print jth element from
		 * arr[]
		 */
		if (BigInteger.valueOf(counter).testBit(j)) {
		    //System.out.print(arr[j] + " ");
		    result +=arr[j];
		}   
	    }
	    System.out.println(result);
	}
    }

// Driver method to test the above function 
    public static void main(String[] args) {
	System.out.println("All Non-empty Subsequences");
	printSubsequences(arr.length);
    }
}
