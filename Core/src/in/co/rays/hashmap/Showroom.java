package in.co.rays.hashmap;

public class Showroom {
	String name;
	String slocation;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSlocation() {
		return slocation;
	}

	public void setSlocation(String slocation) {
		this.slocation = slocation;
	}

	@Override
	public String toString() {
		return "Showroom [name=" + name + ", slocation=" + slocation + "]";
	}

}
