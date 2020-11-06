package com.example;

import java.util.HashMap;

public class Testetst {

    public Testetst() {
	// TODO Auto-generated constructor stub
    }

    public static String cal(String erica, String bob) {
	HashMap<String,Integer> diffTOPoints = new HashMap();
	    diffTOPoints.put("E",1);
	    diffTOPoints.put("M",3);
	    diffTOPoints.put("H",5);
	    int ericPoints = 0;
	    int bobPoints=0;
	    for(int i=0; i<erica.length();i++){
	       int a=  diffTOPoints.get(erica.charAt(i)+"");
	       
	       ericPoints = ericPoints + diffTOPoints.get(erica.charAt(i)+"");
	    }
	    for(int j=0; j<bob.length();j++){
	        bobPoints = bobPoints + diffTOPoints.get(erica.charAt(j)+"");
	    }

	    if(ericPoints == bobPoints){
	        return "Tie";
	    } else if( ericPoints > bobPoints){
	        return "Erica";
	    }
	    else{
	        return "Bob";
	    }

	    }
    
    public static void main(String[] args) {
	System.out.println(cal("E", "H"));
    }
    }
