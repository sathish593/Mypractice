/**
 * 
 */
package com.example.Java8;

import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * @author UyyalaSK
 *
 */
class Test{
    public Test(String orde) {
	this.order = orde;
    }
    String order;
    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return order;
    }
    public int compareTo(Test value) {
	return -this.order.compareTo(value.order);
    }
}
public class MapSort {

	 public static void main(String[] argv) {
	     	Collections.sort();
	        Map<String, Test> unsortMap = new HashMap<>();
	        unsortMap.put("z", new Test("z"));
	        unsortMap.put("b", new Test("d"));
	        unsortMap.put("a", new Test("df"));
	        unsortMap.put("c", new Test("g"));
	        unsortMap.put("d", new Test("h"));
	        unsortMap.put("d1", new Test("r"));
	        unsortMap.put("e", new Test("w"));
	        unsortMap.put("y", new Test("g"));
	        unsortMap.put("n", new Test("df"));
	        unsortMap.put("g", new Test("e"));
	        unsortMap.put("m", new Test("r"));
	        unsortMap.put("f", new Test("w"));
	        
	        Map<String, Integer> unsortMap1 = new HashMap<>();
	        unsortMap1.put("z", 1);
	        unsortMap1.put("b", 3);
	        unsortMap1.put("a", 2);
	        unsortMap1.put("c", 1);
	        unsortMap1.put("d", 3);
	        unsortMap1.put("d1", 65);
	        unsortMap1.put("e", 435);
	        unsortMap1.put("y", 34);
	        unsortMap1.put("n", 3);
	        unsortMap1.put("g", 9);
	       


	        System.out.println("Original...");
	        System.out.println(unsortMap);

	        // sort by keys, a,b,c..., and return a new LinkedHashMap
	        // toMap() will returns HashMap by default, we need LinkedHashMap to keep the order.
	        Map<String, Test> result = unsortMap.entrySet().stream()
	                .sorted(Map.Entry.comparingByKey())
	                .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue,
	                        (oldValue, newValue) -> oldValue, LinkedHashMap::new));
	        
	        Map<String, Test> result2 = unsortMap.entrySet().stream()
	                .sorted((e1, e2) -> e2.getValue().compareTo(e1.getValue()))
	                .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue,
	                        (oldValue, newValue) -> oldValue, LinkedHashMap::new));


	        // Not Recommend, but it works.
	        //Alternative way to sort a Map by keys, and put it into the "result" map
		/*
		 * Map<String, Integer> result2 = new LinkedHashMap<>();
		 * unsortMap.entrySet().stream() .sorted(Map.Entry.comparingByKey())
		 * .forEachOrdered(x -> result2.put(x.getKey(), x.getValue()));
		 */

	        System.out.println("Sorted...");
	        System.out.println(result2);
	       // System.out.println(result2);
	 }
}

