package com.example;

interface BaseI{
     void method();
}

class BaseC{
    public void method() {
	System.out.println("sdsds");
    }
}
public class InherTest extends BaseC implements  BaseI{

    public static void main(String[] args) {
	new InherTest().method();
    }

}
