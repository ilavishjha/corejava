package in.co.rays.aggregation;

public class Company {
	String cname;
	String clocation;
	Employee e;
	public Company(String cname, String clocation, Employee e) {
		this.cname = cname;
		this.clocation = clocation;
		this.e = e;
		
	}
	@Override
	public String toString() {
		return "Company [cname=" + cname + ", clocation=" + clocation + "]";
	}
	
	
	

}
