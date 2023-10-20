package in.co.rays.aggregation;

public class Employee implements Comparable<Employee>{
	String ename;
	int eid;
	int esalary;
	public Employee(String ename, int eid, int esalary) {
		super();
		this.ename = ename;
		this.eid = eid;
		this.esalary = esalary;
	}
	@Override
	public String toString() {
		return "Employee [ename=" + ename + ", eid=" + eid + ", esalary=" + esalary + "]";
	}
	public int compareTo(Employee o) {
		 if(this.eid<o.eid)
			 return 1;
		 else if(this.eid<o.eid)
			 return -1;
		 return 0;
	}
	
	

}
