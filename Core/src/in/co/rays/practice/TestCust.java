package in.co.rays.practice;

public class TestCust {
	public static void main(String[] args) throws Exception {

		Customer c = new Customer("ram", 834);
		Customer c1 = (Customer) c.clone();
		c1.name = "lavish";
		c1.a.balance = 3445;

		System.out.println(c.name);
		System.out.println(c.a.balance);
		System.out.println(c1.name);
		System.out.println(c1.a.balance);
	}
}