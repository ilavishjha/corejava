package in.co.rays.exceptionhandling;

public class Except2 {
	public static void main(String[] args) {
		//String name="Lavish";
		
		int a=0;
		for (int i = 0; i <= 100; i++) {
			System.out.println(i);
			
		}
		
		
		try {
			String name="Lavish";
			
			System.out.println(name.charAt(6));
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e);
		}
	}

}
