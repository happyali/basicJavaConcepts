package Aggregation;

public class Employee {

	int accountid = 0;
	String accountname = "XYZ";
	Address address; // Aggregation of Class Address

	public Employee(int accountid, String accountname, Address address) {
		this.accountid = accountid;
		this.accountname = accountname;
		this.address = address;
		System.out.println("I am in Employee Method for " + accountid);
	}

	void display() {
		System.out.println(accountid + " " + accountname);
		System.out.println(address.city + " " + address.state + " " + address.country);
	}

	public static void main(String[] args) {
		Address address1 = new Address("Mum", "MAH", "India");
		Address address2 = new Address("HYD", "TG", "India");

		Employee e1 = new Employee(111, "Huamid", address1);
		Employee e2 = new Employee(112, "Ali", address2);

		e1.display();
		e2.display();

	}
}
