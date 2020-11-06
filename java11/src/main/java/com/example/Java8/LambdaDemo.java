/**
 * 
 */
package com.example.Java8;

import java.util.ArrayList;
import java.util.List;

/**
 * @author UyyalaSK
 *
 */

interface MyComparator {

    public boolean compare(int a1, int a2);
}
public class LambdaDemo {

	public static void main(String[] args) {
		MyComparator comp=(a1,a2)->{
			if(a1==a2)
				return true;
			else
				return false;
		};
		
		System.out.println(comp.compare(10,20));
		
		List<String> l= new ArrayList<String>();
		l.add("abc");
		l.add("abc1");
		l.add("abc2");
		l.add("abc3");
		
		l.stream().forEach(s->System.out.println(s));
		
		
	}
}
