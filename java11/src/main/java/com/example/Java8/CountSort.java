package com.example.Java8;

import java.util.Arrays;

public class CountSort {

    static void countSort(int[] arr) {
	int max = Arrays.stream(arr).max().getAsInt();
	int min = Arrays.stream(arr).min().getAsInt();
	int range = max - min + 1;
	int count[] = new int[range];
	int output[] = new int[arr.length];
	for (int i = 0; i < arr.length; i++) {
	    int curr = arr[i];
	    count[curr - min]++;
	}
	System.out.print("initila counts ---");
	printArray(count);

	for (int i = 1; i < count.length; i++) {
	    count[i] += count[i - 1];
	}
	System.out.print("updated counts ---");
	printArray(count);
	
	for (int i = 0; i < arr.length; i++) {
	    output[count[arr[i]-min]-1] = arr[i];
	    --count[arr[i]-min];
	}
	
	for (int i = 0; i < arr.length; i++) {
	    arr[i] = output[i];
	}
    }

    static void printArray(int[] arr) {
	for (int i = 0; i < arr.length; i++) {
	    System.out.print(arr[i] + " ");
	}
	System.out.println("");
    }

    // Driver code
    public static void main(String[] args) {
	int[] arr = { 5, 10, 12, 3, 8, 6, 2, 11 ,0};
	System.out.print("initial--");
	printArray(arr);
	countSort(arr);
	printArray(arr);
    }
}
