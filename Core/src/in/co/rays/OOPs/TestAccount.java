package in.co.rays.OOPs;

public class TestAccount {
	public static void main(String[] args) {
		Account a=new Account();
		a.setAccounttype("saving");
		a.setBalance(5645.4);
		a.setNumber(98787645);
		
		System.out.println(a.getAccounttype());
		System.out.println(a.getBalance());
		System.out.println(a.getNumber());
		
	}

}
