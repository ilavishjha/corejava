package in.co.rays.collections;

public class Employee {
	private String name=null;
	private String address=null;
	private int id =0;
	
	public Employee(String name,String address,int id) {
		this.address=address;
		this.name=name;
		this.id=id;
			
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return name+" "+address+ " "+id;
	}
	

}
