package com.example.Java8;

public class InnerClassTest {
    
    class Test {
	void print() {
	    System.out.println("sddsdsd");
	}
    }

    public InnerClassTest() {
	// TODO Auto-generated constructor stub
	new Test().print();
    }
    
    public static void main(String[] args) {
	InnerClassTest t = new InnerClassTest();
	
    }

}
