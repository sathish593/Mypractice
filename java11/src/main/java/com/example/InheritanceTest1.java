package com.example;

class First 
{ 
    int i = 10; 
    public First() {
	System.out.println("First default");
    }
   
    public First(int j) 
    { 
        System.out.println(i);  
        this.i = j * 10; 
    } 
} 
   
class Second extends First 
{ 
    public Second() {
	
    }
    public Second(int j) 
    { 
        //super(j);  
        System.out.println(i);  
        this.i = j * 20; 
    } 
} 
   
public class InheritanceTest1 
{ 
    public static void main(String[] args) 
    { 
        Second n = new Second();  
        System.out.println(n.i); 
    } 
} 