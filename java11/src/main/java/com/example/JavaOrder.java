package com.example;

public class JavaOrder {

    public JavaOrder() {
	System.out.println("constructor");
    }

    {
	System.out.println("from block");
    }
    
    static  {
	System.out.println("from static block");
    }
    
    public static void main(String[] args) {
	JavaOrder j = new JavaOrder();
    }
}
