/**
 * 
 */
package com.example.Java8;

import java.util.Arrays;
import java.util.HashMap;
import java.util.stream.Stream;

import com.github.wnameless.json.flattener.JsonFlattener;

/**
 * @author UyyalaSK
 *
 */
public class FlatMap {

	 public static void main(String[] args) {
	     
	     //HashMap<String,String> map=JsonFlattener.flatten(json); 

	        String[][] data = new String[][]{{"a", "b"}, {"c", "d"}, {"e", "f"}};

	        //Stream<String[]>
	        Stream<String[]> temp = Arrays.stream(data);

	        //Stream<String>, GOOD!
	        Stream<String> stringStream = temp.flatMap(x -> Arrays.stream(x));

	       // Stream<String> stream = stringStream.filter(x -> "a".equals(x.toString()));
	        stringStream.forEach(System.out::println);

	        //stream.forEach(System.out::println);

			/*Stream<String> stream = Arrays.stream(data)
	                .flatMap(x -> Arrays.stream(x))
	                .filter(x -> "a".equals(x.toString()));*/

	    }
}
