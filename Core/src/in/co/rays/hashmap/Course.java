package in.co.rays.hashmap;

public class Course {
	int cid;
	String cname;
	int Cprice;
	public Course(int cid, String cname, int cprice) {
		super();
		this.cid = cid;
		this.cname = cname;
		Cprice = cprice;
	}
	@Override
	public String toString() {
		return "Course [cid=" + cid + ", cname=" + cname + ", Cprice=" + Cprice + "]";
	}
	

}
