import java.util.LinkedHashSet;
import java.util.Set;

public class StringDuplicate {

    public StringDuplicate() {
	// TODO Auto-generated constructor stub
    }
    
    public static String removeDups(String ip) {
	var result = new Object(){
	    String res ="";
	};
	
	
	Set<String> temp = new LinkedHashSet<>();
	for(int i=0;i<ip.length();i++) {
	    temp.add(ip.charAt(i)+"");
	}
	temp.forEach(s -> {
	    result.res +=s;
	});
	
	
	
	return result.res ;
    }
    
    public static String removeDups1(String ip) {
	String res = "";
	
	for(int i=0;i<ip.length();i++) {
	    if(!res.contains(ip.charAt(i)+"")) {
		res +=ip.charAt(i);
	    }
		
	}
	
	return res ;
    }
    
    public static void main(String[] args) {
	System.out.println(removeDups1("aaaaabbsssc"));
    }

}
