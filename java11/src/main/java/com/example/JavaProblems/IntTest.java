package com.example.JavaProblems;

public class IntTest {

	static void x(int i1, int i2) {
		System.out.println("hell from 1st  "+i1+"--"+i2);
	}

	static void x(int... i) {
		System.out.println("hell from 2nd");
	}
	static void y(byte b) {
		System.out.println("byte--"+b);
	}

	public static void main(String[] args) {
		x(1,Integer.MAX_VALUE+1);
		int j= 11/2;
		for (byte i=127; i < 128; i++) {
			y(i);
		}
		
	}
}
