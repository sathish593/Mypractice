package com.example;

class ParamTest {

    public ParamTest() {
	// TODO Auto-generated constructor stub
    }
    public void print(String s) {
	System.out.println("string --"+s);
    }
    public void print(Object s) {
   	System.out.println("object --"+s);
       }
    public void print(Integer i) {
 	System.out.println("Integer"+i);
     }
    public void print(int i) {
	System.out.println("int"+i);
    }
    public void print(long i) {
  	System.out.println("long"+i);
      }
    
    public static void main(String[] args) {
	ParamTest tes= new ParamTest();
	Object obj=null;
	tes.print(obj);
	//tes.print(null);
	tes.print(1l);
    }
}
