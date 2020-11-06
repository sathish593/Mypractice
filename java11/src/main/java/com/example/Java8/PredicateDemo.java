package com.example.Java8;

import java.util.function.Predicate;

public class PredicateDemo {

	public static void main(String[] args) 
    { 
        // Creating predicate 
        Predicate<Integer> lesserthan18 = i -> (i < 18);  
        Predicate<Integer> greaterthan9 = i -> (i > 9);
        Predicate<Integer> greaterthan20 = i -> (i > 20);
        // run Predicate method 
        System.out.println(lesserthan18.and(greaterthan9).test(10));  
        System.out.println(lesserthan18.or(greaterthan20).test(10));
        System.out.println(lesserthan18.and(greaterthan9).negate().test(10)); 
    } 
}
