package in.co.rays.practice;

public class TestCloneee {
	public static void main(String[] args) throws Exception {
		
	
	Cloneeee c1=new Cloneeee(9876);
	Cloneeee c2=(Cloneeee) c1.clone();
	c2.balance=23456;
	System.out.println(c1.balance);
	System.out.println(c2.balance);
	
	

}
}