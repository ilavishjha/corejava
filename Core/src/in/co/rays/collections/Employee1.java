package in.co.rays.collections;

public class Employee1 implements Comparable<Employee1>{
	int eid;
	String ename;
	int phone;
	
	
	
	
	public Employee1(int eid, String ename, int phone) {
		super();
		this.eid = eid;
		this.ename = ename;
		this.phone = phone;
	}

	@Override
	public String toString() {
		return "Employee1 [eid=" + eid + ", ename=" + ename + ", phone=" + phone + "]";
	}

	@Override
	public int compareTo(Employee1 o) {
		
		
		return this.ename.compareTo(o.ename);
	}
	


}
