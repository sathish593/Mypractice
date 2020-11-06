package com.example.Java8;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.TreeMap;
import java.util.stream.Collectors;

public class CountSweets {

    static class Res{
	    public String item ;
	   
	    public int max;
	}
	
   
    static String whichSweetShouldIBring(List<String> votes) {
	
	TreeMap<String,Integer> count = new TreeMap<>();
	votes.forEach( item -> {
	    Integer itemCount = count.get(item);
	  if(itemCount != null) {
	      count.put(item, itemCount+1);
	  }
	  else {
	      count.put(item, 1);
	  }
	});
	System.out.println(count);
	
	Res max = new Res();
	max.item= "";
	max.max = 0;
	
	count.entrySet().forEach(e ->{
	 if( e.getValue() >= max.max) {
	     max.max = e.getValue();
	     max.item = e.getKey();
	 }
	});
	
	
	return max.item;
    }

    
    public static void main(String[] args) {
	
	 BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	 Scanner s = new Scanner(System.in);

	
	List<String> votes = new ArrayList<>();
	votes.add("laddu");
	votes.add("ass");
	System.out.println(whichSweetShouldIBring(votes));
    }
}
