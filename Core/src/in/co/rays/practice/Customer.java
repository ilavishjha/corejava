package in.co.rays.practice;

public class Customer implements Cloneable {
	String name;
	Account a = new Account();

	public Customer(String name, int balance) {
		this.name = name;
		this.a.balance = balance;

	}

	@Override
	protected Object clone() throws CloneNotSupportedException {
		Customer c = (Customer) super.clone();
		c.a = (Account) a.clone();
		return c;
	}
}
