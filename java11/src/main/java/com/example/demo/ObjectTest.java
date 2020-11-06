package com.example.demo;

import java.util.Collections;

public class ObjectTest {

    public static void main1(String[] args) {
	TestObj temp = new TestObj("obj1", "from main");
	TestObj temp1 = new TestObj("obj2", "from main");
	System.out.println(temp);
	test(temp);
	System.out.println(temp);
	ObjectTest obj = new ObjectTest();
	obj.test1(temp);
	System.out.println(temp);
	obj.swap(temp, temp1);
	System.out.println(temp );
	System.out.println(temp1 );
    }
    public void dummy(String str) {
	System.out.println("HELLO"+str);

    }
   public static void main(String[] args) {
       new ObjectTest().dummy("aadhya");
       ObjectTest ob1 = new ObjectTest();
       ob1.dummy("sathish");
       ob1.dummy("mounika");
}
    
    private void swap(TestObj t1, TestObj t2) {
	TestObj tem= t1;
	t1=t2;
	t2=tem;
    }
    private void test1(TestObj temp) {
	Collections.sort(list);
	temp.setMsg(" from test1");
    }

    private static void test(TestObj temp) {
	temp.setMsg(" from test");

    }

}
