package in.co.rays.exceptionhandling;

public class Except1 {
	public static void main(String[] args) {
		
	
	int a=10;
	int b=0;
	try {
		int c=a/b;
		System.out.println(c);
		
	} catch (Exception e) {
		System.out.println(e);
		
	}//Exception in thread "main" java.lang.ArithmeticException: / by zero
	// in.co.rays.exceptionhandling.Except1.main(Except1.java:9)

	}

}
