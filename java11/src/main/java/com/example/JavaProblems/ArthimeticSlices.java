package com.example.JavaProblems;

public class ArthimeticSlices {
  
    public static int numberOfArithmeticSlices(int[] A) {
        int dp = 0;
        int sum = 0;
        for (int i = 2; i < A.length; i++) {
            if (A[i] - A[i - 1] == A[i - 1] - A[i - 2]) {
                dp = 1 + dp;
                sum += dp;
            } else
                dp = 0;
        }
        return sum;
    }
    public static void main(String[] args) {
	int[] ip = {-1,1,3,3,3,2,3,2,1,0};
	
	System.out.println(numberOfArithmeticSlices(ip));
    }
}
