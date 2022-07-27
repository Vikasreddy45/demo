package client;

import java.util.List;
import java.util.Scanner;
import java.util.ArrayList;

import database.CustomerData;
import database.ProductData;
import invoicing.Customer;
import invoicing.Product;
import invoicing.Invoice;
import invoicing.LineItem;

public class App {

	static Scanner scan = new Scanner(System.in);
	public static void main(String[] args) {
		
		ProductData productData = new ProductData();
		CustomerData customerData = new CustomerData();
		
		List<Product> products = productData.getProducts();
		List<Customer> customers = customerData.getCustomer();
		
		System.out.println("Enter customer emailId");
		String emailString = scan.next();
		App app = new App();
		if(app.validateCustomer(emailString, customers)) {
			System.out.println("Please choose products to purchase.");
			app.displayProducts(products);
			Invoice invoice = new Invoice("I001");
			int id=1;
			List<LineItem> items = new ArrayList<>();
			while(true) {
				int pid = scan.nextInt();
				System.out.println("Enter the quantity:");
				int quantity = scan.nextInt();
				
				for(Product product:products) {
					if(product.getProdid() == pid) {
						LineItem lineItem = new LineItem(id++,invoice,product,quantity);
						items.add(lineItem);
						break;
					}
				}
				System.out.println("Do you want to continue enter y/n");
				char ch = scan.next().charAt(0);
				if(ch=='n' || ch=='N') {
					break;
				}
				System.out.println("Please choose products to purchase.");
				app.displayProducts(products);
			}
			invoice.setLineItems(items);
			int total = 0;
			System.out.println("Invoice No - "+invoice.getInvno());
			System.out.println("Customer Email :- " + emailString);
			System.out.format("%5s%10s%10s%10s%10s\n","SNO","Name","Price","Quantity","Total");
			
			for(LineItem item:invoice.getLineItems()) {
				double sum = item.getQuantity()*item.getProduct().getPrice();
				System.out.format("%5s%10s%10s%10s%10s\n",item.getId(),item.getProduct().getName(),item.getProduct().getPrice(),
						item.getQuantity(),sum);
				total += sum;
			}
			System.out.println("Total amount :- "+total);
		}else {
			System.out.println("Not a valid email Id");
		}
		
	}
	public void displayProducts(List<Product>products) {
		System.out.format("%3s%10s%8s\n", "Id" ,"Name","Price");
		for(Product product: products)
		{
			System.out.format("%3d",product.getProdid());
			System.out.format("%10s",product.getName());
			System.out.format("%12.2f \n", product.getPrice());
		}
	}
	public boolean validateCustomer(String email,List<Customer> customers) {
		for(Customer customer : customers) {
			if(customer.getEmail().equals(email))
				return true;
			
		}
		return false;
	}

}
