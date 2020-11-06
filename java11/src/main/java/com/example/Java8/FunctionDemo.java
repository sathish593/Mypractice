package com.example.Java8;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.function.Function;

public class FunctionDemo {
    
    private static String testMethod(String a) {
	a = a+a;
	return a;
    }

	public static void main(String[] args) {
	    
	   // String tempStr="hello";
	    //tempStr="sdsd";
		Function<String, String> fun= a-> {
		    String tempStr="hello";
		    FunctionDemo.testMethod(tempStr);
		  return  a.concat(" FROM apply");
		};
		//fun.andThen(String::toLowerCase);
		fun=fun.andThen(a -> a.concat(" FRom andThen").toUpperCase());
		fun=fun.compose(a->a.concat(" From Compose"));
		
		System.out.println(fun.apply("HI"));
		//fun=Function.identity();
		System.out.println(fun);
		
		Function<Integer, Integer> half = a -> a / 2;
        half = half.andThen(a -> 3 * a); 
        System.out.println(half.apply(10)); 
       
	}
	
}
