package com.example;

import java.util.List;

class Product{
    int id;
    String name;
    String price;
}

class Orders{
    int id;
    int prodid;
    String odate;
    String cName;
}

public class TestTest {

   
    
    public List<Orders> getOrdersByProduct(String pname, List<Product> products, List<Orders> orders) {
	products.stream().filter(product -> product.name.equals(pname)).collect()
	
	
	orders.forEach(order ->{
	    products.forEach(product -> {
		if(product.name.equalsIgnoreCase(pname) && order.prodid == product.id) {
		    
		}
	    });
	});
	
	return ;
    }

}
