package com.example.Java8;

import java.math.BigDecimal;
import java.text.NumberFormat;
import java.util.Locale;

public class BigDecTest {
public static void main(String[] args) {
	Locale locale = new Locale("en", "US");
	BigDecimal temp =  BigDecimal.valueOf(-514.2345345);
	NumberFormat defaultFormat = NumberFormat.getCurrencyInstance(locale);
	BigDecimal temp1=temp.abs();
	String amt =  defaultFormat.format(temp1);
	if(amt.startsWith("(")){
		amt = amt.replace("(", "");
		amt = amt.replace(")", "");
		//amt = "-"+ amt;
	}
	System.out.println(amt);
}
}
