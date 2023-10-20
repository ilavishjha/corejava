package in.co.rays.exceptionhandling;

public class TestLoginException {
	public static void main(String[] args) {
		String name ="lavish";
		if (name.equals("lavis")) {
			System.out.println("access granted");
		
		}else {
			LoginException l=new LoginException();
			try {
				throw l;
			} catch (Exception e) {
				// TODO: handle exception
				System.out.println(e);
			}
		}
	}

}
