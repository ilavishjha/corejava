package in.co.rays.exceptionhandling;

public class ArrayExcept {
	public static void main(String[] args) {
	try {
		
		 int a[]= {1,2,3,4};      
			System.out.println(a[4]);
		
	} catch (Exception e) {
		System.out.println(e);
		// TODO: handle exception
	}	
	
	
		 //Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: Index 4 out of bounds for length 4
	//at in.co.rays.exceptionhandling.ArrayExcept.main(ArrayExcept.java:9)
//	 int a[]= {1,2,3,4};      
//	System.out.println(a[4]);
}
}