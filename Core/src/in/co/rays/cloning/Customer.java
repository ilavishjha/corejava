package in.co.rays.cloning;

public class Customer implements Cloneable {
	//public int balance;
	int balance;
	
	
//	 public BankAccount(double balance) {
//	 this.balance=balance;
//	 
//	 }
	 @Override
	protected Object clone() throws CloneNotSupportedException {
	
		return super.clone();
	}

}
