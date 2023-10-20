package in.co.rays.cloning;

public class TestCustomer {
	public static void main(String[] args) throws CloneNotSupportedException {
		
	
	Account1 c1=new Account1 ("himanshu",500);
	Account1 c2=(Account1) c1.clone();
	c2.name="ram";
	
	c2.account.balance=5433;
	System.out.println(c1.name);
	System.out.println(c1.account.balance);
	System.out.println(c2.name);
	System.out.println(c2.account.balance);
	
	//Customer c12=new Customer();
	
			
	}
}
