package com.example.Java8;

import java.util.HashMap;

public class GenericsTest<T> {
    T t;

    public T getT() {
        return t;
    }

    public void setT(T t) {
        this.t = t;
    }
  
    public static void main(String[] args) {
	GenericsTest t1= new GenericsTest<>();
	
	t1.setT("hello");
	t1.setT(new HashMap<>());
	t1.setT(123);
	System.out.println(t1.getT());
    }

}
