package com.example;

class Alpha 
{ 
    public String type = "a "; 
    public Alpha() {  System.out.print("alpha "); } 
} 
  
public class InheritanceTest2 extends Alpha 
{ 
    public String type;
    public InheritanceTest2()  {  System.out.print("beta ");  } 
  
    void go() 
    { 
        type = "b "; 
        System.out.print(this.type + super.type); 
    } 
  
    public static void main(String[] args) 
    { 
        new InheritanceTest2().go(); 
    } 
} 