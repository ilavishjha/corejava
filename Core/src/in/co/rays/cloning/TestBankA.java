package in.co.rays.cloning;

public class TestBankA {
	public static void main(String[] args) throws Exception {
		
	
BankAccount a1=new BankAccount(10.52);
BankAccount a2=(BankAccount) a1.clone();
a2.balance=23.5;
  System.out.println(a1.balance);
  System.out.println(a2.balance);

}
}