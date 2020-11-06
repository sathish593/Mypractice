package com.example;



class Derived1 
{ 
    Derived1 getDetails(String temp) 
    { 
        System.out.println("Derived class " + temp);
	return null;
    }  
} 
  
public class OverridingExample extends Derived1 
{ 
    OverridingExample getDetails(String temp) 
    { 
        System.out.println("Test class " + temp);
	return null;
	 
        
    } 
    public static void main(String[] args) 
    { 
        OverridingExample obj = new OverridingExample(); 
        obj.getDetails("GFG"); 
    } 
} 
