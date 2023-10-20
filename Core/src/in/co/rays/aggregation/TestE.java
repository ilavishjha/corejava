package in.co.rays.aggregation;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class TestE {
	ArrayList<Company>a1=new ArrayList<>();
	void checkcity(ArrayList<Company>a1) {
		Iterator<Company>it=a1.iterator();
		while (it.hasNext()) {
			Company c =  it.next();
			if (c.clocation.equalsIgnoreCase("indore")) {
				System.out.println(c.cname+" "+c.e.eid+" "+c.e.ename+" "+c.e.esalary);
					}
			
			
		}
	}
	void employeename(ArrayList<Company>a1) {
		Iterator<Company>it=a1.iterator();
		while (it.hasNext()) {
			Company cm2 = it.next();
			if (cm2.e.ename.equalsIgnoreCase("lavish")) {
				System.out.println(cm2.cname+" "+cm2.e.eid+" "+cm2.clocation+" "+cm2.e.esalary);
				
			}
			
		}
	}
	void companyname(ArrayList<Company>a1) {
		Iterator<Company>it=a1.iterator();
		while (it.hasNext()) {
			Company co =  it.next();
			if (co.cname.equalsIgnoreCase("infosys")) {
				System.out.println(co.e.ename+" "+co.e.eid+" "+co.clocation+" "+co.e.esalary);
			}
			
		}
	}
	
	public static void main(String[] args) {
		TestE emp=new TestE();
		Employee e1 = new Employee("lavish", 101, 12000);
		Employee e2 = new Employee("ram", 102, 13000);
		Employee e3 = new Employee("shyam", 103, 14000);
		ArrayList<Employee>al= new ArrayList<Employee>();
		al.add(e1);
		al.add(e2);
		al.add(e3);
		System.out.println("----sort employe id--");
		Collections.sort(al );
		System.out.println(al);
		Company c1 = new Company("infosys", "indore", e1);
		Company c2 = new Company("hcl", "indore", e2);
		Company c3 = new Company("infosys", "mumbai", e3);
		ArrayList<Company>a1= new ArrayList<Company>();
		a1.add(c1);
		a1.add(c3);
		a1.add(c2);
		System.out.println(a1);//employee detail nhi arhi
		
		
		
		
		System.out.println("-------------------");
		System.out.println("by city name");
		emp.checkcity(a1);
		
		
		System.out.println("by employee name");
		emp.employeename(a1);
		
		System.out.println("by compnay name");
		emp.companyname(a1);
		
		
		}
		
		
		
	
		
}


