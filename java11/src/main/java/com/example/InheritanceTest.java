package com.example;

//file name: Main.java 
class Base { 
 private void foo() { System.out.println("Base"); } 
} 

class Derived extends Base { 

 // compiler error  
 public void foo() { System.out.println("Derived"); }  
} 

public class InheritanceTest { 
 public static void main(String args[]) { 
     Derived d = new Derived(); 
     d.foo(); 
 } 
} 
