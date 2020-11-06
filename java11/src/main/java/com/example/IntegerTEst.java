package com.example;

public class IntegerTEst {

    public IntegerTEst() {
	// TODO Auto-generated constructor stub
    }

    public static void main(String[] args) {
	Float f = new Float("3.0");
	byte b = f.byteValue();
	int i = f.intValue();
	double d = f.doubleValue();
	System.out.println(b+i+d);
    }
}
