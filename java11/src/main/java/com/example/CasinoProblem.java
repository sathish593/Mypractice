package com.example;

import java.util.Scanner;

public class CasinoProblem {
    public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	
	
	int N = sc.nextInt();
	int K = sc.nextInt();

	int tempN = N;
	int result = 0;
	// write your Logic here

	for (int i = 0; i < K && tempN>0; ) {

	    if (tempN % 2 != 0) {
		tempN -= 1;
		result += 1;
	    } else {
		tempN = tempN / 2;
		result += 1;
		i++;
	    }
	}
	result = result + tempN -1 ;

	// OUTPUT [uncomment & modify if required]
	System.out.println(result);
	System.out.println(Integer.MAX_VALUE);

    }
}