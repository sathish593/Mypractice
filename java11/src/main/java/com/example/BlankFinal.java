package com.example;


// A sample Java program to demonstrate use and 
// working of blank final 
class TestFinal
{ 
    // We can initialize here, but if we 
    // initialize here, then all objects get 
    // the same value.  So we use blank final 
    final int i; 
  
    TestFinal(int x) 
    { 
        // Since we have initialized above, we 
        // must initialize i in constructor. 
        // If we remove this line, we get compiler 
        // error. 
        i = x; 
    } 
} 
  
// Driver Code 
public class BlankFinal 
{ 
    public static void main(String args[]) 
    { 
	TestFinal t1 = new TestFinal(10); 
        System.out.println(t1.i); 
  
        TestFinal t2 = new TestFinal(20); 
        System.out.println(t2.i); 
        System.out.println(t2.i); 
    } 
} 