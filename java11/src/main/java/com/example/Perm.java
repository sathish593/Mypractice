package com.example;

//Java program to print all the permutations 
//of the given string 
public class Perm { 

	// Function to print all the permutations of str 
	static void printPermutn(String str, String ans) 
	{ 
	    
		// If string is empty 
		if (str.length() == 0) { 
			System.out.println(ans + " "); 
			return; 
		} 

		for (int i = 0; i < str.length(); i++) { 
		    System.out.println("str --\t"+str+"\t ans--\t"+ans);
			// ith character of str 
			char ch = str.charAt(i); 

			// Rest of the string after excluding 
			// the ith character 
			String ros = str.substring(0, i) + 
						str.substring(i + 1); 

			// Recurvise call 
			printPermutn(ros, ans + ch); 
		} 
	} 

	// Driver code 
	public static void main(String[] args) 
	{ 
		String s = "abc"; 
		printPermutn(s, ""); 
	} 
} 