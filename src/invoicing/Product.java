package invoicing;

public class Product {
	private int prodid;
	private double price;
	private String name;
	public Product() {
		// TODO Auto-generated constructor stub
	}
	public Product(int prodid, double price, String name) {
		super();
		this.prodid = prodid;
		this.price = price;
		this.name = name;
	}
	public int getProdid() {
		return prodid;
	}
	public void setProdid(int prodid) {
		this.prodid = prodid;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@Override
	public String toString() {
		return "Product [prodid=" + prodid + ", price=" + price + ", name=" + name + "]";
	}
}
