package com.example;

class Super{
    public void print() {
	System.out.println("super");

    }
}
class Sub extends Super{
    public void print() {
	System.out.println("sub");

    }
}

public class InheritanceTest3 {

   public static void main(String[] args) {
    Super sup = new Sub();
    Sub sub = (Sub) new Super();
    sub.print();
}

}
