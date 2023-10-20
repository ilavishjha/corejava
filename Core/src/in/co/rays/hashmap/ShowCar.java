package in.co.rays.hashmap;
import java.util.*;
import java.util.Map.Entry;
public class ShowCar {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the showroom name");
		String sname=sc.next();
	System.out.println("enter the showroom location	");
	String slocation=sc.next();
	
	
	System.out.println("enter the car name");
	String cname=sc.next();
	System.out.println("ente the car prize");
int price=sc.nextInt();
System.out.println("Enter the car fuel type");
String type=sc.next();
Showroom sr=new Showroom();
sr.setName(sname);
sr.setSlocation(slocation);
Showroom sr1=new Showroom();
sr1.setName(sname);
sr1.setSlocation(slocation);
Showroom sr2=new Showroom();
sr2.setName(sname);
sr2.setSlocation(slocation);

Car c1=new Car();
c1.setCname(cname);
c1.setPrice(price);
c1.setType(type);
Car c2=new Car();
c2.setCname(cname);
c2.setPrice(price);
c2.setType(type);

HashMap<Showroom, Car>hm=new HashMap<Showroom, Car>();
hm.put(sr, c1);
hm.put(sr1, c2);
hm.put(sr,c2);

Set<Entry<Showroom, Car>>set=hm.entrySet();
for (Entry<Showroom, Car> map : set) {
	Showroom sho=map.getKey();
	Car ca=map.getValue();
	if (ca.cname.equals(cname)) {
		
		
	}
	System.out.println(ca);
}
	}

}
