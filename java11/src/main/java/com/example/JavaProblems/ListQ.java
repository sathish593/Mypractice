package com.example.JavaProblems;

import java.util.ArrayList;
import java.util.List;

public class ListQ {

	public static void main(String[] args) {
		 ArrayList<String> list = new ArrayList<>(); 
         list.add("dog"); 
         list.add("cat"); 
         list.add("frog"); 
         list.contains("cat");
         //list.hasObject("cat");
         list.indexOf("cat");
         list.indexOf(1);
         
         List<String> list1 = new ArrayList<>();
         list1.add("A");
         list1.add("D");
 
         List<String> list2 = new ArrayList<>();	
         list2.add("B");
         list2.add("C");
 
         list1.addAll(1, list2);
 
         System.out.println(list1);
	}
}

class Counter {
    int count;
    Counter(int count) {
        this.count = count;
    }

    public String toString() {
        return "Counter-" + count;
    }
}

 class TestListClone {
    public static void main(String[] args) {
        ArrayList<Counter> original = new ArrayList<>();
        original.add(new Counter(10));

        ArrayList<Counter> cloned = (ArrayList<Counter>) original.clone();
        cloned.get(0).count = 5;

        System.out.println(original);
    }
}
 
 
 class Student {
     private String name;
     private int age;
 
     Student(String name, int age) {
         this.name = name;
         this.age = age;
     }
 
     public String toString() {
         return "Student[" + name + ", " + age + "]";
     }
     
     @Override
    public int hashCode() {
    	// TODO Auto-generated method stub
    	 System.out.println(age+name.hashCode());
    	return age+name.hashCode();
    }
}
 
 class DuplicateTest {
     public static void main(String[] args) {
         List<Student> students = new ArrayList<>();
         students.add(new Student("James", 25));
         students.add(new Student("James", 27));
         students.add(new Student("James", 25));
         students.add(new Student("James", 25));
 
         students.remove(new Student("James", 25));
 
         for(Student stud : students) {
             System.out.println(stud);
         }
     }
}
