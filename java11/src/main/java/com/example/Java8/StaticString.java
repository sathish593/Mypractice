package com.example.Java8;

import java.util.HashMap;
import java.util.Map;

import org.apache.commons.text.StringSubstitutor;

public class StaticString {

    public static void main(String[] args) {
	/*
	 * Map<String, Object> temp = new HashMap<>(); temp.put("name", "sathish");
	 */
	System.out.println(strSubstitutor("{{name}}","name", "sathish", "{{", "}}"));
	
	System.out.println(strSubstitutor("{{name}}", "name","sasasas", "{{", "}}"));
    }

    public static String strSubstitutor(String inputPlaceHolderString, Map<String, Object> replacementData,
	    String placeHolderPrefix, String placeHoldersuffix) {
	StringSubstitutor sub = new StringSubstitutor(replacementData, placeHolderPrefix, placeHoldersuffix);
	return sub.replace(inputPlaceHolderString);
    }

    public static String strSubstitutor(String inputPlaceHolderString, String key, String replacementvalue,
	    String placeHolderPrefix, String placeHoldersuffix) {
	Map<String, Object> temp = new HashMap<>();
	temp.put(key, replacementvalue);
	StringSubstitutor sub = new StringSubstitutor(temp, placeHolderPrefix, placeHoldersuffix);
	String temp1 = sub.replace(inputPlaceHolderString);
	return temp1;
    }

}
