package com.example.Java8;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import java.util.stream.Collectors;

public class MapTransform {

    public MapTransform() {
	// TODO Auto-generated constructor stub
    }

    public static void main(String[] args) {
	List<Map<String, String>> l = new ArrayList<Map<String, String>>();
	Map<String, String> map1 = new HashMap<String, String>();
	Map<String, String> map2 = new HashMap<String, String>();
	map1.put("a", "aaaa");
	map2.put("b", "bbbbb");
	l.add(map2);
	l.add(map1);
	TreeMap<String, String> res =  l.stream()
        .collect(TreeMap::new, TreeMap::putAll, TreeMap::putAll);
	
	System.out.println(res);
    }
}
