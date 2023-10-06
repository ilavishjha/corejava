package in.co.rays.cloning;

public class Account1 implements Cloneable {
	String name;
	//BankAccount balance;
	
	Customer account=new Customer();

	public Account1(String name,int balance) {
		this.name = name;
		this.account.balance = balance;
	}
@Override
protected Object clone() throws CloneNotSupportedException {
	Account1 c=(Account1) super.clone();
	c.account=(Customer) account.clone();
	return c;
}
	
}
