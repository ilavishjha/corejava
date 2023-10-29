package in.co.rays.classtestexception;

public class TestExceptionHandle {
	public static void main(String[] args) {
		String name="lavish";
		if (name.equals("lavis")) {
			System.out.println("valid user");
			
		}else {
			ExceptionHandle a=new ExceptionHandle();
			try {
				throw a;
			} catch (Exception e) {
				System.out.println(e);
			}
		}
	}

}
