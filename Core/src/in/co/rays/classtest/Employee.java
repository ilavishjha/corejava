package in.co.rays.classtest;

public class Employee implements Comparable<Employee> {
	int id;
	String name;
	public Employee(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + "]";
	}
	
	
	@Override
	public int compareTo(Employee o) {
		// TODO Auto-generated method stub
		return this.id-o.id;
	}
	
	

}
