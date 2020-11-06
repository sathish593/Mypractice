package com.example.JavaProblems;

public class StringQ {

	
	public static void main(String[] args) {
		
		String s="banana";
		StringBuilder sb= new StringBuilder("banana");
		System.out.println(s.charAt(2));
		System.out.println(s.indexOf('a'));
		System.out.println(s.indexOf('a',2));
		System.out.println(s.substring(3,5));
		sb.substring(3, 6);
		sb.append("sds");
		sb.reverse();
		System.out.println(sb);
		
		
		
		 StringBuilder s1 = new StringBuilder(10 + 2 + "ABC" + 4 + 5); 
		 System.out.println(s1);
		//System.out.println( s1.delete(3, 6));
         s1.append(s1.delete(3, 6)); 
         System.out.println(s1); 
         
         StringBuilder sb1 = new StringBuilder("123456");
         sb1.subSequence(2, 4);
                 sb1.deleteCharAt(3);
         sb1.reverse();
         System.out.println(sb1);
	}
}



class SpecialString {
    String str;
    SpecialString(String str) {
        this.str = str;
    }
}

 class Test1 {
    public static void main(String[] args) {
        System.out.println(new String("Java"));
        System.out.println(new StringBuilder("Java"));
        System.out.println(new SpecialString("Java"));
    }
}