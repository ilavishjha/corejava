package in.co.rays.arraylistpractice;

import java.util.ArrayList;
import java.util.Iterator;

class Employee12 {
	int id;
	String name;
	int salary;

	public Employee12(int id, String name, int salary) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", salary=" + salary + "]";
	}

}

public class Employeemain {
	ArrayList<Employee12> a1 = new ArrayList<Employee12>();

	public void maxSalary(ArrayList<Employee12> a1) {

		Iterator<Employee12> it = a1.iterator();
		while (it.hasNext()) {
			Employee12 emp = it.next();
			if (emp.salary > 10000) {
				System.out.println(emp.id + " " + emp.name + " " + emp.salary);
			}

		}
	}

	public void searchEmp(ArrayList<Employee12> a1) {
		Iterator<Employee12> it1 = a1.iterator();
		boolean s = true;
		while (it1.hasNext()) {
			Employee12 emp1 = it1.next();
			if (emp1.name.equalsIgnoreCase("lavish")) {
				System.out.println(s);

			}

		}
	}

	public static void main(String[] args) {
		ArrayList<Employee12> e2 = new ArrayList<Employee12>();
		e2.add(new Employee12(101, "lavish", 120000));
		e2.add(new Employee12(102, "ram", 12000));
		e2.add(new Employee12(104, "rahul", 1200));
		e2.add(new Employee12(103, "sagar", 100));
		e2.add(new Employee12(108, "dilip", 1268150000));

		Employeemain emp1 = new Employeemain();
		emp1.maxSalary(e2);
		Employeemain emp = new Employeemain();
		emp1.searchEmp(e2);

	}

}
