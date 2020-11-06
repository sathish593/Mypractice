package com.example.demo;

import java.lang.reflect.InvocationTargetException;


public class StackTrace {

    private void getCaller() {
	StackTraceElement[] temp = new Throwable().getStackTrace();
	int i=0;
	for (StackTraceElement stackTraceElement : temp) {
	    System.out.println("i - "+i+" My Caller -" +temp[i].getMethodName());
	    i++;
	}
    }
    
    public static void callMethodByName(Object object, String methodName) throws IllegalAccessException, InvocationTargetException, NoSuchMethodException {
	    object.getClass().getDeclaredMethod(methodName).invoke(object);
	}
    
    public static void callMethodByName(Object object, String methodName, int i, String s) throws IllegalAccessException, InvocationTargetException, NoSuchMethodException {
        object.getClass().getDeclaredMethod(methodName, int.class, String.class).invoke(object, i, s);
    }
    
    private void tempMetho() {
	StackTrace st = new StackTrace();
	st.getCaller();

    }
    
    private String appendString(int i, String s) {
	System.out.println(i+s);
	return i+s;
    }
    
    public static void main(String[] args) throws IllegalAccessException, InvocationTargetException, NoSuchMethodException {
	StackTrace st = new StackTrace();
	callMethodByName(st, "tempMetho");
	callMethodByName(st, "appendString", 10, "Ten");
    }

}
