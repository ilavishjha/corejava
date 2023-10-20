package in.co.rays.practice;

public class Cloneeee implements Cloneable {
	
	int balance=0;
//	String name=null;
	public Cloneeee(int balance) {
		this.balance = balance;
	
	}
	@Override
	protected Object clone() throws CloneNotSupportedException {
		
		return super.clone();
	}

}
