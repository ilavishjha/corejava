package in.co.rays.threadspractice;

class Passport implements Runnable {

	Thread t;

	public Passport() throws Exception {
		t = new Thread(this, "Passport");
		t.start();
		t.join();
	}

	public void run() {
		System.out.println("please verify");

	}

}

class check implements Runnable {
	String name;
	int no;
	String location;
	int adhrno;

	Thread t;

	public check(String name, int no, String location, int adhrno) throws Exception {
		super();
		this.name = name;
		this.no = no;
		this.location = location;
		this.adhrno = adhrno;
		t = new Thread(this, "check");
		t.start();
		t.join();
	}

	@Override
	public void run() {
		System.out.println("verifying");
		try {
			Thread.sleep(3000);
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println(name + " " + name);
		System.out.println(name + " " + location);
		System.out.println(name + " " + no);
		System.out.println(name + " " + adhrno);
		try {
			Thread.sleep(1000);
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		System.out.println("           ");
		System.out.println("document verified succesfully");
	}

}

class Done implements Runnable {
	Thread t;

	public Done() throws InterruptedException {
		t = new Thread(this, "done");
		t.start();
		t.join();
	}

	public void run() {
		System.out.println("           ");
		// TODO Auto-generated method stub
		System.out.println("done");
		try {
			Thread.sleep(2000);
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println("           ");
		System.out.println("done ghr jao");
	}

}

public class PassportVerification {
	public static void main(String[] args) throws Exception {
Passport p=new Passport();
check c=new check("lavish", 659596, "indore", 8448);
Done d=new Done();

	}

}
