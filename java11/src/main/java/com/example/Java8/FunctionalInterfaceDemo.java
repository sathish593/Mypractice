/**
 * 
 */
package com.example.Java8;

/**
 * @author UyyalaSK
 *
 */
public class FunctionalInterfaceDemo  {

	public static void main(String[] args) {
		MyFirstFunctionalInterface mfl=()-> System.out.println("hello from lambda");
		MyFirstFunctionalInterface2 mfl1=System.out::println;
		mfl.firstWork();
		mfl1.firstWork("Hello from lambda 2");
		System.out.println(mfl.dummyDefault());
		System.out.println(MyFirstFunctionalInterface.dummyStatic());
	}

}
