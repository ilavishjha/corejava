package in.co.rays.aggregation;

import java.util.HashSet;
import java.util.Iterator;
import java.util.TreeSet;



public class DepartEmp {
	public static void main(String[] args) {

		HashSet<Employee2> emp = new HashSet<Employee2>();
		Department dep1=new Department(101, "hr",12000);
		Department dep2=new Department(105, "admin",1200);
		Department dep3=new Department(103, "staff",120);
		Department dep4=new Department(109, "lab",120000);
		Department dep5=new Department(108, "crew",12000000);
		
		Employee2 e1=new Employee2(21, "ram", dep1);
		Employee2 e2=new Employee2(24, "lavish", dep2);
		Employee2 e3=new Employee2(23, "ra", dep3);
		Employee2 e4=new Employee2(22, "rm", dep4);
		Employee2 e5=new Employee2(26, "am", dep5);
		
		emp.add(e1);
		emp.add(e2);
		emp.add(e3);
		emp.add(e4);
		emp.add(e5);
		
		
		
		TreeSet<Employee2>tr1= new TreeSet<Employee2>(emp);
		System.out.println(tr1);
		Iterator<Employee2>it=tr1.iterator();
		while (it.hasNext()) {
			Employee2 em = it.next();
			System.out.println(em);
			
		}
		
		
		
		
		
		

	}
}
