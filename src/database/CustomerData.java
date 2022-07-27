package database;
import java.util.ArrayList;
import java.util.List;
import invoicing.Customer;


public class CustomerData {

	private List<Customer> customers = initializeCustomers();
	
	private List<Customer> initializeCustomers(){
		List<Customer> cuslist = new ArrayList<Customer>();
		cuslist.add(new Customer("a@a.c","A","1234567890"));
		cuslist.add(new Customer("b@a.c","B","1234567890"));
		cuslist.add(new Customer("c@a.c","C","1234567890"));
		return cuslist;
	}
	public List<Customer> getCustomer(){
		return customers;
	}
}
