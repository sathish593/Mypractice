package com.example.JavaProblems;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import com.jayway.jsonpath.JsonPath;
import com.jayway.jsonpath.PathNotFoundException;

public class JsonpathTest {

    public JsonpathTest() {
	// TODO Auto-generated constructor stub
    }

    private static String test(String input, String key) {
	try {
	    return JsonPath.read(input, key);
	} catch (PathNotFoundException e) {
	    return "";
	}
    }

    @SuppressWarnings("unchecked")
    private static List<?> pullips(String json) {

	List<Map<String, Object>> subsets = JsonPath.read(json, "$.subsets");
	ArrayList<String> ips= new ArrayList<>();
	ArrayList<String> ports= new ArrayList<>();
	subsets.forEach(item-> item.entrySet().stream().filter(x->"ports".equalsIgnoreCase(x.getKey())).forEach(y-> {
	    List<Map<String, Object>> ipList = (List<Map<String, Object>>) y.getValue();
	    ipList.forEach(ipitem-> {
		if(ipitem.containsKey("http")) {
		    ports.add((String) ipitem.get("port"));
		}
	    });
	}));
	
	String port = ports.size() > 0  ?  ports.get(0)  :  "8080"; 
	subsets.forEach(item -> item.entrySet().stream().filter(x-> "addresses".equalsIgnoreCase(x.getKey())).forEach(y->{
	    List<Map<String, Object>> addresses = (List<Map<String, Object>>) y.getValue();
	    addresses.forEach(address->address.entrySet().forEach(entry->{
		if(entry.getKey().equalsIgnoreCase("ip")) {
		    ips.add(entry.getValue()+":"+port);
		}
	    }));
	}));

	ips.forEach(System.out::println);
	return ips;
    }

    public static void main(String[] args) {
	String tem = test(" {\r\n" + "        \"NAME\": \"TestNAME\",\r\n" + "        \"ADDRESS\": \"TestADDRESS\",\r\n"
		+ "        \"PHONE\": \"TestPHONE\",\r\n" + "        \"EIN\": \"TestEIN\",\r\n"
		+ "        \"TYPE_OF_ENTITY\": \"TestTYPE_OF_ENTITY\",\r\n"
		+ "        \"AFFILIATED_COMPANIES_ELIGIBLE\": \"TestAFFILIATED_COMPANIES_ELIGIBLE\",\r\n"
		+ "        \"PLAN_NAME\": \"TestPLAN_NAME\",\r\n" + "        \"PLAN_NUMBER\": \"TestPLAN_NUMBER\"}",
		"$.NAME");
	//System.out.println("tetre" + tem);

	String json = "{\"kind\":\"Endpoints\",\"apiVersion\":\"v1\",\"metadata\":{\"name\":\"automationhub-scheduler-services-dit\",\"namespace\":\"ibpm\",\"selfLink\":\"/api/v1/namespaces/ibpm/endpoints/automationhub-scheduler-services-dit\",\"uid\":\"cf8355d9-008c-11ea-8e43-0050568a86b8\",\"resourceVersion\":\"292014290\",\"creationTimestamp\":\"2019-11-06T11:58:56Z\",\"labels\":{\"adp.com/dc\":\"cdl\",\"adp.com/env\":\"dit\",\"adp.com/env-type\":\"dit\",\"adp.com/project\":\"automationhub-scheduler-services\",\"app.kubernetes.io/instance\":\"automationhub-scheduler-services-dit\",\"app.kubernetes.io/managed-by\":\"Tiller\",\"app.kubernetes.io/name\":\"automationhub-scheduler-services-dit\",\"helm.sh/chart\":\"web-service-1.3.0\"}},\"subsets\":[{\"addresses\":[{\"ip\":\"29.66.211.50\",\"nodeName\":\"cdldvcldvkn0120\",\"targetRef\":{\"kind\":\"Pod\",\"namespace\":\"ibpm\",\"name\":\"automationhub-scheduler-services-dit-64f6d94b66-x8nl4\",\"uid\":\"09c7ffd6-015b-11ea-8e43-0050568a86b8\",\"resourceVersion\":\"292014281\"}},{\"ip\":\"29.66.235.109\",\"nodeName\":\"cdldvcldvkn0051\",\"targetRef\":{\"kind\":\"Pod\",\"namespace\":\"ibpm\",\"name\":\"automationhub-scheduler-services-dit-64f6d94b66-qp2r6\",\"uid\":\"02f506be-015b-11ea-8e43-0050568a86b8\",\"resourceVersion\":\"292014126\"}}],\"ports\":[{\"name\":\"http\",\"port\":8080,\"protocol\":\"TCP\"}]}]} ";

	pullips(json);

    }

}
