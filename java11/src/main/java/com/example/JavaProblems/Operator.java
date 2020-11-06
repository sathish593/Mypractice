package com.example.JavaProblems;

public class Operator { 
    public static void main(String[] args) 
    { 
        int a = 10; 
        int b = 20; 
  
        if (++a <= 10 && --b < 20) {} 
          System.out.println("Output of && operator: "
                           + "a = " + a + " b = " + b); 
        System.out.println("-------------"); 
  
        a = 10; 
        b = 20; 
        if (++a <= 10 & --b < 20) {} 
        System.out.println(++a <= 10 & --b < 20);
          System.out.println("Output of & operator: "
                          + "a = " + a + " b = " + b); 
    } 
} 



 class Test {
	 public static void main(String[] args) {
	 int x = 10;
	 int y = 2;
	 try {
	 for (int z = 2; z >= 0; z--) {
	 int ans = x / z;
	System.out.print(ans+ " ");
	 }
	 } 
	 catch (ArithmeticException e1) {
		 System.out.println("E2");
		 }
	 catch (Exception e1) {
	 System.out.println("E1");
	 } 
	 }
	}
