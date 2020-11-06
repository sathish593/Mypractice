package com.example.Java8;

public class StringComma {
    
    public static String removeCommas(String ip) {
	int remainingLen = ip.length() - ip.indexOf(',');
	if(ip.contains(",") && remainingLen > 3)  {
	    ip =  ip.replaceFirst(",", "");
	    return removeCommas(ip);
	}
	else {
	    return ip.replaceFirst(",", ".");
	}
    }

  public static void main(String[] args) {
    String taxValue =" 11,12,   23 2,0,2 ";
    taxValue =taxValue.replaceAll("\\s", ""); 
    System.out.println(removeCommas(taxValue));
}

}
