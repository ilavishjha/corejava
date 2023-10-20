package in.co.rays.aggregation;

import java.util.Comparator;

public class Employee2  implements Comparable<Employee2>{
	int id;
	String name;
	Department dl;
	public Employee2(int id, String name, Department dl) {
		super();
		this.id = id;
		this.name = name;
		this.dl = dl;
	}
	@Override
	public String toString() {
		return "Employee2 [id=" + id + ", name=" + name + "]";
	}
	@Override
	public int compareTo(Employee2 o) {
		if (this.id<o.id) 
			return -1;
			else if (this.id>o.id) 
				return 1 ;
return 0;
	}
	
	
	

}
