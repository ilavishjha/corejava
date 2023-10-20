package in.co.rays.aggregation;

public class Department implements Comparable<Department> {
	int did;
	String name;
	int salary;
	public Department(int did, String name, int salary) {
		super();
		this.did = did;
		this.name = name;
		this.salary = salary;
	}
	@Override
	public String toString() {
		return "Department [did=" + did + ", name=" + name + ", salary=" + salary + "]";
	}
	@Override
	public int compareTo(Department o) {
		
		return 0;
	}
	

}
