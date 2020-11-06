package com.example.Java8;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class MapTest {

    public MapTest() {
	// TODO Auto-generated constructor stub
    }

    public static void main(String[] args) {
	Map<String,String> map = new HashMap<>();
	map.put("zz", "zzz");
	map.put("g", "ggg");
	map.put("f", "ffff");
	map.put("a", "aaa");
	System.out.println(map);
	Map<String,String> map2 = new TreeMap<>(map);
	System.out.println(map2);
    }
}
