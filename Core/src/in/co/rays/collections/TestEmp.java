package in.co.rays.collections;

import java.util.ArrayList;

public class TestEmp {
	public static void main(String[] args) {
		
		
		
		Employee e1=new Employee("lavish","indore",98);
		Employee  e2=new Employee("lavish","indore",98);
		System.out.println(e1.equals(e2));
		System.out.println(e1.hashCode());
		System.out.println(e2.hashCode());
		
}
}