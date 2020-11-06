/**
 * 
 */
package com.example.Java8;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @author UyyalaSK
 *
 */
public class StreamDemo {
	
	public static void main(String[] args) {
		ArrayList<String> items = new ArrayList<String>();
		items.add("abc");
		items.add("abcd");
		items.add("bcd");
		items.add("cde");
		items.add("ghi");
		String prefix="a";
		System.out.println(prefix.codePointAt(0));
		
		List<String> filteredList = items.stream().filter(x->!x.equals("abc")).collect(Collectors.toList());
		
		class Res{
			public String temp;
		}
		
		Res r=new Res();
		r.temp="";
		var wrapper =new Object() {int count=1;};
		filteredList.forEach(s->{
			System.out.println(s);
			r.temp+=s;
			wrapper.count++;
			
			});
		System.out.println("temp=="+r.temp);
		System.out.println("wrapper=="+wrapper.count);
		
		
	}

}
