package in.co.rays.practice;

public enum Enum {
	
	
	KID(10),
	MAN(50),
	OLDMAN(70);
	private final int weight;
	

	Enum(int w){
		this.weight=w;
	}
	public void display() {
		System.out.println(weight);
		
	}
	
	
public static void main(String[] args) {
	Enum h=Enum.KID;
	h.display();
}
}

