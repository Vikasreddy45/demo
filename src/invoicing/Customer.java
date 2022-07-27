package invoicing;

public class Customer {
	private String email;
	private String cname;
	private String phone;
	public Customer() {
		// TODO Auto-generated constructor stub
	}
	public Customer(String email, String cname, String phone) {
		super();
		this.email = email;
		this.cname = cname;
		this.phone = phone;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getCname() {
		return cname;
	}
	public void setCname(String cname) {
		this.cname = cname;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	@Override
	public String toString() {
		return "Customer [email=" + email + ", cname=" + cname + ", phone=" + phone + "]";
	}
	
}
