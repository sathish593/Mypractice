/**
 * 
 */
package com.example.Java8;

/**
 * @author UyyalaSK
 *
 */
@FunctionalInterface
public interface MyFirstFunctionalInterface {

	 public void firstWork();
	
	 public static String dummyStatic() {
		 return "Hi from dummy static method";
	 }
	 
	 default String dummyDefault(){
		 return "Hi from dummy default method";
	    }
}
