package com.example;

public class OuterClass 
{ 
	private int data = 10; 
	private int data1= 101212; 
	class Inner 
	{ 
		private int data = 20; 
		private int getData() 
		{ 
			return data; 
		} 
		public void main(String[] args) 
		{ 	System.out.println(data1);
			Inner inner = new Inner(); 
			System.out.println(inner.getData()); 
			
		} 
	} 
	private int getData() 
	{ 
		return data; 
	} 
	public static void main(String[] args) 
	{ 
		OuterClass outer = new OuterClass(); 
		OuterClass.Inner inner = outer.new Inner(); 
		System.out.printf("%d", outer.getData()); 
		inner.main(args); 
	} 
} 
