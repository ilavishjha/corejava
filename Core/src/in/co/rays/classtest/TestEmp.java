package in.co.rays.classtest;

import java.util.ArrayList;
import java.util.Collections;

public class TestEmp {
	public static void main(String[] args) {
		ArrayList<Employee>emp=new ArrayList<Employee>();
		emp.add(new Employee(101, "lavish"));
		emp.add(new Employee(99, "ram"));
		emp.add(new Employee(100, "rahul"));
		
		System.out.println(emp);
		Collections.sort(emp);
		System.out.println(emp);
	}

}
