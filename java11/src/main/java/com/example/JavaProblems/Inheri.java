package com.example.JavaProblems;

class Shape {
	  void print() {
	    System.out.println("Shape");
	  }
	}

	class Rectangle extends Shape {
		
	/*
	 * void print() { System.out.println("Rectangle"); }
	 */
	  void print(int a) {
	    System.out.println("Rectangle");
	  }
	}

	class Square extends Shape {
	  void print() {
	    System.out.println("Square");
	  }
	}

	public class Inheri {
	  public static void main(String args[]) {
	    Shape shape = new Rectangle();
	    Rectangle r= new Rectangle();
	    Square rabbit = new Square();
	    shape.print();
	    rabbit.print();
	    r.print(2);
	  }
	}
