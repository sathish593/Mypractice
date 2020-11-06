package com.example;

public class RuntimePolymorphism 
{ 
    public static void main(String[] args) 
    { 
        A1 a = new B1(); 
        B1 b = new B1(); 
          
        System.out.println(a.c + " " + a.getValue()  
            + " " + b.getValue() + " " + b.getSuperValue()); 
        System.out.println(a.c + " " +b.c); 
    } 
} 
class A1 
{ 
    protected char c = 'A'; 
    char getValue() 
    { 
        return c; 
    } 
} 
  
class B1 extends A1 
{ 
    protected char c = 'B'; 
    char getValue() 
    { 
        return c; 
    } 
    char getSuperValue() 
    { 
        return super.c; 
    } 
} 