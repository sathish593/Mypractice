package com.example.Java8;

public class StaticTest {
    
    static  int potti = 10;
    int x=20;

    public StaticTest() {
	// TODO Auto-generated constructor stub
    }
    
    public static void main(String[] args) {
	StaticTest t1 = new StaticTest();
	StaticTest t2 = new StaticTest();
	t2.x=30;
	t2.potti=50;
	System.out.println(StaticTest.potti+"--"+StaticTest.potti);
	System.out.println(t2.x);
    }

}
