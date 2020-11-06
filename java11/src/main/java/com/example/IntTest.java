package com.example;

public class IntTest {

   static void int11(int x) {
       System.out.println("int");
   }
   static void int11(Integer x) {
       System.out.println("integer");
   }
   static void object(Object x) {
       System.out.println("object");
   }
   static String object(String x) {
       System.out.println("object");
       return "";
   }
   public static void main(String[] args) {
    int11(1);
    String s ="sfdsfsf";
    object(s);
}
}
