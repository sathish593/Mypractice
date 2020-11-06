package com.example;
class A extends Exception{}
class B extends A{}
public class Test {

    public  static void Test1() {
	// TODO Auto-generated constructor stub
    }

    public static void main(String[] args) {
	try {
	    throw new B();
	}catch (A e) {
	   System.out.println("a");
	}
	catch (Exception e) {
	    System.out.println("e");
	}
    }
}
