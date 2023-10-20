package in.co.rays.hashmap;

public class Student {
	String sname;
	int sid;
	String slocation;

	public Student(String sname, int sid, String slocation) {
		super();
		this.sname = sname;
		this.sid = sid;
		this.slocation = slocation;
	}

	@Override
	public String toString() {
		return "Student [sname=" + sname + ", sid=" + sid + ", slocation=" + slocation + "]";
	}

}
