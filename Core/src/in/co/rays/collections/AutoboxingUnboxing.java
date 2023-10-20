package in.co.rays.collections;

public class AutoboxingUnboxing {
	public static void main(String[] args) {
		int a=10;
		Integer b=new Integer(a);//wrapper class ,autoboxing
		System.out.println(b);
		
		Integer c= new Integer(1009876543);//unboxing
		int d=c;
		System.out.println(d);
	}

}
