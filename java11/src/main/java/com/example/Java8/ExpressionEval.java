package com.example.Java8;

import java.util.HashMap;

import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import javax.script.ScriptException;

import org.apache.commons.text.StringSubstitutor;


 

public class ExpressionEval {

	public static String evaluate(HashMap<String, String> replacements) throws ScriptException {
		
		HashMap<String, String> expressions = new HashMap<String, String>();
	
		String AGE_REQUIREMENT = " '${AGE_REQUIREMENT}' != null  ?  '${AGE_REQUIREMENT}'  : 'N/A' ";
		
		expressions.put("AGE_REQUIREMENT", AGE_REQUIREMENT);
		
		String SERVICE_REQUIREMENT = " '${SERVICE_REQUIREMENT1}' == 'No eligibility service required'  ?  ('N/A')  "
				+ ": ( '${SERVICE_REQUIREMENT2}' == 'After completing' ? ('${SERVICE_REQUIREMENT_TEXT}') "
				+ ": ( '${SERVICE_REQUIREMENT3}' == 'After completing 1 Year' ? ('1 year') : ( 'N/A' ) ) )";
		
		expressions.put("SERVICE_REQUIREMENT", SERVICE_REQUIREMENT);
		
		String HOURS_REQUIREMENT = " '${SERVICE_REQUIREMENT1}' == 'No eligibility service required'  ?  ('N/A')  "
				+ ": ( '${SERVICE_REQUIREMENT2}' == 'After completing' ? ('${SERVICE_REQUIREMENT_TEXT}' ) "
				+ ": ( '${SERVICE_REQUIREMENT3}' == 'After completing 1 Year' ? ('1 year') : ( 'N/A' ) ) )";
		
		expressions.forEach((k,v)->{
			//if(k.equals("SERVICE_REQUIREMENT")) {
				System.out.println("raw expression --" +v);
				String exp  = StringSubstitutor.replace(v, replacements);
				System.out.println("Expression --"+exp);
				ScriptEngineManager mgr = new ScriptEngineManager();
				ScriptEngine engine = mgr.getEngineByName("JavaScript");
				try {
					System.out.println(engine.eval(exp));
				} catch (ScriptException e) {
					e.printStackTrace();
				}
			//}
		});
		

		return "";

	}

	public static void main(String[] args) {

		HashMap<String, String> replacements = new HashMap<>();
		replacements.put("AGE_REQUIREMENT", "AGE 18");
		replacements.put("SERVICE_REQUIREMENT1", "No eligibility service required");
		replacements.put("SERVICE_REQUIREMENT2", "After completing");
		replacements.put("SERVICE_REQUIREMENT_TEXT", "4");
		replacements.put("SERVICE_REQUIREMENT3", "After completing 1 Year");
		replacements.put("SERVICE_REQUIREMENT1", "No eligibility service required");
		replacements.put("SERVICE_REQUIREMENT1", "No eligibility service required");
		replacements.put("SERVICE_REQUIREMENT1", "No eligibility service required");
		replacements.put("SERVICE_REQUIREMENT1", "No eligibility service required");
		replacements.put("SERVICE_REQUIREMENT1", "No eligibility service required");
		replacements.put("SERVICE_REQUIREMENT1", "No eligibility service required");
		replacements.put("SERVICE_REQUIREMENT1", "No eligibility service required");
		replacements.put("SERVICE_REQUIREMENT1", "No eligibility service required");
		replacements.put("SERVICE_REQUIREMENT1", "No eligibility service required");
		replacements.put("SERVICE_REQUIREMENT1", "No eligibility service required");
		replacements.put("SERVICE_REQUIREMENT1", "No eligibility service required");
		replacements.put("SERVICE_REQUIREMENT1", "No eligibility service required");
		replacements.put("SERVICE_REQUIREMENT1", "No eligibility service required");
		replacements.put("SERVICE_REQUIREMENT1", "No eligibility service required");
		replacements.put("SERVICE_REQUIREMENT1", "No eligibility service required");
		replacements.put("SERVICE_REQUIREMENT1", "No eligibility service required");
		replacements.put("SERVICE_REQUIREMENT1", "No eligibility service required");
		replacements.put("SERVICE_REQUIREMENT1", "No eligibility service required");
		replacements.put("SERVICE_REQUIREMENT1", "No eligibility service required");
		replacements.put("SERVICE_REQUIREMENT1", "No eligibility service required");
		replacements.put("SERVICE_REQUIREMENT1", "No eligibility service required");
		replacements.put("SERVICE_REQUIREMENT1", "No eligibility service required");
		
		try {
			evaluate(replacements);
		} catch (ScriptException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
