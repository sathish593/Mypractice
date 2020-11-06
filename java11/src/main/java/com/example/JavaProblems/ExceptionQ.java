package com.example.JavaProblems;

public class ExceptionQ {

	private static int test(int o) {
		try {
			int p= 2/o;
			System.out.println("asdsad");
			return p;
		}catch (Exception e) {
			System.out.println("method catch");
		}finally {
			System.out.println("method final");
		}
		return o;

	}
	public static void main(String[] args) {
		
		
		try {
			System.out.println("in main-"+test(2));
		}catch (Exception e) {
			System.out.println("main catch");
		}finally {
			System.out.println("main final");
		}
	}
}
