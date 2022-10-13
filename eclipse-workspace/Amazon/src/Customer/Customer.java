package Customer;

public class Customer {
	public String username;
	public String password;
	public String email;
	public long phone;
	public String address;
	
	public void editProfile()
	{
		System.out.println("from editProfile");
	}
	public void changePassword() {System.out.println("from change password");}
	
	public void checkOrderStatus() {System.out.println("from check orders");}
	
	public void returnAndRefund() {System.out.println("from return");}
	
	public void placeOrCancelOrder() {System.out.println("from place order");}
	
	public void login() {System.out.println("from login");}
}
