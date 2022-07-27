package database;
import java.util.ArrayList;
import java.util.List;
import invoicing.Customer;
import invoicing.Product;

public class ProductData {

private List<Product> products = initializeProducts();
	
	private List<Product> initializeProducts(){
		List<Product> prodlist = new ArrayList<Product>();
		prodlist.add(new Product(1,5000,"Laptop"));
		prodlist.add(new Product(2,1000,"Mouse"));
		prodlist.add(new Product(1,2000,"Keyboard"));
		return prodlist;
	}
	public List<Product> getProducts(){
		return products;
	}

}
