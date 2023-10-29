package in.co.rays.threadspractice;
class thread1 implements Runnable{
String name;
thread1(String name){
	this.name=name;
	
}
	@Override
	public void run() {
		// TODO Auto-generated method stub
		String s=Thread.currentThread().getName();
		for (int i = 0; i <10; i++) {
			System.out.println(s+" "+name);
		Thread.yield();
		}
	}
	
}
class thread2 implements Runnable{
	String name;
	thread2(String name){
		this.name=name;
	}
	@Override
	public void run() {
		// TODO Auto-generated method stub
		String s1=Thread.currentThread().getName();
		for (int i = 0; i < 5; i++) {
			System.out.println(s1+" "+name);
			Thread.yield();
		}
			
		}
			
		
	}
	

public class thread_yield {
       public static void main(String[] args) {
    	   Runnable r;
		r=new thread1("lavish");
		Thread t=new Thread(r, "thread1");
		t.getPriority();
		t.start();
		
		r=new thread1("ram");
		Thread t1=new Thread(r, "thread2");
		t1.getPriority();
		t1.start();

	}
}
