package com.example.Java8;

import java.util.Calendar;

public class LoopTest {

    public LoopTest() {

    }

    public static void main(String[] args) {
	Calendar startTime = Calendar.getInstance();  
	for(int i=0;i<10000;i++) {
	    System.out.println("sadsadsadsdasa-"+i);
	}
	Calendar endTime = Calendar.getInstance();  
	System.out.println(endTime.getTimeInMillis()-startTime.getTimeInMillis());
    }
}
