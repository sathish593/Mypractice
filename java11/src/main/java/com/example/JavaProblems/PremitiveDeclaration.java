package com.example.JavaProblems;

public class PremitiveDeclaration{ 
	
	
    public static void main(String args[]){ 
    	//char d="d"; wrong
    	//float f=3.1415; worng
    	float f1=3.2f;
    	double d1=324234.23;
    	double d2=324234.235464d;
    	long i1=43546546543654l;
    	int i=34;
    	//byte b=257; byte -128 -- 127
    	boolean isPresent=true;
    	
    	
    	int myArray[];
    	//int myArrayq[5];
    	//int myArrayw[5] = {1,2,3,4,5};
    	int myArray1[] = {1,2,3,4,5};
    	int arr[] = new int[5];
    	
    	System.out.println(f1+" "+d2); 
    } 
    
  } 


 class DefaultValues {
    char c;
    double d;
    float f;
    int i;
    long l;
    boolean b;
    byte b1;
    public static void main(String[] args) {
    	DefaultValues obj = new DefaultValues();
        System.out.println(">" + obj.c);
        System.out.println(">" + obj.d);
        System.out.println(">" + obj.f);
        System.out.println(">" + obj.i);
        System.out.println(">" + obj.l);
        System.out.println(">" + obj.b);
        System.out.println(">" + obj.b1);
    }
}