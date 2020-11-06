package com.example;

interface interf{
    public void methodB();
}
class C{
    public void methodB(){
	System.out.println("sdsd");
	
    }
}
public class inher extends C implements interf{
    Object obj = new Object();
    String s = "";
    public static void main(String[] args) {
	inher i = new inher();
	i.methodB();
    }

}
