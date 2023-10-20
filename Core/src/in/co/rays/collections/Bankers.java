package in.co.rays.collections;

public class Bankers implements Comparable<Bankers> {
	int id;
	int mobno;
	String name;
	String location;
	public Bankers(int id, int mobno, String name, String location) {
		super();
		this.id = id;
		this.mobno = mobno;
		this.name = name;
		this.location = location;
	}
	@Override
	public String toString() {
		return "Bankers [id=" + id + ", mobno=" + mobno + ", name=" + name + ", location=" + location + "]";
	}
	@Override
	public int compareTo(Bankers o) {
		if (this.id<o.id) 
			return 1;
			else if (this.id>o.id) 
				return -1 ;
					return 0;
	}
	
	
		}

